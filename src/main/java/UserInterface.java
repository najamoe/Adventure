import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    public void start() {
        Adventure adventure = new Adventure();
        Scanner UserInput = new Scanner(System.in);
        String gameplay;
        System.out.println("Welcome to adventure");
        System.out.println("gamestorygamestorygamestorygamestorygamestorygamestorygamestorygamestory");
        System.out.println("If at any point you need help, type help");
        System.out.println("where do you wish to go ?");


        do {
            gameplay = UserInput.next().toLowerCase();

            switch (gameplay) {
                case "north", "go north"->{
                    if (adventure.go("north")) {
                        System.out.println("you went north");
                        System.out.println(adventure.getCurrentRoom());
                    } else {
                        System.out.println("no way");
                    }}
                case "south", "go south" -> {
                    if (adventure.go("south")){
                        System.out.println(adventure.getCurrentRoom());
                } else {
                    System.out.println("nono");
                }}
                case "East", "go east" -> {
                    if (adventure.go("East")) {
                        System.out.println("you went East");
                        System.out.println(adventure.getCurrentRoom());
                    } else {
                        System.out.println("you can't go that way");
                    }
                }
                case "West", "go west" -> {
                    if (adventure.go("west")) {
                        System.out.println("you went west");
                        System.out.println(adventure.getCurrentRoom());
                    } else {
                        System.out.println("you can't go that way");
                    }
                }
                case "Look" ->
                        System.out.println(adventure.getCurrentRoom().getRoomName() + " " + adventure.getCurrentRoom().getRoomDescription());
                case "Help" -> {
                    System.out.println("""
                            check the following commandlines for help:
                            To move around, type a direction (e.g go north, go south, go east, go west
                            To look around you, notype look
                            """);
                }
                case "Exit", "quit" -> System.out.println("Exiting game"); //kan man lave en "are you sure(yes/no)"?
            }
        } while (gameplay != "Exit");
    }

}

