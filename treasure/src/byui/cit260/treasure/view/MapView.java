

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
public class MapView extends View{
    
    public MapView(){
        super("\nt = Visit Trader"
                                 + "\nm = Visit Main Map"         
                                 + "\ns = Visit Shore"         
                                 + "\no = Visit Ocean"
                                 + "\ni = Visit Island"
                                 + "\nb = Back");
    }
        
        @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        switch (value) {
            case "t":  //Visit Trader
                this.Trader();
                break;
                case "m":  //Visit Main Map
                this.MainMap();
                break;
            case "s": // Visit Shore
                this.visitShore();
                break;
            case "o": //Visit Ocean
                this.visitOcean();
                break;
            case "i": //Visit Island
               this.visitIsland();
               break;
            case "b": // Quit Help menu
                System.out.println("Back...");
            default:
                System.out.println("\ninvalid selection");
        }
        return false;
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
    

