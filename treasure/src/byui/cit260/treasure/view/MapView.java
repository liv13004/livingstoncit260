/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import byui.cit260.treasure.model.Map;
import byui.cit260.treasure.control.GameControl;
import byui.cit260.treasure.control.Mapcontrol;
import byui.cit260.treasure.control.Mapcontrol;
import java.util.Scanner;
import treasure.Treasure;
/**
 *
 * @author braden
 */
public class MapView {
    
    public class MainMapView{
            boolean valid = false;
            String place = null;
            String test = null;
            
            String test = Mapcontrol.Location;
         if (test == "beach") {
                 do {
                 System.out.println(
                         
                         "\nt = Visit Beach"
                                 + "\nc = Visit Ocean"
                                 + "\no = Visit Island"
                                 + "\nq = Quit");
                 
                 String input = this.getInput();
                 selection = input.charAt(0);
                 this.doAction();
             }
             while (selection != 'q');
             }
             }
         
             
    public class BeachMapView { 
             public String lugar;
             Mapcontrol.Location(location)= lugar;
             if (Mapcontrol.Location(location) == "beach") { //use for ocean
             do {
                 System.out.println(
                         
                         "\nb = Visit Trader"
                                 + "\nl = leave boat"
                                 + "\ni = Sail Island"
                                 + "\ns = Sail Beach"
                                 + "\nq = Quit");
                 
                 String input = this.getInput();
                 selection = input.charAt(0);
                 this.doAction(selection);
             }
             while (selection != 'q');
             }
             }
     
    public class OceanMapView{
             if (GameControl. == null); //use for island
             do {
                 System.out.println(
                         
                         "\nb = Visit Trader"
                                 + "\nl = leave boat"
                                 + "\ni = Sail Island"
                                 + "\ns = Sail Beach"
                                 + "\nq = Quit");
                 
                 String input = this.getInput();
                 selection = input.charAt(0);
                 this.doAction(selection);
             }
             while (selection != 'q');
         }
    
   public class IslandMapView(){
             if (GameControl. == null); //use for island
             do {
                 System.out.println(
                         
                         "\nb = Visit Trader"
                                 + "\nl = leave boat"
                                 + "\ni = Sail Island"
                                 + "\ns = Sail Beach"
                                 + "\nq = Quit");
                 
                 String input = this.getInput();
                 selection = input.charAt(0);
                 this.doAction(selection);
             }
             while (selection != 'q');
         }
          
     private String getInput() {
        boolean valid = false; //indicates if the name has been retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) {//while a valid input has not been retrieved
            //prompt for the player's input
            System.out.println("Enter your selection below;");
            //get the name from the keyboard and trim off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
            //if the input is invalid (less than two character in length)
            if (selection.isEmpty()) {
                System.out.println("selection cannot be blank");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition

        }
        return selection; //return the input
    }

    private void doAction(char choice) {
        switch (choice) {
            case 'G':  //game information
                this.MainMap();
                break;
            case 'M': // How to Move
                this.beachMapView();
                break;
            case 'L': //How to Calculate Lumber
                this.oceanMapView();
                break;
            case 'C': //Convert from Metric to Standard
               this.islandMapView();
               break;
            case 'q': // Quit Help menu
                System.out.println("quitting");
                System.exit(0);
            default:
                System.out.println("\ninvalid selection");
        }
    }
    
    private void MainMap() {
        System.out.println("mapView Called");
        GameControl.createMapView(Treasure.getPlayer());
//display the map
        MainMapView mapView = new MainMapView();
        mapView.displayMainMap();
      
    }
    private void beachMapView() {
        System.out.println("beachMapView function called");
        
        GameControl.createBeachMapView(Treasure.getPlayer());
//display the map
        BeachMapView beachMap = new BeachMapView();
        beachMap.displayBeachMap();
    }
    private void oceanMapView() {
        System.out.println("oceanMapView function called");
        
        GameControl.createOceanMapView(Treasure.getPlayer());
//display the map
        OceanMapView oceanMap = new OceanMapView();
        oceanMap.displayOceanMap();
    }
    private void islandMapView() {
        System.out.println("islandMapView function called");
        
        GameControl.createIslandMapView(Treasure.getPlayer());
//display the map
        IslandMapView islandMap = new MapView();
        islandMap.displayIslandMap();
    }
}  
