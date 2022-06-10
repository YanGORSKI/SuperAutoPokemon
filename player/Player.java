package player;

public class Player {
    int victories;
    int lifes;
    int gold;
    int round;
    
    public Player() {
        this.victories = 0;
        this.lifes = 15;
        this.gold = 0;
        this.round = 0;
    }

    
    public void advanceRound() {
        this.round = this.round + 1;
    }
    
    public int getVictories() {
        return victories;
    }
    public void setVictories(int victories) {
        this.victories = victories;
    }
    public int getLifes() {
        return lifes;
    }
    public void setLifes(int lifes) {
        this.lifes = lifes;
    }
    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public double getRound() {
        return round;
    }
    public void setRound(int round) {
        this.round = round;
    }


    @Override
    public String toString() {
        return "Player [gold=" + gold + ", lifes=" + lifes + ", round=" + round + ", victories=" + victories + "]";
    }


    
}
