import std.*;

/**
 * implementing a simulation of a bouncing ball using acceleration vector for gravity
 */
public class BouncingBall {

    public static void execute() {
        StdDraw.setXscale(-500, 500);
        StdDraw.setYscale(0, 1000);
        boolean up = false; // represents the direction of movement
        double x = 1, y = 800;
        while (true) {
            StdDraw.line(-500, 0, 500, 0);
            StdDraw.filledCircle(0, y, 100);
            y = (!up) ? y - x : y + x;
            if (y < 100) {
                y = 100;
                up = !up;
            }
            StdDraw.show(25);
            x = (!up) ? x + 1 : x - 1;
            StdDraw.clear();
        }
    }
}
