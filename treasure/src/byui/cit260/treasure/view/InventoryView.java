/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import byui.cit260.treasure.control.InventoryControl;

/**
 *
 * @author andrew
 */
public class InventoryView extends View{
    public InventoryView(){
        super("\nWhat would you like to do?"
                + "\ns = show items"
                    + "\nt = take item"
                    + "\nd = Drop item"
                    + "\nb = Back");
    }

    InventoryControl inventorycontrol = new InventoryControl();
    
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        switch (value) {
            case "s":
                System.out.printf("\nlumber = %s"
                        + "\nsail = %s",inventorycontrol.getLumber(),inventorycontrol.getSail());
                break;
            case "t":
                System.out.println("What do you want to take."
                        + "\n l = Lumber"
                        + "\n s = sail");
                inventorycontrol.addItem(super.getChar());
                break;
            case "d":
                System.out.println("What would you like to drop?"
                        + "\n l = lumber"
                        + "\n s = sail");
                inventorycontrol.dropItem(super.getChar());
                break;
            case "b":
                System.out.println("Back...");
                break;
            default:
                System.out.println("\ninvalid selection");

        }
        return false;
    }
}