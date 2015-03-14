/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;


import byui.cit260.treasure.model.Game;
import byui.cit260.treasure.model.Inventory;
import byui.cit260.treasure.view.GetInput;

/**
 *
 * @author andrew
 */
public class InventoryControl {
    private Game game;
    GetInput getinput = new GetInput();

    
    public void dropItem(String selection) {
        
        
        switch (selection) {
            case "l":
                game.setLumber(game.getLumber() - 1);
                break;
            case "s":
                game.setSail(game.getSail() - 1);
                break;
            default:
                System.out.println("\ninvalid selection");
                
        }
    }

    public void addItem(String selection) {
 switch (selection) {
            case "l":
                inventory.setLumber(inventory.getLumber() + 1);
                break;
            case "s":
                inventory.setSail(inventory.getSail() + 1);
                break;
            default:
                System.out.println("\ninvalid selection");
                
        }
 
    }
    public int getLumber() {
        return inventory.getLumber();
    }

    

    public int getSail() {
        return inventory.getSail();
    }

}


