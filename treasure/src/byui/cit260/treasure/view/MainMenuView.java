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


/**
 *
 * @author andrew
 */
public class MainMenuView extends View{
    
    public MainMenuView(){
        super("\nn = New Game"
                    + "\nl = Load Game"
                    + "\no = Options"
                    + "\nq = Quit");
    }


        
    @Override
    public boolean doAction(Object obj) {
        //string value = (String) obj;
        String value = (String) obj;
        //value = value.toUpperCase();
        
        
        boolean valid = false;
        switch (value) {
            case "n":
                startNewGame();
                valid = true;
                break;
            case "l":
                startExistingGame();
                valid = true;
                break;
            case "q":
                System.out.println("quitting");
                System.exit(0);
                break;
            default:
                System.out.println("\ninvalid selection");
        }
        return(valid);
    }

    private void startNewGame() {
        System.out.println("NewGame");
        GameControl.createNewGame(Treasure.getPlayer());

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu(new InventoryControl());
    }

    private void startExistingGame() {
        System.out.println("LoadGame");
    }

    private void displayOptions() {
        System.out.println("Options");
    }

}
