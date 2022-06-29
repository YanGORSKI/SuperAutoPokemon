package player;

import java.util.ArrayList;

import pokemons.Pokemon;
import screens.arena.shop.PokeSlot;

public class Team {
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
        for (PokeSlot slot : teamSlots) {
            System.out.print(slot.toString());
        }
        System.out.println();

    }
}
