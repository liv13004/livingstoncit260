package byui.cit260.treasure.control;

/**
 *
 * @author andrew
 */
import byui.cit260.treasure.view.ErrorView;
import byui.cit260.treasure.view.GetInput;
import java.util.Random;

public class MathControl {

    Random random = new Random();
    GetInput getinput = new GetInput();

    public boolean math() {
        int equation = random.nextInt(2);
        if (equation == 0) {
            boolean valid = MathA();
            if (valid == false) {
                System.out.println("sorry wrong...");
                ErrorView.display(this.getClass().getName(), "sorry wrong...");
            }
            return (valid);
        }
        if (equation == 1) {
            boolean valid = MathB();
            if (valid == false) {
                System.out.println("sorry wrong...");
                 ErrorView.display(this.getClass().getName(), "sorry wrong...");
            }
            return (valid);
        } else {
            return (false);
        }
    }

    private boolean MathA() {
        double numA = Double.parseDouble(getinput.getNumber());
        int x = random.nextInt(50);
        int y = random.nextInt(50);
        int z = random.nextInt(50);
        System.out.printf("What is %s * %s - %s \n", x, y, z);
        return ((x * y - z) == (numA));
        //return ((x * y - z) == (getinput.getNumber()));

    }

    private boolean MathB() {
        double numB = Double.parseDouble(getinput.getNumber());
        int x = random.nextInt(50);
        int y = random.nextInt(50);
        int z = random.nextInt(50);
        System.out.printf("What is %s - %s / %s \n", x, y, z);
        return ((x - y / z) == (numB));
        //return ((x - y / z) == (getinput.getNumber()));
    }

    public boolean turtle(double turtle, double counter) {
        double numC = Double.parseDouble(getinput.getNumber());
        turtle = ((turtle * 2.20462) * (1.05));
        System.out.printf("The turtle says its weight is %s kilograms \n but the counterweight is measured in pounds\n"
                , ((turtle * 100) / 100));
        System.out.println("How many pounds should be placed on the counter weight to make it 5% higher than the turtles weight?");
        return ((numC) == counter);
        //return ((x * y - z) == (numC));
        //return (getinput.getNumber() == counter);
        
    }

    public boolean dolphin(double dolphin, double counter) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double numD = Double.parseDouble(getinput.getNumber());
        dolphin = ((dolphin * 1.60934) * (1.15));
        System.out.printf("The dolphin says it got separated from it's family and is lost!"
                + "It has a map but it's units are in miles and the dolphin only knows how to use kilometers"
                 , ((dolphin * 100) / 100));
        System.out.println("How far of a distance does the dolphin need to swim in addition to 15% farther in order to catch up with it's family?");
        return ((numD) == counter);
        //return ((x * y - z) == (numC));
        //return (getinput.getNumber() == counter);
        
    }
}
