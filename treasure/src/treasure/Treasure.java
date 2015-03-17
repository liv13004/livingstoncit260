
package treasure;



import byui.cit260.treasure.model.Game;
import byui.cit260.treasure.model.Player;
import byui.cit260.treasure.view.StartProgramView;


public class Treasure {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        StartProgramView start = new StartProgramView();
        start.startProgram();
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Treasure.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Treasure.player = player;
    }

  
 

}
