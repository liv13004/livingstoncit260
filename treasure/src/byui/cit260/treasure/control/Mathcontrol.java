package byui.cit260.treasure.control;

/**
 *
 * @author andrew
 */
import java.util.Random;
import java.util.Scanner;

public class Mathcontrol {

    Random random = new Random();
    Scanner in = new Scanner(System.in);
    int w = random.nextInt(2);
    int x = random.nextInt(50);
    int y = random.nextInt(50);
    int z = random.nextInt(50);

    public boolean math() {
        if (w == 0) {
            return (MathA());
        }
        if (w == 1) {
            return (MathB());
        } else {
            return (false);
        }
    }

    private boolean MathA() {
        System.out.printf("What is %s * %s - %s \n", x, y, z);
        return ((x * y - z) == (in.nextDouble()));

    }

    private boolean MathB() {
        System.out.printf("What is %s - %s / %s \n", x, y, z);
        return ((x - y / z) == (in.nextDouble()));
    }

    public boolean turtle(double turtle, double counter) {
        
        turtle = (turtle * 2.20462);
        System.out.printf("the turtle says its weight is %s kilograms \n but the counterweight is measured in pounds\n", ((turtle* 100) / 100));
        System.out.println("How many pounds should be placed on the counter weight to make it 5% higher than the turtles weight?");
        return (in.nextDouble() == counter);
    }
}
