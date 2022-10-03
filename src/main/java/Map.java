public class Map {

    private Room starterRoom;

    public Map(){
        setRooms();
    }
        Room DesertedRoad = new Room("deserted road",
                //description
                "this is a deserted road",
                //Item
                "item");
        Room DarkForest = new Room("Dark forest",
                //description
                "description",
                //Item
                "item");
        Room Church = new Room("church", "descriptionn", "cross");
        Room Cemetery = new Room("cemetery ", "description", "item");
        Room SecretBasement = new Room("Secret Basement", "description", "item");
        Room AbandonedSchool = new Room("abandoned school", "description", "item");
        Room PublicPool = new Room("public pool", "description", "item");
        Room SchoolGym = new Room("School gym", "description", "item");
        Room Playground = new Room("playground", "description", "item");

        public void setRooms() {
        DesertedRoad.setEast(DarkForest);
        DesertedRoad.setSouth(Cemetery);

        DarkForest.setEast(Church);
        DarkForest.setWest(DesertedRoad);

        Church.setSouth(AbandonedSchool);
        Church.setWest(Church);

        Cemetery.setNorth(DesertedRoad);
        Cemetery.setSouth(PublicPool);

        SecretBasement.setSouth(SchoolGym);

        AbandonedSchool.setNorth(Church);
        AbandonedSchool.setSouth(Playground);

        PublicPool.setNorth(Cemetery);
        PublicPool.setEast(SchoolGym);

        SchoolGym.setNorth(SecretBasement);
        SchoolGym.setEast(Playground);
        SchoolGym.setWest(PublicPool);

        Playground.setNorth(AbandonedSchool);
        Playground.setWest(SchoolGym);

        starterRoom = DesertedRoad;
    }

    public Room getStarterRoom() {
        return DesertedRoad;
    }


}


