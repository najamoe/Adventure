package org.example;


//Room har fire attributter af typen Room til at håndtere forbindelser til de fire andre rum: north, east, south og west.
// Hvis der ikke er noget rum i den pågældende retning, har attributten værdien null.
public class Room {
    private String roomname;
    private String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    public Room(String roomname, String description){
        this.roomname = roomname;
        this.description = description;
    }

    //Getters
    public Room getNorth(){
        return north;
    }
    public Room getEast(){
        return east;
    }
    public Room getSouth(){
        return south;
    }
    public Room getWest(){
        return west;
    }
    public String getRoomName(){
        return roomname;
        // er det muligt at få en getter til at returne 2 values?
    }
    public String getRoomDescription(){
        return description;
    }
    //Setters
    public void setNorth(Room north){
        this.north = north;

    }
    public void setSouth(Room south){
        this.south = south;
    }
    public void setEast(Room east) {
        this.east = east;
    }
    public void setWest(Room west){
        this.west = west;
    }


}
