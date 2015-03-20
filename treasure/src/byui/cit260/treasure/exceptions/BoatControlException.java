/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.exceptions;

/**
 *
 * @author andrew
 */
public class BoatControlException extends Exception {

    public BoatControlException() {
    }

    public BoatControlException(String message) {
        super(message);
    }

    public BoatControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public BoatControlException(Throwable cause) {
        super(cause);
    }

    public BoatControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
