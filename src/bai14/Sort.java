package bai14;

public class Sort {
    public static void main(String[] args) {
        int[] ints = {7, 3, 2, 5, 7, 4, 5, 0, 10};

//        bubbleSort(ints);
//        selectSort(ints);
        insertionSort(ints);

        for (int i : ints) {
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            for (int j = 0; j < ints.length - i; j++) {
                if (ints[j + 1] < ints[j]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
    }

    public static void selectSort(int[] ints) {
        int min, minIndex;
        for (int i = 0; i < ints.length - 1; i++) {
            min = ints[i];
            minIndex = i;
            for (int j = i + 1; j < ints.length; j++) {
                if (min > ints[j]) {
                    min = ints[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                ints[minIndex] = ints[i];
                ints[i] = min;
            }
        }
    }

    public static void insertionSort(int[] ints) {
        int min, minIndex;
        for (int i = 0; i < ints.length; i++) {
            min = ints[i];
            minIndex = i;
            while (minIndex > 0 && min < ints[minIndex-1]) {
                ints[minIndex] = ints[minIndex - 1];
                minIndex--;
            }
            ints[minIndex] = min;
        }
    }
}
