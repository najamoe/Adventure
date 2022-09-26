package org.example;

import java.security.PublicKey;

//Room har fire attributter af typen Room til at håndtere forbindelser til de fire andre rum: north, east, south og west.
// Hvis der ikke er noget rum i den pågældende retning, har attributten værdien null.
public class Room {
    public String direction;
    public String roomname;
    public String description;

    public Room(String direction, String roomname, String description){
        this.direction=direction;
        this.roomname=roomname;
        this.description=description;
    }

    //Gettere
    public String getRoomname(){
        return roomname;
    }
    public String getDescription(){
        return description;
    }




    //First room



}
