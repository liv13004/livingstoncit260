/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.model;

import java.io.Serializable;
/**
 *
 * @author andrew
 */
public class Gold implements Serializable{
    // class instance variables
    private int gold;
    
    public Gold(){
        
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    @Override
    public String toString() {
        return "Gold{" + "gold=" + gold + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.gold;
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
        final Gold other = (Gold) obj;
        if (this.gold != other.gold) {
            return false;
        }
        return true;
    }
    
}
