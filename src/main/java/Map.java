import java.util.concurrent.ForkJoinTask;

public class Map {

    private Room starterRoom;

    public Map() {
        setRooms();
    }

    Room DesertedRoad = new Room("deserted road", "this is a deserted road");
    Room DarkForest = new Room("Dark forest", "description");
    Room Church = new Room("church", "descriptionn");
    Room Cemetery = new Room("cemetery ", "description");
    Room SecretBasement = new Room("Secret Basement", "description");
    Room AbandonedSchool = new Room("abandoned school", "description");
    Room PublicPool = new Room("public pool", "description");
    Room SchoolGym = new Room("School gym", "description");
    Room Playground = new Room("playground", "description");

    //Items
    Item cross = new Item("Cross ", "maybe it can keep away the deamons");
    Item flashlight = new Item("Flashlight ", "description of flashlight");
    Item hammer = new Item("hammer ", "used to smashed things");
    Item joint = new Item("Joint ", "keep calm");

    public void setRooms() {
        DesertedRoad.setEast(DarkForest);
        DesertedRoad.setSouth(Cemetery);
        DesertedRoad.addItem(flashlight);

        DarkForest.setEast(Church);
        DarkForest.setWest(DesertedRoad);

        Church.setSouth(AbandonedSchool);
        Church.setWest(Church);

        Cemetery.setNorth(DesertedRoad);
        Cemetery.setSouth(PublicPool);
        Cemetery.addItem(cross);

        SecretBasement.setSouth(SchoolGym);

        AbandonedSchool.setNorth(Church);
        AbandonedSchool.setSouth(Playground);

        PublicPool.setNorth(Cemetery);
        PublicPool.setEast(SchoolGym);
        PublicPool.addItem(joint);

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


