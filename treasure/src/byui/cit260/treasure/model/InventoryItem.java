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
    private int amount;
    private int requiredAmount;
    private String description;

    public InventoryItem() {

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public Object getDescription() {
        return description;
    }

}
