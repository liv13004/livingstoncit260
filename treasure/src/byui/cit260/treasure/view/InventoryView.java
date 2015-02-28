/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import byui.cit260.treasure.model.Inventory;
import byui.cit260.treasure.control.InventoryControl;

/**
 *
 * @author andrew
 */
public class InventoryView {

    GetInput getinput = new GetInput();
    InventoryControl inventorycontrol = new InventoryControl();
    Inventory inventory = new Inventory();

    public void openInventory() {
        char selection;
        do {
            System.out.printf(""
                    + "\nYou have %s Lumber"
                    + "\nYou have %s sail", inventory.getLumber(), inventory.getSail());
            System.out.println("\nWhat would you like to do?"
                    + "\nd = Drop item"
                    + "\nb = Back");
            selection = getinput.getChar();
            doAction(selection);
        } while (selection != 'b');

    }

    private void doAction(char selection) {
        switch (selection) {
            case 'd':
                System.out.println("What would you like to drop?"
                        + "\nl = lumber"
                        + "\ns = sail");
                inventorycontrol.dropItem(inventory, getinput.getChar());
                break;
            case 'b':
                System.out.println("Back...");
                break;
            default:
                System.out.println("\ninvalid selection");

        }
    }
}
