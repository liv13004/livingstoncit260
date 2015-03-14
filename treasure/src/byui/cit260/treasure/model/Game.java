/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.model;

import byui.cit260.treasure.control.GameControl;
import byui.cit260.treasure.control.InventoryControl;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Braden
 */
public class Game implements Serializable {
    private Characters characters;
        private Player player;
        private Map map;
        private Boat boat;
        private Inventory inventory;
        private Gold gold;
        private InventoryControl inventoryControl;
        
     // class instance variables
        private double noPeople;

    public Game() {
    }

    public double getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(double noPeople) {
        this.noPeople = noPeople;
    }

    @Override
    public String toString() {
        return "Game{" + "noPeople=" + noPeople + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.noPeople) ^ (Double.doubleToLongBits(this.noPeople) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.noPeople) != Double.doubleToLongBits(other.noPeople)) {
            return false;
        }
        return true;
    }


    public void setMap(Map map) {
        this.map = map;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }
}
