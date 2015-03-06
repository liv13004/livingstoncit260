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

public class Map implements Serializable {

    // class instance variables
    private int rowCount;
    private int colCount;
    private String location;

    public Map() {
        
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int IrowCount) {
        rowCount = IrowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
           // Map.setLocation(location);
            this.location = location;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCount=" + colCount + ", location=" + location + '}';
    }

    public static class setRowCount {

        public setRowCount() {
        }
    }
}
