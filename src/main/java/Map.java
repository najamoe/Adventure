import java.util.concurrent.ForkJoinTask;

public class Map {

    private Room starterRoom;

    public Map() {
        setRooms();
    }

    Room DesertedRoad = new Room("You find yourself standing along a dark deserted road.",
            "\nThe rain is pouring down " +
                    "and as you are standing alone, you feel exposed to the elements.\n" +
                    "You need to find a way to be able to see where you are going, so you can get to a safe place.");
    Room DarkForest = new Room("Dark forest",
            "description");
    Room Church = new Room("The dankness of the church envelops you, and the quiet sound of tippytaps from a mouse feels like\n" +
            "it will burst your ears", " as it breaks the complete silence in the grand church");
    Room Cemetery = new Room("Cemetery \n",
            "surrounded by what is left of this lonely cemetery, old miskept gravestones tells the story of a city in disarray\n" +
                    "You can feel that you are not welcome, standing here, disrupting the dead's peace\n" +
                    "You should really hurry up and see if there are any clues to finding your sister");
    Room SecretBasement = new Room("Secret Basement",
            "description");
    Room AbandonedSchool = new Room("abandoned school",
            "description");
    Room PublicPool = new Room("public pool",
            "description");
    Room SchoolGym = new Room("School gym",
            "description");
    Room Playground = new Room("playground",
            "description");

    //Items
    Item cross = new Item("There is a shining cross laying by the altar", "maybe it can keep away the deamons");
    Item key = new Item("The cross is not the only shining object I see,\n", "maybe the key beside it would be helpfull?");
    Item flashlight = new Item("flashlight", "");
    Item hammer = new Item("If you looke closely there is a hammer in the corner ", "perhaps you need to smash something later on?");
    Item joint = new Item("joint", "");
    Item Barbell = new Item("There is a big barbell", "laying beside you, maybe it could be a weapon?");

    //food
    Food redbull = new Food("Redbull","makes you fly", 10);
    Food rottenApple = new Food("rottenApple","possible worth eating",  -20);


    public void setRooms() {
        DesertedRoad.setEast(DarkForest);
        DesertedRoad.setSouth(Cemetery);
        DesertedRoad.addItem(flashlight);

        DarkForest.setEast(Church);
        DarkForest.setWest(DesertedRoad);

        Church.setSouth(AbandonedSchool);
        Church.setWest(Church);
        Church.addItem(cross);
        Church.addItem(key);

        Cemetery.setNorth(DesertedRoad);
        Cemetery.setSouth(PublicPool);

        SecretBasement.setSouth(SchoolGym);

        AbandonedSchool.setNorth(Church);
        AbandonedSchool.setSouth(Playground);

        PublicPool.setNorth(Cemetery);
        PublicPool.setEast(SchoolGym);
        PublicPool.addItem(joint);

        SchoolGym.setNorth(SecretBasement);
        SchoolGym.setEast(Playground);
        SchoolGym.setWest(PublicPool);
        SchoolGym.addItem(Barbell);
        SchoolGym.addItem(redbull);

        Playground.setNorth(AbandonedSchool);
        Playground.setWest(SchoolGym);
        Playground.addItem(rottenApple);

        starterRoom = DesertedRoad;
    }

    public Room getStarterRoom() {
        return DesertedRoad;
    }
}


