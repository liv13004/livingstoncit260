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

    private static final String gameMenu = ("\nm = View Map"
            + "\ni = Open Inventory"
            + "\nc = Checklist"
            + "\ns = Save Game"
            + "\nh = help menu"
            + "\nq = quit");

    public GameMenuView() {
        super(gameMenu);

        // System.out.print(gameMenu);
    }

    //GameMenuView() {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    @Override
    public void doAction(Object obj) {

        String value = (String) obj;
        switch (value) {
            case "m":
                System.out.println("display Main map...");
                MapView.mapLocation = "Main";
                MapView.defaultMenu = MapView.mainMapMenu;
                MapView map = new MapView();
                map.display();
                break;
            case "i":
                InventoryView.defaultMenu = InventoryView.inventoryViewMenu;
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

    }

}
