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
public class Inventory implements Serializable {

    // class instance variables
    private int lumber;
    private int sail;

    public Inventory() {
        
    }

    public int getLumber() {
        return lumber;
    }

    public void setLumber(int lumber) {
        this.lumber = lumber;
    }

    public int getSail() {
        return sail;
    }

    public void setSail(int sail) {
        this.sail = sail;
    }

    @Override
    public String toString() {
        return "Inventory{" + "lumber=" + lumber + ", sail=" + sail + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.lumber;
        hash = 67 * hash + this.sail;
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
        final Inventory other = (Inventory) obj;
        if (this.lumber != other.lumber) {
            return false;
        }
        if (this.sail != other.sail) {
            return false;
        }
        return true;
    }
    
    


}
