import java.util.ArrayList;
public class Room {
    private String roomname;
    private String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item Items) {
        items.add(Items);
    }

    public Room(String roomname, String description) {
        this.roomname = roomname;
        this.description = description;
        this.north = this.south = this.east = this.west = null;
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
