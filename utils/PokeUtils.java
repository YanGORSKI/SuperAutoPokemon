package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import pokemons.PokeList;
import pokemons.Pokemon;
import screens.arena.ShopScreen;
import screens.arena.shop.Buyable;
import screens.arena.shop.Shop;

public class PokeUtils {
	Random random = new Random();

	public static int dn(int n) {
		int dn = (int) (Math.random() * n + 1);
		return dn;
	}
	
	public static int d20() {
		int d20 = (int) (Math.random() * 20 + 1);
		return d20;
	}

	public static int d100() {
		int d100 = (int) (Math.random() * 100 + 1);
		return d100;
	}

	public static String input() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        line = in.readLine();
		return line;
    }

	public static void waitInput() throws IOException {
		System.out.println("Press ENTER:");
		String wait = input();
	}
	
	
	public static Buyable clone(Buyable buyable) {
		return buyable;
	}

	public static int shopIndexInput(Shop shop) throws IOException {
		int shopIndex = 100;
		System.out.println("Enter the slot position on the shop that you want to buy\nBetween 1 and " + shop.getActiveSlots().size());
		while (!(shopIndex > 0 && shopIndex < shop.getActiveSlots().size()+1)) {
            // ShopScreen.printShop();
			try {
                shopIndex = Integer.parseInt(PokeUtils.input());
            } catch (NumberFormatException e) {
                System.out.println("Invalid Option");
				PokeUtils.waitInput();
				continue;
            } catch (IOException e) {
                System.out.println("Invalid Option");
                PokeUtils.waitInput();
				continue;
            }
        }
		return shopIndex;
	}
	
	static ArrayList<PokeList> tier1 = new ArrayList<>();
	static ArrayList<PokeList> tier2 = new ArrayList<>();
	static ArrayList<PokeList> tier3 = new ArrayList<>();
	static ArrayList<PokeList> tier4 = new ArrayList<>();
	static ArrayList<PokeList> tier5 = new ArrayList<>();
	static ArrayList<PokeList> tier6 = new ArrayList<>();

	
	public static void clear() {
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}
	
	
	public static ArrayList<PokeList> getTier1() {
		return tier1;
	}

	public static ArrayList<PokeList> getTier2() {
		return tier2;
	}

	public static ArrayList<PokeList> getTier3() {
		return tier3;
	}

	public static ArrayList<PokeList> getTier4() {
		return tier4;
	}

	public static ArrayList<PokeList> getTier5() {
		return tier5;
	}

	public static ArrayList<PokeList> getTier6() {
		return tier6;
	}

	public static void defineTiers() {
	
		for (int i = 0; i < PokeList.values().length; i++) {
			if (PokeList.values()[i].getTier() == 1) {
				tier1.add(PokeList.values()[i]);
			}
		}

	
		for (int i = 0; i < PokeList.values().length; i++) {
			if (PokeList.values()[i].getTier() == 2) {
				tier2.add(PokeList.values()[i]);
			}
		}

	
		for (int i = 0; i < PokeList.values().length; i++) {
			if (PokeList.values()[i].getTier() == 3) {
				tier3.add(PokeList.values()[i]);
			}
		}

	
		for (int i = 0; i < PokeList.values().length; i++) {
			if (PokeList.values()[i].getTier() == 4) {
				tier4.add(PokeList.values()[i]);
			}
		}

	
		for (int i = 0; i < PokeList.values().length; i++) {
			if (PokeList.values()[i].getTier() == 5) {
				tier5.add(PokeList.values()[i]);
			}
		}

	
		for (int i = 0; i < PokeList.values().length; i++) {
			if (PokeList.values()[i].getTier() == 6) {
				tier6.add(PokeList.values()[i]);
			}
		}
	}

	

}