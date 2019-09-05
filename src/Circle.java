public class Circle {
    private Point center;
    private double radius;

    public Circle() {
        center = new Point();
        radius = 1.0;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(int x, int y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "center = " + center + " radius = " + radius + "}";
    }

    public class Point {
        private int x;
        private int y;

        // DVC - no parameters
        public Point() {
            this.x = 0;
            this.y = 0;
        }

        // EVC - has parameters
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

}

// NESTED CLASSES
// a class defined inside of another class
// outer class: these are not nested, normal classes we have been working with
// can be public or private

// 4 types
// 1. static nested class
// 2. non-static nested class (AKA inner class)
// 3. local inner class (non-static nested class defined inside a method)
// 4. anonymous inner class (local inner class without a name)