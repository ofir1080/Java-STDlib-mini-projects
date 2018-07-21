import std.*;
import opt.*;

public class OpticalIllusion {

    public static void execute() {
        StdDraw.setCanvasSize(650, 650);
        StdDraw.setXscale(-180, 180);
        StdDraw.setYscale(-180, 180);
        MyPoint[] balls = new MyPoint[12];

        // creates a path for each ball with its own slope and position
        balls[0] = new MyPoint(new Line(2 * Math.PI * 1 / 24), new MyInt(135), new MyBool(true)); // 15
        balls[1] = new MyPoint(new Line(2 * Math.PI * 1 / 12), new MyInt(90), new MyBool(true)); // 30
        balls[2] = new MyPoint(new Line(2 * Math.PI * 1 / 8), new MyInt(55), new MyBool(true)); // 45
        balls[3] = new MyPoint(new Line(2 * Math.PI * 1 / 6), new MyInt(30), new MyBool(true)); // 60
        balls[4] = new MyPoint(new Line(2 * Math.PI * 5 / 24), new MyInt(15), new MyBool(true)); // 75
        balls[5] = new MyPoint(new Line(2 * Math.PI), new MyInt(180), new MyBool(true)); // 90
        balls[6] = new MyPoint(new Line(2 * Math.PI * 1 / 4), new MyInt(0), new MyBool(true)); // 0
        balls[7] = new MyPoint(new Line(2 * Math.PI * -1 / 24), new MyInt(225), new MyBool(true)); // -15
        balls[8] = new MyPoint(new Line(2 * Math.PI * -1 / 12), new MyInt(270), new MyBool(true)); // -30
        balls[9] = new MyPoint(new Line(2 * Math.PI * -1 / 8), new MyInt(305), new MyBool(true)); // -45
        balls[10] = new MyPoint(new Line(2 * Math.PI * -1 / 6), new MyInt(330), new MyBool(true)); // -60
        balls[11] = new MyPoint(new Line(2 * Math.PI * -5 / 24), new MyInt(345), new MyBool(true));  // -75

        while (true) {
            StdDraw.circle(0, 0, 183);
            for (int i = 0; i < balls.length; i++) {
                double x = balls[i].line.points[balls[i].integer.intger].getX();
                double y = balls[i].line.points[balls[i].integer.intger].getY();
                StdDraw.filledCircle(x, y, 3);
                setNexPoint(balls[i].integer, balls[i].bool);
            }
            StdDraw.show(1);
            StdDraw.clear();
        }
    }

    /**
     * sets the next point of a certain ball
     * @param x x coordinate of a ball
     * @param b direction of movement
     */

    public static void setNexPoint(MyInt x, MyBool b) {
        if (x.intger == 359) b.b = false;
        if (x.intger == 0) b.b = true;
        if (b.b) x.intger++;
        if (!b.b) x.intger--;
    }

}


