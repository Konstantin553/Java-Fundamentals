
class Point {

    // Fields to store the coordinates
    private int x;
    private int y;

    // Constructor to initialize the point with x and y
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x coordinate
    public int getX() {
        return x;
    }

    // Setter for x coordinate
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y coordinate
    public int getY() {
        return y;
    }

    // Setter for y coordinate
    public void setY(int y) {
        this.y = y;
    }
}

// Class to represent a Line, defined by two points (start and end)
class Line {

    // Fields to store the start and end points
    private Point start;
    private Point end;

    // Constructor to initialize the Line with start and end points
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Getter for the start point
    public Point getStart() {
        return start;
    }

    // Setter for the start point
    public void setStart(Point start) {
        this.start = start;
    }

    // Getter for the end point
    public Point getEnd() {
        return end;
    }

    // Setter for the end point
    public void setEnd(Point end) {
        this.end = end;
    }

    // toString method to represent the Line in the format [(start.x,start.y),(end.x,end.y)]
    @Override
    public String toString() {
        return "[" + "(" + start.getX() + "," + start.getY() + "),"
                + "(" + end.getX() + "," + end.getY() + ")]";
    }
}

public class Points {
}
