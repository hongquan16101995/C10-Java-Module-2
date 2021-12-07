package bai3.baitap;

import java.util.Scanner;

public class SumColumnInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = createArray(scanner);
        System.out.println("Nhập vào cột muốn tính tổng: ");
        int column = scanner.nextInt();
        int sum = sumColumn(array, column);
        System.out.println("Tổng các phần tử trong cột là: " + sum);
    }

    public static int sumColumn(int[][] array, int column) {
        int sum = 0;
        for (int[] e : array) {
            if (column < e.length) {
                sum += e[column - 1];
            }
        }
        return sum;
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
