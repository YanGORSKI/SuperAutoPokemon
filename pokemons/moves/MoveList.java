package pokemons.moves;



import pokemons.conditions.Condition;
import pokemons.stats.Stats;
import pokemons.types.PokeType;

public enum MoveList {
    //NORMAL ATTACK
    //	ID				NAME				TYPE				RANGE			PWR	ACC		hits	trns 	dlay	rst		Crit	Recoil	stat		t.stat		value	%efct		CONDITION				EXTRA DMG
        TACKLE			("Tackle",		PokeType.NORMAL,	Range.MELEE,	40,	1.0,	1,		1, 		0, 		0,		0.05,	0,		Stats.ATK,		null,		0.0,	0,		null,					0),
        SCRATCH			("Scratch",		PokeType.NORMAL,	Range.MELEE,	40,	1.0,	1,		1, 		0, 		0,		0.05,	0,		Stats.ATK,		null,		0.0,	0,		null,					0),
        SLASH			("Slash",			PokeType.NORMAL,	Range.MELEE,	70,	1.0,	1,		1, 		0, 		0,		0.15,	0,		Stats.ATK,		null,		0.0,	0,		null,					0),
        BITE			("Bite",			PokeType.NORMAL,	Range.MELEE,	60,	1.0,	1,		1, 		0, 		0,		0.05,	0,		Stats.ATK,		null,		0.0,	0.1,		Condition.FLINCHING,	           0),
        RAGE			("Rage",			PokeType.NORMAL,	Range.MELEE,	20,	1.0,	1,		100,	    0, 		0,		0.05,	0,		Stats.ATK,		Stats.ATK,		        0.2,	1.0,		null,					0),
        SKULL_BASH		("Skull Bash",	PokeType.NORMAL,	Range.MELEE,	130,   1.0,	1,		2, 		1, 		0,		0.05,	0,		Stats.ATK,		null,		0.0,	0.0,		null,					0),
                                                                                                    
    //	DEBUFF MOVES                                                                               
    //	ID				NAME				TYPE				RANGE			PWR	ACC		hits	trns 	dlay	rst		Crit	Recoil	stat		t.stat		value	%efct		CONDITION				EXTRA DMG
        GROWL			("Growl",			PokeType.NORMAL,	Range.RANGED,	0,	1.0,	1,		1, 		0, 		0,		0.0d,	0,		null,		Stats.ATK,		-0.2,	1,			null,					0),
        TAIL_WHIP		("Tail Whip",		PokeType.NORMAL,	Range.RANGED,	0,	1.0,	1,		1, 		0, 		0,		0.0d,	0,		null,		Stats.DEF,		-0.2,	1,			null,					0),
        LEER			("Leer",			PokeType.NORMAL,	Range.RANGED,	0,	1.0,	1,		1, 		0, 		0,		0.0d,	0,		null,		Stats.DEF,		-0.2,	1,			null,					0),
    
    //	BUFF MOVES                                                                               
    //	ID				NAME				TYPE				RANGE			PWR	ACC		hits	trns 	dlay	rst		Crit	Recoil	stat		t.stat		value	%efct		CONDITION				EXTRA DMG
        GROWTH			("Growth",		PokeType.NORMAL,	Range.SELF,		0,	1.0,	1,		1, 		0, 		0,		0.0d,	0,		null,		Stats.SPECIAL,	0.2,	1,			null,					0),
        WITHDRAW		("Withdraw",		PokeType.NORMAL,	Range.SELF,		0,	1.0,	1,		1, 		0, 		0,		0.0d,	0,		null,		Stats.DEF,	0.2,	1,			null,					0),
                                                                                                    
    //	FIRE                                                                                        
    //	ID				NAME				TYPE				RANGE			PWR	ACC		hits	trns 	dlay	rst		Crit	Recoil	stat		t.stat		value	%efct		CONDITION				EXTRA DMG
        EMBER			("Ember",			PokeType.FIRE,		Range.RANGED,	40,	1.0,	1,		1, 		0, 		0,		0.05,	0,		Stats.SATK,	null,		0.0,	0.1,		Condition.BURNING,		0),
        FLAMETHROWER	("Flamethrower",	PokeType.FIRE,		Range.RANGED,	90,	1.0,	1,		1, 		0, 		0,		0.05,	0,		Stats.SATK,	null,		0.0,	0.1,		Condition.BURNING,		0),
        FIRE_SPIN		("Fire Spin",		PokeType.FIRE,		Range.RANGED,	35,	0.85,	1,		5, 		0, 		0,		0.05,	0,		Stats.SATK,	null,		0.0,	1.0,		Condition.BOUND,		0),
                                                                                                   
    //	GRASS                                                                                      
    //	ID				NAME				TYPE				RANGE			PWR	ACC		hits	trns 	dlay	rst		Crit	Recoil	stat		t.stat		value	%efct		CONDITION				EXTRA DMG
        VINE_WHIP		("Vine Whip",		PokeType.GRASS,	Range.MELEE,	45,	1.0,	1,		1, 		0, 		0,		0.05,	0,		Stats.ATK,		null,		0.0,	0,			null,					0),
        RAZOR_LEAF		("Razor Leaf",	PokeType.GRASS,	Range.RANGED,	55,	0.95,	1,		1, 		0, 		0,		0.15,	0,		Stats.ATK,		null,		0.0,	0,			null,					0),
        SEED_BOMB		("Seed Bomb",		PokeType.GRASS,	Range.RANGED,	80,	1,		1,		1, 		0, 		0,		0.05,	0,		Stats.ATK,		null,		0.0,	0,			null,					0),
        LEECH_SEED		("Leech Seed",	PokeType.GRASS,	Range.RANGED,	0,	    0.9,	1,		1,	    0, 		0,		0.00,	0,		null,		null,		0.0,	1.0,			Condition.SEEDED,		0),
        SOLAR_BEAM		("Solar Beam",	PokeType.GRASS,	Range.RANGED,	120,	1,		1,		2, 		1, 		0,		0.05,	0,		Stats.SATK,	null,		0.0,	0,			null,					0),
                                                                                                    
    //	WATER                                                                                      
    //	ID				NAME				TYPE				RANGE			PWR	ACC		hits	trns 	dlay	rst		Crit	Recoil	stat		t.stat		value	%efct		CONDITION				EXTRA DMG
        BUBBLE			("Bubble",		PokeType.WATER,	Range.RANGED,	40,	1.0,	1,		1, 		0, 		0,		0.05,	0,		Stats.SATK,	Stats.SPD,		                   -0.2,   0.3,		    null,					0),
        WATER_GUN		("Water Gun",		PokeType.WATER,	Range.RANGED,	50,	1.0,	1,		1, 		0, 		0,		0.0d,	0,		Stats.SATK,	null,		0.0,	0,			null,					0),
        HYDRO_PUMP		("Hydro Pump",	PokeType.WATER,	Range.RANGED,	110,   0.8,	1,		1, 		0, 		0,		0.0d,	0,		Stats.SATK,	null,		0.0,	0,			null,					0),
                                                                                                    
    //	POISON                                                                                    
    //	ID				NAME				TYPE				RANGE			PWR	ACC		hits	trns 	dlay	rst		Crit	Recoil	stat		t.stat		value	%efct		CONDITION				EXTRA DMG
        POISON_POWDER	("Poison Powder",	PokeType.POISON,	Range.RANGED,	0,	0.2,	1,		1, 		0, 		0,		0.00,	0,		null,		null,		0.0,	1,			Condition.POISONED,		0);
                                                                                                    
        
    
        String name;
        PokeType type;
        Range range;
        int pwr;
        double acc;
        int hits;
        int turns;
        int delay;
        int rest;
        double critChance;
        double recoil;
        Stats dmgStat;
        Stats effectStat;
        double statChange;
        double effectChance;
        Condition condition;
        int extraDmg;
        
        MoveList(
                String name,
                PokeType type,
                Range range,
                int pwr,
                double acc,
                int hits,
                int turns,
                int delay,
                int rest,
                double critChance,
                double recoil,
                Stats dmgStat,
                Stats effectStat,
                double statChange,
                double effectChance,
                Condition condition,
                int extraDmg
            )
        {
            this.name = name;
            this.type = type;
            this.range = range;
            this.pwr = pwr;
            this.acc = acc;
            this.hits = hits;
            this.turns = turns;
            this.delay = delay;
            this.rest = rest;
            this.critChance = critChance;
            this.recoil = recoil;
            this.dmgStat = dmgStat;
            this.effectStat = effectStat;
            this.statChange = statChange;
            this.effectChance = effectChance;
            this.condition = condition;
            this.extraDmg = extraDmg;
        }
    
        public String getName() {
            return name;
        }
    
        public PokeType getType() {
            return type;
        }
    
        public Range getRange() {
            return range;
        }
    
        public int getPwr() {
            return pwr;
        }
    
        public double getAcc() {
            return acc;
        }
    
        public int getHits() {
            return hits;
        }
    
        public int getTurns() {
            return turns;
        }
    
        public int getDelay() {
            return delay;
        }
    
        public int getRest() {
            return rest;
        }
    
        public double getCritChance() {
            return critChance;
        }
    
        public double getRecoil() {
            return recoil;
        }
    
        public Stats getDmgStat() {
            return dmgStat;
        }
    
        public Stats getEffectStat() {
            return effectStat;
        }
    
        public double getStatChange() {
            return statChange;
        }
    
        public double getEffectChance() {
            return effectChance;
        }
    
        public Condition getCondition() {
            return condition;
        }
    
        public int getExtraDmg() {
            return extraDmg;
        }
    
        
    
        
        
    }
