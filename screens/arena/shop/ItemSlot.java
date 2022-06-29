package screens.arena.shop;

import items.Item;

public class ItemSlot extends Slot{
    Item content;

    public boolean hasContent() {
        if (this.content != null) return true;
        else return false;
    }

    @Override
    public String toString() {
        if (this.content == null) {
            return "[EMPTY]";
        } else {
            return ("["+content.getName()+"]");
        }
    }
}
