package pokemons.moves;

import pokemons.Pokemon;
import pokemons.conditions.Condition;
import pokemons.stats.Stats;
import pokemons.types.PokeType;
import utils.PokeUtils;

public class Move {
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

    //Standard Constructor
    public Move(String name, PokeType type, Range range, int pwr, double acc, int hits, int turns, int delay, int rest,
            double critChance, double recoil, Stats dmgStat, Stats effectStat, double statChange, double effectChance,
            Condition condition, int extraDmg) {
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

    //MoveList import constructor
    public Move(MoveList move) {
        this.name         = move.getName();
        this.type         = move.getType();
        this.range        = move.getRange();
        this.pwr          = move.getPwr();
        this.acc          = move.getAcc();
        this.hits         = move.getHits();
        this.turns        = move.getTurns();
        this.delay        = move.getDelay();
        this.rest         = move.getRest();
        this.critChance   = move.getCritChance();
        this.recoil       = move.getRecoil();
        this.dmgStat      = move.getDmgStat();
        this.effectStat   = move.getEffectStat();
        this.statChange   = move.getStatChange();
        this.effectChance = move.getEffectChance();
        this.condition    = move.getCondition();
        this.extraDmg     = move.getExtraDmg();
    }

    public boolean hitCheck(Pokemon target) {
		if((this.acc - target.getEVS()) >= 1) {
			return true;
		}
		if((this.acc - target.getEVS()) < 1) {
			int d20 = PokeUtils.d20();
			if (d20 <= (int)((this.acc - target.getEVS())*20)) {
				return true;
			}
		}
		return false;
	}
    
    public void execute(Pokemon user, Pokemon target) {
        if (this.getPwr() > 0 || this.getExtraDmg() > 0) {
			this.dealDmg(user, target);
		}

		if (this.getCondition() != null) {
			if (this.secEffectCheck()) {
				this.inflictCondition(user, target);
			}
		}

		if (this.getEffectStat() != null) {
			if (this.secEffectCheck()) {
				if ((double)(this.getStatChange()) > 0) this.changeStat(user);
				if ((double)(this.getStatChange()) < 0) this.changeStat(target);
			}
		}
        user.activeMoveTurnsTicks();
	}
    
    public void dealDmg(Pokemon user, Pokemon target) {
		int finalDmg = 0;
		if(this.getDmgStat().equals(Stats.ATK)) {
			double atk_def = ((double)(user.getATK())/(double)(target.getDEF()));

			finalDmg = (int)((atk_def*this.pwr) + this.extraDmg);

			for (int i = 0; i < user.getConditions().size(); i++) {
				finalDmg = (int) (finalDmg*(user.getConditions().get(i).conditionDmgAdj(user)));
			}
		}
		if(this.getDmgStat().equals(Stats.SATK)) {
			double satk_sdef = ((double)(user.getSATK())/(double)(target.getSDEF()));
			finalDmg = (int)((satk_sdef*this.pwr) + this.extraDmg);
			for (int i = 0; i < user.getConditions().size(); i++) {
				finalDmg = (int) (finalDmg*(user.getConditions().get(i).conditionDmgAdj(user)));
			}
		}
		double typeAdjust = this.type.typeAdj(target);
		double abilityAdjust = user.getAbility().abilityCheckDmg(user, this);

		finalDmg = (int)(finalDmg*typeAdjust);
		finalDmg = (int)(finalDmg*abilityAdjust);


		for (int i=0; i<this.hits; i++) {
			if(isCrit(this)) {
				target.takeDmg(finalDmg*1.5);
				System.out.println(user.getNickname() + " deals " + (int)(finalDmg*1.5) + " damage to " + target.getNickname() + ". It's a critical hit!");
			} else {
				target.takeDmg(finalDmg);
				System.out.println(user.getNickname() + " deals " + (int)(finalDmg) + " damage to " + target.getNickname() + ".");
			}
			if (typeAdjust > 1) System.out.println("It's super effective!");
			if (typeAdjust < 1) System.out.println("It's not very effective");
			if (typeAdjust == 0) System.out.println("It had no effect");
            System.out.println(target.getNickname()+"'s HP goes to " + target.getHP());
		}

	}
    
    private boolean isCrit(Move move) {
		int d20 = PokeUtils.d20();
		if(d20 <= (int)(this.critChance*20)) return true;
		return false;
	}

    public void inflictCondition(Pokemon user, Pokemon target) {
		if (target.getConditions().contains(this.getCondition())) {
            System.out.println(target.getNickname() + " is already " + this.getCondition().name());
            return;
        } else {
            target.addCondition(this.getCondition());
            System.out.println(user.getNickname() + " inflicts " + this.getCondition().name() + " to " + target.getNickname());
            if (this.getCondition().equals(Condition.BOUND)) {
                target.setInactiveCount(this.getTurns());
            }
        }
	}

    public void changeStat(Pokemon target) {
        switch (this.effectStat) {
            case HP:
                break;
            case ATK:
                target.changeATK(target.getATK()*this.getStatChange());
                System.out.println(target.getNickname() + "'s ATK has gone to " + target.getATK());
                break;
            case DEF:
                target.changeDEF(target.getDEF()*this.getStatChange());
                System.out.println(target.getNickname() + "'s DEF has gone to " + target.getDEF());
                break;
            case SATK:
                target.changeSATK(target.getSATK()*this.getStatChange());
                System.out.println(target.getNickname() + "'s SATK has gone to " + target.getSATK());
                break;
            case SDEF:
                target.changeSDEF(target.getSDEF()*this.getStatChange());
                System.out.println(target.getNickname() + "'s SDEF has gone to " + target.getSDEF());
                break;
            case SPD:
                target.changeSPD(target.getSPD()*this.getStatChange());
                System.out.println(target.getNickname() + "'s SPD has gone to " + target.getSPD());
                break;
            case EVS:
                target.changeEVS(target.getEVS()*this.getStatChange());
                System.out.println(target.getNickname() + "'s EVS has gone to " + target.getEVS());
                break;
            case SPECIAL:
                target.changeSATK(target.getSATK()*this.getStatChange());
                System.out.println(target.getNickname() + "'s SATK has gone to " + target.getSATK());
                target.changeSDEF(target.getSDEF()*this.getStatChange());
                System.out.println(target.getNickname() + "'s SDEF has gone to " + target.getSDEF());
                break;
            default:
                break;
        }
    }
    
    public boolean secEffectCheck() {
		if((int)(this.getEffectChance()) >= 1) {
			return true;
		}
		if(this.effectChance < 1) {
			int d20 = PokeUtils.d20();
			if(d20 <= (int)(this.effectChance*20)) {
				return true;
			}
		} return false;
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

    @Override
    public String toString() {
        return (
            name + " " + type + "(" + range + ")\n"
            + "PWR: " + pwr + " // ACC: " + acc
        );
    }

    
    
}
