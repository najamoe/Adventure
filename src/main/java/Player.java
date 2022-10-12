import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList<>();
    private ArrayList<Weapon> currentWeapon = new ArrayList<>();
    private int playerhealth;

    public Player() {
        playerhealth = 100;
    }

    //Food
    public Enumerations eatFood(String itemName) {
        Item playerinventory = searchInventory(itemName);
        if (playerinventory != null) {
            if (playerinventory instanceof Food food) {
                int addedHealthPoints = food.getFoodhealth();
                setHealth(addedHealthPoints);
                removeItem(itemName);
                return Enumerations.USABLE;
            } else {
                return Enumerations.CANTUSE;
            }
        } else {
            return Enumerations.DOSENTEXIST;
        }}
    //Weapons
    public ArrayList<Weapon> getCurrentWeapon() {
        return currentWeapon;
    }

    public Enumerations equpItem(String itemName) {
        Item playerinventory = searchInventory(itemName);
        if (playerinventory != null) {
            if (playerinventory instanceof Weapon weapon) {
                removeItem(itemName);
                currentWeapon.add(weapon);
                return Enumerations.USABLE;
            } else{
                return Enumerations.CANTUSE;
            }
        } else{
                return Enumerations.DOSENTEXIST;
            }
        }

    // health
    public int getHealth() {
        return playerhealth;
    }

    public void setHealth(int health) {
        this.playerhealth += health;
    }

    //Items
    public String getShortName() {
        return getShortName();
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public Item searchInventory(String itemName) {
        for (Item item : inventory) {
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

    //Weapon
    public Item getEquippedItem(String itemName) {
        for (Item item : currentWeapon) {
            if (item.getItemName().equals(itemName)) {
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
