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
public class MainMenuView {
    
    private final String MENU = "\n"

            +"\n------------------------------"
            +"\n| Main Menu"
            +"\n-------------------------------"
            +"\nB - Begin Game"
            +"\nP - Get help on how to play the game"
            +"\nS - Save game"
            +"\nX - Exit"
            +"\n-------------------------------";
            
    public void displayMenu() {
        
        char selection = ' ';
        do{
        
        System.out.println(MENU); //display the main menu
        
        String input = this.getInput(); //get the user's selection
        selection = input.charAt(0); //get first character of string
        
        this.doAction(selection); //do action based on selection
         
        } while (selection != 'X'); //an selection is not "Exit"
    }

    private String getInput() {
              boolean valid = false; //indicates if the input text has been retrieved
              String playersInput = null;
              Scanner keyboard = new Scanner(System.in); //keyboard input stream
              
              while(!valid){//while a valid input has not been retrieved
                  //prompt for the users input
                  System.out.println("Enter the menu choice below;");
                  //get the input from the keyboard and trim off the blanks
                  playersInput = keyboard.nextLine();
                  playersInput = playersInput.trim();
                  
                  //if the input is invalid (less than one character in length)
                  if (playersInput.length()<1){
                  System.out.println("invalid input - the input must not be blank");
                  continue; // and repeat again
                  }
                  
                  //if the input is invalid (less than one character in length)
                  if (playersInput.length()>1){
                  System.out.println("invalid input - the input must not be more than one");
                  continue; // and repeat again
              }
                  break; // out of the (exit) the repetition
                  
              }
              return playersInput; //return the name
    }

    public void doAction(char choice) {
           switch (choice) {
            case 'B': //create and start a new game
                this.startNewGame();
                break;
            case 'G': // get and start an existing game
                this.startExistingGame();
                break;
            case 'P': //display the help menu
                this.displayHelpMenu();
                break;
            case 'S': // save the current game
                this.saveGame();
                break;
            case 'X': // Exit the program
                return;
           default:
        System.out.println("\n*** Invalid selection *** Try again");
               break;
    }
    }    

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(Treasure.getPlayer());
        
        //display the game menu
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        System.out.println("*** StartNewGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("*** StartExistingGame function called ***");
    }
    private void saveGame() {
        System.out.println("*** StartExistingGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }
    
    
    
}
