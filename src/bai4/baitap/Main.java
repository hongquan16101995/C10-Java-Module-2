package bai4.baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        //bài 1
//        //dạng pt bậc 2: ax2 + bx + c = 0
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập hệ số a: ");
//        int heSoA = scanner.nextInt();
//        System.out.println("Nhập hệ số b: ");
//        int heSoB = scanner.nextInt();
//        System.out.println("Nhập hệ số c: ");
//        int heSoC = scanner.nextInt();
//        QuadraticEquation quadraticEquation = new QuadraticEquation(heSoA, heSoB, heSoC);
//        displayRoot(heSoA, heSoB, heSoC, quadraticEquation);

//        //bài 2
//        StopWatch stopWatch = new StopWatch();
//        long[] arr = new long[100000];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Math.round(Math.random() * 1000);
//        }
//
//        stopWatch.getStartTime();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    long temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        stopWatch.getEndTime();
//        System.out.println(stopWatch.getElapsedTime());
    }

    public static void displayRoot(int heSoA, int heSoB, int heSoC, QuadraticEquation quadraticEquation) {
        if (heSoA == heSoB && heSoB == heSoC && heSoA == 0) {
            System.out.println("PT có vô số ng");
        } else if (heSoA == 0 && heSoB != 0 && heSoC != 0) {
            System.out.println("Nghiệm của PT là: " + ((-quadraticEquation.getC()) / quadraticEquation.getB()));
        } else if ((heSoA == 0 && heSoB == 0) || quadraticEquation.getDelta() < 0) {
            System.out.println("PT vô nghiệm");
        } else if (quadraticEquation.getDelta() == 0) {
            System.out.println("PT có nghiệm kép là: " + quadraticEquation.getRoot());
        } else {
            System.out.println("PT có 2 nghiệm là: " + quadraticEquation.getRoot1() + "; " + quadraticEquation.getRoot2());
        }
    }
}
