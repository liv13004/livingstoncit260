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
public class CharacterView extends View {
    private static String trader;
    private static String character;
    private static String turtle;
    private static String dolphin;
    private static String addItem;
       
    Mathcontrol math = new Mathcontrol();
    GetInput getinput = new GetInput();
    InventoryControl inventorycontrol = new InventoryControl();
      GoldControl goldcontrol = new GoldControl();
    
    
//String promptMessage
    public CharacterView() {
        super(//(promptMessage) 
                 (CharacterView.trader));
       
        
    }
        
    public void trader() {
        char value;
        System.out.println("Hi! my name is trader. what'll it be.");
        do {

            
            System.out.println(
                    trader = "\nn"
                    + "\nl = Lumber"
                    + "\ns = Sail"
                    + "\nb = Back");
                    value = getinput.getChar();
            doAction(value);
            System.out.println("Will there be anything else you need?");
        } while (value != 'b');
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
            doAction(selection);
        } while (selection != 'b');
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
            doAction(selection);
        } while (selection != 'b');
    }



    @Override
    public boolean doAction(Object obj) {
            String value = (String) obj;
            if (character.equals("trader")){
            
          //public void doActionTrader(String value) {
        switch (value) {
            case "l":
                System.out.println("Great! here you go.");
                inventorycontrol.addItem(value);
                break;
            case "s":
                System.out.println("Great! here you go.");
                inventorycontrol.addItem(value);
                break;
            case "b":
                System.out.println("Back...");
                break;
            default:
                System.out.println("\ninvalid selection");

                    }
            }
            
            if (character.equals("turtle")){
                switch (value) {
            case "h":
                if(math.math()){
                    
                System.out.println("ahh! thank you I thought I would rot for the rest of my life."
                        + "\nhere take this.");
           goldcontrol.addGold(10);}
                break;            
            case "s":
                System.out.println("you are an evil person.");
                break;
            case "b":
                System.out.println("Back...");
                break;
            default:
                System.out.println("\ninvalid selection");
                }
            }
                
            if (character.equals("dolphin")){
                switch (value) {
            case "h":
                if(math.math()){
                System.out.println("ahh! thank you I thought I would rot for the rest of my life."
                        + "\nhere take this.");
           goldcontrol.addGold(10);
                }
                break;
            case "s":
                System.out.println("I hate you.");
                break;
            case "b":
                System.out.println("Back...");
                break;
            default:
                System.out.println("\ninvalid selection");

                }
            }
                
           return false;
    }
  }
