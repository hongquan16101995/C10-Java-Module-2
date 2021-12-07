package bai3.baitap;

import java.util.Scanner;

public class MaxMinArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = createArray(scanner);
        System.out.println("Phần tử có giá trị lớn nhất là: " + maxElement(array)[0][0]
                + ", có vị trí là: " + maxElement(array)[1][0] + " và " + maxElement(array)[1][1]);
        System.out.println("Phần tử có giá trị nhỏ nhất là: " + minElement(array)[0][0]
                + ", có vị trí là: " + minElement(array)[1][0] + " và " + minElement(array)[1][1]);

    }

    public static int[][] maxElement(int[][] array) {
        int[] max = {array[0][0]};
        int[] index = {0, 0};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][i] > max[0]) {
                    max[0] = array[i][j];
                    index[0] = i;
                    index[1] = j;
                }
            }

        }
        return new int[][]{max, index};
    }

    public static int[][] minElement(int[][] array) {
        int[] min = {array[0][0]};
        int[] index = {0, 0};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][i] < min[0]) {
                    min[0] = array[i][j];
                    index[0] = i;
                    index[1] = j;
                }
            }

        }
        return new int[][]{min, index};
    }

    public static int[][] createArray(Scanner scanner) {
        System.out.println("Nhập vào độ dài mảng: ");
        int length = scanner.nextInt();
        int[][] array = new int[length][];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập vào độ dài phần tử của mảng: ");
            int lengthE = scanner.nextInt();
            array[i] = new int[lengthE];
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập vào phần tử thứ " + (j + 1) + " của phần tử thứ " + (i + 1) + ": ");
                array[i][j] = scanner.nextInt();
            }

        }
        return array;
    }
}
