/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import byui.cit260.treasure.model.Boat;
import byui.cit260.treasure.model.Game;

import byui.cit260.treasure.model.InventoryItem;
import byui.cit260.treasure.model.Map;
import byui.cit260.treasure.model.Player;


import treasure.Treasure;

/**
 *
 * @author andrew
 */
public class GameControl {
        
    public static void createNewGame(Player player) {
Game game = new Game();
Treasure.setCurrentGame(game);

game.setPlayer(player);

InventoryItem[] inventoryList = GameControl.createInventoryList();

game.setInventory(inventoryList);

Boat boat = new Boat();
boat.setBoat(boat);

Map map = Mapcontrol.createMap();
game.setMap(map);

Mapcontrol.moveCharactersToStart(map);

    }
    
    public enum Item {
        lumber,
        sail;
    }
    
    public static InventoryItem[] createInventoryList(){
        System.out.println("createInventoryListcaled");
        InventoryItem[] inventory = 
                new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem lumber = new InventoryItem();
        lumber.setDescription("lumber");
        lumber.setQuantityInStock(0);
        lumber.setRequiredAmount();
        inventory[Item.lumber.ordinal()] = lumber;
        
        InventoryItem sail = new InventoryItem();
        sail.setDescription("sail");
        sail.setQuantityInStock(0);
        sail.setRequiredAmount();
        inventory[Item.sail.ordinal()] = sail;
        
        return null;
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

public static void createGameMenu(Player player) {
        //Super.GameMenuView gameMenu = new GameMenuView();
        System.out.println("\n*** createGameMenu stub function called ****");
        //View.this.doAction();
    }

    public static void createHelpMenu(Player player) {
        System.out.println("\n*** createHelpMenu stub function called ****");
    }

    public static void createBoatMenu(Player player) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void createMapView(Player player) {
        System.out.println("\n*** create mapView stub function called ****");
    }
//    public static String location(String input){
//        String complete = input;        
//      return complete;    
//}
}