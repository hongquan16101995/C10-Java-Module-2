package demo;

import demo1.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Dog", 1, 10, 0.5, "Male");
        System.out.println(animal.height);
//        System.out.println(animal.weight);
        System.currentTimeMillis();
    }
}
