package screens.arena;

import player.Player;
import screens.arena.shop.Shop;
import utils.PokeUtils;

public class Arena {
    Player player;
    Shop shop;

    public Arena() {
        PokeUtils.defineTiers();

        player = new Player();
        
        shop = new Shop(this);
    }

    public Player getPlayer() {
        return this.player;
    }

    public Shop getShop() {
        return this.shop;
    }
    
    public void fightOption() {
    }


    
}
