/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import byui.cit260.treasure.control.PlayerControl;
import byui.cit260.treasure.model.Player;

/**
 *
 * @author Braden
 */
public class StartProgramView {
    
 public void startProgram(){
     this.displayBanner();      //display banner
     
     Player player = PlayerControl.createPlayer(PlayerName);  //create player
     
     this.displayWelcomeMessage(player);
     
     
 }
////          Begin
//         
//Display the banner screen
//Get the players name
//Create a new player
//DISPLAY a customized welcome message
//DISPLAY the main menu
//END
//
          
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

    private void displayWelcomeMessage(Player player) {
        
    }
    
}
