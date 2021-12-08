import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        //sử dụng từ khóa new
        int[] ints = new int[length];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
//        ints[5] = 1; //index của ints: 0,1,2,3,4

        for (int element : ints) {
            System.out.print(element + "; ");
        }

        //khai báo trực tiếp
        int[] ints1 = {};
        System.out.println(ints1.length);

//        //mảng 2 chiều
//        int[][] array1 = new int[length][length];
//
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array1[i].length; j++) {
//                array1[i][j] = scanner.nextInt();
//            }
//        }
//
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array1[i].length; j++) {
//                System.out.print(array1[i][j] +"; ");
//            }
//            System.out.println();
//        }
//
//        for (int[] element : array1) {
//            for (int e : element) {
//                System.out.print(e + "; ");
//            }
//            System.out.println();
//        }
    }
}