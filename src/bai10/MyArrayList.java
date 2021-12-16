package bai10;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        int[] ints = new int[10];
        //trước bản cập nhật Java 7
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //sau bản Java 7
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        System.out.println(arrayList1.add(1));
        arrayList1.add(1,10);
        for (Integer intValue: arrayList1) {
            System.out.println(intValue);
        }

        //lớp tự tạo
//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(1);
    }
}
