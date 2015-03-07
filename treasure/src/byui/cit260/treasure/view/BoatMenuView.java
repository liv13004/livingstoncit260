/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import java.util.Scanner;
import treasure.Treasure;
import byui.cit260.treasure.control.GameControl;
import byui.cit260.treasure.control.InventoryControl;


/**
 *
 * @author braden
 */

public class BoatMenuView extends View{

    public BoatMenuView() {
        super("\nb = Board Boat"
                    + "\nl = Leave Boat"
                    + "\ni = Sail Island"
                    + "\ns = Sail Beach"
                    + "\nq = Quit");
    }

//    private BoatMenuView() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
  
//            String input = this.getInput();
//            selection = input.charAt(0);
//            this.doAction(selection);
//        } while (selection != 'q');   
//    }
//  
//  private String getInput() {
//        boolean valid = false; //indicates if the name has been retrieved
//        String selection = null;
//        Scanner keyboard = new Scanner(System.in); //keyboard input stream
//
//        while (!valid) {//while a valid name has not been retrieved
//            //prompt for the player's name
//            System.out.println("Enter your selection below;");
//            //get the name from the keyboard and trim off the blanks
//            selection = keyboard.nextLine();
//            selection = selection.trim();
//            //if the name is invalid (less thajn two character in length)
//            if (selection.isEmpty()) {
//                System.out.println("selection cannot be blank");
//                continue; // and repeat again
//            }
//            break; // out of the (exit) the repetition
//
//        }
//        return selection; //return the name
//    }
    
        //return(valid);
    //}
 
 
 

    @Override
    public boolean doAction(Object obj) {
//string value = (String) obj;
        String value = (String) obj;
//value = value.toUpperCase();

        boolean valid = false;
        switch (value) {
            case "b":
                System.out.println("Getting on the boat...");
                this.boardBoat();
                break;
            case "l":
                System.out.println("Leaving the boat..");
                this.leaveBoat();
                break;
            case "i":
                System.out.println("Leaving for the island...");
                this.sailIsland();
                break;
            case "s":
                System.out.println("Leaving for the beach...");
                this.sailBeach();
                break;
            case "q":
                System.out.println("quitting");
                System.exit(0);
                break;
            default:
                System.out.println("\ninvalid selection");
    }
        return(valid);
}

    private void boatMenuView() {
        System.out.println("Boat Menu Called");
        GameControl.createBoatMenu(Treasure.getPlayer());
//display the boat menu
        BoatMenuView boatMenu = new BoatMenuView();
        boatMenu.display();
      
    }
    
    private void boardBoat() {
        System.out.println("boardBoat function called");
    }
 private void leaveBoat() {
        System.out.println("leaveBoat function called");
    }
 private void sailIsland() {
        System.out.println("sailIsland function called");
    }
 private void sailBeach() {
        System.out.println("sailBeach function called");
    }
}