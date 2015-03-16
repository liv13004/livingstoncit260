/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import byui.cit260.treasure.model.Game;
import byui.cit260.treasure.model.Map;
import treasure.Treasure;

/**
 *
 * @author andrew
 */
public class GameMenuView extends View {

    Game game;
    Map map;

    public GameMenuView() {
        super(
                "\nm = View Map"
                + "\ni = Open Inventory"
                + "\nc = Checklist"
                + "\ns = Save Game"
                + "\nh = help menu"
                + "\nq = quit");
    }

    //GameMenuView() {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    @Override
    public boolean doAction(Object obj) {

        //String value = {String} obj;
        //value = value.toUpperCase()'
        // InventoryControl inventorycontrol;
        //HelpMenuView helpmenu = new HelpMenuView();
        //displayMenu(InventoryControl icontrol) {
        // inventorycontrol = icontrol;
        //char selection;
        // do {
        //   System.out.println(
        // String input = this.getInput();
        //selection = input.charAt(0);
        //boolean doAction = this.doAction(selection);
        //} while (selection != 'q');
        //return false;
        //}
        //}
//@Override
//public boolean 
        //private String getInput() {
        // boolean valid = false; //indicates if the name has been retrieved
        // String selection = null;
        // Scanner keyboard = new Scanner(System.in); //keyboard input stream
        //while (!valid) {//while a valid name has not been retrieved
        //prompt for the player's name
        // System.out.println("Enter your selection below;");
        //get the name from the keyboard and trim off the blanks
        //selection = keyboard.nextLine();
        // selection = selection.trim();
        //if the name is invalid (less thajn two character in length)
        // if (selection.isEmpty()) {
        //    System.out.println("selection cannot be blank");
        //    continue; // and repeat again
        // }
        //break; // out of the (exit) the repetition
        //}
        //return selection; //return the name
        // }
        String value = (String) obj;
        switch (value) {
            case "m":

                this.displayMap();
                break;
            case "i":
                InventoryView inventory = new InventoryView();
                inventory.display();
                break;
            case "c":
                System.out.println("viewing checklist...");
                break;
            case "s":
                System.out.println("save game...");
                break;
            case "h":
                System.out.println("help menu...");
                HelpMenuView helpmenu = new HelpMenuView();
                helpmenu.display();
                break;
            case "q":
                System.out.println("quitting");
                System.exit(0);
                break;
            default:
                System.out.println("\ninvalid selection");
        }
        return false;

    }

//    private void viewInventory() {
//        System.out.println("***viewInventory stub function called ***");
//        InventoryItem[] inventory = GameControl.getSortedInventoryList();
//        System.out.println("\nList of Inventory Items");
//        System.out.println("Description" + "\t"
//                + "Requited" + "\t"
//                + "In Stock");
//
//        //for each inventory item
//        for (InventoryItem inventoryItem : inventory) {
//            //Display the description, the required inpunt and amount in stock
//            System.out.println(inventoryItem.getDescription() + "\t     "
//                    + inventoryItem.getRequiredAmount() + "\t     "
//                    + inventoryItem.getquantityInStock());
//       }
//    }
    int colCount = map.getColCount();
    int rowCount = map.getRowCount();

    private void displayMap() {
        game = Treasure.getCurrentGame();
        map = game.getMap();
//
        //
        for (int i = 1; i <= colCount; i++) {

            displayColDiv();
            System.out.printf("  %s  ", i);
        }
        displayColDiv();
        for (int i = 0; i <= colCount; i++) {

            displayRowDiv();
            for (int j = 1; j <= colCount; j++) {
                displayColDiv();
                System.out.printf("item ", j);

            }
            displayColDiv();
        }

    }

    private void displayRowDiv() {
        String string = ("\n  ");
        for (int i = 1; i <= colCount; i++) {
            string = string.concat("----------");
        }
        System.out.println(string + "-");
    }

    private void displayColDiv() {

        System.out.print("  |  ");

    }
}
