/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import java.util.Scanner;
import treasure.Treasure;
import byui.cit260.treasure.control.Checklistcontrol;
/**
 *
 * @author braden
 */
public class ChecklistDialogView {
    
    private String getInput() {
        boolean valid = false; //indicates if the name has been retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) {//while a valid name has not been retrieved
            //prompt for the player's name
            System.out.println("Enter the answer below;");
            //get the name from the keyboard and trim off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
            //if the name is invalid (less than two character in length)
            if (selection.isEmpty()) {
                System.out.println("Selection cannot be blank");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition

        }
        return null;        
    }
    
    
    
    private void buildBoatDialog() {
        System.out.println("Congratulations! You have built a boat, now lets go some places!");
        boolean done = Checklistcontrol.BuildBoat(true);
     }    
    private void climbTreeDialog() {
        System.out.println("Congratulations! You have climbed the tree, now you know where to go!");
        boolean done = Checklistcontrol.GetBearings(true);
    }
    private void buildBridgeDialog() {
        System.out.println("Congratulations! You have built the bridge, hurry up, you're almost to the treasure!");
        boolean done = Checklistcontrol.FixBridge(true);
    }    
    private void openChestDialog() {
        System.out.println("Congratulations! You have opened the chest and found the treasure!");
        boolean done = Checklistcontrol.OpenChest(true);
    }
    private void completeGameDialog() {
        System.out.println("Congratulations! You have Completed the Game");
         }
    
}