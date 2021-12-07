package bai3.baitap;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = createArray(scanner);
        System.out.println("Phần tử có giá trị lớn nhất là: " + maxElement(array)[0]
                + ", có vị trí là: " + maxElement(array)[1]);
        System.out.println("Phần tử có giá trị nhỏ nhất là: " + minElement(array)[0]
                + ", có vị trí là: " + minElement(array)[1]);

    }

    public static int[] maxElement(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return new int[]{max, index};
    }

    public static int[] minElement(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return new int[]{min, index};
    }

    public static int[] createArray(Scanner scanner) {
        System.out.println("Nhập vào độ dài mảng: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
