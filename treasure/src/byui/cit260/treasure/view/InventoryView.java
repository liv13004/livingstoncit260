/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import byui.cit260.treasure.control.InventoryControl;
import byui.cit260.treasure.model.Game;
import byui.cit260.treasure.model.InventoryItem;
import treasure.Treasure;

/**
 *
 * @author andrew
 */
public class InventoryView extends View{
private Game game;

public static String defaultMenu = "";
    private static final String takeItem = ("What do you want to take.\"\n" 
                                        +    "\nl = Lumber" 
                                        +    "\ns = sail"
                                        + "\nb = Back\" " );

    
  private static final String dropItem =( "What do you want to drop."
                                     +   "\nl = Lumber" 
                                     +   "\ns = sail"
                                     + "\nb = Back\" ");
  public static final String inventoryViewMenu = ("What would you like to do?"
                + "\ns = show items"
                    + "\nt = take item"
                    + "\nd = Drop item"
                    + "\nb = Back");
  

    public InventoryView(){
        super(defaultMenu);
        
        InventoryControl inventorycontrol = new InventoryControl();
    }
InventoryControl inventorycontrol = new InventoryControl();
    
    
    @Override
    public boolean doAction(Object obj) {
        GameMenuView GameMenu = new GameMenuView();
        String value = (String) obj;
        
        switch (value) {
            case "s":
                System.out.println("here is your current inventroy\n");
                inventorycontrol.displayInventory();
                InventoryView.defaultMenu = InventoryView.inventoryViewMenu;
                System.out.println(defaultMenu);
                break;
            case "t":
                System.out.println(takeItem);
                InventoryView.defaultMenu = InventoryView.takeItem;
                inventorycontrol.addItem(super.getString());
                
                super.display();
                
                break;
            case "d":
                System.out.println(dropItem);
                InventoryView.defaultMenu = InventoryView.dropItem;
                
                inventorycontrol.dropItem(super.getString());
                
                super.display();
                
                break;
            case "b":
                System.out.println("Back...");
                GameMenu.display();
                break;
            default:
                System.out.println("\ninvalid selection");

        }
        return false;
    }

    
}