/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import byui.cit260.treasure.model.Player;
import treasure.Treasure;

/**
 *
 * @author andrew
 */
public class GameControl {
    public static Object location;
    
    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGAme stub function called ****");
    }
    
public static Player createPlayer(String name) {
        System.out.println("creating player");
        if (name == null){
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        Treasure.setPlayer(player); //save the player
        
        return player;
    }

    public static void createHelpMenu(Player player) {
        System.out.println("\n*** createHelpMenu stub function called ****");
    }

    public static void createBoatMenu(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static boolean location(boolean input){
boolean complete = input;        
       return complete;    
}
}