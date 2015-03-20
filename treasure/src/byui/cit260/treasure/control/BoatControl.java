/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import byui.cit260.treasure.exceptions.BoatControlException;
import byui.cit260.treasure.model.Boat;

/**
 *
 * @author andrew
 */
public class BoatControl{ 

    Boat boat = new Boat();

    public boolean onBoat(boolean manifest) throws BoatControlException{
        //boat.isOnboard(true);
        //return(boat.isOnboard(true));
        //return manifest;
        boat.setOnboard(manifest);
        return false;
    }

    public boolean offBoat(boolean manifest) throws BoatControlException{
       // throw new BoatControlException("Player can't get off the boat, because player isn't on the boat");
        //boat.isOnboard();
        //boat.isOnboard(false);
        boat.setOnboard(manifest);
        
        //return(boat.isOnboard(false));
        //return false;
        throw new BoatControlException("testy test");
    }


}
