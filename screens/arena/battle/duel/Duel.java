package screens.arena.battle.duel;

import java.io.IOException;
import java.util.ArrayList;

import pokemons.Pokemon;
import pokemons.conditions.Condition;
import utils.PokeUtils;
import utils.TypeWriter;


public class Duel {
    TypeWriter tWr = new TypeWriter();

    int turn;
    Pokemon battler1;
    Pokemon battler2;
    ArrayList<Pokemon> order;

    public void dueling() throws IOException {
       while (battler1.getHP() > 0 && battler2.getHP() > 0) {
        // for (int i = 0; i < 5; i++) {
            beginTurn();
            System.out.println();
            combat(this.order.get(0), this.order.get(1));
            System.out.println();
            endTurn();
        }
        System.out.println();
        declareWinner();
        // }
    }
    
    public void beginTurn() {
        PokeUtils.clear();
        this.turn = this.turn + 1;
        System.out.println("__________________________________________");
        tWr.println("TURN: " + this.turn);
        for (int i = 0; i < this.battler1.getConditions().size(); i++) {
            this.battler1.getConditions().get(i).conditionCheckBegin(this.battler1);
            this.battler1.getConditions().get(i).conditionFromUser(this.battler1, this.battler2);
        }for (int i = 0; i < this.battler2.getConditions().size(); i++) {
            this.battler2.getConditions().get(i).conditionCheckBegin(this.battler2);
            this.battler2.getConditions().get(i).conditionFromUser(this.battler2, this.battler1);
        }
        battler1.setTarget(battler2);
        battler2.setTarget(battler1);
        if (battler1.canChoose()) {
            battler1.choose();
        }
        if (battler2.canChoose()) {
            battler2.choose();
        }
        checkOrder(this.battler1, this.battler2);
        
    }
    
    public void combat(Pokemon first, Pokemon second) {
        // debugPrintPokeMoveInfo(first);
        if (first.canAct()) {
            first.use(first.getActiveMove());
        }
        System.out.println("");
        // debugPrintPokeMoveInfo(second);
        if (second.canAct()) {
            second.use(second.getActiveMove());
        }
    }
    
    
    public void endTurn() throws IOException {
        PokeUtils.waitInput();
    }
    
    
    private void declareWinner() {
        if (this.battler1.getHP() <= 0 && this.battler2.getHP() <= 0) {
            tWr.println("It's a tie!");
        } else if (this.battler1.getHP() <= 0 && this.battler2.getHP() > 0) {
            tWr.println(battler2.getNickname() + " wins the duel!");
        } if (this.battler1.getHP() > 0 && this.battler2.getHP() <= 0) {
            tWr.println(battler1.getNickname() + " wins the duel!");
        }
    }
    

    private void checkOrder(Pokemon battler1, Pokemon battler2) {
        ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();

		if (battler1.getConditions().contains(Condition.BOUND)) {
            pokemonList.add(battler2);
        }
        if (battler2.getConditions().contains(Condition.BOUND)) {
            pokemonList.add(battler1);
        }
        if (battler1.getActiveMove().getName().equals("Quick Attack")) {
            pokemonList.add(battler1);
        }
        if (battler2.getActiveMove().getName().equals("Quick Attack")) {
            pokemonList.add(battler2);
        }
        if (!pokemonList.contains(battler1) && !pokemonList.contains(battler2)) {
            if (battler1.getSPD() == battler2.getSPD()) {
                int d20 = PokeUtils.d20();
                if (d20 <= 10) {
                    pokemonList.add(battler1);
                } else {
                    pokemonList.add(battler2);
                }
            }else if (battler1.getSPD() > battler2.getSPD()) {
                pokemonList.add(battler1);
            }else {
                pokemonList.add(battler2);
            }
        }
		if(pokemonList.contains(battler1)) {
			pokemonList.add(battler2);
		} else {
			pokemonList.add(battler1);
		}

		this.order = pokemonList;
    }

    public void debugPrintPokeMoveInfo(Pokemon pokemon) {
        System.out.println(pokemon.getActiveMove());
        System.out.println(pokemon.getActiveMoveTurns());
        System.out.println(pokemon.getActiveMoveDelay());
        System.out.println(pokemon.getInactiveCount());
        System.out.println(pokemon.getConditions());
    }

    public Duel(Pokemon battler1, Pokemon battler2) throws IOException {
        this.battler1 = battler1;
        this.battler2 = battler2;
        this.turn = 0;
        dueling();
    }
}