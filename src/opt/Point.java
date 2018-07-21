package opt;

/**
 * a point on a straight line y=m*x+b
 */

public class Point {
    private double x;
    private double y;

    public Point(double m, double x) {
        this.x = x;
        this.y = m * x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return ("(" + this.x + ", " + this.y + ")");
    }
}