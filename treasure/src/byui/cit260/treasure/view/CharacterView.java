/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import byui.cit260.treasure.control.GoldControl;
import byui.cit260.treasure.control.InventoryControl;
import byui.cit260.treasure.control.Mathcontrol;

/**
 *
 * @author andrew
 */
public class CharacterView {
    Mathcontrol math = new Mathcontrol();
    GetInput getinput = new GetInput();
    InventoryControl inventorycontrol = new InventoryControl();
    GoldControl goldcontrol = new GoldControl();

    public void trader() {
        char selection;
        System.out.println("Hi! my name is trader. what'll it be.");
        do {

            
            System.out.println("?\n"
                    + "\nl = Lumber"
                    + "\ns = Sail"
                    + "\nb = Back");
            selection = getinput.getChar();
            doActionTrader(selection);
            System.out.println("Will there be anything else you need?");
        } while (selection != 'b');
    }

    private void doActionTrader(char selection) {
        switch (selection) {
            case 'l':
                System.out.println("Great! here you go.");
                inventorycontrol.addItem(selection);
                break;
            case 's':
                System.out.println("Great! here you go.");
                inventorycontrol.addItem(selection);
                break;
            case 'b':
                System.out.println("Back...");
                break;
            default:
                System.out.println("\ninvalid selection");

        }
    }

    public void turtle() {
        char selection;
        do {

            System.out.println("Hey! Help! I got myself locked in this cage!");
            System.out.println("?\n"
                    + "\nh = Help"
                    + "\ns = Step away and let the turtle rot."
                    + "\nb = Back");
            selection = getinput.getChar();
            doActionTurtle(selection);
        } while (selection != 'b');
    }

    private void doActionTurtle(char selection) {
        switch (selection) {
            case 'h':
                if(math.math()){
                    
                System.out.println("ahh! thank you I thought I would rot for the rest of my life."
                        + "\nhere take this.");
           goldcontrol.addGold(10);
                }
                
                break;
            case 's':
                System.out.println("you are an evil person.");
                break;
            case 'b':
                System.out.println("Back...");
                break;
            default:
                System.out.println("\ninvalid selection");

        }
    }
    public void dolphin() {
        char selection;
        do {

            System.out.println("Hey! Help! I need to know how fast I can get to my family. they are 5 miles east"
                    + "\n I can swim about 2 kilometers per hour");
            System.out.println("?\n"
                    + "\nh = Help"
                    + "\ns = Step away and let the dolphin drown in its own stupidity."
                    + "\nb = Back");
            selection = getinput.getChar();
            doActionDolphin(selection);
        } while (selection != 'b');
    }

    private void doActionDolphin(char selection) {
        switch (selection) {
            case 'h':
                if(math.math()){
                System.out.println("ahh! thank you I thought I would rot for the rest of my life."
                        + "\nhere take this.");
           goldcontrol.addGold(10);
                }
                break;
            case 's':
                System.out.println("I hate you.");
                break;
            case 'b':
                System.out.println("Back...");
                break;
            default:
                System.out.println("\ninvalid selection");

        }
    }
}
