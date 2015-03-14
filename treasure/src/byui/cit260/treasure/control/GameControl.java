/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import byui.cit260.treasure.model.Boat;
import byui.cit260.treasure.model.Game;
import byui.cit260.treasure.model.Gold;
import byui.cit260.treasure.model.Inventory;
import byui.cit260.treasure.model.Map;
import byui.cit260.treasure.model.Player;

import treasure.Treasure;


public class GameControl {
    private Game game;

    public static void createNewGame(Player player) {
        Game game = new Game();
        Treasure.setCurrentGame(game);
        
        game.setPlayer(player);

        Inventory inventory = new Inventory();
        game.setInventory(inventory);

        Boat boat = new Boat();
        game.setBoat(boat);

        Map map = new Map();
        game.setMap(map);
        
        Gold gold = new Gold();
        game.setGold(gold);
        Mapcontrol.moveCharactersToStart(map);

    }




    public static Player createPlayer(String name) {
        System.out.println("creating player");
        if (name == null) {
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

class Constants {

    public static int NUMBER_OF_INVENTORY_ITEMS;

    public Constants() {
    }
}