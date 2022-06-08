import pokemons.PokeList;
import pokemons.Pokemon;
import pokemons.conditions.Condition;
import screens.arena.battle.duel.Duel;
import screens.titlescreen.*;

public class main {
    public static void main(String[] args) {
//Chama só o Menu
// TitleScreen.run();      
// menu();

//Testes preliminares
Pokemon bulba = new Pokemon(PokeList.BULBASAUR);
bulba.setNickname("Bulbinho");
Pokemon saur = new Pokemon(PokeList.BULBASAUR);
saur.setNickname("Saurinho");

Pokemon squir = new Pokemon(PokeList.SQUIRTLE);
squir.setNickname("Squirtinho");
Pokemon tlezin = new Pokemon(PokeList.SQUIRTLE);
tlezin.setNickname("Taruguinho");

Pokemon charm = new Pokemon(PokeList.CHARMANDER);
charm.setNickname("Charminho");
Pokemon mander = new Pokemon(PokeList.CHARMANDER);
mander.setNickname("Mandinho");

Pokemon ivy = new Pokemon(PokeList.IVYSAUR);
ivy.setNickname("Ivinho");
Pokemon saurosso = new Pokemon(PokeList.IVYSAUR);
saurosso.setNickname("Saurosso");

Pokemon wart = new Pokemon(PokeList.WARTORTLE);
wart.setNickname("Warto");
Pokemon tortl = new Pokemon(PokeList.WARTORTLE);
tortl.setNickname("Tortle");

Pokemon charas = new Pokemon(PokeList.CHARMELEON);
charas.setNickname("Charme");
Pokemon meleon = new Pokemon(PokeList.CHARMELEON);
meleon.setNickname("Cameleon");

Pokemon veninho = new Pokemon(PokeList.VENUSAUR);
veninho.setNickname("Veninho");
Pokemon sauraum = new Pokemon(PokeList.VENUSAUR);
sauraum.setNickname("Sauraum");

Pokemon blast = new Pokemon(PokeList.BLASTOISE);
blast.setNickname("Blastinho");
Pokemon toize = new Pokemon(PokeList.BLASTOISE);
toize.setNickname("Toizaum");

Pokemon charinho = new Pokemon(PokeList.CHARIZARD);
charinho.setNickname("Charam");
Pokemon zardaum = new Pokemon(PokeList.CHARIZARD);
zardaum.setNickname("Lizardaum");



Duel duel = new Duel(ivy, saurosso);


    }

    // ARENA - SETTINGS - DECKS
    private static void menu() {
    }
}