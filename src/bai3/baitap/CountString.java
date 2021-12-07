package bai3.baitap;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        String string = scanner.nextLine();
        System.out.println("Nhập vào 1 ký tự bất kỳ: ");
        char character = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự là: " + count);
    }
}
