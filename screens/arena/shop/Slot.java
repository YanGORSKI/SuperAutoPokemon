package screens.arena.shop;

import pokemons.Pokemon;

public class Slot {
    boolean active = false;
    int cost;
    int content;
    

    public void activateSlot() {
        active = true;
    }

    public void generate(Shop shop) {}

}