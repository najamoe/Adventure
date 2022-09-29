import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    public void start() {
        boolean isRunning = true;
        Adventure adventure = new Adventure();
        Scanner UserInput = new Scanner(System.in);
        String gameplay;
        System.out.println("Welcome to adventure");
        System.out.println("gamestorygamestorygamestorygamestorygamestorygamestorygamestorygamestory");
        System.out.println("If at any point you need help, type help");
        System.out.println("where do you wish to go ?");


        while (isRunning) {
            gameplay = UserInput.next().toLowerCase();

            switch (gameplay) {

                case "north", "go north":
                    if (adventure.goNorth()) {
                        System.out.println("you went north");
                        System.out.println("Going north \n");
                    } else {
                        System.out.println("no way");
                    }
                    break;
                case "south", "go south":
                    if (adventure.goSouth()) {
                        System.out.println(adventure.getCurrentRoom());
                    } else {
                        System.out.println("nono");
                    }break;

                case "East", "go east":
                    if (adventure.goEast()) {
                        System.out.println("you went East");
                        System.out.println(adventure.getCurrentRoom());
                    } else {
                        System.out.println("you can't go that way");
                    } break;
                case "West", "go west":
                    if (adventure.goWest()) {
                        System.out.println("you went west");
                        System.out.println(adventure.getCurrentRoom());
                    } else {
                        System.out.println("you can't go that way");
                    }break;
            case "Look":
                System.out.println(adventure.getCurrentRoom().getRoomName() + " " + adventure.getCurrentRoom().getRoomDescription());

                break;
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
}   }
}


