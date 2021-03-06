package pokemons;

import java.io.IOException;
import java.util.ArrayList;

import items.Item;
import pokemons.abilities.Ability;
import pokemons.conditions.Condition;
import pokemons.moves.Move;
import pokemons.stats.Stat;
import pokemons.stats.Stats;
import pokemons.types.PokeType;
import screens.arena.shop.Buyable;
import utils.PokeUtils;
import utils.TypeWriter;

public class Pokemon extends Buyable{
    TypeWriter tWr = new TypeWriter();

    String name;
    String nickname;

    PokeType type1;
    PokeType type2;

    int form;
    int tier;

    int LVL;
    int maxLVL;
    int evos;

    Stat HP;
    Stat ATK;
    Stat DEF;
    Stat SATK;
    Stat SDEF;
    Stat SPD;
    Stat EVS;
    Stat ACC;
    Stat CRIT;

    Move move1;
    Move move2;
    Move move3;
    Move move4;

    Move activeMove;
    int activeMoveMaxTurns;
    int activeMoveTurns;
    int activeMoveDelay;
    int activeMoveRest;

    Move lastUsedMove;
    Move lastSufferedMove;

    Pokemon target;

    Ability ability;

    ArrayList<Condition> conditions = new ArrayList<Condition>();
    ArrayList<Stat> coreStats = new ArrayList<Stat>();
    int inactiveCount;

    Item heldItem;

    //Constructor
    public Pokemon(PokeList pokemon) {
        this.name = pokemon.name;
        this.nickname = pokemon.name;
        
        this.type1 = pokemon.type1;
        if(pokemon.type2 != null) this.type2 = pokemon.type2;
        
        this.form = pokemon.form;
        this.tier = pokemon.tier;
        this.LVL = 0;
        this.evos = pokemon.evos;

        switch (this.evos) {
            case 1:
                this.maxLVL = 10;
                break;
            case 2:
                this.maxLVL = 5;
                break;
            case 3:
                switch (this.form) {
                    case 1:
                        this.maxLVL = 5;
                        break;
                    case 2:
                        this.maxLVL = 3;
                        break;
                    case 3:
                        this.maxLVL = 2;
                        break;
                }    
                break;
        }
        
        this.HP = new Stat(Stats.HP, pokemon.baseHP);
        this.ATK = new Stat(Stats.ATK, pokemon.baseATK);
        this.DEF = new Stat(Stats.DEF, pokemon.baseDEF);
        this.SATK = new Stat(Stats.SATK, pokemon.baseS_ATK);
        this.SDEF = new Stat(Stats.SDEF, pokemon.baseS_DEF);
        this.SPD = new Stat(Stats.SPD, pokemon.baseSPD);
        this.ACC = new Stat(Stats.ACC, 1d);
        this.EVS = new Stat(Stats.EVS, 0d);
        this.CRIT = new Stat(Stats.CRIT, 0d);

        this.move1 = new Move(pokemon.move1);
        this.move2 = new Move(pokemon.move2);
        this.move3 = new Move(pokemon.move3);
        this.move4 = new Move(pokemon.move4);

        if(PokeUtils.d20()>12) {
            this.ability = pokemon.ability1;
        } else {
            this.ability = pokemon.ability2;
        }
        this.inactiveCount = 0;
        this.activeMove = null;
        this.activeMoveMaxTurns = 0;
        this.activeMoveTurns = 0;
        this.activeMoveDelay = 0;
        this.activeMoveRest = 0;

        this.lastUsedMove = null;
        this.lastSufferedMove = null;

        this.coreStats.add(this.HP);
        this.coreStats.add(this.ATK);
        this.coreStats.add(this.DEF);
        this.coreStats.add(this.SATK);
        this.coreStats.add(this.SDEF);
        this.coreStats.add(this.SPD);
    }

    //Act Check
    public boolean canAct() {
        if (inactiveCount > 0) {
            tWr.println(this.getNickname() + " can't act!");
            this.inactiveCount = this.inactiveCount-1;
            if (inactiveCount == 0) {
                this.conditions.remove(Condition.BOUND);
            }
            return false;
        }
        if (!isAlive()) {
            tWr.println(this.getNickname() + " fainted!");
            return false;
        }
        if (!(this.target.getHP() > 0)) {
            tWr.println(this.getNickname() + " has no target!");
            return false;
        }
        if (this.conditions.contains(Condition.FLINCHING)) {
            tWr.println(this.getNickname() + " flinched!");
            this.conditions.remove(Condition.FLINCHING);
            return false;
        }
        if (this.conditions.contains(Condition.PARALYZED)) {
            int d20 = PokeUtils.d20();
            if (d20 >= 1 && d20 <= 5) {
                tWr.println(this.getNickname() + " is paralyzed!");
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public boolean isAlive() {
        if (this.getHP() > 0) {
            return true;
        } else return false;
    }


    public boolean canChoose() {
        if (activeMoveTurns > 0) {
            if(this.activeMove.getName().equals("Rage")) {
                tWr.println(this.getNickname() + " is still raging!");
            }
            return false;
        } else return true;
    }

    public void choose() {
		if (this.activeMove != null && this.activeMoveDelay > 0) {
			this.activeMoveDelay = this.activeMoveDelay - 1;
			if (this.activeMoveDelay == 0) {
				while (this.conditions.contains(Condition.CHARGING)) {
					this.conditions.remove(Condition.CHARGING);
				}
				tWr.println(this.getNickname() + "'s attack is ready!");
				return;
			} else {
				this.conditions.add(Condition.CHARGING);
				tWr.println(this.getNickname() + "is charging an attack!");
				return;
			}
		} else {
			if(this.activeMove != null && this.activeMoveTurns > 0) {
				tWr.println(this.getNickname() + "is still going!");
				this.activeMoveTurns = this.activeMoveTurns-1;
				return;
			} else {
				if (this.activeMove != null && this.activeMoveRest > 0) {
					tWr.println(this.getNickname() + "is recharging!");
					this.activeMoveRest = this.activeMoveRest-1;
					return;
				} else {
					int rnd = PokeUtils.d20();
					if (rnd >= 1 && rnd <= 8) this.activeMove = this.move1;
					if (rnd >= 9 && rnd <= 14) this.activeMove = this.move2;
					if (rnd >= 15 && rnd <= 18) this.activeMove = this.move3;
					if (rnd >= 19 && rnd <= 20) this.activeMove = this.move4;
                    this.activeMoveTurns = this.activeMove.turnsCheck();
                    this.activeMoveMaxTurns = this.activeMoveTurns;
                    this.activeMoveDelay = this.activeMove.getDelay();
                    this.activeMoveRest = this.activeMove.getRest();
				}
			}
		}
	}

    public void use(Move move) {
        if (this.activeMoveDelay > 0) {
            tWr.println(this.getNickname() + " is charging!");
            this.activeMoveTurnsTicks();
            return;
        }
        if (this.conditions.contains(Condition.CHARGING)) {
            tWr.println(this.getNickname() + " is charging!");
            return;
        } else {
            if (this.activeMove != null && this.activeMoveMaxTurns > this.activeMoveTurns) {
                tWr.println(this.getNickname() + " uses " + this.activeMove.getName());
                this.activeMove.execute(this, this.target);
                if (this.activeMoveTurns == 0) {
                    resetActiveMove();
                }
            } else {
                tWr.println(this.getNickname() + " uses " + this.activeMove.getName());
                if (this.activeMove.getAcc() > 0) {
                    if (this.activeMove.hitCheck(this, this.target)) {
                        this.activeMove.execute(this, this.target);
                        if (this.activeMoveTurns == 0) {
                            resetActiveMove();
                        }
                    } else {
                        tWr.println(this.getNickname() + " misses!");
                        resetActiveMove();
                    }
                } else {
                    this.activeMove.execute(this, this.target);
                    if (this.activeMoveTurns == 0) {
                        resetActiveMove();
                    }
                }
            }
        }
    }

    private void resetActiveMove() {
        this.activeMove = null;
        this.activeMoveMaxTurns = 0;
        this.activeMoveTurns = 0;
        this.activeMoveDelay = 0;
        this.activeMoveRest = 0;
    }

    public void updateStats() {
        this.HP.updateStat();
        this.ATK.updateStat();
        this.DEF.updateStat();
        this.SATK.updateStat();
        this.SDEF.updateStat();
        this.SPD.updateStat();
        this.EVS.updateStat();
        this.CRIT.updateStat();
        this.ACC.updateStat();
    }

    public void takeDmg(double dmg) {
        this.HP.modStat(-dmg);
        this.HP.updateStat();
    }

    public void healDmg(double dmg) {
        this.HP.modStat(+dmg);
        this.HP.updateStat();
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public String getNickname() {
        return nickname;
    }

    public String getName() {
        return name;
    }

    public PokeType getType1() {
        return type1;
    }

    public PokeType getType2() {
        return type2;
    }

    public int getForm() {
        return form;
    }

    public int getTier() {
        return tier;
    }

    public int getLVL() {
        return LVL;
    }

    public int getHP() {
        return this.HP.current();
    }

    public double getBaseHP() {
        return this.HP.getBase();
    }

    public int getATK() {
        return this.ATK.current();
    }

    public void changeATK(double change) {
        this.ATK.modStat(change);
        this.ATK.updateStat();
    }

    public int getDEF() {
        return this.DEF.current();
    }

    public void changeDEF(double change) {
        this.DEF.modStat(change);
        this.DEF.updateStat();
    }

    public int getSATK() {
        return this.SATK.current();
    }

    public void changeSATK(double change) {
        this.SATK.modStat(change);
        this.SATK.updateStat();
    }

    public int getSDEF() {
        return this.SDEF.current();
    }

    public void changeSDEF(double change) {
        this.SDEF.modStat(change);
        this.SDEF.updateStat();
    }
    
    public int getSPD() {
        return this.SPD.current();
    }
    
    public void changeSPD(double change) {
        this.SPD.modStat(change);
        this.SPD.updateStat();
    }
    
    public double getEVS() {
        return this.EVS.currentd();
    }

    public double getEVS100() {
        return this.EVS.currentd()*100;
    }
    
    public void changeEVS(double change) {
        this.EVS.modStat(change);
        this.EVS.updateStat();
    }
    
    public int getACC() {
        return this.ACC.current();
    }
    
    public void changeACC(double change) {
        this.ACC.modStat(change);
        this.ACC.updateStat();
    }

    public double getCRIT() {
        return this.CRIT.currentd();
    }

    public double getCRIT100() {
        return this.CRIT.currentd()*100;
    }
    
    public void changeCRIT(double change) {
        this.ACC.modStat(change);
        this.ACC.updateStat();
    }
    
    public Move getMove1() {
        return move1;
    }

    public Move getMove2() {
        return move2;
    }

    public Move getMove3() {
        return move3;
    }

    public Move getMove4() {
        return move4;
    }
    
    public Move getActiveMove() {
        return activeMove;
    }
    
    public int getActiveMoveMaxTurns() {
        return activeMoveMaxTurns;
    }

    public int getActiveMoveTurns() {
        return activeMoveTurns;
    }

    public void activeMoveTurnsTicks() {
        this.activeMoveTurns = (this.activeMoveTurns - 1);
        this.activeMoveDelay = (this.activeMoveDelay - 1);
    }

    public int getActiveMoveDelay() {
        return activeMoveDelay;
    }

    public int getActiveMoveRest() {
        return activeMoveRest;
    }

    public Move getLastUsedMove() {
        return lastUsedMove;
    }

    public Move getLastSufferedMove() {
        return lastSufferedMove;
    }

    public Pokemon getTarget() {
        return target;
    }

    public void setTarget(Pokemon target) {
        this.target = target;
    }

    public Ability getAbility() {
        return ability;
    }

    public ArrayList<Condition> getConditions() {
        return conditions;
    }
    
    public void addCondition(Condition condition) {
        this.conditions.add(condition);
    }

    public int getInactiveCount() {
        return inactiveCount;
    }

    public String getGraphLvL() {
        String maxLVLToken = "~";
        String actualLVLToken = "+";
        String overLVLToken = "x";
        String graphLVL = "";
        
        if (this.evos == 1) {
            if (this.LVL < 6) {
                for (int i = 0; i < this.LVL; i++) {
                    graphLVL = graphLVL + actualLVLToken;
                }
                for (int i = 0; i < (5-this.LVL); i++) {
                    graphLVL = graphLVL + maxLVLToken;
                }
            } else {
                for (int i = 0; i < this.LVL; i++) {
                    graphLVL = graphLVL + maxLVLToken;
                }
                for (int i = 0; i < (this.maxLVL-this.LVL); i++) {
                    graphLVL = graphLVL + overLVLToken;
                }
            }

        } else {
            for (int i = 0; i < this.LVL; i++) {
                graphLVL = graphLVL + actualLVLToken;
            }
            for (int i = 0; i < (this.maxLVL-this.LVL); i++) {
                graphLVL = graphLVL + maxLVLToken;
            } 
        }
        
        return graphLVL;
    }
    
    public void setInactiveCount(int turns) {
        this.inactiveCount = turns;
    }
    
    public int getMaxLVL() {
        return this.maxLVL;
    }
    
    //TODO
    public void levelUp() throws IOException {
        int beforeLVL = this.getLVL();
        String beforeGraphLVL = this.getGraphLvL();
        int beforeHP = this.getHP();
        int beforeATK = this.getATK();
        int beforeDEF = this.getDEF();
        int beforeSATK = this.getSATK();
        int beforeSDEF = this.getSDEF();
        int beforeSPD = this.getSPD();
        this.LVL = this.LVL + 1;
        for (Stat stat : coreStats) {
            System.out.println(stat.toString());
            System.out.println(stat.getBase());
            System.out.println(stat.current());
            System.out.println(stat.getRoot());
            stat.levelUpBase();
            stat.updateStat();
            System.out.println(stat.getBase());
            System.out.println(stat.current());
            System.out.println(stat.getRoot());
        }
        //print LevelUp
        PokeUtils.clear();
        System.out.printf("_________________________________\n");
        System.out.printf(nickname + " (" + name + ") leveled up!\n");
        System.out.printf("LVL: \t" + beforeLVL + "(+1) \t" + beforeGraphLVL + "\n");
        System.out.printf("HP: \t"    + (int)(beforeHP) +     " \t(+%.1f)" + "\n", (HP.getBase() - beforeHP));
        System.out.printf("ATK: \t"   + (int)(beforeATK) +    " \t(+%.1f)" + "\n", (ATK.getBase() - beforeATK));
        System.out.printf("DEF: \t"   + (int)(beforeDEF) +    " \t(+%.1f)" + "\n", (DEF.getBase() - beforeDEF));
        System.out.printf("SATK: \t"  + (int)(beforeSATK) +   " \t(+%.1f)" + "\n", (SATK.getBase() - beforeSATK));
        System.out.printf("SDEF: \t"  + (int)(beforeSDEF) +   " \t(+%.1f)" + "\n", (SDEF.getBase() - beforeSDEF));
        System.out.printf("SPD: \t"   + (int)(beforeSPD) +    " \t(+%.1f)" + "\n", (SPD.getBase() - beforeSPD));
        System.out.printf("\n");
        
        PokeUtils.waitInput();
        
        PokeUtils.clear();
        System.out.printf("_________________________________\n");
        System.out.printf(nickname + " (" + name + ") leveled up!\n");
        System.out.printf("LVL: \t" + LVL + " \t" + getGraphLvL() + "\n");
        System.out.printf("HP: \t"    + (int)(HP.getBase()) + "\n");
        System.out.printf("ATK: \t"   + (int)(ATK.getBase()) + "\n");
        System.out.printf("DEF: \t"   + (int)(DEF.getBase()) + "\n");
        System.out.printf("SATK: \t"  + (int)(SATK.getBase()) + "\n");
        System.out.printf("SDEF: \t"  + (int)(SDEF.getBase()) + "\n");
        System.out.printf("SPD: \t"   + (int)(SPD.getBase()) + "\n");
        System.out.println();
        PokeUtils.waitInput();

        //TODO ACTUAL LVL UP
    }
    
    @Override
    public String toString() {
        return (
                    "_______________________________________\n"
                    + nickname + " (" + name + ") \tLVL: " + LVL + " " + getGraphLvL() + "\n"
                    + type1 + " " + type2 + "\n"
                    + "HP: \t" + HP.current() + "/" + (int)(HP.getBase()) + "\n"
                    + "ATK: \t" + ATK.current() + "/" + (int)(ATK.getBase()) + "\n"
                    + "DEF: \t" + DEF.current() + "/" + (int)(DEF.getBase()) + "\n"
                    + "SATK: \t" + SATK.current() + "/" + (int)(SATK.getBase()) + "\n"
                    + "SDEF: \t" + SDEF.current() + "/" + (int)(SDEF.getBase()) + "\n"
                    + "SPD: \t" + SPD.current() + "/" + (int)(SPD.getBase()) + "\n"
                    + "EVS: \t" + EVS.current() + "/" + (int)(EVS.getBase()) + "\n\n"
                    + "Ability: " + ability + "\n\n"
                    + "MOVES\n"
                    + "(1) " + move1 + "\n"
                    + "(2) " + move2 + "\n"
                    + "(3) " + move3 + "\n"
                    + "(4) " + move4 + "\n\n"
                    + "Conditions:" + this.getConditions() + "\n"
                    + "_______________________________________\n"
        );
    }

    public void getDetails() {
        //TODO DETAILS SCREEN
    }






    
}
