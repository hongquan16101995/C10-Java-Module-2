package bai12;

import bai4.lythuyet.demo1.Animal;

import java.util.Comparator;

public class AnimalCompare1 implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge() - o2.getAge();
    }
}
