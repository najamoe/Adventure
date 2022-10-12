import java.util.ArrayList;
import java.util.Scanner;

public class Map {

    private Room starterRoom;

    public Map() {
        setRooms();
    }

    private Room DesertedRoad = new Room("You find yourself standing along a dark deserted road.",
            "\nThe rain is pouring down " +
                    "and as you are standing alone, you feel exposed to the elements.\n" +
                    "You need to find a way to be able to see where you are going, so you can get to a safe place.");
    private Room DarkForest = new Room("Dark forest, ",
            "surrounded by the tall gloomy trees, the wind helping them create a deafening sound");
    private Room Church = new Room("The dankness of the church envelops you, and the quiet sound of tippytaps from a mouse feels like\n" +
            "it will burst your ears", " as it breaks the complete silence in the grand church");
    private Room Cemetery = new Room("Cemetery \n",
            "surrounded by what is left of this lonely cemetery, old miskept gravestones tells the story of a city in disarray\n" +
                    "You can feel that you are not welcome, standing here, disrupting the dead's peace\n" +
                    "You should really hurry up and see if there are any clues to finding your sister");
    private Room SecretBasement = new Room("Secret Basement",
            "description");
    private Room AbandonedSchool = new Room("abandoned school",
            "description");
    private Room PublicPool = new Room("public pool",
            "description");
    private Room SchoolGym = new Room("School gym",
            "description");
    private Room Playground = new Room("playground",
            "description");

    //Items
    private Item cross = new Item(" cross", " maybe it can keep away the deamons", "cross");
    private Item key = new Item("key", " maybe the key beside it would be helpfull?", "key");
    private Item flashlight = new Item("flashlight", " for the darkness", "flashlight");
    private Item joint = new Item("joint", " will help you stay calm", "joint");
    private Item Barbell = new Item("barbell", " laying beside you, maybe it could be a weapon?", "barbell");

    //food
    private Food redbull = new Food("Redbull", "will always make you fly", 60, "redbull");
    private Food rottenApple = new Food("rotten Apple", "it's possible worth eating", -20, "rotten apple");
    private Food waterbottle = new Food("waterbottle", "maybe it is clean enough to drink?", 20, "waterbottle");
    private Food snickers = new Food("snickers", ",if your energy is low this will provide a sugarboost", 10, "snickers");

    //MeleeWeapon
    private MeleeWeapon knife = new MeleeWeapon("knife","knife", "dull blade", 10);
    private MeleeWeapon stick = new MeleeWeapon("Stick", "stick", "throw or smack something", 2);

    //RangedWeapon
    private RangedWeapon glock = new RangedWeapon("gun", " Glock 17", "Gun", 20, 19);
    private RangedWeapon torch = new RangedWeapon("fire torch", "torch", "fire torch", 8, 4);
    public void setRooms() {
        DesertedRoad.setEast(DarkForest);
        DesertedRoad.setSouth(Cemetery);
        DesertedRoad.addItem(flashlight);
        DesertedRoad.addItem(snickers);
        DesertedRoad.addItem(glock);

        DarkForest.setEast(Church);
        DarkForest.setWest(DesertedRoad);
        DarkForest.addItem(rottenApple);
        DarkForest.addItem(stick);

        Church.setSouth(AbandonedSchool);
        Church.setWest(Church);
        Church.addItem(cross);
        Church.addItem(key);
        Church.addItem(waterbottle);
        Church.addItem(knife);

        Cemetery.setNorth(DesertedRoad);
        Cemetery.setSouth(PublicPool);

        SecretBasement.setSouth(SchoolGym);

        AbandonedSchool.setNorth(Church);
        AbandonedSchool.setSouth(Playground);
        AbandonedSchool.addItem(torch);

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
    }

    public Room getStarterRoom() {
        return DesertedRoad;
    }
}


