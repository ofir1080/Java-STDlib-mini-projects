package opt;

/**
 * MyPoint object represents a path of a single ball throughout its space
 */

public class MyPoint {
    public Line line;
    public MyInt integer;
    public MyBool bool;

    public MyPoint(Line line, MyInt integer, MyBool bool) {
        this.line = line;
        this.integer = integer;
        this.bool = bool;
    }
}
