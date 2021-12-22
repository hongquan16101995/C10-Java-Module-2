package bai14;

public class SelectSort {
    public static void main(String[] args) {
        int[] ints = {5, 7, 4, 5, 0, 10};

        for (int i = 0; i < ints.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[minIndex] > ints[j]) {
                    minIndex = j;
                }
            }
                int temp = ints[i];
                ints[i] = ints[minIndex];
                ints[minIndex] = temp;
        }

        for (int i : ints) {
            System.out.println(i);
        }
    }
}
