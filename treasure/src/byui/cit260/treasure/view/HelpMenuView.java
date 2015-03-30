/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

/**
 *
 * @author Braden
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\ng = What is the goal of the game?"
                + "\nm = How to Move"
                + "\nl = Estimating the amount of lumber"
                + "\nc = Convert from Metric to Standard"
                + "\nb = Back");
    }

    @Override
    public void doAction(Object obj) {

        String value = (String) obj;
        switch (value) {
            case "G":
                System.out.println("display game goal...");
                break;
            case "M":
                System.out.println("display how to move...");
                break;
            case "E":
                System.out.println("display lumber help...");
                break;
            case "C":
                System.out.println("display converting help...");
                break;
            case "B":
                System.out.println("Back");
                break;
            default:
                System.out.println("\ninvalid selection");
                 ErrorView.display(this.getClass().getName(), "\ninvalid selection");
        }

    }

}
