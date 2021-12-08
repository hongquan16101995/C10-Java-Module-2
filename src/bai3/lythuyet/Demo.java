public class Demo {
    public static void main(String[] args) {
        int num = 10;
        int[] array = {1,2,3};
        System.out.println(num);
        System.out.println(array[1]);
        change(num, array);
        System.out.println(num);
        System.out.println(array[1]);
    }

    public static void change(int num, int[] arr) {
        num = 1000;
        arr[1] = 100;
    }
}
