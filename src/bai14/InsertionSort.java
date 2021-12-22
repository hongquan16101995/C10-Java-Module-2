package bai14;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ints = {1, 3, 2, 5, 7, 4, 8, 5, 0, 10};

        for (int i = 1; i < ints.length; i++) {
            int index = i - 1;
            int value = ints[i];
            while (index >= 0 && ints[index] > value) {
                ints[index + 1] = ints[index];
                index--;
            }
            ints[index+1] = value;
        }

        for (int i : ints) {
            System.out.println(i);
        }
    }
}
