public class PointOld {
    private int x;
    private int y;

    // DVC - no parameters
    public PointOld() {
        this.x = 0;
        this.y = 0;
    }

    // EVC - has parameters
    public PointOld(int x, int y) {
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
