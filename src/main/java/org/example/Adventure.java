package org.example;
//selve spillet (altså de fem kommandoer der skal udføres når brugeren har indtastet dem) er i Adventure
//enkelt room-objekt i Adventure. Lad det være currentRoom, som spilleren befinder sig i.
//Udskriv navn og beskrivelse når spilleren skriver "look".

// String direction,String roomname,String description,String north,String south,String east,String west

public class Adventure {
    private Room currentRoom = null;
    public void createRooms(){
        Room room1 = new Room("deserted road", "this is a deserted road");
        Room room2 = new Room("Dark forest", "description");
        Room room3 = new Room("church", "descriptionn");
        Room room4 = new Room("cemetery", "description");
        Room room5 = new Room("Secret Basement", "description");
        Room room6 = new Room("abandoned school", "description");
        Room room7 = new Room("public pool", "description");
        Room room8 = new Room("School gym", "description");
        Room room9 = new Room("playground", "description");

        room1.setNorth(null);
        room1.setEast(room2);
        room1.setSouth(room4);
        room1.setWest(null);


        currentRoom = room1;
    }
    public Room getCurrentRoom(){
        return currentRoom;
    }

    public void goEast() {
        currentRoom = currentRoom.getEast();
    }


}
