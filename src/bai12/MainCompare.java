package bai12;

import bai4.lythuyet.demo1.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainCompare {
    public static void main(String[] args) {
        ArrayList<AnimalCompare> animals = new ArrayList<>();
        Collections.sort(animals);

        ArrayList<Animal> animals1 = new ArrayList<>();
        AnimalCompare1 animalCompare1 = new AnimalCompare1();
        Collections.sort(animals1, animalCompare1);

        ArrayList<Animal> animals2 = new ArrayList<>();
        animals2.sort(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        animals2.sort((o1, o2) -> o1.getAge() - o2.getAge());

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(10);
        integers.add(8);
        integers.forEach((s) -> System.out.println(s));
        integers.sort((o1, o2) -> o2 - o1);
        System.out.println("--------------");

        for (Integer integer: integers) {
            System.out.println(integer);
        }
    }
}
