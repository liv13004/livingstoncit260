/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import byui.cit260.treasure.control.GameControl.Item;
import byui.cit260.treasure.model.Boat;
import byui.cit260.treasure.model.Game;
import byui.cit260.treasure.model.Gold;
import byui.cit260.treasure.model.InventoryItem;
import byui.cit260.treasure.model.Map;
import byui.cit260.treasure.model.Player;

import treasure.Treasure;


public class GameControl {
    //private Game game;
    
    

    public static void createNewGame(Player player) {
        
        Game game = new Game(); //create new game
        
        Treasure.setCurrentGame(game); //save in treasure
        
        game.setPlayer(player); //save player in game

        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventoryItem(inventoryList);
        
        Boat boat = new Boat();
        game.setBoat(boat);
        
        Map map = new Map(5,5);
        game.setMap(map);
        

        
        Gold gold = new Gold();
        game.setGold(gold);
        Mapcontrol.moveCharactersToStart(map);
        
        
    }

    private static class Constants {
        private static int NUMBER_OF_INVENTORY_ITEMS;
    }

  public enum Item {
        lumber,
        sail,
        seashell,
        rope,
        calculator,
        batteries,
        phone,
        matches,
        flashlight,
        knife;
    }
    

   
    
public static InventoryItem[] createInventoryList() {
    
     
    System.out.println("*** called createInventoryList in GameControl ***" );
    
    InventoryItem[] inventory =
                new InventoryItem[Item.values().length];//Constants.NUMBER_OF_INVENTORY_ITEMS
    
    InventoryItem lumber = new InventoryItem();
    lumber.setDescription("Lumber");
    lumber.setAmount(0);
    lumber.setRequiredAmount(0);
    inventory[Item.lumber.ordinal()] = lumber;
    
    InventoryItem sail = new InventoryItem();
    sail.setDescription("Sail");
    sail.setAmount(0);
    sail.setRequiredAmount(0);
    inventory[Item.sail.ordinal()] = sail;
    
    InventoryItem seashell = new InventoryItem();
    seashell.setDescription("Seashell");
    seashell.setAmount(0);
    seashell.setRequiredAmount(0);
    inventory[Item.seashell.ordinal()] = seashell;
    
    InventoryItem rope = new InventoryItem();
    rope.setDescription("Rope");
    rope.setAmount(0);
    rope.setRequiredAmount(0);
    inventory[Item.rope.ordinal()] = rope;
    
    InventoryItem calculator = new InventoryItem();
    calculator.setDescription("Calculator");
    calculator.setAmount(0);
    calculator.setRequiredAmount(0);
    inventory[Item.calculator.ordinal()] = calculator;
    
    InventoryItem batteries = new InventoryItem();
    batteries.setDescription("Batteries");
    batteries.setAmount(0);
    batteries.setRequiredAmount(0);
    inventory[Item.batteries.ordinal()] = batteries;
    
    InventoryItem phone = new InventoryItem();
    phone.setDescription("Phone");
    phone.setAmount(0);
    phone.setRequiredAmount(0);
    inventory[Item.phone.ordinal()] = phone;
    
    InventoryItem matches = new InventoryItem();
    matches.setDescription("Matches");
    matches.setAmount(0);
    matches.setRequiredAmount(0);
    inventory[Item.matches.ordinal()] = matches;
    
    InventoryItem flashlight = new InventoryItem();
    flashlight.setDescription("Flashlight");
    flashlight.setAmount(0);
    flashlight.setRequiredAmount(0);
    inventory[Item.flashlight.ordinal()] = flashlight;
    
    InventoryItem knife = new InventoryItem();
    knife.setDescription("Knife");
    knife.setAmount(0);
    knife.setRequiredAmount(0);
    inventory[Item.knife.ordinal()] = knife;
    
    return inventory;
}

public static InventoryItem[] getSortedInventoryList(){
    // getinventory list for the current game
    InventoryItem[] originalInventoryList = 
            Treasure.getCurrentGame().getInventoryItem();
    
    //clone InventoryList
    InventoryItem[] inventoryList = originalInventoryList.clone();

    InventoryItem tempInventoryItem;
    for(int i = 0; i < inventoryList.length - 1; i++){
        for (int j = 0; j < inventoryList.length - 1 - i; j++){
            if (inventoryList[j].getDescription().toString().compareToIgnoreCase((String)inventoryList[j + 1].getDescription()) > 0){
                tempInventoryItem = inventoryList[j];
                inventoryList[j] = inventoryList[i];
                inventoryList[j + 1] = tempInventoryItem;
            }
        }
    }
    return inventoryList;
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
    
//    public static void createInventoryList(Inventory inventoryList) {
//        
//        System.out.println("\n*** create InventoryList stub function called ****");
//    }
//    public static String location(String input){
//        String complete = input;        
//      return complete;    
//}
//class Constants {
//
//    public int NUMBER_OF_INVENTORY_ITEMS;
//
//        public void Constants() {
//        }
//    }

}