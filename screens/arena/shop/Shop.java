package screens.arena.shop;

import java.util.ArrayList;

import items.Item;
import player.Player;
import utils.PokeUtils;

public class Shop {
    //shows the Pokemons and items available to buy based on the tier the player's in
    PokeSlot pSlot1 = new PokeSlot();
    PokeSlot pSlot2 = new PokeSlot();
    PokeSlot pSlot3 = new PokeSlot();
    PokeSlot pSlot4 = new PokeSlot();
    PokeSlot pSlot5 = new PokeSlot();
    PokeSlot pSlot6 = new PokeSlot();

    ItemSlot iSlot1 = new ItemSlot();
    ItemSlot iSlot2 = new ItemSlot();
    ItemSlot iSlot3 = new ItemSlot();

    ArrayList<Slot> activeSlots = new ArrayList<>();
    int currentTier;

    public Shop(Player player) {
        if (player.getRound() > 30) {
            this.currentTier = 10;
        } else {
            this.currentTier = (int)(Math.ceil(player.getRound()/3));
        }
        unlockSlots();
        for (int i = 0; i < activeSlots.size(); i++) {
            activeSlots.get(i).generate(this);
        }
        printShop();
        
    }

    public void unlockSlots() {
        switch (this.currentTier) {
            case 1:
            this.pSlot1.activateSlot();
            this.pSlot2.activateSlot();
            this.pSlot3.activateSlot();
            this.iSlot1.activateSlot();
            this.iSlot2.activateSlot();
            this.activeSlots.add(pSlot1);
            this.activeSlots.add(pSlot2);
            this.activeSlots.add(pSlot3);
            this.activeSlots.add(iSlot1);
            this.activeSlots.add(iSlot2);
            break;
            case 2:
            this.pSlot1.activateSlot();
            this.pSlot2.activateSlot();
            this.pSlot3.activateSlot();
            this.iSlot1.activateSlot();
            this.iSlot2.activateSlot();
            this.activeSlots.add(pSlot1);
            this.activeSlots.add(pSlot2);
            this.activeSlots.add(pSlot3);
            this.activeSlots.add(iSlot1);
            this.activeSlots.add(iSlot2);
            break;
            case 3:
            this.pSlot1.activateSlot();
            this.pSlot2.activateSlot();
            this.pSlot3.activateSlot();
            this.pSlot4.activateSlot();
            this.iSlot1.activateSlot();
            this.iSlot2.activateSlot();
            this.activeSlots.add(pSlot1);
            this.activeSlots.add(pSlot2);
            this.activeSlots.add(pSlot3);
            this.activeSlots.add(pSlot4);
            this.activeSlots.add(iSlot1);
            this.activeSlots.add(iSlot2);
            break;
            case 4:
            this.pSlot1.activateSlot();
            this.pSlot2.activateSlot();
            this.pSlot3.activateSlot();
            this.pSlot4.activateSlot();
            this.iSlot1.activateSlot();
            this.iSlot2.activateSlot();
            this.activeSlots.add(pSlot1);
            this.activeSlots.add(pSlot2);
            this.activeSlots.add(pSlot3);
            this.activeSlots.add(pSlot4);
            this.activeSlots.add(iSlot1);
            this.activeSlots.add(iSlot2);
            break;
            case 5:
            this.pSlot1.activateSlot();
            this.pSlot2.activateSlot();
            this.pSlot3.activateSlot();
            this.pSlot4.activateSlot();
            this.iSlot1.activateSlot();
            this.iSlot2.activateSlot();
            this.iSlot3.activateSlot();
            this.activeSlots.add(pSlot1);
            this.activeSlots.add(pSlot2);
            this.activeSlots.add(pSlot3);
            this.activeSlots.add(pSlot4);
            this.activeSlots.add(iSlot1);
            this.activeSlots.add(iSlot2);
            this.activeSlots.add(iSlot3);
            break;
            case 6:
            this.pSlot1.activateSlot();
            this.pSlot2.activateSlot();
            this.pSlot3.activateSlot();
            this.pSlot4.activateSlot();
            this.pSlot5.activateSlot();
            this.iSlot1.activateSlot();
            this.iSlot2.activateSlot();
            this.iSlot3.activateSlot();
            this.activeSlots.add(pSlot1);
            this.activeSlots.add(pSlot2);
            this.activeSlots.add(pSlot3);
            this.activeSlots.add(pSlot4);
            this.activeSlots.add(pSlot5);
            this.activeSlots.add(iSlot1);
            this.activeSlots.add(iSlot2);
            this.activeSlots.add(iSlot3);
            break;
            case 7:
            this.pSlot1.activateSlot();
            this.pSlot2.activateSlot();
            this.pSlot3.activateSlot();
            this.pSlot4.activateSlot();
            this.pSlot5.activateSlot();
            this.iSlot1.activateSlot();
            this.iSlot2.activateSlot();
            this.iSlot3.activateSlot();
            this.activeSlots.add(pSlot1);
            this.activeSlots.add(pSlot2);
            this.activeSlots.add(pSlot3);
            this.activeSlots.add(pSlot4);
            this.activeSlots.add(pSlot5);
            this.activeSlots.add(iSlot1);
            this.activeSlots.add(iSlot2);
            this.activeSlots.add(iSlot3);
            break;
            case 8:
            this.pSlot1.activateSlot();
            this.pSlot2.activateSlot();
            this.pSlot3.activateSlot();
            this.pSlot4.activateSlot();
            this.pSlot5.activateSlot();
            this.iSlot1.activateSlot();
            this.iSlot2.activateSlot();
            this.iSlot3.activateSlot();
            this.activeSlots.add(pSlot1);
            this.activeSlots.add(pSlot2);
            this.activeSlots.add(pSlot3);
            this.activeSlots.add(pSlot4);
            this.activeSlots.add(pSlot5);
            this.activeSlots.add(iSlot1);
            this.activeSlots.add(iSlot2);
            this.activeSlots.add(iSlot3);
            break;
            case 9:
            this.pSlot1.activateSlot();
            this.pSlot2.activateSlot();
            this.pSlot3.activateSlot();
            this.pSlot4.activateSlot();
            this.pSlot5.activateSlot();
            this.pSlot6.activateSlot();
            this.iSlot1.activateSlot();
            this.iSlot2.activateSlot();
            this.iSlot3.activateSlot();
            this.activeSlots.add(pSlot1);
            this.activeSlots.add(pSlot2);
            this.activeSlots.add(pSlot3);
            this.activeSlots.add(pSlot4);
            this.activeSlots.add(pSlot5);
            this.activeSlots.add(pSlot6);
            this.activeSlots.add(iSlot1);
            this.activeSlots.add(iSlot2);
            this.activeSlots.add(iSlot3);
            break;
            case 10:
            this.pSlot1.activateSlot();
            this.pSlot2.activateSlot();
            this.pSlot3.activateSlot();
            this.pSlot4.activateSlot();
            this.pSlot5.activateSlot();
            this.pSlot6.activateSlot();
            this.iSlot1.activateSlot();
            this.iSlot2.activateSlot();
            this.iSlot3.activateSlot();
            this.activeSlots.add(pSlot1);
            this.activeSlots.add(pSlot2);
            this.activeSlots.add(pSlot3);
            this.activeSlots.add(pSlot4);
            this.activeSlots.add(pSlot5);
            this.activeSlots.add(pSlot6);
            this.activeSlots.add(iSlot1);
            this.activeSlots.add(iSlot2);
            this.activeSlots.add(iSlot3);
            break;
        }
    }

    public int getPokeTier() {
        int d100 = PokeUtils.d100();
        switch (this.currentTier) {
            case 1:
                return 1;
            case 2:
                if (d100 >= 1 && d100 <= 80) {
                    return 1;}
                if (d100 >= 81 && d100 <= 100) {
                    return 2;}
            case 3:
                if (d100 >= 1 && d100 <= 30) {
                    return 1;}
                if (d100 >= 31 && d100 <= 80) {
                    return 2;}
                if (d100 >= 81 && d100 <= 100) {
                    return 3;}
            case 4:
                if (d100 >= 1 && d100 <= 10) {
                    return 1;}
                if (d100 >= 11 && d100 <= 30) {
                    return 2;}
                if (d100 >= 31 && d100 <= 80) {
                    return 3;}
                if (d100 >= 81 && d100 <= 100) {
                    return 4;}
            case 5:
                if (d100 >= 1 && d100 <= 5) {
                    return 1;}
                if (d100 >= 6 && d100 <= 15) {
                    return 2;}
                if (d100 >= 16 && d100 <= 40) {
                    return 3;}
                if (d100 >= 41 && d100 <= 80) {
                    return 4;}
                if (d100 >= 81 && d100 <= 100) {
                    return 5;}
            case 6:
                if (d100 >= 1 && d100 <= 5) {
                    return 1;}
                if (d100 >= 6 && d100 <= 15) {
                    return 2;}
                if (d100 >= 16 && d100 <= 30) {
                    return 3;}
                if (d100 >= 31 && d100 <= 50) {
                    return 4;}
                if (d100 >= 51 && d100 <= 90) {
                    return 5;}
                if (d100 >= 91 && d100 <= 100) {
                    return 6;}
            case 7:
                if (d100 == 1) {
                    return 1;}
                if (d100 >= 2 && d100 <= 5) {
                    return 2;}
                if (d100 >= 6 && d100 <= 15) {
                    return 3;}
                if (d100 >= 16 && d100 <= 35) {
                    return 4;}
                if (d100 >= 36 && d100 <= 75) {
                    return 5;}
                if (d100 >= 76 && d100 <= 100) {
                    return 6;}
            case 8:
                if (d100 == 1) {
                    return 1;}
                if (d100 >= 2 && d100 <= 5) {
                    return 2;}
                if (d100 >= 6 && d100 <= 10) {
                    return 3;}
                if (d100 >= 11 && d100 <= 20) {
                    return 4;}
                if (d100 >= 21 && d100 <= 65) {
                    return 5;}
                if (d100 >= 66 && d100 <= 100) {
                    return 6;}
            case 9:
                if (d100 == 1) {
                    return 1;}
                if (d100 >= 2 && d100 <= 3) {
                    return 2;}
                if (d100 >= 4 && d100 <= 5) {
                    return 3;}
                if (d100 >= 6 && d100 <= 10) {
                    return 4;}
                if (d100 >= 11 && d100 <= 50) {
                    return 5;}
                if (d100 >= 51 && d100 <= 100) {
                    return 6;}
            case 10:
                if (d100 == 1) {
                    return 1;}
                if (d100 >= 2 && d100 <= 3) {
                    return 2;}
                if (d100 >= 4 && d100 <= 5) {
                    return 3;}
                if (d100 >= 6 && d100 <= 10) {
                    return 4;}
                if (d100 >= 11 && d100 <= 35) {
                    return 5;}
                if (d100 >= 36 && d100 <= 100) {
                    return 6;}
            default:
                return 1;
        }
	}

    public void printShop() {
        for (int i = 0; i < activeSlots.size(); i++) {
            System.out.print(activeSlots.get(i).toString());
        }
    }
    
    
    @Override
    public String toString() {
        String shopString = "";
        for (int i = 0; i < activeSlots.size(); i++) {
            shopString.concat(activeSlots.get(i).toString());
        }
        return shopString;
    }
}
