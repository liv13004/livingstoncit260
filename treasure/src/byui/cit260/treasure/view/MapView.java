package byui.cit260.treasure.view;

import byui.cit260.treasure.control.ChecklistControl;
import byui.cit260.treasure.control.GameControl;
import byui.cit260.treasure.control.InventoryControl;
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
    public static String mainMapMenu = (" \n  Main Map Menu \n \n "
            + "\np = Visit Beach (Start Here)"
            + "\no = Visit Ocean"
            + "\ni = Visit Island"
            + "\nb = Back");
    public static String beachMapMenu = ("\n  Beach Level Menu"
           // + "\nm = Visit Main Map"
            + "\nt = Visit Trader"
            + "\ns = Visit Shore"
            + "\no = Visit Ocean"
            + "\ni = Visit Island"
            + "\nb = Back");
 
    public static String beachShoreMenu = (" \n Beach Shore Menu \n \n "
            + "See that island off in the Distance?"
            + "\n You probably need to build a boat to get there!"
            + "\nc = Construct Boat"
            + "\ns = Go to Boat"
            + "\np = Head to main Beach"
            + "\nb = Back\" ");
    
    public static String traderMenu = ("\n  Trader Menu \n \n "
            + "Hi! my name is trader. what'll it be."
            + "\nl = Lumber"
            + "\ns = Sail"
            + "\nb = Back\" ");
    public static String oceanMapMenu = ("\n Ocean Level Menu \n \n "
            + "You are sailing the ocean, don't get seasick!"
            + "\nu = Go to Turtle"
            + "\nd = Go to Dolphin"
            + "\np = Go to Beach"
            + "\ni = Go to Island"
            + "\nb = Back");
    public static String turtleMenu = ("\n Turtle Menu \n \n "
            + "Hey! Help! I got myself locked in this cage!"
            + "?\n"
            + "\na = Help the Turtle"
            + "\ns = Step away and let the turtle rot."
            + "\nh = Get some Math Help"
            + "\nb = Back");
    public static String dolphinMenu = ("\n  Dolphin Menu \n \n "
            + "Hey! Help! I need to know how fast I can get to my family."
            + "\n I can swim about 2 kilometers per hour"
            + "?\n"
            + "\na = Help the Dolphin"
            + "\nh = Help"
            + "\ns = Step away and let the dolphin drown in its own stupidity."
            + "\nb = Back");
    public static String islandShoreMenu = ("\n  Island Shore Menu \n \n "
            + "You just walked off the boat onto the Island Seashore"
            + "\n What do you want to do next?"
            + "\ni = Go get on Boat"
            + "\nl = Head Inland"            
            + "\nb = Back\n ");
    public static String islandMapMenu = ("\n  Island Level Menu \n \n "
            + "Welcome to the Island, you're almost there!"
            + "\nt = Go to Trader"
            + "\nj = Go to Jungle"
            //+ "\nf = Go to River"
           // + "\nc = Go to Treasure Chest"
            + "\ns = Go to Island Shore"
            + "\no = Go to Ocean"
            + "\nh = Go to Beach"
            + "\nb = Back\n ");
    public static String jungleMenu = ("\n Jungle Level Menu \n \n "
            + "\nYou're deep within the jungle, there are bugs everywhere and you're lost!!\n\n"
            + "\nl = Try to use a flashlight"
            + "\nc = Climb a tree and try to get your bearings!"
            + "\nr = Follow the trail and hope it leads you out of here!"
            + "\nb = Back\n ");
    public static String riverMenu = ("\n River Menu \n \n "
            + "\nYou've come to a large river and the bridge is washed out!!\n\n"
            + "\nIt looks like you can repair it if you get some fresh lumber and rope!\n\n"
            + "\nf = Try to repair the bridge"
            + "\ng = Give up and head back"
            + "\nn = Try to swim across!!"
            + "\nb = Back\n ");
    public static String chestMenu = ("\n Treasure Chest Menu \n \n "
            + "\nYou're here at last! You've found the treasure chest!!\n\n"
            + "\nThe chest looks so old and heavy you can barely wait to see what's inside!!\n\n"
            + "As you get closer to the chest and dust it off you see that it's locked and"
            + "there is some weird writing and symbols that look like nothing youve ever seen!!!"
            + "\nWhat do you do want to do?!?!\n\n"
            + "\ne = Symbols, weird writing? That never stopped Indiana Jones! Use your knife and try and pick the lock"
            + "\nm = I'm too scared to open it, what if it's cursed or booby trapped!?!?"
            + "\nu = It's already opened....."
            + "\nb = Back\n ");

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
                    //System.out.println("\ninvalid selection");
                    ErrorView.display(this.getClass().getName(), "\ninvalid selection");

            }
        }

        if ("Beach".equals(mapLocation)) {
            String value = (String) obj;
            switch (value) {
                
//                case "m":  //Visit Main Map
//                    mapLocation = "Main Map";
//                    this.displayMap();
//                   // this.mainMapView();
//                    break;

                case "t":  //Visit Trader
                    mapCharacter = "Beach Trader";
                    mapLocation = "Trader";
                    this.Trader();
                    break;

                case "s": // Visit Shore
                    mapLocation = "Beach Shore";
                    this.console.println("display Beach Shore menu");
                    //MapView shore = new MapView();
                    //shore.display();
                    MapView.defaultMenu = MapView.beachShoreMenu;
                    this.visitBeachShore();
                    break;
                case "b": // Quit Help menu
                    mapLocation = "Main";
                    this.console.println("Back...");
                    break;
                default:
                    //System.out.println("\ninvalid selection");
                    ErrorView.display(this.getClass().getName(), "\ninvalid selection");
            }

        }

        if ("Beach Shore".equals(mapLocation)) {
            String value = (String) obj;
            switch (value) {
                case "c": // Construct Boat
                    mapLocation = "Beach Shore";
                    this.buildBoat();
                   // this.visitBeachShore();
                    this.console.println("display Boat menu");
                    MapView shore = new MapView();
                    shore.display();
                    MapView.defaultMenu = MapView.beachShoreMenu;
                    break;
                case "s": // Visit Boat
                    mapLocation = "Beach Shore";
                    //this.visitBeachShore();
                    this.console.println("display Boat menu");
                    BoatMenuView boat = new BoatMenuView();
                    boat.display();
                    MapView.defaultMenu = MapView.beachShoreMenu;
                    break;
                case "p": // Visit Main Beach
                    mapLocation = "Beach";
                    this.visitBeachShore();
                    this.console.println("display Beach menu");
                    MapView beach = new MapView();
                    beach.display();
                    MapView.defaultMenu = MapView.beachMapMenu;
                    break;
                case "b": // Quit Beach menu
                    mapLocation = "Beach";
                    //System.out.println("Back...");
                    this.console.println("Back...");
                    break;
                default:
                    //System.out.println("\ninvalid selection");
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
                case "i":  //Visit Island
                    mapLocation = "Island Shore";
                    this.visitIsland();
                    MapView.defaultMenu = MapView.oceanMapMenu;
                    //this.visitOcean();
                    break;
                case "b": // Quit Ocean menu
                    mapLocation = "Main";
                    this.console.println("Back...");
                    break;
                default:
                    //System.out.println("\ninvalid selection");
                    ErrorView.display(this.getClass().getName(), "\ninvalid selection");
            }
        }

        if ("Island".equals(mapLocation)) {
            String value = (String) obj;
             //String passed = this.visitJungle((String) obj);
            switch (value) {
                case "t":  //Visit Trader
                    mapLocation = "Trader";
                    mapCharacter = "Island Trader";
                    this.Trader();
                    break;
                    
                case "j":  //Visit Jungle
                    //String a;
                    this.console.println("\n Jungle pre test\n");
                    mapLocation = "Jungle";
                    defaultMenu = jungleMenu;
                    MapView spare = new MapView();
                    spare.display();
                    //this.visitJungle(value);
                    //.visitJungle(passed);
                   // a = visitJungle(value);
                    //spare.visitJungle(a) passed 
                           // (String Flashlight);
                    //String b = spare.visitJungle(passed);
                     //this.console.println("\nPrinting var b via spare object:\n");
                    //String b = spare.visitJungle(value);
                    //visitJungle((String) Flashlight);
                   // String a = spare.visitJungle(String Flashlight);
                    this.console.println("\nmid test\n");
                   // this.console.println("\nPrinting var a:\n");
                   // this.console.print(a);
                    //this.console.println("\nPrinting var b:\n");
                    //this.console.print(b);
                     //this.console.println("Printing var a:");
                   // this.console.print(this.visitJungle(a));
                   // this.console.println("Printing var b:");
                    // this.console.print(this.visitJungle(b));
                    //a = spare.visitJungle(value);
                            //visitJungle(a) test 
                            //= new visitJungle();
                    //console.print(visitJungle(Flashlight));
                   // visitJungle(value);
                    this.console.println("\n Jungle post test\n");
                   
                    break;
                    
                case "l":  //Use Flashlight
                    
                    //String b = spare.visitJungle(value);
                    //String b;
                    this.console.println("\n Flashlight pre test\n");
                    mapLocation = "Jungle";
                    defaultMenu = jungleMenu;
                    MapView light = new MapView();
                    light.display();
                      String b  = visitJungle(value);
                    this.console.print(b);
                    //this.visitJungle(String,Flashlight) test = new visitJungle(String Flashlight); 
                    //console.println(visitJungle());
                    //String Flashlight);
                    //visitJungle(); String Flashlight;
                    //this.console.print(Flashlight);
                    this.console.println("\nflashlight post test\n");
                    break;   
                    
                case "c":  //Climb Tree 
                    mapLocation = "Jungle";
                    //this.visitJungle(value, value);
                    break;
                    
                case "r":  //Follow Trail
                    mapLocation = "Jungle";
                    //this.visitJungle(value, value);
                    break;    
                    
                case "f":  //Fix Bridge
                    mapLocation = "River";
                    this.visitRiver();
                    break;

                case "g":  //Give Up
                    mapLocation = "River";
                    this.visitRiver();
                    break;    
                    
                case "n":  //Try to Swim
                    mapLocation = "River";
                    this.visitRiver();
                    break;    
                    
                case "e":  //Open Treasure visitChest
                    mapLocation = "Chest";
                    this.visitChest();
                    break;
                    
                case "m":  //Too Scared to Open
                    mapLocation = "Chest";
                    this.visitChest();
                    break;    

                case "u":  //Chest is Already Opened
                    mapLocation = "Chest";
                    this.visitChest();
                    break;    
                    
                case "s": // Visit Shore
                    mapLocation = "Island Shore";
                    this.visitBeachShore();
                    //System.out.println("display Shore menu");
                    this.console.println("display Shore menu");
                    MapView shore = new MapView();
                    shore.display();
                    MapView.defaultMenu = MapView.beachShoreMenu;
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
                    break;
                
                default:
                    //System.out.println("\ninvalid selection");
                    ErrorView.display(this.getClass().getName(), "\ninvalid selection");

            }

        }

        if ("Island Shore".equals(mapLocation)){
        String value = (String) obj;
        switch (value) {
       
        case "i": // Board Boat
            mapLocation = "Island Shore";
            BoatMenuView board = new BoatMenuView();
            board.display();
            //this.visitIslandShore();
            //System.out.println("display Island Shore menu");
            this.console.println("display Boat menu");
          
            //MapView.defaultMenu = MapView.islandShoreMenu;
            //break;
            
        case "l": // Head to Island Mainland
            mapLocation = "Island";
            MapView.defaultMenu = MapView.islandMapMenu;
            this.console.println("display Island Map menu");
            MapView mainland = new MapView();
            mainland.display();
            break;    
        
        case "b": // Quit Island Shore menu
            mapLocation = "Ocean";
            //System.out.println("Back...");
            this.console.println("Back...");
            break;
        default:
        //System.out.println("\ninvalid selection");
        ErrorView.display(this.getClass().getName(),"\ninvalid selection");     
        }
         }

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
    
//    private void beachShoreView() {
//        //System.out.print(beachMapMenu);
//
//        MapView.defaultMenu = MapView.beachShoreMenu;
//        MapView beach = new MapView();
//        beach.display();
//
//    }

    private void Trader() {
        this.console.println(" Go to Trader ");
        MapView.mapCharacter = "Trader";
        CharacterView.defaultMenu = traderMenu;
        CharacterView trader = new CharacterView();

        trader.display();
    }

    private void visitBeachShore() {
        this.console.println(" Go to Beach Shore ");
        MapView.mapLocation = "Beach Shore";
        MapView.defaultMenu = MapView.beachShoreMenu;
        MapView buildBoat = new MapView();
        buildBoat.display();
       

    }
    
    private void buildBoat() {
        InventoryControl inventory = new InventoryControl();
        //if (inventory.displayInventory());
        this.console.println(" You used the sail and lumber to build a boat, now you can cross the ocean!");
        ChecklistControl.BuildBoat(true);
        MapView.mapLocation = "Beach Shore";
        //System.out.print(shoreMenu);

        //BoatMenuView boat = new BoatMenuView();
       // boat.display()
    }

    private void visitOcean() {

        //System.out.println(" Go to Ocean");
        this.console.println(" Go to Ocean");
        MapView.defaultMenu = MapView.oceanMapMenu;
        MapView ocean = new MapView();
        ocean.display();
        //System.out.print(oceanMapMenu);
        displayPromptMessage = 1;

    }

    private void visitIsland() {

        //System.out.println(" Go to Island ");
        this.console.println(" Go to Island ");
        MapView.defaultMenu = MapView.islandMapMenu;
        MapView island = new MapView();
        island.display();
        //System.out.print(islandMapMenu);
        displayPromptMessage = 1;
    }
    
    private void visitIslandShore() {
        this.console.println(" Go to Island Shore ");
        MapView.mapLocation = "Island Shore";
        MapView.defaultMenu = MapView.islandShoreMenu;
        MapView buildBoat = new MapView();
        buildBoat.display();
       

    }

    private void visitTurtle() {
        this.console.println(" Go to Turtle ");
        MapView.mapCharacter = "Turtle";
        CharacterView turtle = new CharacterView();
        turtle.display();

        displayPromptMessage = 0;
    }

    private void visitDolphin() {
        this.console.println(" Go to Dolphin");
        MapView.mapCharacter = "Dolphin";
        CharacterView dolphin = new CharacterView();
        dolphin.display();

        displayPromptMessage = 0;
    }
    
      private String visitJungle(String Flashlight) {
       //MapView(Flashlight); 
         this.console.println(" Head into the Jungle");
            defaultMenu = jungleMenu;
            MapView island = new MapView();
            island.display();
            
        
        
        
        
        
       this.console.println("As you head into the Jungle you start to realize that,"
                + "\nit's thicker and darker in here than you thought and you're getting lost.\n"
                + "\nYou see that there's light high up in the treetops. ");
            
         Flashlight = "You turn on the flashlight, but the bulb looks dim."
                    + "You decide to turn it off and put it away for later";
        
           // Trail = "You follow the trail and at first it looks good! But after\n"
                  //  + "\n walking a mile it dead ends at a rock wall. Better head back...";
        //this.doAction(this);useFlashlight();{
       //this.console.print(Flashlight);
      
            //getBearings();{
                  //  }
        
              
        
      
        
        displayPromptMessage = 1;
        return Flashlight;
      
    }

    private void visitRiver() {
        this.console.println(" Head to the River");
        MapView.mapLocation = "River";
        MapView bridge = new MapView();
        bridge.display();
        //ChecklistControl.FixBridge(true);
        displayPromptMessage = 1;
    }

    private void visitChest() {
        this.console.println(" Head towards the old building");
        MapView.mapLocation = "Chest";
        MapView chest = new MapView();
        chest.display();
        //ChecklistControl.OpenChest(true);
        displayPromptMessage = 1;
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
            //System.out.printf("   %s   ", i);
            this.console.printf("   %s   ", i);
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
               //System.out.print(buff);
                this.console.print(buff);

            }
            displayColDiv();

        }
        displayRowDiv();
        //System.out.print("\n\n");
         this.console.print("\n\n");
    }

    private void displayRowDiv() {
        String string = ("\n  ");
        for (int i = 1; i <= colCount; i++) {
            string = string.concat("------------");
        }
        //System.out.println(string + "-");
        this.console.println(string + "-");
    }

    private void displayColDiv() {

        //System.out.print("  |  ");
        this.console.print("  |  ");

    }

    private void getBearings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class useFlashlight {

        public useFlashlight() {
        }
    }

  
    
}
