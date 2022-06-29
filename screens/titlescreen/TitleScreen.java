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

    int index;

    public TitleScreen() {
        this.index = 0;
    }

    String[] options = {    "Arena",
                            "Deck Builder",
                            "Options",
                            "Exit",

    };

    public void printMenu() {
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
    

    public void run() throws IOException {
        PokeUtils.clear();
        String input;
        while (true) {
            PokeUtils.clear();
            printMenu();
            input = PokeUtils.input().toUpperCase();
            
            switch (input) {
                case "A":
                case "ARENA":
                ShopScreen shopScrn = new ShopScreen();
                shopScrn.run();

                break;
                case "D":
                case "DECK":
                case "DB":
                case "DECK BUILD":
                case "DECKBUILD":
                case "DECK BUILDER":
                case "DECKBUILDER":
                // DeckBuilder.run();

                break;
                case "O":
                case "OPTIONS":
                case "OPT":
                // OptionsScreen.run();

                break;
                case "E":
                case "EXIT":
                case "QUIT":
                System.exit(0);
                break;
                default:
                System.out.println("Please, type a valid option");
                PokeUtils.waitInput();
                // String placeholder = sc.next();
                
                break;
            
            }
        }
    }
}