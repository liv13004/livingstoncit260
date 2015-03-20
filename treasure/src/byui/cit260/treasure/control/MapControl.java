/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import byui.cit260.treasure.exceptions.MapControlException;
import byui.cit260.treasure.model.Game;
import byui.cit260.treasure.model.Map;
import java.util.Scanner;
import treasure.Treasure;

/**
 *
 * @author andrew
 */
public class MapControl {
private Game game;

    static void moveCharactersToStart(Map map) throws MapControlException{
        System.out.println("move CharactersToStart has been called");
    }

    public class playerLocation {

        playerLocation() {
            String location = "";
            location = "beach";
        }

    }

    /**
     *
     * @param character
     * @param location
     */
    public void move(String character, String location) {
        
    }
    public void moveToLocation(){
        
    }

    /**
     *
     * @param Area
     */
    public void Visit(int Area) {
        // TODO - implement Mapcontrol.Visit
      
    }

}


