import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import player.Player;
import pokemons.PokeList;
import pokemons.Pokemon;
import screens.arena.battle.duel.Duel;
import screens.arena.shop.Shop;
import screens.titlescreen.TitleScreen;
import utils.PokeUtils;

public class main {
    public static void main(String[] args) throws IOException {
//Chama só o Menu
TitleScreen tScreen = new TitleScreen();
PokeUtils.clear();
tScreen.run();

//Testes preliminares
PokeUtils.defineTiers();

Pokemon bulba = new Pokemon(PokeList.BULBASAUR);
bulba.setNickname("Bulbinho");
Pokemon ivy = new Pokemon(PokeList.IVYSAUR);
ivy.setNickname("Ivinho");
Pokemon veninho = new Pokemon(PokeList.VENUSAUR);
veninho.setNickname("Veninho");

Pokemon squir = new Pokemon(PokeList.SQUIRTLE);
squir.setNickname("Squirtinho");
Pokemon wart = new Pokemon(PokeList.WARTORTLE);
wart.setNickname("Warto");
Pokemon blast = new Pokemon(PokeList.BLASTOISE);
blast.setNickname("Blastinho");

Pokemon charm = new Pokemon(PokeList.CHARMANDER);
charm.setNickname("Charminho");
Pokemon charas = new Pokemon(PokeList.CHARMELEON);
charas.setNickname("Charme");
Pokemon charinho = new Pokemon(PokeList.CHARIZARD);
charinho.setNickname("Charam");

Pokemon caterpie = new Pokemon(PokeList.CATERPIE);
caterpie.setNickname("Caterpinha");

Pokemon weedle = new Pokemon(PokeList.WEEDLE);
weedle.setNickname("Weedlinho");

Pokemon pidgey = new Pokemon(PokeList.PIDGEY);
pidgey.setNickname("Pombo");

Pokemon rattata = new Pokemon(PokeList.RATTATA);
rattata.setNickname("Ratazana");

Pokemon spearow = new Pokemon(PokeList.SPEAROW);
spearow.setNickname("Pardal");
Pokemon row = new Pokemon(PokeList.SPEAROW);
row.setNickname("Perow");

Pokemon ekans = new Pokemon(PokeList.EKANS);
ekans.setNickname("Cobroxa");

Pokemon pika = new Pokemon(PokeList.PIKACHU);
pika.setNickname("Pika");

// System.out.println(caterpie);
// System.out.println();
// System.out.println(weedle);

// Duel duel = new Duel(caterpie, weedle);

// Player player = new Player();
// player.advanceRound();

// Shop shop = new Shop(player);
// System.out.println();
// shop.refreshShop(player);
// shop.printShop();



    }

    // ARENA - SETTINGS - DECKS
    private static void menu() {
    }
}