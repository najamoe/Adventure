import com.sun.source.tree.BreakTree;

import java.util.ArrayList;

public class player {
    private Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList<>();
    private int playerhealth;

    public player(){
        playerhealth=100;
    }

    //Food
    public enumerations eatFood(String itemName) {
        Item playerInvent = searchInventory(itemName);
        if (playerInvent == null) {
            return enumerations.DOSENTEXIST;
        } else if (playerInvent instanceof Food food) {
            playerhealth += getHealth();
            removeItem(itemName);
            return enumerations.EATFOOD;
        } else {
            return enumerations.CANTEAT;
    }}


    // health
    public int getHealth(){
        return playerhealth;
    }
    public player setHealth(int health){
        this.playerhealth=playerhealth;
        return null;
    }

    //Items
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public Item searchInventory (String itemName){
        for (Item item : inventory){
            if (item.getItemName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }

    //Take, add, remove and drop items
    public Item addItem(Item item) {
        inventory.add(item);
        return item;
    }
    public Item takeItem(String itemName) {
        Item takeItem = getCurrentRoom().removeItem(itemName);
        addItem(takeItem);
        return takeItem;
    }

    public Item dropItem(String itemName) {
    Item dropItem = removeItem(itemName);
    currentRoom.addItem(dropItem);
    return dropItem;
    }

    public Item removeItem(String name) {
        for (Item item : inventory) {
            if (item.getItemName().equals(name)) {
                inventory.remove(item);
                return item;
            }
        }
        return null;
    }

    public Item getItem(String name) {
        for (Item item : inventory) {
            if (item.getItemName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    //Directions
    public boolean goNorth() {
        if (currentRoom.getNorth() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getNorth();
            return true;
        }
    }

    public boolean goSouth() {
        if (currentRoom.getSouth() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getSouth();
            return true;
        }
    }

    public boolean goEast() {
        if (currentRoom.getEast() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getEast();
            return true;
        }
    }

    public boolean goWest() {
        if (currentRoom.getWest() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getWest();
            return true;
        }
    }


}
