import java.util.Arrays;

public class PointTester {
    public static void main(String[] args) {
        Point pointOne = new Point(3, 7);
        Point origin = new Point();

        Point[] points = new Point[5];
        // room to store point references, but no new point objects were just made

        for (int j = 0; j < points.length; j++) {
            points[j] = new Point(j, j);
        }
        // print out the points in the array
        // static toString of the Array class
        System.out.println(Arrays.toString(points)); // Array is a class name, not an
        // object reference name!!!

        // task 3: create a circle class and circle tester
        // Circle has a Point (center) and a double (radius)
        // has-a 
    }
}
