package bai7.lythuyet.interface_java;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        Tiger tiger = new Tiger();
        tiger.makeSound();
        tiger.eat();
        tiger.sleep();
    }
}
