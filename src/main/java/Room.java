//Room har fire attributter af typen Room til at håndtere forbindelser til de fire andre rum: north, east, south og west.
// Hvis der ikke er noget rum i den pågældende retning, har attributten værdien null.
public class Room {
    private String roomname;
    private String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    public Room(String roomname, String description) {
        this.roomname = roomname;
        this.description = description;
        this.north = this.south = this.east = this.west = null;
    }

    //Getters
   public String getRoomName(){
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
    } public Room getEast() {
        return east;
    }
    public Room getWest() {
        return west;
    }


    //Setters
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
