package bai13;

public class Demo {
    public static void main(String[] args) {
        //độ phức tạp 0(1)
//        System.out.println("HelloWorld");
//        int a = 10;
//        if (a > 5) {
//            System.out.println("Hi");
//        }

        //tìm kiếm - độ phức tạp
//        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //c1: tuyến tính
//        int number = 3; // C(1)
//        boolean check = false; // C(1)
//        for (int i : ints) { // C(ints.length) <=> C(n) với n là độ dài mảng
//            if (i == number) { // C(1)
//                System.out.println("Có"); // C(1)
//                check = true; // C(1)
//            }
//        }
//        if (!check) { // C(1)
//            System.out.println("Không có"); // C(1)
//        }
        // O(max (C1, C(n.1), C3) = 0(C(n.1)) = O(C(n))

        //c2: nhị phân
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number1 = 10;
        int length = ints.length;
        int first = 0;
        System.out.println(searchBinary(ints, number1, first, length));
    }

    public static int searchBinary(int[] ints, int number1, int first, int last) {
        int mid = (first + last) / 2;
        if (first < last) {
            if (number1 == ints[mid]) {
                return mid;
            } else if (number1 > ints[mid]) {
                first = mid + 1;
                return searchBinary(ints, number1, first, last);
            } else {
                last = mid - 1;
                return searchBinary(ints, number1, first, last);
            }
        }
        return -1;
    }
}
