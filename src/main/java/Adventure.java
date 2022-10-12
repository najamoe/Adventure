import java.util.ArrayList;

public class Adventure {
    private Map map;
    private Player player;

    public Adventure() {
        map = new Map();
        player = new Player();
        player.setCurrentRoom(map.getStarterRoom());
    }

    public Player getPlayer() {
        return player;
    }

    public Room getCurrentRoom() {
        return player.getCurrentRoom();
    }

    //Directions
    public boolean goNorth() {
        return player.goNorth();
    }
    public boolean goSouth() {
        return player.goSouth();
    }
    public boolean goEast() {
        return player.goEast();
    }
    public boolean goWest() {
        return player.goWest();
    }

    //Food
    public Enumerations eatFood(String itemName) {
        return player.eatFood(itemName);
    }
    public Item searchInventory(String itemName) {
        return player.searchInventory(itemName);
    }
    //Items
    public Item dropItem(String itemName) {
        return player.dropItem(itemName);
    }
    public Item takeItem(String itemName) {
        return player.takeItem(itemName);
    }
    public Item removeItem(String itemName) {
        return player.removeItem(itemName);
    }
    public ArrayList<Item> getinventory() {
        return player.getInventory();
    }
    //Weapons
    public ArrayList<Weapon> getCurrentWeapon() {
        return player.getCurrentWeapon();
    }
    public Item getEquippedItem(String itemName) {
        return player.getEquippedItem(itemName);
    }
    public Enumerations equipItem(String itemName) {
        return player.equpItem(itemName);
    }
}


