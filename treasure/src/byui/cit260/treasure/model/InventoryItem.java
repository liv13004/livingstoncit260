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
public enum InventoryItem implements Serializable{
    lumber("item used to build and repair"),
    sail("item needed to build the boat");
    
    private final String description;
    
    InventoryItem(String description) {
        this.description = description;
    }
    
    public String getDescription(){
        return description;
    }

    public static InventoryItem getLumber() {
        return lumber;
    }

    public static InventoryItem getSail() {
        return sail;
    }
    
}
