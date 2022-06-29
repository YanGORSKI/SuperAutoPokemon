package screens.arena.shop;

import pokemons.Pokemon;
import utils.PokeUtils;

public class PokeSlot extends Slot{
    Pokemon content;

    public PokeSlot() {
        this.content = null;
    }

    public void generate(Shop shop) {
        int fromTier = shop.getPokeTier();
        switch (fromTier) {
            case 1:
                this.content = new Pokemon(PokeUtils.getTier1().get((PokeUtils.dn(PokeUtils.getTier1().size()))-1));
                break;
            case 2:
                this.content = new Pokemon(PokeUtils.getTier2().get(PokeUtils.dn(PokeUtils.getTier2().size())));
                break;
            case 3:
                this.content = new Pokemon(PokeUtils.getTier3().get(PokeUtils.dn(PokeUtils.getTier3().size())));
                break;
            case 4:
                this.content = new Pokemon(PokeUtils.getTier4().get(PokeUtils.dn(PokeUtils.getTier4().size())));
                break;
            case 5:
                this.content = new Pokemon(PokeUtils.getTier5().get(PokeUtils.dn(PokeUtils.getTier5().size())));
                break;
            case 6:
                this.content = new Pokemon(PokeUtils.getTier6().get(PokeUtils.dn(PokeUtils.getTier6().size())));
                break;
        }

        
    }

    public boolean hasContent() {
        if (this.content != null) return true;
        else return false;
    }

    public void receivePokemon(Pokemon pokemon) {
        content = pokemon;
    }
    
    public void deleteContent() {
        this.content = null;
    }
    
    public Pokemon getContent() {
        return content;
    }
     
    @Override
    public String toString() {
        if (this.content == null) {
            return "[EMPTY]";
        } else {
            return ("[" + getContent().getName() + "]");
        }
    }
}
