package org.example;

import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    public void start() {
        Adventure adventure = new Adventure();
        adventure.createRooms();
        Scanner UserInput = new Scanner(System.in);

        System.out.println("Welcome to adventure");
        System.out.println("Do you wish to read the manual for the game before beginning? (yes/no)");
        /*String intro = UserInput.nextLine();
        switch(intro) {
            case "yes":
                System.out.println("INDSÆT MANUAL");
                System.out.println("Do you wish to start your adventure? (yes/no)");
                UserInput.nextLine();
                break;
            case "no":
                System.out.println("Are you ready to begin your adventure?(yes/no)");
                break;
            case "quit":
                System.out.println("shutting game down");
                //indsæt stop af spillet
                break;
            default:
                System.out.println("You can only answer with yes or no");

            }
              */

        System.out.println("gamestorygamestorygamestorygamestorygamestorygamestorygamestorygamestory");
        System.out.println("If at any point you need help, type help");
        System.out.println("where do you wish to go next?");
        String gameplay;

        do {
            gameplay = UserInput.next();
            gameplay = gameplay.toLowerCase();
            switch (gameplay) {
                case "north", "go north":
                    System.out.println("You went north");
                    break;
                case "South", "go south":
                    System.out.println("you went south");
                    break;
                case "East", "go east":
                    adventure.goEast();
                    System.out.println("You went east");
                    break;
                case "West", "go west":
                    System.out.println("you went west");
                    break;
                case "Look", "look":
                    System.out.println(adventure.getCurrentRoom().getRoomName()+" "+adventure.getCurrentRoom().getRoomDescription());
                    break;
                case "Help", "help":
                    System.out.println("commands:\n");
                    break;
                case "Exit", "quit":
                    System.out.println("Exiting game"); //kan man lave en "are you sure(yes/no)"?

            }
        } while (gameplay != "Exit");
    }
}

