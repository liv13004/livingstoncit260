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
                    + "\ng = take item"
                    + "\nd = Drop item"
                    + "\nb = Back");
            selection = getinput.getChar();
            doAction(selection);
        } while (selection != 'b');

    }

    private void doAction(char selection) {
        switch (selection) {
            case 'g':
                System.out.println("what would you like to take?");
                System.out.printf("\n%s\n",getinput.getString());
                break;
            case 'd':
                System.out.println("What would you like to drop?"
                        + "\n l = lumber"
                        + "\n s = sail");
                System.out.printf("\n %s", getinput.getString());
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
