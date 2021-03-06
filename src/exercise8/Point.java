package exercise8;

import java.util.Scanner;

public class Point {
    double x, y;

    public Point() {
        x=y=0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point otherPoint) {
        this.x = otherPoint.x;
        this.y = otherPoint.y;
    }

    public void initialize() {
        Scanner input = new Scanner(System.in);
        
        x = input.nextDouble();
        y = input.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        this.x = x + xDelta;
        this.y = y + yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        Point newPoint = new Point();
        newPoint.x = x + xDelta;
        newPoint.y = y + yDelta;
    return newPoint;
    }

    public boolean equals(Point otherPoint) {
        if (this.x == otherPoint.x && this.y == otherPoint.y) {
            return true;
        } else {
            return false;
        }

    }

    public String toString() {

        return "(" + x  + ", " + y + ")";
    }
}