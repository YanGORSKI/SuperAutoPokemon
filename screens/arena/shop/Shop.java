package screens.arena.shop;

import java.io.IOException;
import java.util.ArrayList;

import player.Player;
import pokemons.Pokemon;
import screens.arena.ShopScreen;
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
    Player player;

    public Shop(Player player) {
        this.player = player;
        if (player.getRound() > 30) {
            this.currentTier = 10;
        } else {
            this.currentTier = (int)(Math.ceil(player.getRound()/3));
        }
        unlockSlots();
        for (int i = 0; i < activeSlots.size(); i++) {
            activeSlots.get(i).generate(this);
        }
        // printShop();
        
    }

    public ArrayList<Slot> getActiveSlots() {
        return this.activeSlots;
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

    public void refreshShop(Player player) {
        if (player.getGold() < 1) {
            System.out.println("You don't have enough money to refresh the shop");
        } else {
            player.spendGold(1);
            System.out.println("Player spent 1 gold to refresh the shop and now has: " + player.getGold() + " Gold");
            for (int i=0; i < (this.activeSlots.size()-1);i++) {
                if (this.activeSlots.get(i).isFrozen) {
                    System.out.println("Slot " + i + " is frozen");
                } else {
                    this.activeSlots.get(i).generate(this);
                }
            }
        }
    }
    
    public void buyPokemon(Player player, Slot source, PokeSlot destiny) {
        if (player.getGold() < 3) {
            System.out.println("You don't have enough money to buy a Pokemon");
        } else {
            if (!(destiny.content == null)) {
                System.out.println("The chosen slot is occupied");
            } else {
                player.spendGold(3);
                System.out.println("Player bought " + source.getContent().getName() + " for 3 Gold and has now " + player.getGold() + " Gold");
                destiny.content = (Pokemon) PokeUtils.clone(source.getContent());
                source.deleteContent();
            }
        }
    }

    public void sellPokemon(Player player, PokeSlot slot) {
        if (!slot.hasContent()) {
            System.out.println("There's nothing to sell");
            return;
        } else {
            int price = (slot.getContent().getLVL()*1);
            player.earnGold(price);
            slot.deleteContent();
            System.out.println("Sold " + slot.getContent().getName() + "(LvL " + slot.getContent().getLVL() + ") for " + price);
        }
    }
    
    public void printShop() {
        for (int i = 0; i < activeSlots.size(); i++) {
            // if (activeSlots.get(i+1).getClass()) {

            // }
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
    
    // public void sellOption() {
    //     int teamIndex = 100;
    // }
    
    public void buyOption() throws IOException {
        int shopIndex = 100;
        int teamIndex = 100;
        shopIndex = PokeUtils.shopIndexInput(this);
        if (this.activeSlots.get(shopIndex-1).toString().equals("[EMPTY]")) {
            System.out.println("There's nothing to buy in here");
            PokeUtils.waitInput();
            return;
        }
        if (player.getGold() < this.activeSlots.get(shopIndex-1).getCost()) {
            System.out.println("You don't have enough Gold");
            PokeUtils.waitInput();
            return;
        } else {
                System.out.println("Enter the slot position on your team that you'll place your new Pokemon");
            while (!(teamIndex > 0 && teamIndex < 6)) {
                try {
                    teamIndex = Integer.parseInt(PokeUtils.input());
                } catch (NumberFormatException e) {
                    System.out.println("Enter the slot position on your team that you'll place your new Pokemon\nBetween 1 and 5");
                    PokeUtils.waitInput();
                } catch (IOException e) {
                    System.out.println("Enter the slot position on your team that you'll place your new Pokemon\nBetween 1 and 5");
                    PokeUtils.waitInput();
                }
            }
            if (player.getTeam().getSlots().get(teamIndex-1).hasContent()) {
                if(player.getTeam().getSlots().get(teamIndex-1).getContent().getName().equals(this.activeSlots.get(shopIndex-1).getContent().getName())) {
                    player.getTeam().getSlots().get(teamIndex-1).getContent().levelUp();
                    return;
                } else {
                    System.out.println("Team Slot occupied");
                    PokeUtils.waitInput();
                    return;
                }
            } else {
                this.buyPokemon(this.player, this.activeSlots.get(shopIndex-1), this.player.getTeam().getSlots().get(teamIndex-1));
                return;
            }
        }


    }

    public void sellOption() {
    }

    public void evolveOption() {
    }
}
