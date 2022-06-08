package pokemons.stats;

public class Stat {
    Stats stat;
    double base;
    double mod;
    int current;
    
    public Stat(Stats stat, double base) {
        this.stat = stat;
        this.base = base;
        this.mod = 0;
        this.current = (int)(Math.round(this.base + this.mod));
    }

    public void updateStat() {
        this.current = (int)(Math.round(this.base + this.mod));
    }

    public int current() {
        return this.current; 
    }

    public void modStat(double change) {
        this.mod = (this.mod + change);
    }

    public double getBase() {
        return this.base;
    }
}
