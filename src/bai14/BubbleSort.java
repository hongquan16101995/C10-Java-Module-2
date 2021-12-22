package bai14;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ints = {1, 3, 2, 5, 7, 4, 8, 5, 0};

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }

        for (int i : ints) {
            System.out.println(i);
        }
    }
}
