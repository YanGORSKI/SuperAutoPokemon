package screens.arena;

import java.io.IOException;

import utils.PokeUtils;
import utils.TFormat;
//TORNAR SHOPSCREEN STATIC
public class ShopScreen {
    Arena arena = null;
    boolean goToBattle = false;

    public ShopScreen() {
        this.arena = new Arena();
        this.goToBattle = false;
    }
    
    public void run() throws IOException {
        PokeUtils.clear();
        if (this.arena == null) {
            this.arena = new Arena();
        }
        while(!this.goToBattle) {
            PokeUtils.clear();
            this.printShopScreen();
            String input = PokeUtils.input().toUpperCase();

            switch(input) {
                case "BUY":
                case "B":
                PokeUtils.clear();
                this.printShopScreen();
                arena.shop.buyOption();
                break;
                case "SELL":
                case "S":
                PokeUtils.clear();
                this.printShopScreen();
                arena.shop.sellOption();
                break;
                case "EVOLVE":
                case "E":
                PokeUtils.clear();
                this.printShopScreen();
                arena.shop.evolveOption();
                break;
                case "FIGHT":
                case "F":
                arena.fightOption();
                break;
                case "REFRESH":
                case "R":
                case "RE":
                arena.shop.refreshShop(arena.player);;
                break;
                default:
                PokeUtils.clear();
                this.printShopScreen();
                System.out.println("Please select a valid option");
                PokeUtils.waitInput();
                break;

            }
            
        }

    }

    private void printOptionsHorizontal() {
        String[] options = {
                            "Fight",
                            "Buy",
                            "Sell",
                            "Evolve",
                            "Refresh"
                        };
        for (int i = 0; i < options.length; i++) {
            char[] word = options[i].toCharArray();
            String print = "";
            for (int x = 0; x < word.length;x++) {
                if (x == 0) {
                    print = print + TFormat.ANSI_RED + word[x] + TFormat.ANSI_reset;
                } else {
                    print = print + word[x];
                }
            }
            if (i == options.length-1) {
                System.out.print(print + "\n");    
            } else {
                System.out.print(print + "\t");
            }
        }
    }

    private void printShopScreen() {
        this.arena.player.printPlayer();
        System.out.println();
        System.out.println();
        this.arena.player.getTeam().printMyTeam();
        System.out.println("My Team");
        System.out.println();
        this.arena.shop.printShop();
        System.out.println();
        System.out.println("Buy Pokemon - 3 Gold\t\tBuy Item - 3 Gold");
        System.out.println();
        this.printOptionsHorizontal();
        //debug
        // System.out.println(this.arena.player.getGold());
    }

    public void goToBattle() {
        this.goToBattle = true;
    }

    
}
