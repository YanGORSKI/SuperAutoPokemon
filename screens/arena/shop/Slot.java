package screens.arena.shop;

public class Slot {
    boolean active = false;
    int cost;
    Buyable content;
    boolean isFrozen = false;

    public Buyable getContent() {
        return content;
    }

    public void receiveContent(Buyable newContent) {
        this.content = newContent;
    }

    public void deleteContent() {
        this.content = null;
    }
    
    public int getCost() {
        return cost;
    }
    
    public void activateSlot() {
        active = true;
    }

    public void freezeSlot() {
        isFrozen = true;
    }

    public void unfreezeSlot() {
        isFrozen = false;
    }

    public void generate(Shop shop) {
    }

}