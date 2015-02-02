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
public class Inventory implements Serializable{
    // class instance variables
    private String item;
    private int quantity;
    
    public Inventory(){
        
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Inventory{" + "item=" + item + ", quantity=" + quantity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.item);
        hash = 23 * hash + this.quantity;
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
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        return true;
    }
    
    
}
