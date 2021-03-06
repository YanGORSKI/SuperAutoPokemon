package pokemons;

import pokemons.abilities.Ability;
import pokemons.moves.MoveList;
import pokemons.types.PokeType;

public enum PokeList {
	
	
	
	//bulbasauro evoLine
	//			evos, 			name				    type1				type2		frm			tier			HP				ATK				DEF				SATK				SDEF				SPD 		Ability1			Ability2			Move1					Move2					Move3					Move4
	BULBASAUR	(3,	"Bulbasaur",     PokeType.GRASS,     PokeType.NULL, 	1, 	1, 		180, 	49, 	49,  	65,  	65,  	45, 	Ability.OVERGROW, 	Ability.OVERGROW, 	MoveList.TACKLE, 		MoveList.GROWL, 		MoveList.VINE_WHIP, 	MoveList.RAZOR_LEAF),
	IVYSAUR		(3,	"Ivysaur", 		PokeType.GRASS, 	PokeType.NULL, 	2, 	3, 		240, 	62, 	63,  	80,  	80,  	60, 	Ability.OVERGROW, 	Ability.OVERGROW, 	MoveList.VINE_WHIP, 	MoveList.GROWTH, 		MoveList.POISON_POWDER, MoveList.RAZOR_LEAF),
	VENUSAUR	(3,	"Venusaur", 		PokeType.GRASS, 	PokeType.NULL, 	3, 	6, 		320, 	82, 	83,  	100, 	100, 	80, 	Ability.OVERGROW, 	Ability.OVERGROW, 	MoveList.RAZOR_LEAF, 	MoveList.POISON_POWDER, MoveList.LEECH_SEED, 	MoveList.SOLAR_BEAM),
	//charmander evoLine
	//			evos, 			name				    type1				type2		frm			tier			HP				ATK				DEF				SATK				SDEF				SPD 		Ability1			Ability2			Move1					Move2					Move3					Move4
	CHARMANDER	(3,"Charmander", 	PokeType.FIRE,  	PokeType.NULL, 	1, 	1, 		156, 	52, 	43,  	60,  	50,  	65, 	Ability.BLAZE, 		Ability.BLAZE, 	  	MoveList.SCRATCH, 		MoveList.GROWL, 		MoveList.LEER, 			MoveList.EMBER),
	CHARMELEON	(3,"Charmeleon", 	PokeType.FIRE,  	PokeType.NULL, 	2, 	3, 		232, 	64, 	58,  	80,  	65,  	80, 	Ability.BLAZE, 		Ability.BLAZE, 	  	MoveList.EMBER, 		MoveList.LEER, 			MoveList.RAGE, 			MoveList.FLAMETHROWER),
	CHARIZARD	(3,"Charizard", 	PokeType.FIRE,  	PokeType.NULL, 	3, 	6, 		312, 	84, 	78,  	109, 	85,  	100, 	Ability.BLAZE, 		Ability.BLAZE, 	  	MoveList.FLAMETHROWER, 	MoveList.RAGE, 			MoveList.SLASH, 		MoveList.FIRE_SPIN),
	//squirtle evoLine														156
	//			evos, 			name				    type1				type2		frm			tier			HP				ATK				DEF				SATK				SDEF				SPD 		Ability1			Ability2			Move1					Move2					Move3					Move4
	SQUIRTLE	(3,"Squirtle", 		PokeType.WATER, 	PokeType.NULL, 	1, 	1, 		176, 	48, 	65,  	50,  	64,  	43, 	Ability.TORRENT, 	Ability.TORRENT,  	MoveList.TACKLE, 		MoveList.TAIL_WHIP, 	MoveList.BUBBLE, 		MoveList.WATER_GUN),
	WARTORTLE	(3,"Wartortle", 	PokeType.WATER, 	PokeType.NULL, 	2, 	3, 		236, 	63, 	80,  	65,  	80,  	58, 	Ability.TORRENT, 	Ability.TORRENT,  	MoveList.WATER_GUN, 	MoveList.WITHDRAW, 		MoveList.BITE, 			MoveList.SKULL_BASH),
	BLASTOISE	(3,"Blastoise",		PokeType.WATER, 	PokeType.NULL, 	3, 	6, 		316, 	83, 	100, 	85,  	105, 	78, 	Ability.TORRENT, 	Ability.TORRENT,  	MoveList.BITE, 			MoveList.SKULL_BASH, 	MoveList.WITHDRAW, 		MoveList.HYDRO_PUMP),
	
	//Caterpie evoline
	//			evos, 			name				    type1				type2		frm			tier			HP				ATK				DEF				SATK				SDEF				SPD 		Ability1			Ability2			Move1					Move2					Move3					Move4
	CATERPIE	(3,"Caterpie",	PokeType.BUG,		PokeType.NULL, 		1, 1, 180, 	30, 35, 20, 20, 45,	Ability.SHIELD_DUST,	Ability.SHIELD_DUST, 	MoveList.TACKLE, 		MoveList.STRING_SHOT, 	MoveList.TACKLE, 		MoveList.STRING_SHOT),
	
	//Weedle evoline
	WEEDLE 		(3,"Weedle", 	PokeType.BUG, 		PokeType.POISON, 	1, 1, 160, 	35, 30, 20, 20, 50, 	Ability.SHIELD_DUST, 	Ability.SHIELD_DUST, 	MoveList.POISON_STING, 	MoveList.STRING_SHOT, 	MoveList.POISON_STING, 	MoveList.STRING_SHOT),
	
	//Pidgey evoline
	PIDGEY		(3,"Pidgey", 	PokeType.NORMAL, 	PokeType.FLYING, 	1, 1, 160, 	45, 40, 35, 35, 56, 	Ability.KEEN_EYE, 		Ability.TANGLED_FEET, 	MoveList.GUST, 			MoveList.AGILITY, 		MoveList.SAND_ATTACK, 	MoveList.QUICK_ATTACK),

	//Rattata evoline
	//			name				type1				type2					frm		tier		HP			ATK			DEF				SATK		SDEF		SPD 	Ability1			Ability2				Move1					Move2					Move3						Move4
	RATTATA		(2,"Rattata", 	PokeType.NORMAL, 	PokeType.NULL, 		1, 1, 120, 56, 35, 25, 35, 72, Ability.GUTS, 		Ability.HUSTLE, 		MoveList.TACKLE, 		MoveList.TAIL_WHIP, 	MoveList.QUICK_ATTACK,		MoveList.FOCUS_ENERGY),
	
	//Spearow evoline
	SPEAROW 	(2,"Spearow", 	PokeType.NORMAL, 	PokeType.FLYING,    1, 1, 160, 60, 30, 31, 31, 70, Ability.KEEN_EYE, 	Ability.SNIPER, 		MoveList.PECK, 			MoveList.GROWL, 		MoveList.LEER, 				MoveList.FURY_ATTACK),
	
	//Ekans evoline
	EKANS 		(2,"Ekans", 	PokeType.POISON, 	PokeType.NULL, 		1, 1, 140, 60, 44, 40, 54, 55, Ability.INTIMIDATE, 	Ability.SHED_SKIN, 		MoveList.WRAP, 			MoveList.LEER, 			MoveList.POISON_STING, 		MoveList.BITE),
	
	//Pikachu evoline
	PIKACHU 	(2,"Pikachu", 	PokeType.ELECTRIC, 	PokeType.NULL, 		1, 1, 140, 55, 30, 50, 40, 90, Ability.STATIC, 		Ability.LIGHTNING_ROD, 	MoveList.THUNDER_SHOCK, MoveList.DOUBLE_TEAM, 	MoveList.AGILITY, 			MoveList.THUNDERBOLT)
	;
	
	
	
	
	String name;
	PokeType type1;
	PokeType type2;
	int form;
	int tier;
	int evos;
	double baseHP; 
	double baseATK; 
	double baseDEF; 
	double baseS_ATK; 
	double baseS_DEF; 
	double baseSPD; 
	double baseEVS;
	Ability ability1;
	Ability ability2;
	MoveList move1;
	MoveList move2;
	MoveList move3;
	MoveList move4;
	
	
	private PokeList
			(
			int evos,
			String name,
			PokeType type1,
			PokeType type2,
			int form,
			int tier,
			double baseHP,
			double baseATK,
			double baseDEF,
			double baseS_ATK,
			double baseS_DEF,
			double baseSPD,
			Ability ability1,
			Ability ability2,
			MoveList move1,
			MoveList move2,
			MoveList move3,
			MoveList move4
			)
	{
		this.evos		= evos;
		this.name 		= name;
		this.type1 		= type1;
		this.type2 		= type2;
		this.form 		= form;
		this.tier 		= tier;
		this.baseHP 	= baseHP;
		this.baseATK 	= baseATK;
		this.baseDEF 	= baseDEF;
		this.baseS_ATK 	= baseS_ATK;
		this.baseS_DEF 	= baseS_DEF;
		this.baseSPD 	= baseSPD;
		this.baseEVS 	= 0d;
		this.ability1	= ability1;
		this.ability2 	= ability2;
		this.move1 		= move1;
		this.move2 		= move2;
		this.move3 		= move3;
		this.move4 		= move4;
	}
	
	
	public PokeType getType1() {
		return type1;
	}
	public PokeType getType2() {
		return type2;
	}
	public String getName() {
		return name;
	}
	public int getForm() {
		return form;
	}
	public int getTier() {
		return tier;
	}
	public double getBaseHP() {
		return baseHP;
	}
	public double getBaseATK() {
		return baseATK;
	}
	public double getBaseDEF() {
		return baseDEF;
	}
	public double getBaseS_ATK() {
		return baseS_ATK;
	}
	public double getBaseS_DEF() {
		return baseS_DEF;
	}
	public double getBaseSPD() {
		return baseSPD;
	}
	public double getBaseEVS() {
		return baseEVS;
	}
	public MoveList getMove1() {
		return move1;
	}
	public MoveList getMove2() {
		return move2;
	}
	public MoveList getMove3() {
		return move3;
	}
	public MoveList getMove4() {
		return move4;
	}
	
	
	
	
}
