package utils;

import java.util.ArrayList;
import java.util.Random;

import pokemons.PokeList;
import pokemons.Pokemon;

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
	
	public static Pokemon clone(Pokemon pokemon) {
		return pokemon;
	}
	
	static ArrayList<PokeList> tier1 = new ArrayList<>();
	static ArrayList<PokeList> tier2 = new ArrayList<>();
	static ArrayList<PokeList> tier3 = new ArrayList<>();
	static ArrayList<PokeList> tier4 = new ArrayList<>();
	static ArrayList<PokeList> tier5 = new ArrayList<>();
	static ArrayList<PokeList> tier6 = new ArrayList<>();

	
	
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