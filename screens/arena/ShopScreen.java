package screens.arena;

import java.io.IOException;

import utils.PokeUtils;
import utils.TFormat;
//TORNAR SHOPSCREEN STATIC
public class ShopScreen {
    public static Arena arena = null;
    static boolean goToBattle = false;
    static String[] shopOptions = {
        "Buy",
        "Sell",
        "Lock|Unlock",
        "Refresh"
    };
    static String[] teamOptions = {
        "Move",
        "Evolve",
        "Info"
    };
    static String[] gameOptions = {
        "Fight",
        "Config",
        "Quit"
    };

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
                case "MOVE":
                case "M":
                PokeUtils.clear();
                printShopScreen();
                arena.player.getTeam().moveOption();
                break;
                case "EVOLVE":
                case "E":
                PokeUtils.clear();
                printShopScreen();
                arena.shop.evolveOption();
                break;
                case "INFO":
                case "I":
                PokeUtils.clear();
                printShopScreen();
                arena.player.getTeam().infoOption();
                break;
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
                case "LOCK":
                case "UNLOCK":
                case "L":
                case "U":
                case "UN":
                arena.shop.lockSlotToggle();
                break;
                case "REFRESH":
                case "R":
                case "RE":
                arena.shop.refreshShop();;
                break;
                case "FIGHT":
                case "F":
                arena.fightOption();
                break;
                case "CONFIG":
                case "C":
                arena.fightOption();
                break;
                case "QUIT":
                case "Q":
                case "EXIT":
                arena.fightOption();
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

    private static void printOptionsHorizontal(String[] options) {
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
        arena.player.getTeam().printMyTeam();
        System.out.println("My Team");
        System.out.println();
        arena.shop.printShopSlots();
        System.out.println();
        System.out.println("Buy Pokemon \t- 3 Gold     Buy Item - 3 Gold");
        System.out.println("Evolve Pokemon \t- 5 Gold");
        System.out.println();
        System.out.print("Team: ");
        printOptionsHorizontal(ShopScreen.teamOptions);
        System.out.print("Shop: ");
        printOptionsHorizontal(ShopScreen.shopOptions);
        System.out.print("Game: ");
        printOptionsHorizontal(ShopScreen.gameOptions);
        //debug
        // System.out.println(arena.player.getGold());
    }

    public static void goToBattle() {
        goToBattle = true;
    }

    
}
