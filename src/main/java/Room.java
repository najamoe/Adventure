import java.util.ArrayList;

public class Room {
    private String roomname;
    private String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    ArrayList<Item> itemsRoom = new ArrayList<>();
    Player player = new Player();

    public Room(String roomname, String description) {
        this.roomname = roomname;
        this.description = description;
        this.north = this.south = this.east = this.west = null;
    }

    //Items
    public ArrayList<Item> getItemsRoom() {
        return itemsRoom;
    }

    public void addItem(Item item) {
        itemsRoom.add(item);
    }

    public Item getItem(String itemName) {
        for (Item item : itemsRoom) {
            if (item.getItemName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }

    public Item removeItem(String itemName) {
        for (Item item : itemsRoom) {
            if (item.getItemName().equals(itemName)) {
                itemsRoom.remove(item);
                return item;
            }
        }
        return null;
    }


    //Getters
    public String getRoomName() {
        return roomname;
    }

    public String getRoomDescription() {
        return description;
    }

    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }

    //Setters
    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }
}
