package utils;

import java.util.Random;

import pokemons.Pokemon;

public class PokeUtils {
	Random random = new Random();
	
	public static int d20() {
		int d20 = (int)(Math.random() * 20 + 1);
		return d20;
		
	}
	
	public static Pokemon clone(Pokemon pokemon) {
		return pokemon;
		
	}
	
	
	

}
