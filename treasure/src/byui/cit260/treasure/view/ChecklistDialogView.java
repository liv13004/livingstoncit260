/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import java.util.Scanner;
import treasure.Treasure;
import byui.cit260.treasure.control.ChecklistControl;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author braden
 */
public class ChecklistDialogView extends View {

    public ChecklistDialogView(String promptMessage) {
        super(promptMessage);
    }

    @Override
    public String getInput() {
        boolean valid = false; //indicates if the name has been retrieved
        String selection = null;
        try {
            String option = this.keyboard.readLine(); //keyboard input stream
        } catch (IOException ex) {
            Logger.getLogger(ChecklistDialogView.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (!valid) {//while a valid name has not been retrieved
            //prompt for the player's name
            this.console.println("Enter the answer below;");
            try {
                //get the name from the keyboard and trim off the blanks
                selection = keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(ChecklistDialogView.class.getName()).log(Level.SEVERE, null, ex);
            }
            selection = selection.trim();
            //if the name is invalid (less than two character in length)
            if (selection.isEmpty()) {
                this.console.println("Selection cannot be blank");
                ErrorView.display(this.getClass().getName(), "Selection cannot be blank");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition

        }
        return null;
    }

    private void buildBoatDialog() {
        this.console.println("Congratulations! You have built a boat, now lets go some places!");
        boolean done = ChecklistControl.BuildBoat(true);
    }

    private void climbTreeDialog() {
        this.console.println("Congratulations! You have climbed the tree, now you know where to go!");
        boolean done = ChecklistControl.GetBearings(true);
    }

    private void buildBridgeDialog() {
        this.console.println("Congratulations! You have built the bridge, hurry up, you're almost to the treasure!");
        boolean done = ChecklistControl.FixBridge(true);
    }

    private void openChestDialog() {
        this.console.println("Congratulations! You have opened the chest and found the treasure!");
        boolean done = ChecklistControl.OpenChest(true);
    }

    private void completeGameDialog() {
        this.console.println("Congratulations! You have Completed the Game");
    }

    @Override
    public void doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
