package screens.arena.shop;

public class Slot {
    boolean active = false;
    int cost;
    Buyable content;
    boolean isLocked = false;

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

    public void lockSlot() {
        isLocked = true;
    }

    public void unlockSlot() {
        isLocked = false;
    }

    public void generate(Shop shop) {
    }

    
}