/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import byui.cit260.treasure.control.GameControl;
import java.util.Scanner;
import treasure.Treasure;

/**
 *
 * @author Braden
 */
public class HelpMenuView {
    
    void displayHelpMenu() {
        char selection;
        do {
            System.out.println(
                    "\nn = Need some Help?"
                    + "\nG = What is the goal of the game?"
                    + "\nM = How to Move"
                    + "\nL = Estimating the amount of lumber"
                    + "\nC = Convert from Metric to Standard"
                    + "\nQ = Quit");
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get first character of string
            this.doAction(selection); //do action based on selection
        } while (selection != 'q');
    }

     private String getInput() {
        boolean valid = false; //indicates if the name has been retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) {//while a valid name has not been retrieved
            //prompt for the player's name
            System.out.println("Enter your selection below;");
            //get the name from the keyboard and trim off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
            //if the name is invalid (less thajn two character in length)
            if (selection.isEmpty()) {
                System.out.println("selection cannot be blank");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition

        }
        return selection; //return the name
    }

    private void doAction(char choice) {
        switch (choice) {
            case 'G':  //game information
                this.gameHelp();
                break;
            case 'M': // How to Move
                this.moveHelp();
                break;
            case 'L': //How to Calculate Lumber
                this.lumberHelp();
                break;
            case 'C': //Convert from Metric to Standard
               this.convertHelp();
               break;
            case 'q': // Quit Help menu
                System.out.println("quitting");
                System.exit(0);
            default:
                System.out.println("\ninvalid selection");
        }
    }

    private void gameHelp() {
        System.out.println("gameHelp Called");
        GameControl.createHelpMenu(Treasure.getPlayer());
//display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
      
    }

    private void moveHelp() {
        System.out.println("moveHelp function called");
    }

    private void lumberHelp() {
        System.out.println("lumberHelp function called");
    }
    
     private void convertHelp() {
        System.out.println("convertHelp function called");
    }

    
}