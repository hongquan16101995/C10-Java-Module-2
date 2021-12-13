package bai7.lythuyet.compa;

public class Circle {
    private int radius;
    private int x;
    private boolean filled;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, int x) {
        this.radius = radius;
        this.x = x;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
