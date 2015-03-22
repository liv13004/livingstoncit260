/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import byui.cit260.treasure.exceptions.MapControlException;
import byui.cit260.treasure.model.Game;
import byui.cit260.treasure.model.Map;
import byui.cit260.treasure.model.Player;
import java.awt.Point;
import java.util.Scanner;
import treasure.Treasure;

/**
 *
 * @author andrew
 */
public class MapControl {
private Game game;
private Map map;

    public MapControl() {
    game = Treasure.getCurrentGame();
    map = game.getMap();
}

    



    /**
     *
     * @param character
     * @param location
     */
    public void move(String character, String location) {
        
    }
    public void moveToLocation(Player player, Point coordinates) throws MapControlException{
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        if(newRow < 0 || newRow >= map.getRowCount() ||
           newColumn < 0 || newColumn >= map.getColCount()){
            throw new MapControlException("can not move player to "
                    + coordinates.x + ", " + coordinates.y
                    + " it is outside the map");
        }
    }

    /**
     *
     * @param Area
     */
    public void Visit(int Area) {
        // TODO - implement Mapcontrol.Visit
      
    }

}


