package bai1.thuchanh;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        int width;
        int height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng: ");
        width = scanner.nextInt();
        System.out.println("Nhập vào chiều dài: ");
        height = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào 1 chuỗi: ");
        String string = scanner.nextLine();

        int area = width * height;
        System.out.println("Diện tích hình là: " + area);
        System.out.println(string);
    }
}
