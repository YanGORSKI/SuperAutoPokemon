package screens.titlescreen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import screens.arena.ShopScreen;

import java.util.EventObject;

import utils.PokeUtils;
import utils.TFormat;

public class TitleScreen {
    Scanner sc = new Scanner(System.in);

    int index = 0;

    private TitleScreen() {
        this.index = 0;
    }

    static String[] options = {    "Arena",
                            "Deck Builder",
                            "Options",
                            "Exit",

    };

    public static void printMenu() {
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
                System.out.println(print);
            }
        }
    

    public static void run() throws IOException {
        PokeUtils.clear();
        String input;
        while (true) {
            PokeUtils.clear();
            printMenu();
            input = PokeUtils.input().toUpperCase();
            
            switch (input) {
                case "A":
                case "1":
                case "ARENA":
                ShopScreen.run();

                break;
                case "D":
                case "DECK":
                case "DB":
                case "DECK BUILD":
                case "DECKBUILD":
                case "DECK BUILDER":
                case "DECKBUILDER":
                case "2":
                // DeckBuilder.run();

                break;
                case "O":
                case "OPTIONS":
                case "OPT":
                case "3":
                // OptionsScreen.run();

                break;
                case "E":
                case "EXIT":
                case "QUIT":
                case "4":
                System.exit(0);
                break;
                default:
                PokeUtils.invalidInput();
                PokeUtils.waitInput();
                // String placeholder = sc.next();
                
                break;
            
            }
        }
    }
}