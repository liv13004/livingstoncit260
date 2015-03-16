/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.model;

import byui.cit260.treasure.control.GameControl;
import byui.cit260.treasure.control.InventoryControl;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
/**
 *
 * @author Braden
 */
public class Game implements Serializable {
     // class instance variables
        private double noPeople;
        private Characters characters;
        private Player player;
        private Map map;
        private Boat boat;
        private InventoryItem[] inventoryList;
        private Gold gold;
        private InventoryControl inventoryControl;
        
    
    public Game() {
        
    }

    public double getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(double noPeople) {
        this.noPeople = noPeople;
    }

    public Characters getCharacters() {
        return characters;
    }

    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public InventoryItem[] getInventory() {
        return inventoryList;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventoryList = inventory;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public InventoryControl getInventoryControl() {
        return inventoryControl;
    }

    public void setInventoryControl(InventoryControl inventoryControl) {
        this.inventoryControl = inventoryControl;
    }

    @Override
    public String toString() {
        return "Game{" + "noPeople=" + noPeople + ", characters=" + characters + ", player=" + player + ", map=" + map + ", boat=" + boat + ", inventory=" + inventoryList + ", gold=" + gold + ", inventoryControl=" + inventoryControl + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.noPeople) ^ (Double.doubleToLongBits(this.noPeople) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.characters);
        hash = 71 * hash + Objects.hashCode(this.player);
        hash = 71 * hash + Objects.hashCode(this.map);
        hash = 71 * hash + Objects.hashCode(this.boat);
        hash = 71 * hash + Arrays.deepHashCode(this.inventoryList);
        hash = 71 * hash + Objects.hashCode(this.gold);
        hash = 71 * hash + Objects.hashCode(this.inventoryControl);
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
        if (!Objects.equals(this.characters, other.characters)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.boat, other.boat)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventoryList, other.inventoryList)) {
            return false;
        }
        if (!Objects.equals(this.gold, other.gold)) {
            return false;
        }
        if (!Objects.equals(this.inventoryControl, other.inventoryControl)) {
            return false;
        }
        return true;
    }
    
    

   

    
    


    
}
