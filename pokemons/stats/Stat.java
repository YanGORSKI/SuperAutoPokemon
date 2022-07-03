package pokemons.stats;

import utils.PokeUtils;

public class Stat {
    Stats stat;
    double root;
    double base;
    double mod;
    double currentd;
    int current;
    
    public Stat(Stats stat, double base) {
        this.stat = stat;
        this.root = base;
        this.base = base;
        this.mod = 0;
        this.currentd = this.base + this.mod;
        this.current = (int)(currentd);
    }

    public void updateStat() {
        if (this.stat == Stats.EVS && this.base+this.mod > 0.5) {
            this.currentd = 0.5;
            this.current = (int)(this.currentd);
        } else if (this.stat == Stats.CRIT && this.base + this.mod > 0.5) {
            this.currentd = 0.5;
            this.current = (int)(this.currentd);
        } else {
            this.currentd = this.base + this.mod;
            this.current = (int)(this.currentd);
        }
    }

    public int current() {
        return this.current; 
    }

    public double currentd() {
        return this.currentd;
    }

    public void modStat(double change) {
        this.mod = (this.mod + change);
    }

    public double getBase() {
        return this.base;
    }

    public void levelUpBase() {
        double statMutation = PokeUtils.statMutation();
        this.base = this.base + (this.root*0.2*statMutation);
    }

    public double getRoot() {
        return this.root;
    }

    public Stats getStat() {
        return this.stat;
    }
    
    @Override
    public String toString() {
        return this.stat.toString();
    }
}
