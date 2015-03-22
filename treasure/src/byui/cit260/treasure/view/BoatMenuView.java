/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import java.util.Scanner;
import treasure.Treasure;
import byui.cit260.treasure.control.GameControl;
import byui.cit260.treasure.control.BoatControl;
import byui.cit260.treasure.control.InventoryControl;
import byui.cit260.treasure.exceptions.BoatControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author braden
 */
public class BoatMenuView extends View {

    BoatControl boat = new BoatControl();

    public BoatMenuView() {
        super("\ng = Board Boat"
                + "\nl = Leave Boat"
                + "\no = Sail Ocean"
                + "\ni = Sail Island"
                + "\np = Sail Beach"
                + "\nb = Back");
    }

    @Override
    public void doAction(Object obj) {
        try {
            //string value = (String) obj;
            
//value = value.toUpperCase();
            //if ((boat.onBoat(true))){//&&(( value.equals(("o"))))){//||(value.equals("i"))||(value.equals("b"))))){
            //boolean valid = false;
            if (!boat.onBoat(false)) {
                String value = (String) obj;
                switch (value) {//{
                    case "i":
                        System.out.println("Leaving for the island...");
                        this.sailIsland();
                        break;
                    case "o":
                        System.out.println("Leaving for the ocean...");
                        this.sailOcean();
                        break;
                    case "p":
                        System.out.println("Leaving for the beach...");
                        this.sailBeach();
                        break;
                        //}
                        //return false;
                        //}
                        //else {
                        //boolean valid = false;
                        //String value = (String) obj;
                        //switch (value) {
                        
                    case "g":
                        System.out.println("Getting on the boat...");
                        this.boardBoat();
                        break;
                    case "l":
                        System.out.println("Leaving the boat..");
                        this.leaveBoat();
                        break;
                }
            } else {
                String value = (String) obj;
                switch (value) {//{    case "i":
//                System.out.println("Leaving for the island...");
//                this.sailIsland();
//                break;
//            case "o":
//                System.out.println("Leaving for the ocean...");
//                this.sailOcean();
//                break;
//            case "p":
//                System.out.println("Leaving for the beach...");
//                this.sailBeach();
//                break;
                    case "b":
                        System.out.println("back to previous menu");
                        if ("Main".equals(MapView.mapLocation));
                        {
                            MapView.defaultMenu = MapView.mainMapMenu;
                            MapView main = new MapView();
                            main.display();
                        }
                        if ("Beach Shore".equals(MapView.mapLocation));
                        {
                            MapView.defaultMenu = MapView.beachMapMenu;
                            MapView beach = new MapView();
                            beach.display();
                        }
                        if ("Island Shore".equals(MapView.mapLocation));
                        {
                            MapView.defaultMenu = MapView.islandMapMenu;
                            MapView island = new MapView();
                            island.display();
                        }
                    
                    //System.exit(0);
                    //break;
                    default:
                        System.out.println("\ninvalid selection");
                }
            }
            
            
            //return(valid);
            //return false;
            //return false;
        } catch (BoatControlException ex) {
            Logger.getLogger(BoatMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void boatMenuView() {
        System.out.println("Boat Menu Called");
        GameControl.createBoatMenu(Treasure.getPlayer());
//display the boat menu
        BoatMenuView boatMenu = new BoatMenuView();
        boatMenu.display();

    }

    private void boardBoat() throws BoatControlException {
        System.out.println("boardBoat function called");
        System.out.println("Mind the Gap! You are now getting on the Boat!");
        //onBoat.onBoat();
        boat.onBoat(true);

        super.display();
    }

    private void leaveBoat() throws BoatControlException {
        System.out.println("leaveBoat function called");
        System.out.println("Step Lightly! You are now getting off the boat!");
        //onBoat.onBoat(false);
        //boat.offBoat(true);
        boat.onBoat(false);
        super.display();

    }

    private void sailOcean() {
        System.out.println("sailOcean function called");
        MapView.mapLocation = "Ocean";
        MapView.defaultMenu = MapView.oceanMapMenu;
        MapView ocean = new MapView();
        ocean.display();
    }

    private void sailIsland() {
        System.out.println("sailIsland function called");
        MapView.mapLocation = "Island";
        System.out.println("You Have Arrived at the Island."
                + "\n"
                + "Since you're feeling pretty seasick, \n"
                + "\n you should probably get off the boat");

        this.boatMenuView();

        MapView.defaultMenu = MapView.islandMapMenu;

        MapView island = new MapView();
        island.display();

    }

    private void sailBeach() {
        System.out.println("sailBeach function called");
        System.out.println("You Have Arrived at the Beach."
                + "\n"
                + "Since youre feeling pretty seasick,\n"
                + "you should probably get off the boat");
        this.boatMenuView();
        MapView.mapLocation = "Beach";
        MapView.defaultMenu = MapView.beachMapMenu;
        MapView beach = new MapView();
        beach.display();
    }
}
