package bai7.lythuyet.compa;

public class ComparableCircle extends Circle implements Comparable<Circle> {

    public ComparableCircle(int radius) {
        super(radius);
    }

    public ComparableCircle(int radius, int x) {
        super(radius, x);
    }

    @Override
    public int compareTo(Circle o) {
        if (getRadius() < o.getRadius()) {
            return -1;
        } else if (getRadius() > o.getRadius()) {
            return 1;
        } else {
            if (getX() > o.getX()) {
                return -1;
            } else if (getX() < o.getX()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
