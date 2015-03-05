

package byui.cit260.treasure.view;
import byui.cit260.treasure.control.GameControl;
import byui.cit260.treasure.model.Map;
import java.util.Scanner;
import treasure.Treasure;


/**
 *
 * @author Braden
 */
@SuppressWarnings("InitializerMayBeStatic")
public class MapView {
         Map map = new Map();
         GetInput getinput=new GetInput();
         
    //public void testMapView() {
    
    //map.setLocation("beach");
    //System.out.println(map.getLocation());
    
    String localMap = map.getLocation();
    //}
    //MainMapView(String test).public String getLocation;
        public void mainMapView(){
            map.setLocation("beach");
            //System.out.println(map.getLocation());
    
        //String localMap = map.getLocation();
         if ("beach" == (map.getLocation())){
                char selection; 
                do {
                 System.out.println(
                         
                                  "\nt = Visit Trader"
                                 + "\nm = Visit Main Map"         
                                 + "\ns = Visit Shore"         
                                 + "\no = Visit Ocean"
                                 + "\ni = Visit Island"
                                 + "\nq = Quit");
                 
                 selection = getinput.getChar();
                 this.doAction(selection);
             }
             while (selection != 'q');
             }
         else System.out.println(
                         
                                  "Invalid Selection!");
             }
        private String getInput() {
        boolean valid = false; //indicates if the name has been retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) {//while a valid input has not been retrieved
            //prompt for the player's input
            System.out.println("Enter your selection below;");
            //get the name from the keyboard and trim off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
            //if the input is invalid (less than two character in length)
            if (selection.isEmpty()) {
                System.out.println("selection cannot be blank");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition

        }
        return selection; //return the input
    }

    private void doAction(char choice) {
        switch (choice) {
            case 't':  //Visit Trader
                this.Trader();
                break;
                case 'm':  //Visit Main Map
                this.MainMap();
                break;
            case 's': // Visit Shore
                this.visitShore();
                break;
            case 'o': //Visit Ocean
                this.visitOcean();
                break;
            case 'i': //Visit Island
               this.visitIsland();
               break;
            case 'q': // Quit Help menu
                System.out.println("quitting");
                System.exit(0);
            default:
                System.out.println("\ninvalid selection");
        }
    }
    private void MainMap() {
        System.out.println("mapView Called");
        GameControl.createMapView(Treasure.getPlayer());
//display the map
       // MapView mapView = new MapView();
        this.displayMainMap();      
    }

    private void displayMainMap() {
        System.out.println("Main Map Displayed");
    }

    private void beachMapView() {
        System.out.println(" Go to Beach ");
    }

    private void oceanMapView() {
System.out.println("mapView Called");    }

    private void islandMapView() {
System.out.println("mapView Called");    }

    private void Trader() {
System.out.println(" Go to Trader ");    }

    private void visitShore() {
System.out.println(" Go to Shore ");    }

    private void visitOcean() {
System.out.println(" Go to Ocean ");    }

    private void visitIsland() {
System.out.println(" Go to Island ");    }
    
}  
    

