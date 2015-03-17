/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import byui.cit260.treasure.model.Boat;
/**
 *
 * @author andrew
 */
public class Boatcontrol {
        Boat boat = new Boat();
       
    public boolean OnBoat() {
    return(boat.isOnboard());
    }

    public void getOnBoat() {
    boat.setOnboard(true);
    }

    public void getOffBoat(boolean b) {
        boat.setOnboard(false);
    }
}