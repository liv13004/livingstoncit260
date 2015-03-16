/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.model;

import byui.cit260.treasure.control.InventoryControl;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author andrew
 */
public class InventoryItem implements Serializable {
    private InventoryControl inventoryControl;
   //  class instance variables
    private int lumber;
    private int sail;
    private String inventoryType;
    private int quantityInStock;
    private int requiredAmount;
    private String description;
    
    public InventoryItem() {
        
    }

    
    
    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
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
        return "Inventory{" + "inventoryControl=" + inventoryControl + ", lumber=" + lumber + ", sail=" + sail + ", inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.inventoryControl);
        hash = 23 * hash + this.lumber;
        hash = 23 * hash + this.sail;
        hash = 23 * hash + Objects.hashCode(this.inventoryType);
        hash = 23 * hash + this.quantityInStock;
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
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.inventoryControl, other.inventoryControl)) {
            return false;
        }
        if (this.lumber != other.lumber) {
            return false;
        }
        if (this.sail != other.sail) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        return true;
    }

    public Object getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
  
}
