package bai12;

import bai4.lythuyet.demo1.Animal;

public class AnimalCompare extends Animal implements Comparable<Animal> {
    @Override
    public int compareTo(Animal o) {
        return o.getAge() - getAge();
    }
}
