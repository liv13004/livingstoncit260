/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.model;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.Objects;
import treasure.Treasure;

/**
 *
 * @author Braden
 */
public class SceneLocation implements Serializable {
    //class instance variables
    private int row;
    private int column;
    private boolean visited;
    

    public SceneLocation() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }


    private static Map createMap(){
        //create and initailize new map
        Map map = new Map(20, 20);
        //create all of the scenes for the map
        Scene[] scenes = createScenes();
        //assign each scene to a locationint the map
        gameControl.assignScenesToLocations(map, scenes);
        
        return(map);
    }
    
    private static Scene[] createScenes(){
        BufferedImage image = null;
        
        Game game = Treasure.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingSene = new Scene();
        startingScene.setDescription("You see a beach "
                + "you notice a trader with some wood...");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        ImageIcon startingSceneImage = MapControl.getImage(startingScene,
                "/cit260/treasure/images/startingimg.jpg");
        startingScene.setIcon(startingSceneImage);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("You see a beach "
                + "you notice a trader with some wood...");
        finishScene.setMapSymbol(" ST ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(240);
        ImageIcon finishSceneImage = MapControl.getImage(finishScene,
                "/cit260/treasure/images/finishimg.jpg");
        finishScene.setIcon(startingSceneImage);
        scenes[SceneType.start.ordinal()] = finishScene;
    }

    public enum SceneType{
        start,
        beach,
        ocean,
        Island,
        chest,
        finish;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene([sceneType.start.ordinal()]);
        locations[0][1].setScene([sceneType.beach.ordinal()]);
        locations[0][2].setScene([sceneType.ocean.ordinal()]);
        locations[0][3].setScene([sceneType.Island.ordinal()]);
        locations[0][4].setScene([sceneType.chest.ordinal()]);
        locations[0][5].setScene([sceneType.finish.ordinal()]);
    }
    
    
    
}
