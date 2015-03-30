/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import java.util.Scanner;
import treasure.Treasure;
import byui.cit260.treasure.control.GameControl;
import byui.cit260.treasure.control.InventoryControl;
import byui.cit260.treasure.exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andrew
 */
public class MainMenuView extends View {
private GameControl gameControl;
    public static String mainMenu = ("\nn = New Game"
            + "\nl = Load Game"
            + "\no = Options"
            + "\nq = Quit");

    public MainMenuView() {
        super(mainMenu);
        //System.out.print(mainMenu);
        gameControl = new GameControl();
    }

    @Override
    public void doAction(Object obj) {
        //string value = (String) obj;
        String value = (String) obj;
        //value = value.toUpperCase();

        boolean valid = false;
        switch (value) {
            case "n":
        {
            try {
                startNewGame();
            } catch (MapControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                valid = true;
                break;
            case "l":
                startExistingGame();
                valid = true;
                break;
            case "o":
                displayOptions();
                valid = true;
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

    private void startNewGame() throws MapControlException {
        this.console.println("NewGame");
        gameControl.createNewGame(Treasure.getPlayer());
        gameControl.createGameMenu(Treasure.getPlayer());
        //DISPLAY the Game menu
        GameMenuView GameMenu = new GameMenuView() {
        };
        GameMenu.display();
        //View.doGameMenuView();
        //   gameMenu.displayMenu(new InventoryControl());
    }

    private void startExistingGame() {
         this.console.println("LoadGame");
    }

    private void displayOptions() {
         this.console.println("Options");
    }

    private void mainMenu() {
        mainMenu = ("\nn = New Game"
                + "\nl = Load Game"
                + "\no = Options"
                + "\nq = Quit");
         this.console.println(mainMenu);
    }

}
