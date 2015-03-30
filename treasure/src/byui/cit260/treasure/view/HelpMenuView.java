/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

/**
 *
 * @author Braden
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\ng = What is the goal of the game?"
                + "\nm = How to Move"
                + "\nl = Estimating the amount of lumber"
                + "\nc = Convert from Metric to Standard"
                + "\nb = Back");
    }

    @Override
    public void doAction(Object obj) {

        String value = (String) obj;
        switch (value) {
            case "g":
                this.console.println("display game goal...");
                this.gameGoal();
                break;
            case "m":
                 this.console.println("display how to move...");
                 this.helpMove();
                 break;
            case "l":
                 this.console.println("display lumber help...");
                 this.helpLumber();
                 break;
            case "c":
                 this.console.println("display converting help...");
                 this.helpMathConversions();
                 break;
            case "b":
                this.console.println("Back");
                break;
            default:
                System.out.println("\ninvalid selection");

                 ErrorView.display(this.getClass().getName(), "\ninvalid selection");
        }

    }
    
    private void gameGoal() {
        this.console.println(" \n Goals of the Game \n");
        this.console.println(" \n In this game there are various quests that you as the player will need to accomplish.\n"
                + " \n This will include collecting lumber, building a boat, helping a dolphin and a turtle, gathering"
                + "\n bearings and coordinates, building bridges and exploring jungles to find a lost treasure! \n"
                + " \n\n                        We wish you luck in your endeavors traveler! \n"               
        );
       
    }
    
    private void helpMove() {
       this.console.println(" \n How to Move through the game \n ");
       this.console.println( " \n \n Since this is a basic text game there is only one way to move through the game. "
               + "\n You navigate from one place on the map to another through the menu options. \n"
               + "\n There are three types of menu's and two typs of maps : \n"
               + "\n 1. Main menus - and Main Map \n"
                     + " \n         Navigate through the menu by selecting options such as: New Game or Options "
                     + " \n         The main map shows an overview map of the levels in the whole game."
             + "\n"
             + "\n"
               + " \n 2. Level Menus - and Level Maps \n"
                    + " \n          Navigate through the menu by selecting options such as: Go to Trader, Go to Ocean, or Go to Shore "
               
               + "\n"
             + "\n"
                             
               + " \n 3. Character Menus \n"
                    + " \n          Navigate through the menu by selecting the options the character presents you with and responding"
                    + " \n          Some of these options will be things like : Get Lumber, Help Dolphin, Build Boat, or Go to Shore");
      
       
    }
    
    private void helpLumber() {
        this.console.println(" \n Lumber Help \n ");
         this.console.println(" \n In this game you need lumber to build or fix things \n"
                 + "\n You can get lumber by buying it from the trader."
                 + " \n You can earn money by accomplishing various tasks and then use it to buy lumber. ");
       
    }
    
    private void helpMathConversions() {
        this.console.println(" \n Math Conversion Help \n ");
        this.console.println(" \n In this game you will need to perform various math calculations in order to progress through the game. \n"
                + " \n Some of these calculations will involve unit conversions from metric to standard \n"
                + " \n      To convert Kilograms to pounds you will need to multiply the amount of kilograms by 2.20462 \n"
                + " \n              To calculate a percentage add or subtract it from 1.00 based on if it's higher or lower and then multiply it by the converted units. \n"
                
                + " \n      To convert Kilometers to miles you will need to multiply the amount of kilometers by 1.60934 \n"
                + " \n              To calculate a percentage add or subtract it from 1.00 based on if it's higher or lower and then multiply it by the converted units.  \n"
                        );
       // MapView.mapCharacter = "Trader";
        //CharacterView.defaultMenu = traderMenu;
        //CharacterView trader = new CharacterView();

        //trader.display();
    }

}
