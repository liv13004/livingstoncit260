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
    private Location[][] locations;

    public Map() {

    }

    public Map(int rowCount, int colCount) {

        if (rowCount < 1 || colCount < 1) {
            System.out.println("The number of row and columns must be > zero.");
            return;
        }
        this.rowCount = rowCount;
        this.colCount = colCount;

        //create 2-D array for Location objects
        this.locations = new Location[rowCount][colCount];

        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < colCount; column++) {
                //create and initialize new Location object instance
                Location location = new Location();

                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);

                //assign the location object to the current position in array
                locations[row][column] = location;

            }
        }
    }

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

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCount=" + colCount + ", location=" + locations + '}';
    }

    public static class setRowCount {

        public setRowCount() {
        }
    }
}
