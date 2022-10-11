import java.lang.reflect.Array;
import java.util.ArrayList;

public class Adventure {
    private Map map;
    private player player;

    public Adventure(){
    map = new Map();
    player = new player();
    player.setCurrentRoom(map.getStarterRoom());
    }

    public player getPlayer(){
        return player;
    }
    public Room getCurrentRoom() {
        return player.getCurrentRoom();
    }
    //Directions
    public boolean goNorth(){
        return player.goNorth();
    }
    public boolean goSouth(){
        return player.goSouth();
    }
    public boolean goEast(){
        return player.goEast();
    }
    public boolean goWest(){
        return player.goWest();
    }

    //Food
   public enumerations eatenItem(String itemName){
        return player.eatFood(itemName);
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
    public ArrayList<Item> getinventory(){
        return player.getInventory();
    }

}


