/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import byui.cit260.treasure.control.GoldControl;
import byui.cit260.treasure.control.InventoryControl;
import byui.cit260.treasure.control.MathControl;
import byui.cit260.treasure.view.HelpMenuView;
import static byui.cit260.treasure.view.MapView.mapLocation;
import java.text.DecimalFormat;


/**
 *
 * @author braden edited 4/3/15
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
    //private static String turtpt1 = "The turtle says its weight is 0 kilograms";
    public static String turtpt2 = "kilograms" + "\n \n How many pounds should be placed on the counter weight \n to make it 5% higher than the turtles weight?\n" +
"Enter your answer Below...(to two decimal places)";
    public static String turtpt3 = "Ok, now that I'm free I need one last favor from you, which I will reward you for...."
            + "Can you solve the following math problem for me correctly?";
    
    public static String dolphpt1 = "miles" + "\n \n How long will it take me to swim that far of a distance in miles does the dolphin need to swim in addition \n to make it 15% farther in order to catch up with it's family?\n" +
"\n Enter your answer Below...(to two decimal places)\n";
    public static String dolphpt2 = "Ok, now that I know where to go I need one last favor from you, which I will reward you for...."
            + "Can you solve the following math problem for me correctly?";

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
            this.console.print(MapView.turtleMenu);
            defaultMenu = turtle;

        } else if ("Dolphin".equals(MapView.mapCharacter)) {
            this.console.print(MapView.dolphinMenu);
            defaultMenu = dolphin;
        } else;

    }
    
    
    @Override
    public void doAction(Object obj) {
        String value = (String) obj;

        if ("Trader".equals(MapView.mapCharacter)) {//.equals(character)){ // & charOutput.isEmpty()){

            switch (value) {
                case "l":
                    this.console.println("Great! here you go.");
                    //System.out.CharacterView trader;
                    inventorycontrol.addItem(value);
                    // super.display();
                    //MapView trader = new MapView();
                    //trader.display();
                    break;
                case "s":
                    this.console.println("Great! here you go.");
                    inventorycontrol.addItem(value);
                    //  super.display();
                    //MapView trader = new MapView();
                    //MapView trader = new MapView();
                    //trader.display();
                    //View.toString()
                    break;
                case "b":
                    this.console.println("Back...");
                    MapView.defaultMenu = MapView.beachMapMenu;
                    mapLocation = "Beach";
//               MapView beach = new MapView();
//               beach.display();
                    break;
                default:
                    System.out.println("\ninvalid selection");
                     ErrorView.display(this.getClass().getName(), "\ninvalid selection");

            }

        }

        if ("Turtle".equals(MapView.mapCharacter)) {
            switch (value) {
                case "a":
                   // this.math.turtle(turtle, counter);
                    this.turtleTest();
                    //double numC = Double.parseDouble(getinput.getNumber());
                    
                   

                        this.console.println("ahh! thank you I thought I would rot for the rest of my life."
                                + "\nhere take this.");

                        goldcontrol.addGold(10);
                        MapView.defaultMenu = MapView.turtleMenu;
                   MapView turtleMen = new MapView();
                   //turtleMen.display();
                    break;
                case "s":
                    this.console.println("you are an evil person.");
                    break;
                    case "h":
                    //this.console.print();
                        HelpMenuView help = new HelpMenuView();
                        help.display();
                    break;
                case "b":
                    this.console.println("Back...");
                    MapView.defaultMenu = MapView.oceanMapMenu;
//               MapView ocean = new MapView();
//               ocean.display();
                    break;
                default:
                   this.console.println("\ninvalid selection");
                    ErrorView.display(this.getClass().getName(), "\ninvalid selection");
            }

            userInput = value;
        }

        if ("Dolphin".equals(MapView.mapCharacter)) {
            switch (value) {
                case "a":
                    this.dolphinTest();
                     this.console.println("ahh! thank you I thought I would rot for the rest of my life."
                      + "\nhere take this.");
                     goldcontrol.addGold(10);
                     break;
                    case "s":
                    this.console.println("I hate you.");
                    break;
                case "h":
                     HelpMenuView help = new HelpMenuView();
                        help.display();
                    break;
                case "b":
                    this.console.println("Back...");
                    MapView.defaultMenu = MapView.oceanMapMenu;
                    break;
                default:
                    System.out.println("\ninvalid selection");
                    ErrorView.display(this.getClass().getName(), "\ninvalid selection");

            }
            userInput = value;
        }

    }

    private void turtleTest() {
        this.console.println("The turtle got trapped in a cage, and now it needs your help to get out.\n"
                + "\n You will need to convert the turtles weight from Kilograms to pounds \n "
                + "\n This will enable you to know how much pounds are needed for counterweight to release the turtle from the trap \n \n");
        System.out.print("\n The turtle says its weight is" + " ");
                
               // this.console.print(turtpt1);
               // this.console.print(turtpt2);
                math.turtle(50);
    
        MapView turtleMen = new MapView();
        turtleMen.display();
    }
    private void dolphinTest() {
        this.console.println("The dolphin says it got separated from it's family and is lost!\n"
                + "\n It has a map but it's units are in miles and the dolphin only knows how to use kilometers \n "
                + "\n This will enable you to know how much farther distance it needs to swim to catch them! \n \n");
        System.out.print("\n The dolphin's map says its about " + " ");
                
               // this.console.print(turtpt1);
               // this.console.print(turtpt2);
                math.dolphin(50);
 
        MapView dolphinMen = new MapView();
        dolphinMen.display();
    }
    

}
