import std.*;

/**
 * implementing Sierpinski Triangle using and the standard IO java libraries.
 * ** note: each circle moves on its own STRIGHT line! **
 */
public class SierpinskiTriangle {

    public static void execute() {
        StdDraw.setCanvasSize(800, 600);
        StdDraw.setXscale(-1000, 1000);
        StdDraw.setYscale(-1000, 1000);
        int x = 1000;
        int a = 0;

        while (true) {
            sierpinski(8);
            StdDraw.setXscale(-1000, x - a);
            StdDraw.setYscale(-1000, x - a);
            a += 10;

            StdDraw.show(0);
            StdDraw.clear();
            if (x - a == -500) x += 500;
        }
    }

    /**
     * draws window
     * @param n depth of practal
     */
    public static void sierpinski(int n) {
        double[] x = {-1000, 0, 1000};
        double[] y = {-1000, 866, -1000};
        draw(x, y, n);
    }

    /**
     * drwas the a triangle of the giiven points, n times
     *
     * @param x - the array of 3 x values
     * @param y - the array of 3 y values
     * @param n - times the functions will run
     */
    private static void draw(double[] x, double[] y, int n) {
        if (n == 0) return;
        StdDraw.line(x[1], y[1], x[2], y[2]);
        StdDraw.line(x[0], y[0], x[1], y[1]);
        StdDraw.line(x[2], y[2], x[0], y[0]);
        draw(getPoint(x, 1), getPoint(y, 1), n - 1);
        draw(getPoint(x, 0), getPoint(y, 0), n - 1);
        draw(getPoint(x, 2), getPoint(y, 2), n - 1);
    }

    /**
     * receives 3 values as an array arr and creates a new array with 2 of them (the non-n index) to the average
     * of each of those numbers and k
     *
     * @param arr - an array with 3 x's or y's
     * @param k   - the index that doesn't change
     * @return a new 'double' array with new x's or y's for the function 'draw' to draw
     */
    private static double[] getPoint(double[] arr, int k) {
        double[] newArr = new double[3];
        newArr[k] = arr[k];
        if (k == 0) {
            newArr[1] = (arr[k] + arr[1]) / 2;
            newArr[2] = (arr[k] + arr[2]) / 2;
        }
        if (k == 1) {
            newArr[0] = (arr[k] + arr[0]) / 2;
            newArr[2] = (arr[k] + arr[2]) / 2;
        }
        if (k == 2) {
            newArr[1] = (arr[k] + arr[1]) / 2;
            newArr[0] = (arr[k] + arr[0]) / 2;
        }
        return newArr;
    }
}
