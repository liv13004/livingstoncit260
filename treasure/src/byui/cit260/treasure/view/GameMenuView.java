/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;




/**
 *
 * @author andrew
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super(
        
           "\nm = View Map"
                    + "\ni = Open Inventory"
                    + "\nc = Checklist"
                    + "\ns = Save Game"
                    + "\nh = help menu"                        
                    + "\nq = quit");
    }

    //GameMenuView() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    

    @Override
    public boolean doAction(Object obj) {
        
    //String value = {String} obj;
    //value = value.toUpperCase()'
     // InventoryControl inventorycontrol;
    //HelpMenuView helpmenu = new HelpMenuView();
     
    //displayMenu(InventoryControl icontrol) {
       // inventorycontrol = icontrol;
        //char selection;
       // do {
         //   System.out.println(
                   
                   
            
           // String input = this.getInput();
           //selection = input.charAt(0);
          //boolean doAction = this.doAction(selection);
        //} while (selection != 'q');
        //return false;
        
    //}
    //}
//@Override
//public boolean 

    //private String getInput() {
       // boolean valid = false; //indicates if the name has been retrieved
       // String selection = null;
       // Scanner keyboard = new Scanner(System.in); //keyboard input stream

        //while (!valid) {//while a valid name has not been retrieved
            //prompt for the player's name
           // System.out.println("Enter your selection below;");
            //get the name from the keyboard and trim off the blanks
            //selection = keyboard.nextLine();
           // selection = selection.trim();
            //if the name is invalid (less thajn two character in length)
           // if (selection.isEmpty()) {
            //    System.out.println("selection cannot be blank");
            //    continue; // and repeat again
           // }
            //break; // out of the (exit) the repetition

        //}
        //return selection; //return the name
   // }

  String value = (String) obj;
       switch (value) {
            case "m":
                System.out.println("display map...");
                MapView map = new MapView();
                map.display();
                break;
            case "i":
                InventoryView inventory = new InventoryView();
                inventory.display();
                break;
            case "c":
                System.out.println("viewing checklist...");
                break;
            case "s":
                System.out.println("save game...");
                break;
            case "h":
                System.out.println("help menu...");
                HelpMenuView helpmenu = new HelpMenuView();
                helpmenu.display();
                break;
            case "q":
                System.out.println("quitting");
                System.exit(0);
                break;
            default:
                System.out.println("\ninvalid selection");
       }
        return false;
       
      }
  
}
