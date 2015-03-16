/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author andrew
 */
public class Boat implements Serializable {

    // class instance variables
    private String description;
    private boolean onboard;
    
    
    public Boat() {
        this.description = "\nThis is the boat that you will use to get to the island.";
        this.onboard = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

       
//    public void setBoat(Boat boat) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public boolean isOnboard() {
        return onboard;
    }

    public void setOnboard(boolean onboard) {
        this.onboard = onboard;
    }

    @Override
    public String toString() {
        return "Boat{" + "description=" + description + ", onboard=" + onboard + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + (this.onboard ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Boat other = (Boat) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.onboard != other.onboard) {
            return false;
        }
        return true;
    }
   
    
}
