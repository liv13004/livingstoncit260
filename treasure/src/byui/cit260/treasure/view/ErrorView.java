/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import java.io.PrintWriter;
import treasure.Treasure;

/**
 *
 * @author dyeman20
 */
public class ErrorView {
    private static final PrintWriter errorFile = Treasure.getOutFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
        "--------------------------------------------------------------"
        + "\n- ERROR - " + errorMessage
        + "\n-----------------------------------------------------------");
    }
    
}
