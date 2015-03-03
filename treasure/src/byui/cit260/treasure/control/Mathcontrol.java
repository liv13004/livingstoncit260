package byui.cit260.treasure.control;

/**
 *
 * @author andrew
 */
import byui.cit260.treasure.view.GetInput;
import java.util.Random;

public class Mathcontrol {

    Random random = new Random();
    GetInput getinput = new GetInput();

    public boolean math() {
        int equation = random.nextInt(2);
        if (equation == 0) {
            boolean valid = MathA();
            if (valid == false) {
                System.out.println("sorry wrong...");
            }
            return (valid);
        }
        if (equation == 1) {
            boolean valid = MathB();
            if (valid == false) {
                System.out.println("sorry wrong...");
            }
            return (valid);
        } else {
            return (false);
        }
    }

    

    private boolean MathA() {
        int x = random.nextInt(50);
        int y = random.nextInt(50);
        int z = random.nextInt(50);
        System.out.printf("What is %s * %s - %s \n", x, y, z);
        return ((x * y - z) == (getinput.getNumber()));

    }

    private boolean MathB() {
        int x = random.nextInt(50);
        int y = random.nextInt(50);
        int z = random.nextInt(50);
        System.out.printf("What is %s - %s / %s \n", x, y, z);
        return ((x - y / z) == (getinput.getNumber()));
    }

    public boolean turtle(double turtle, double counter) {

        turtle = (turtle * 2.20462);
        System.out.printf("the turtle says its weight is %s kilograms \n but the counterweight is measured in pounds\n", ((turtle * 100) / 100));
        System.out.println("How many pounds should be placed on the counter weight to make it 5% higher than the turtles weight?");
        return (getinput.getNumber() == counter);
    }
}
