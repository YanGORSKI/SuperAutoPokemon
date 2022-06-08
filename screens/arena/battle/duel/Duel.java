package screens.arena.battle.duel;

import java.util.ArrayList;

import pokemons.Pokemon;
import pokemons.conditions.Condition;
import utils.PokeUtils;


public class Duel {
    int turn;
    Pokemon battler1;
    Pokemon battler2;
    ArrayList<Pokemon> order;

    public void dueling() {
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
        this.turn = this.turn + 1;
        System.out.println("__________________________________________");
        System.out.println("TURN: " + this.turn);
        for (int i = 0; i < this.battler1.getConditions().size(); i++) {
            this.battler1.getConditions().get(i).conditionCheckBegin(this.battler1);
            this.battler1.getConditions().get(i).conditionFromUser(this.battler1, this.battler2);
        }for (int i = 0; i < this.battler2.getConditions().size(); i++) {
            this.battler2.getConditions().get(i).conditionCheckBegin(this.battler2);
            this.battler2.getConditions().get(i).conditionFromUser(this.battler2, this.battler1);
        }
        checkOrder(this.battler1, this.battler2);
        
    }
    
    public void combat(Pokemon first, Pokemon second) {
        first.setTarget(second);
        second.setTarget(first);
        // debugPrintPokeMoveInfo(first);
        if (first.canAct()) {
            first.act();
        }
        System.out.println("");
        // debugPrintPokeMoveInfo(second);
        if (second.canAct()) {
            second.act();
        }
    }
    
    
    public void endTurn() {

    }
    
    
    private void declareWinner() {
        if (this.battler1.getHP() <= 0 && this.battler2.getHP() <= 0) {
            System.out.println("It's a tie!");
        } else if (this.battler1.getHP() <= 0 && this.battler2.getHP() > 0) {
            System.out.println(battler2.getNickname() + " wins the duel!");
        } if (this.battler1.getHP() > 0 && this.battler2.getHP() <= 0) {
            System.out.println(battler1.getNickname() + " wins the duel!");
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

    public Duel(Pokemon battler1, Pokemon battler2) {
        this.battler1 = battler1;
        this.battler2 = battler2;
        this.turn = 0;
        dueling();
    }
}