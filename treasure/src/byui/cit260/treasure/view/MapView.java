package byui.cit260.treasure.view;

import byui.cit260.treasure.control.GameControl;
import byui.cit260.treasure.control.MapControl;
import byui.cit260.treasure.model.Location;
import byui.cit260.treasure.model.Map;
import treasure.Treasure;

/**
 *
 * @author Braden
 */
@SuppressWarnings("InitializerMayBeStatic")
public class MapView extends View {

    MapControl mapcontrol;
    public static int displayPromptMessage = 0;
    public static String defaultMenu = "";

    public static String mapCharacter;
    public static String mapLocation;
    public static String mainMapMenu = ("\np = Visit Beach"
            + "\no = Visit Ocean"
            + "\ni = Visit Island"
            + "\nb = Back");
    public static String beachMapMenu = ("\nm = Visit Main Map"
            + "\nt = Visit Trader"
            + "\ns = Visit Shore"
            + "\no = Visit Ocean"
            + "\ni = Visit Island"
            + "\nb = Back");
    public static String shoreMenu = ("See that island off in the Distance?"
            + "You probably need to build a boat to get there!"
            + "\nc = Construct Boat"
            + "\nb = Back\" ");
    public static String traderMenu = ("Hi! my name is trader. what'll it be."
            + "\nl = Lumber"
            + "\ns = Sail"
            + "\nb = Back\" ");
    public static String oceanMapMenu = ("You are sailing the ocean, don't get seasick!"
            + "\nu = Go to Turtle"
            + "\nd = Go to Dolphin"
            + "\nb = Go to Beach"
            + "\ni = Go to Island"
            + "\nb = Back\" ");
    public static String turtleMenu = ("Hey! Help! I got myself locked in this cage!"
            + "?\n"
            + "\nh = Help"
            + "\ns = Step away and let the turtle rot."
            + "\nb = Back");
    public static String dolphinMenu = ("Hey! Help! I need to know how fast I can get to my family. they are 5 miles east"
            + "\n I can swim about 2 kilometers per hour"
            + "?\n"
            + "\nh = Help"
            + "\ns = Step away and let the dolphin drown in its own stupidity."
            + "\nb = Back");
    public static String islandMapMenu = ("Welcome to the Island, you're almost there!"
            + "\nt = Go to Trader"
            + "\nj = Go to Jungle and climb a tree"
            + "\nf = Go to River and fix the Bridge"
            + "\nc = Go to Treasure Chest"
            + "\ns = Go to Island Shore"
            + "\no = Go to Ocean"
            + "\nh = Go to Beach"
            + "\nb = Back\" ");

    public MapView() {
        
        super(defaultMenu);
mapcontrol = new MapControl();
        displayMap();
        
        
    }

    @Override
    public void doAction(Object obj) {
        
        mapcontrol.move(mapCharacter, mapLocation);
        if ("Main".equals(mapLocation)) {
            String value = (String) obj;

            switch (value) {

                case "m":  //Visit Main Map
                    mapLocation = "Main Map";
                    this.displayMap();
                    this.mainMapView();
                    MapView main = new MapView();
                    main.display();
                    
                    MapView.defaultMenu = MapView.mainMapMenu;
                    break;

                case "p":  //Visit Beach Map
                    mapLocation = "Beach";
                    this.console.println("display Beach menu");
                    this.beachMenuView();

                    break;

                case "o": //Visit Ocean
                    mapLocation = "Ocean";
                    this.console.println("display Ocean map... ");
                    this.visitOcean();

                    break;

                case "i": //Visit Island
                    mapLocation = "Island";
                    this.console.println("display Island map...");
                    this.visitIsland();

                    break;
                case "b": // Quit Help menu
                    mapLocation = "Main";
                    this.console.println("Back...");

                default:
                    System.out.println("\ninvalid selection");
                    ErrorView.display(this.getClass().getName(), "\ninvalid selection");

            }
        }

        if ("Beach".equals(mapLocation)) {
            String value = (String) obj;
            switch (value) {
                
                case "m":  //Visit Main Map
                    mapLocation = "Main Map";
                    this.displayMap();
                   // this.mainMapView();
                    break;

                case "t":  //Visit Trader
                    mapCharacter = "Beach Trader";
                    mapLocation = "Trader";
                    this.Trader();
                    break;

                case "s": // Visit Shore
                    mapLocation = "Beach Shore";
                    this.visitShore();
                    this.console.println("display Shore menu");
                    MapView shore = new MapView();
                    shore.display();
                    MapView.defaultMenu = MapView.shoreMenu;
                    break;
                case "b": // Quit Help menu
                    mapLocation = "Main";
                    this.console.println("Back...");
                default:
                    System.out.println("\ninvalid selection");
                    ErrorView.display(this.getClass().getName(), "\ninvalid selection");
            }

        }

        if ("Beach Shore".equals(mapLocation)) {
            String value = (String) obj;
            switch (value) {

                case "s": // Visit Boat
                    mapLocation = "Beach Shore";
                    this.visitShore();
                    this.console.println("display Shore menu");
                    MapView shore = new MapView();
                    shore.display();
                    MapView.defaultMenu = MapView.shoreMenu;
                    break;
                case "b": // Quit Beach menu
                    mapLocation = "Beach";
                    System.out.println("Back...");
                default:
                    System.out.println("\ninvalid selection");
                    ErrorView.display(this.getClass().getName(), "\ninvalid selection");
            }
        }

        if ("Ocean".equals(mapLocation)) {
            String value = (String) obj;
            switch (value) {

                case "u":  //Visit Turtle
                    mapCharacter = "Turtle";
                    this.visitTurtle();
                    //this.visitOcean();
                    break;
                case "d":  //Visit Dolphin
                    mapCharacter = "Dolphin";
                    this.visitDolphin();
                    //this.visitOcean();
                    break;
                case "p":  //Visit Beach
                    mapLocation = "Beach";
                    this.beachMenuView();
                    MapView.defaultMenu = MapView.beachMapMenu;
                    //this.visitOcean();
                    break;
                case "I":  //Visit Island
                    mapLocation = "Dolphin";
                    this.visitIsland();
                    MapView.defaultMenu = MapView.oceanMapMenu;
                    //this.visitOcean();
                    break;
                case "b": // Quit Ocean menu
                    mapLocation = "Main";
                    this.console.println("Back...");
                default:
                    System.out.println("\ninvalid selection");
                    ErrorView.display(this.getClass().getName(), "\ninvalid selection");
            }
        }

        if ("Island".equals(mapLocation)) {
            String value = (String) obj;
            switch (value) {
                case "t":  //Visit Trader
                    mapLocation = "Trader";
                    mapCharacter = "Island Trader";

                    this.Trader();
                    break;
                case "j":  //Visit Jungle
                    mapLocation = "Jungle";
                    // STILL NEEDS TO BE IMPLEMENTED!!!!!!!!!!!!! this.Trader();
                    break;

                case "f":  //Visit Bridge
                    mapLocation = "Bridge";
                    // STILL NEEDS TO BE IMPLEMENTED!!!!!!!!!!!!! this.Trader();
                    break;

                case "c":  //Visit Treasure Chest
                    mapLocation = "Chest";

                    // STILL NEEDS TO BE IMPLEMENTED!!!!!!!!!!!!!this.Trader();
                    break;

                case "s": // Visit Shore
                    mapLocation = "Island Shore";
                    this.visitShore();
                    System.out.println("display Shore menu");
                    MapView shore = new MapView();
                    shore.display();
                    MapView.defaultMenu = MapView.shoreMenu;
                    break;
                case "o":  //Visit Ocean
                    mapLocation = "Ocean";
                    this.Trader();
                    break;
                case "p":  //Visit Beach
                    mapLocation = "Beach";
                    this.Trader();
                    break;

                case "b": // Quit Island menu
                    mapLocation = "Main";
                    this.console.println("Back...");
                default:
                    System.out.println("\ninvalid selection");
                    ErrorView.display(this.getClass().getName(), "\ninvalid selection");

            }

        }

        // if ("Island Shore".equals(mapLocation)){
        // String value = (String) obj;
        //switch (value) {
        // case "s": // Board Boat
        //mapLocation = "On Boat";
        //this.visitShore();
        // System.out.println("display Island Shore menu");
        // MapView shore = new MapView();
        // shore.display();
        // MapView.defaultMenu = MapView.shoreMenu;
        // break;
        // case "b": // Quit Island Shore menu
        // mapLocation = "Island";
        // System.out.println("Back...");
        //default:
        // System.out.println("\ninvalid selection");
        // }
        //return false;
        // }

    }

    private void mainMapView() {
        //System.out.println("mapView Called"); 
        //GameControl.createMapView(Treasure.getPlayer());
        displayMap();
        this.console.println("display Main map...");
        
        MapView.defaultMenu = MapView.mainMapMenu;

        this.display();
    }

    private void beachMenuView() {
        //System.out.print(beachMapMenu);

        MapView.defaultMenu = MapView.beachMapMenu;
        MapView beach = new MapView();
        beach.display();

    }

    private void Trader() {
        this.console.println(" Go to Trader ");
        MapView.mapCharacter = "Trader";
        CharacterView.defaultMenu = traderMenu;
        CharacterView trader = new CharacterView();

        trader.display();
    }

    private void visitShore() {
        this.console.println(" Go to Shore ");
        MapView.mapLocation = "On boat";
        //System.out.print(shoreMenu);

        BoatMenuView boat = new BoatMenuView();
        boat.display();

    }

    private void visitOcean() {

        //System.out.println(" Go to Ocean");
        MapView.defaultMenu = MapView.oceanMapMenu;
        MapView ocean = new MapView();
        ocean.display();
        //System.out.print(oceanMapMenu);
        displayPromptMessage = 1;

    }

    private void visitIsland() {

        //System.out.println(" Go to Island "); 
        MapView.defaultMenu = MapView.islandMapMenu;
        MapView island = new MapView();
        island.display();
        //System.out.print(islandMapMenu);
        displayPromptMessage = 1;
    }

    private void visitTurtle() {
        this.console.println(" Go to Turtle ");
        MapView.mapCharacter = "Turtle";
        CharacterView turtle = new CharacterView();
        turtle.display();
//                System.out.println("Hey! Help! I got myself locked in this cage!"
//                +"?\n"
//                    + "\nh = Help"
//                    + "\ns = Step away and let the turtle rot."
//                    + "\nb = Back");

    }

    private void visitDolphin() {
        this.console.println(" Go to Dolphin");
        MapView.mapCharacter = "Dolphin";
        CharacterView dolphin = new CharacterView();
        dolphin.display();
//                 System.out.println("Hey! Help! I need to know how fast I can get to my family. they are 5 miles east"
//                    + "\n I can swim about 2 kilometers per hour"
//                         +"?\n"
//                    + "\nh = Help"
//                    + "\ns = Step away and let the dolphin drown in its own stupidity."
//                    + "\nb = Back");
    }
    int colCount;
    int rowCount;

    private void displayMap() {
        colCount = mapcontrol.getColCount();
        rowCount = mapcontrol.getRowCount();
        Location locations[][] = mapcontrol.getLocations();
        //
        for (int i = 0; i < colCount; i++) {//display the top row

            displayColDiv();
            System.out.printf("   %s   ", i);
        }
        displayColDiv();
        for (int i = 0; i < rowCount; i++) {//loop through the rows

            displayRowDiv();
            for (int j = 0; j < colCount; j++) {//loop through the columns in the rows
                displayColDiv();
                
                

                String buff = locations[i][j].getScene().getSymbol();
                boolean first = true;
                while ((buff.length() < 7)) {

                    if (first) {
                        buff += " ";
                        first = false;
                    } else {
                        buff = " " + buff;
                        first = true;
                    }

                }
               System.out.print(buff);

            }
            displayColDiv();

        }
        displayRowDiv();
        System.out.print("\n\n");
    }

    private void displayRowDiv() {
        String string = ("\n  ");
        for (int i = 1; i <= colCount; i++) {
            string = string.concat("------------");
        }
        System.out.println(string + "-");
    }

    private void displayColDiv() {

        System.out.print("  |  ");

    }
}
