package player;

import java.io.IOException;
import java.util.ArrayList;

import pokemons.Pokemon;
import screens.arena.ShopScreen;
import screens.arena.shop.PokeSlot;
import utils.PokeUtils;
import utils.TypeWriter;

public class Team {
    public TypeWriter tWr = new TypeWriter();
    PokeSlot slot1;
    // PokeSlot slot15;
    PokeSlot slot2;
    // PokeSlot slot25;
    PokeSlot slot3;
    // PokeSlot slot35;
    PokeSlot slot4;
    // PokeSlot slot45;
    PokeSlot slot5;
    ArrayList<PokeSlot> teamSlots = new ArrayList<>();

    public Team() {
        PokeSlot slot1 = new PokeSlot();
        PokeSlot slot2 = new PokeSlot();
        PokeSlot slot3 = new PokeSlot();
        PokeSlot slot4 = new PokeSlot();
        PokeSlot slot5 = new PokeSlot();
        teamSlots.add(slot1);
        teamSlots.add(slot2);
        teamSlots.add(slot3);
        teamSlots.add(slot4);
        teamSlots.add(slot5);
        // printMyTeam();
    }

    public void placePokemonOnSlot(Pokemon pokemon, PokeSlot slot) {
        slot.receivePokemon(pokemon);
    }

    public ArrayList<PokeSlot> getSlots() {
        return this.teamSlots;
    }

    public void printMyTeam() {
        String printLVL = " ";
        for (int i = 0; i < this.teamSlots.size(); i++) {
            if (this.teamSlots.get(i).hasContent()) {
                    printLVL = printLVL + this.teamSlots.get(i).getContent().getGraphLvL();
                    for (int w = 0; w < (this.teamSlots.get(i).getContent().getName().length()+1)-this.teamSlots.get(i).getContent().getGraphLvL().length(); w++) {
                        printLVL = printLVL + " ";
                    }
                    printLVL = printLVL + " ";
                } else {
                    for (int x = 0; x < 7; x++) {
                        printLVL = printLVL + " ";
                    }                
                }
            }
            System.out.print(printLVL);
            System.out.println();
            for (PokeSlot slot : teamSlots) {
                System.out.print(slot.toString());
            }
            System.out.println();
    }

    public void movePokemon(int position1, int position2) throws IOException {
        int index1 = position1 - 1;
        int index2 = position2 - 1;
        Pokemon safeSpot1;
        Pokemon safeSpot2;
        if (!this.teamSlots.get(index1).hasContent()) {
            tWr.println("Nothing to move!");
            PokeUtils.waitInput();
            return;
        } else {
            if (!this.teamSlots.get(index2).hasContent()) {
                this.teamSlots.get(index2).receivePokemon(PokeUtils.clonePokemon(this.teamSlots.get(index1).getContent()));
                this.teamSlots.get(index1).deleteContent();
            } else {
                if (this.teamSlots.get(index2).getContent().getName().equals(this.teamSlots.get(index1).getContent().getName())) {
                    //mergeFunction() -- getting the highest values from each Pokemon and creating a new one
                    if (this.teamSlots.get(index2).getContent().getLVL() == this.teamSlots.get(index2).getContent().getMaxLVL()) {
                        tWr.println("Pokemon is already at max LVL");
                        PokeUtils.waitInput();
                        return;
                    } else {
                        this.teamSlots.get(index1).deleteContent();
                        this.teamSlots.get(index2).getContent().levelUp();
                    }
                } else {
                    safeSpot1 = PokeUtils.clonePokemon(this.teamSlots.get(index1).getContent());
                    safeSpot2 = PokeUtils.clonePokemon(this.teamSlots.get(index2).getContent());
                    this.teamSlots.get(index1).deleteContent();
                    this.teamSlots.get(index2).deleteContent();
                    this.teamSlots.get(index1).receivePokemon(PokeUtils.clonePokemon(safeSpot2));
                    this.teamSlots.get(index2).receivePokemon(PokeUtils.clonePokemon(safeSpot1));
                    safeSpot1 = null;
                    safeSpot2 = null;
                }
            }
        }
    }

    public void moveOption() throws IOException {
        int position1 = 100;
        int position2 = 100;
        tWr.println("Position 1");
        position1 = PokeUtils.teamIndexInput(ShopScreen.arena.getPlayer());
        tWr.println("Position 2");
        position2 = PokeUtils.teamIndexInput(ShopScreen.arena.getPlayer());
        movePokemon(position1, position2);
    }

	public void infoOption() throws IOException {
        int position = 100;
        tWr.println("MORE INFORMATION");
        position = PokeUtils.teamIndexInput(ShopScreen.arena.getPlayer());
        int index = position-1;
        if (!this.teamSlots.get(index).hasContent()) {
            tWr.println("It's an empty space! You can place a Pokemon here");
            PokeUtils.waitInput();
            return;
        } else {
            this.teamSlots.get(index).getContent().getDetails();
            return;
        }

	}


}
