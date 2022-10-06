import java.util.Scanner;

public class UserInterface {
    private final Scanner UserInput = new Scanner(System.in);
    private Adventure adventure;
    private String input = "";
    private String itemName;

    public void start() {
        adventure = new Adventure();
        welcome();
        game();
    }

        public void welcome() {
            System.out.println("Welcome to your haunted adventure"); //TODO ascii art
            System.out.println("After a night of partying and having a blast with you baby sister you wake up,\n" +
                    "alone, cold and surrounded by darkness. The last thing you remember, is trying a ouija board at the party.\n" +
                    "Your sister is nowhere to be found, and your mission, should you chose to accept it, is to find her\n" +
                    "Do you accept? (Yes/No)");
            //TODO INSERT Yes/No option
            // If yes, continue game, else quit game
            System.out.println(adventure.getCurrentRoom().getRoomDescription());

            System.out.println("If at any point you need help, type help");
            System.out.println("What do you wish to do from here ?");
        }

        public void game(){
        boolean isRunning = true;
        while (isRunning) {
            input = UserInput.nextLine().toLowerCase();

            String[] inputSplit = input.split(" ");
            String userInput = inputSplit[0];

            if (inputSplit.length > 1){
                itemName = inputSplit[1];
            }


            switch (userInput) {
                case "north", "go north", "North"-> {
                    if (adventure.goNorth()) {
                        System.out.println("you went north and have entered the ");
                        System.out.println(adventure.getCurrentRoom().getRoomName() + adventure.getCurrentRoom().getRoomDescription());
                    } else {
                        System.out.println("You can't go that way, try anouther way");
                    }
                }

                case "south", "go south", "South"-> {
                    if (adventure.goSouth()) {
                        System.out.println("You went south and are now in the " + adventure.getCurrentRoom().getRoomName() + adventure.getCurrentRoom().getRoomDescription());
                    } else {
                        System.out.println("You can't go that way, try anouther way");
                    }
                }

                case "East", "go east", "east"-> {
                    if (adventure.goEast()) {
                        System.out.println("you went East and find yourself in the" + adventure.getCurrentRoom().getRoomName() + adventure.getCurrentRoom().getRoomDescription());

                    } else {
                        System.out.println("you can't go that way");
                    }
                }

                case "West", "go west", "west"-> {
                    if (adventure.goWest()) {
                        System.out.println("you went west");
                        System.out.println(adventure.getCurrentRoom().getRoomName() + adventure.getCurrentRoom().getRoomDescription());

                    } else {
                        System.out.println("you can't go that way");
                    }
                }

                case "look", "Look"-> {
                    System.out.println(adventure.getPlayer().getCurrentRoom().itemsRoom);
                }

                case "inventory", "inv", "Inventory"-> {
                    if (adventure.getPlayer().getInventory().isEmpty()){
                        System.out.println("You do not have anything in your invenory, keep looking around and take items to fill your inventory");
                    }else{
                        System.out.println(adventure.getPlayer().getInventory());
                    }
                }

                case "take", "Take"-> {
                    //The item should be removed from itemArray and put in inventoryArray
                    Item itemTaken = adventure.takeItem(itemName);
                    if (itemTaken == null){
                        System.out.println("There is no item in the room of that name.");
                    } else {
                        System.out.println(itemTaken + "has been placed in your inventory");
                    }
                }

                case "drop", "Drop"-> {
                    Item dropItem = adventure.dropItem(itemName);
                    if (dropItem == null) {
                        System.out.println("you do not have that object in your inventory");
                    } else {
                        System.out.println(dropItem + "was dropped from your inventory");
                    }
                }

                case "Help", "help"-> {
                    System.out.println("""
                            check the following commandlines for help:
                            To move around, type a direction (e.g go north, go south, go east, go west
                            To look around you, notype look
                            """);
                }

                case "Exit", "quit"-> {
                    System.out.println("Are you sure? yes/no");
                    //TODO insert YES/NO option
                    System.out.println("Exiting game");
                }

                default-> {
                    System.out.println("I don't understand, try again");
                    break;
                }
            }
        }
    }
}


