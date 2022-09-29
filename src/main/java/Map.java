public class Map {

    private Room starterRoom;

    public void createMap(){
        Room room1 = new Room("deserted road", "this is a deserted road");
        Room room2 = new Room("Dark forest", "description");
        Room room3 = new Room("church", "descriptionn");
        Room room4 = new Room("cemetery", "description");
        Room room5 = new Room("Secret Basement", "description");
        Room room6 = new Room("abandoned school", "description");
        Room room7 = new Room("public pool", "description");
        Room room8 = new Room("School gym", "description");
        Room room9 = new Room("playground", "description");

        room1.setEast(room2);
        room1.setSouth(room4);
        room1.setNorth(null);
        room1.setWest(null);

        room2.setEast(room3);
        room2.setWest(room1);
        room2.setNorth(null);
        room2.setSouth(null);

        room3.setSouth(room6);
        room3.setWest(room3);

        room4.setNorth(room1);
        room4.setSouth(room7);

        room5.setSouth(room8);

        room6.setNorth(room3);
        room6.setSouth(room9);

        room7.setNorth(room4);
        room7.setEast(room8);

        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);

        room9.setNorth(room6);
        room9.setWest(room8);

        starterRoom = room1;
    }
    public Room getStarterRoom(){
        return starterRoom;
    }



}


