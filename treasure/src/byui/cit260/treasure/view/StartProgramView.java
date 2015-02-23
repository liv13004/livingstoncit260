/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import byui.cit260.treasure.control.Gamecontrol;
import byui.cit260.treasure.model.Player;
import java.util.Scanner;

/**
 *
 * @author Braden
 */
public class StartProgramView {
    
    public StartProgramView(){
    }
        
 public void startProgram(){
//Display the banner screen
 this.displayBanner();  
 
//Get the players name
 String playersName = this.getPlayersName();
 
 //Create and save the player object
 Player player = Gamecontrol.createPlayer(playersName);
//DISPLAY a customized welcome message
  this.displayWelcomeMessage(player);
//DISPLAY the main menu
//END
//
 
 }
          
          public void displayBanner() {
              System.out.println("*******************************************************************"
                               + "\n*                                                                 *"
                               + "\n*                  Welcome to find the treasure                   *"
                               + "\n*                        ___                                      *"
                               + "\n*               _       /   |           \\ /                       *"
                               + "\n*                \\     /    |     _______X                        *"
                               + "\n*                 \\___/     |    /      / \\                       *"
                               + "\n*                            \\__/                                 *"
                               + "\n*                                                                 *"
                               + "\n*                            HAVE FUN!!                           *"
                               + "\n*******************************************************************");
              
          }
          
          public String getPlayersName() {
              boolean valid = false; //indicates if the name has been retrieved
              String playersName = null;
              Scanner keyboard = new Scanner(System.in); //keyboard input stream
              
              while(!valid){//while a valid name has not been retrieved
                  //prompt for the player's name
                  System.out.println("Enter the player's name below;");
                  //get the name from the keyboard and trim off the blanks
                  playersName = keyboard.nextLine();
                  playersName = playersName.trim();
                  
                  //if the name is invalid (less tahn two character in length)
                  if (playersName.length()<2){
                  System.out.println("invalid name - the name must not be blank");
                  continue; // and repeat again
              }
                  break; // out of the (exit) the repetition
                  
              }
              return playersName; //return the name
              }
          
          
          
          

    private void displayWelcomeMessage(Player player) {
        System.out.println("\tWelcome to the game " + player.getName() + "!");
    }
    
}


    

       

    

