/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import byui.cit260.treasure.control.GameControl;
import byui.cit260.treasure.model.Game;
import byui.cit260.treasure.model.Map;
import byui.cit260.treasure.view.MapView;
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
                this.console.println("display Main map...");
                MapView.mapLocation = "Main";
                MapView.defaultMenu = MapView.mainMapMenu;
                MapView map = new MapView();
                map.display(); 
                
                //MapView test() = MapView displayMap(); 
             
                //map.displayMap();
                break;
            case "i":
                InventoryView.defaultMenu = InventoryView.inventoryViewMenu;
                InventoryView inventory = new InventoryView();
                inventory.display();
                break;
            case "c":
                 this.console.println("viewing checklist...");
                break;
            case "s":
                 this.console.println("\n enter the name for your game.");
                 String filePath = "saves/" + getString();
                 
                 try {
                     GameControl.saveGame(Treasure.getCurrentGame(), filePath);
                 } catch (Exception ex){
                     ErrorView.display("gameMenuView", ex.getMessage());
                 }
                 
                break;
            case "h":
                 this.console.println("help menu...");
                HelpMenuView helpmenu = new HelpMenuView();
                helpmenu.display();
                break;
            case "q":
                 this.console.println("quitting");
                System.exit(0);
                break;
            default:
                System.out.println("\ninvalid selection");
                ErrorView.display(this.getClass().getName(), "\ninvalid selection");
        }

    }

}
