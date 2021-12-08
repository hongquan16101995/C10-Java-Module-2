import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = scanner.nextInt();

        display(number, a);

        int[] arr = new int[5];
        int[] array = {1,2,3,4,5};
        int[] array2 = new int[arr.length+1];
        //index = 2
        //value = 20
        //array = 1,2,20,3,4,5
    }

    public static void display(int number, int a) {
        int count = 0;
        while (count < a) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
//        if (check) {
//            System.out.println(number + " là SNT");
//        } else {
//            System.out.println(number + " không là SNT");
//        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
