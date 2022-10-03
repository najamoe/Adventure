import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    Adventure adventure = new Adventure();
    Scanner UserInput = new Scanner(System.in);

    public void start() {
        boolean isRunning = true;
        System.out.println("Welcome to adventure");
        System.out.println("gamestorygamestorygamestorygamestorygamestorygamestorygamestorygamestory");
        System.out.println("If at any point you need help, type help");
        System.out.println("where do you wish to go ?");


        while (isRunning) {
            String gameplay = UserInput.nextLine().toLowerCase();
            switch (gameplay) {

                case "north", "go north":
                    if (adventure.goNorth()) {
                        System.out.println("you went north");
                        System.out.println("Going north ");
                        System.out.println(adventure.getCurrentRoom().getRoomName() + adventure.getCurrentRoom().getRoomDescription());
                    } else {
                        System.out.println("no way");
                    }
                    break;
                case "south", "go south":
                    if (adventure.goSouth()) {
                        System.out.println("You went south and are now in the " + adventure.getCurrentRoom().getRoomName() + adventure.getCurrentRoom().getRoomDescription());
                    } else {
                        System.out.println("nono");
                    }
                    break;

                case "East", "go east":
                    if (adventure.goEast()) {
                        System.out.println("you went East");
                        System.out.println(adventure.getCurrentRoom().getRoomName() + adventure.getCurrentRoom().getRoomDescription());

                    } else {
                        System.out.println("you can't go that way");
                    }
                    break;

                case "West", "go west":
                    if (adventure.goWest()) {
                        System.out.println("you went west");
                        System.out.println(adventure.getCurrentRoom().getRoomName() + adventure.getCurrentRoom().getRoomDescription());

                    } else {
                        System.out.println("you can't go that way");
                    }
                    break;
                case "Look":
                    System.out.println(adventure.getCurrentRoom().getRoomName() + " " + adventure.getCurrentRoom().getRoomDescription());
                    System.out.println(adventure.getCurrentRoom().items);
                    break;
                case "inventory", "inv":
                    System.out.println("This is your inventory: "); //create inventory
                case "take":
                    System.out.println("you picked up " + Item.getItem());
                    break;
                case "drop":
                    System.out.println("you dropped your " + Item.getItem());
                case "Help":
                    System.out.println("""
                            check the following commandlines for help:
                            To move around, type a direction (e.g go north, go south, go east, go west
                            To look around you, notype look
                            """);
                    break;
                case "Exit", "quit":
                    System.out.println("Exiting game"); //kan man lave en "are you sure(yes/no)"?
                    break;
                default:
                    System.out.println("dont get it");
                    break;
            }
        }
    }
}


