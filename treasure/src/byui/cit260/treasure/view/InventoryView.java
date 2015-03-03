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
    InventoryControl inventorycontrol;

    public void openInventory(InventoryControl icontrol) {
        char selection;
        inventorycontrol = icontrol;
        do {
            System.out.printf(""
                    + "\nYou have %s Lumber"
                    + "\nYou have %s sail", inventorycontrol.getLumber(), inventorycontrol.getSail());
            System.out.println("\nWhat would you like to do?"
                    + "\nt = take item"
                    + "\nd = Drop item"
                    + "\nb = Back");
            selection = getinput.getChar();
            doAction(selection);
        } while (selection != 'b');

    }

    private void doAction(char selection) {
        switch (selection) {
            case 't':
                System.out.println("What do you want to take."
                        + "\n l = Lumber"
                        + "\n s = sail");
                inventorycontrol.addItem(getinput.getChar());
                break;
            case 'd':
                System.out.println("What would you like to drop?"
                        + "\n l = lumber"
                        + "\n s = sail");
                inventorycontrol.dropItem(getinput.getChar());
                break;
            case 'b':
                System.out.println("Back...");
                break;
            default:
                System.out.println("\ninvalid selection");

        }
    }
}
