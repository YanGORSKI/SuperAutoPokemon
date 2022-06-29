package player;

import utils.TFormat;

public class Player {
    int victories;
    int lifes;
    int gold;
    int round;
    Team team;
    
    public Player() {
        this.victories = 0;
        this.lifes = 15;
        this.gold = 0;
        this.round = 0;
        advanceRound();
        team = new Team();
    }

    public void spendGold(int cost) {
        this.gold = this.gold - cost;
    }

    public void earnGold(int cost) {
        this.gold = this.gold + cost;
    }
    
    
    public void advanceRound() {
        this.round = this.round + 1;
        System.out.println("It's now round: " + this.round);
        earnGold(10);
    }
    
    public int getVictories() {
        return victories;
    }
    public void setVictories(int victories) {
        this.victories = victories;
    }
    public Team getTeam() {
        return this.team;
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

    public void printPlayer() {
        System.out.println("Lifes: " + TFormat.dDigitsNumber(this.lifes) + "\t" + "\t" + "Wins: " + TFormat.dDigitsNumber(this.victories));
        System.out.println("Gold: " + TFormat.dDigitsNumber(this.gold) + "\t" + "\t" + "Round: " + TFormat.dDigitsNumber(this.round));
    }


    @Override
    public String toString() {
        return "Player [gold=" + gold + ", lifes=" + lifes + ", round=" + round + ", victories=" + victories + "]";
    }


    
}
