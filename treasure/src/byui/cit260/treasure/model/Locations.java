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
 * @author Braden
 */
public class Locations implements Serializable{
  
    //class instance variables
    private int rowCount;
    private int colCount;

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.rowCount;
        hash = 89 * hash + this.colCount;
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
        final Locations other = (Locations) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.colCount != other.colCount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Locations{" + "rowCount=" + rowCount + ", colCount=" + colCount + '}';
    }

    public Locations() {
    }
    
    
    
}
