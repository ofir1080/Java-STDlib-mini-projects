package opt;

import std.*;

/**
 * a collection of points with a certain slope
 */

public class Line {
    public Point[] points;
    private double gapSize;
    private double ang;
    private double slope;

    public Line(double ang) {
        this.ang = ang;
        this.slope = Math.tan(ang);
        this.gapSize = (Math.cos(ang) * 2 * 180) / 360;
        this.points = setLine();
    }

    public Point[] setLine() {
        Point[] line = new Point[360];
        double d = 0;
        double x = 177 * Math.cos(ang);
        for(int i = -180; i < 180; i++) {
            line[i + 180] = new Point(slope, x + d);
            d -= gapSize;
        }
        return line;
    }

    public void draw() {
        for (Point point: this.points) {
            StdDraw.point(point.getX(), point.getY());
            StdOut.println(point.getX() +" " + point.getY());
        }
    }
}
