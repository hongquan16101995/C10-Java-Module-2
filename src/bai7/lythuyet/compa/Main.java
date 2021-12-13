package bai7.lythuyet.compa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[5];
        comparableCircles[0] = new ComparableCircle(10,20);
        comparableCircles[1] = new ComparableCircle(5, 20);
        comparableCircles[2] = new ComparableCircle(7, 10);
        comparableCircles[3] = new ComparableCircle(7, 15);
        comparableCircles[4] = new ComparableCircle(2, 30);

        Arrays.sort(comparableCircles);

        for (ComparableCircle c: comparableCircles) {
            System.out.println(c.getRadius() + "; " + c.getX());
        }
    }
}
