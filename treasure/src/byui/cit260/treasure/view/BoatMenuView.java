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
        super(" \n Boat Menu \n \n "
                + "(First choose an action.)"
                + "\ng = Board Boat(If you are leaving a location))"
                + "\nl = Leave Boat(If you have just arrived at a location))"
                + "\n \n  NOW CHOOSE A LOCATION TO GO TO :\n \n"
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
            if (!boat.onBoat(true)) {
                String value = (String) obj;
                switch (value) {//{
                    case "i":
                        this.console.println("  Leaving for the island...\n");
                        this.sailIsland();
                        break;
                    case "o":
                        this.console.println("  Leaving for the ocean...");
                        this.sailOcean();
                        break;
                    case "p":
                        this.console.println("  Leaving for the beach...");
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
                        this.console.println("Getting on the boat...");
                        this.boardBoat();
                        break;
                    case "l":
                        this.console.println("Leaving the boat..");
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
                       this.console.println("back to previous menu");
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
                        ErrorView.display(this.getClass().getName(), "\ninvalid selection");
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
       this.console.println("Boat Menu Called");
        GameControl.createBoatMenu(Treasure.getPlayer());
//display the boat menu
        BoatMenuView boatMenu = new BoatMenuView();
        boatMenu.display();

    }

    private void boardBoat() throws BoatControlException {
        this.console.println("boardBoat function called");
        this.console.println("Mind the Gap! You are now getting on the Boat!");
        //onBoat.onBoat();
        boat.onBoat(true);

        super.display();
    }

    private void leaveBoat() throws BoatControlException {
       this.console.println("leaveBoat function called");
        this.console.println("Step Lightly! You are now getting off the boat!");
        //onBoat.onBoat(false);
        //boat.offBoat(true);
        if ("Main".equals(MapView.mapLocation));
                        {
                            MapView.defaultMenu = MapView.mainMapMenu;
                            //MapView main = new MapView();
                            //main.display();
                        }
        if ("Beach Shore".equals(MapView.mapLocation));
                        {
                            MapView.defaultMenu = MapView.beachMapMenu;
                            //MapView beach = new MapView();
                            //beach.display();
                        }
        if ("Island Shore".equals(MapView.mapLocation));
                        {
                            MapView.defaultMenu = MapView.islandMapMenu;
                            //MapView island = new MapView();
                            //island.display();
                        }
        boat.onBoat(false);
        
        super.display();

    }

    private void sailOcean() {
       this.console.println("sailOcean function called");
        MapView.mapLocation = "Ocean";
        MapView.defaultMenu = MapView.oceanMapMenu;
        MapView ocean = new MapView();
        ocean.display();
    }

    private void sailIsland() {
        this.console.println(""
                + "\n   sailIsland function called");
        MapView.mapLocation = "Island";
        this.console.println(""
                + "\n   You Have Arrived at the Island.\n"
                + "\n"
                + "Since you're feeling pretty seasick,you should probably get off the boat \n"
                + "\n");
        MapView.mapLocation="Island Shore";
       // this.boatMenuView();

        MapView.defaultMenu = MapView.islandMapMenu;

        MapView island = new MapView();
        island.display();

    }

    private void sailBeach() {
       this.console.println("sailBeach function called");
        this.console.println("You Have Arrived at the Beach."
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
