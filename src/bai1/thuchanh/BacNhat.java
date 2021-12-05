package bai1.thuchanh;

import java.util.Scanner;

public class BacNhat {
    public static void main(String[] args) {
        int heSoA;
        float heSoB;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hệ số A: ");
        heSoA = scanner.nextInt();
        System.out.println("Nhập vào hệ số B: ");
        heSoB = scanner.nextFloat();

        if (heSoA == 0 && heSoB != 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (heSoA == 0) {
            System.out.println("Phương trình vô số nghiệm");
        } else {
            System.out.println("Nghiệm của phương trình là: " + (-heSoB / heSoA));
        }
    }
}
