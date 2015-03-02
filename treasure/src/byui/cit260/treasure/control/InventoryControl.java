/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import byui.cit260.treasure.model.Inventory;
import byui.cit260.treasure.view.GetInput;

/**
 *
 * @author andrew
 */
public class InventoryControl {

    GetInput getinput = new GetInput();

    public void dropItem(Inventory inventory, char selection) {
        
        
        switch (selection) {
            case 'l':
                inventory.setLumber(inventory.getLumber() - 1);
                break;
            case 's':
                inventory.setSail(inventory.getSail() - 1);
                break;
            default:
                System.out.println("\ninvalid selection");
                
        }
        

    }

}
