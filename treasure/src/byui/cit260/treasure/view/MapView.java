/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;


import byui.cit260.treasure.model.Map;
import byui.cit260.treasure.control.GameControl;
import java.util.Scanner;
import treasure.Treasure;
/**
 *
 * @author braden
 */
public class MapView {
    
     void displayMapMenu() {
         if (GameControl.location == null); //use for beach
         
           do {
            System.out.println(
                    
                      "\nt = Visit Trader"
                    + "\nc = Build Boat"
                    + "\no = Sail to Ocean"                    
                    + "\nq = Quit");
            
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
            } while (selection != 'q');   
           
           if (location == null); //use for ocean
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
        } while (selection != 'q');   
            
            if (location == null); //use for island
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
        } while (selection != 'q');   
    }
    
}
