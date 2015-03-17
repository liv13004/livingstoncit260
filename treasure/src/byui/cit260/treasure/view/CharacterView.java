/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import byui.cit260.treasure.control.GoldControl;
import byui.cit260.treasure.control.InventoryControl;
import byui.cit260.treasure.control.MathControl;

/**
 *
 * @author andrew
 */
public class CharacterView extends View {

    private static final String trader = MapView.traderMenu;
    private static String character;
    private static final String turtle = MapView.turtleMenu;
    private static final String dolphin = MapView.dolphinMenu;
    private static String addItem;
    private static String userInput;
    private static String charOutput;
    public static String defaultMenu = "";

    MathControl math = new MathControl();
    GetInput getinput = new GetInput();
    InventoryControl inventorycontrol = new InventoryControl();
    GoldControl goldcontrol = new GoldControl();

//String promptMessage
    public CharacterView() {
        super(defaultMenu);
        if ("Trader".equals(MapView.mapCharacter)) {
            //System.out.print(MapView.traderMenu);
            defaultMenu = trader;

        } else if ("Turtle".equals(MapView.mapCharacter)) {
            System.out.print(MapView.turtleMenu);
            defaultMenu = turtle;

        } else if ("Dolphin".equals(MapView.mapCharacter)) {
            System.out.print(MapView.dolphinMenu);
            defaultMenu = dolphin;
        } else;

    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;

        if ("Trader".equals(MapView.mapCharacter)) {//.equals(character)){ // & charOutput.isEmpty()){

            switch (value) {
                case "l":
                    System.out.println("Great! here you go.");
                    //System.out.CharacterView trader;
                    inventorycontrol.addItem(value);
                    // super.display();
                    //MapView trader = new MapView();
                    //trader.display();
                    break;
                case "s":
                    System.out.println("Great! here you go.");
                    inventorycontrol.addItem(value);
                    //  super.display();
                    //MapView trader = new MapView();
                    //MapView trader = new MapView();
                    //trader.display();
                    //View.toString()
                    break;
                case "b":
                    System.out.println("Back...");
                    MapView.defaultMenu = MapView.beachMapMenu;
//               MapView beach = new MapView();
//               beach.display();
                    break;
                default:
                    System.out.println("\ninvalid selection");

            }
            return false;

        }

        if ("Turtle".equals(MapView.mapCharacter)) {
            switch (value) {
                case "h":
                    if (math.math()) {

                        System.out.println("ahh! thank you I thought I would rot for the rest of my life."
                                + "\nhere take this.");

                        goldcontrol.addGold(10);
                    }
                    break;
                case "s":
                    System.out.println("you are an evil person.");
                    break;
                case "b":
                    System.out.println("Back...");
                    System.out.println("Back...");
                    MapView.defaultMenu = MapView.oceanMapMenu;
//               MapView ocean = new MapView();
//               ocean.display();
                    break;
                default:
                    System.out.println("\ninvalid selection");
            }

            userInput = value;
        }

        if ("Dolphin".equals(MapView.mapCharacter)) {
            switch (value) {
                case "h":
                    if (math.math()) {
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
            userInput = value;
        }
        return false;

    }

}
