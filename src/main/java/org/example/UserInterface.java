package org.example;

import java.util.Scanner;

public class UserInterface {
    public void Start() {
        Scanner UserInput = new Scanner(System.in);

        System.out.println("Welcome to adventure");
        System.out.println("Do you wish to read the manual for the game before beginning? (yes/no)");
        String intro = UserInput.nextLine();
      /*  switch(intro) {
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
        System.out.println("where do you wish to go next?");
        String gameplay = UserInput.nextLine();
        switch (gameplay){
            case "North":

        }

        }
    }

