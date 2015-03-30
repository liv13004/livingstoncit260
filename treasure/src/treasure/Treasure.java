package treasure;

import byui.cit260.treasure.model.Game;
import byui.cit260.treasure.model.Player;
import byui.cit260.treasure.view.ErrorView;
import byui.cit260.treasure.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Treasure {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    @SuppressWarnings({"CallToPrintStackTrace", "empty-statement"})
    public static void main(String[] args) {
       
        try{
            
         //open character stream files for end user input and output
        Treasure.inFile = new BufferedReader(new InputStreamReader(System.in));
        
        //BufferedReader dubReader = new BufferedReader(new InputStreamReader(System.in));
       // String inputNum = dubReader.readLine();
        //double number = Double.parseDouble(inputNum);
        //Treasure.number = new BufferedReader(new InputStreamReader(System.in));
        Treasure.outFile = new PrintWriter(System.out, true);
        
        String filePath = "log.txt";
        Treasure.logFile = new PrintWriter(filePath);
                         
        //create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();    
        startProgramView.display();
        
        }catch (Throwable e) {
            System.out.println("Exception:  " + e.toString() +
                    "\nCause: " + e.getCause() +
                    "\nMessage: " + e.getMessage()); 
            e.printStackTrace();;
          }
        finally {
            try{
                if (Treasure.inFile != null)
                    Treasure.inFile.close();
                
                if (Treasure.outFile != null)
                    Treasure.outFile.close();
                
                if (Treasure.logFile != null)
                    Treasure.logFile.close();
                
            } catch (IOException ex) {
              System.out.println("Error closing files");
              return;
              }
            }
            
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutfile(PrintWriter outfile) {
        Treasure.outFile = outfile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInfile(BufferedReader infile) {
        Treasure.inFile = infile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Treasure.logFile = logFile;
    }

       
    
    
}
