import java.util.Arrays;

public class PointTester {
    public static void main(String[] args) {
        Circle.Point pointOne = new Circle.Point(3, 7);
        Circle.Point origin = new Circle.Point();

        Circle.Point[] points = new Circle.Point[5];
        // room to store point references, but no new point objects were just made

        for (int j = 0; j < points.length; j++) {
            points[j] = new Circle.Point(j, j);
        }
        // print out the points in the array
        // static toString of the Array class
        System.out.println(Arrays.toString(points)); // Array is a class name, not an
        // object reference name!!!

        // task 3: create a circle class and circle tester
        // Circle has a Point (center) and a double (radius)
        // has-a --> composition
        // is-a --> inheritance
    }
}
