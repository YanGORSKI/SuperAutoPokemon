package screens.arena;

import java.io.IOException;

import utils.PokeUtils;
import utils.TFormat;
//TORNAR SHOPSCREEN STATIC
public class ShopScreen {
    public static Arena arena = null;
    static boolean goToBattle = false;

    private ShopScreen() {
        arena = new Arena();
        goToBattle = false;
    }
    
    public static void run() throws IOException {
        PokeUtils.clear();
        if (arena == null) {
            arena = new Arena();
        }
        while(!goToBattle) {
            PokeUtils.clear();
            printShopScreen();
            String input = PokeUtils.input().toUpperCase();

            switch(input) {
                case "BUY":
                case "B":
                PokeUtils.clear();
                printShopScreen();
                arena.shop.buyOption();
                break;
                case "SELL":
                case "S":
                PokeUtils.clear();
                printShopScreen();
                arena.shop.sellOption();
                break;
                case "EVOLVE":
                case "E":
                PokeUtils.clear();
                printShopScreen();
                arena.shop.evolveOption();
                break;
                case "FIGHT":
                case "F":
                arena.fightOption();
                break;
                case "REFRESH":
                case "R":
                case "RE":
                arena.shop.refreshShop();;
                break;
                default:
                PokeUtils.clear();
                printShopScreen();
                PokeUtils.invalidInput();
                PokeUtils.waitInput();
                break;

            }
            
        }

    }

    private static void printOptionsHorizontal() {
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

    public static void printShopScreen() {
        arena.player.printPlayer();
        System.out.println();
        System.out.println();
        arena.player.getTeam().printMyTeam();
        System.out.println("My Team");
        System.out.println();
        arena.shop.printShopSlots();
        System.out.println();
        System.out.println("Buy Pokemon - 3 Gold\t\tBuy Item - 3 Gold");
        System.out.println();
        printOptionsHorizontal();
        //debug
        // System.out.println(arena.player.getGold());
    }

    public static void goToBattle() {
        goToBattle = true;
    }

    
}
