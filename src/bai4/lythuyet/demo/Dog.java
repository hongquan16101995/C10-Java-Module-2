package bai4.lythuyet.demo;

import demo1.Animal;

public class Dog extends Animal {
    boolean status;

    public Dog(String name, int age, double weight, double height, String gender) {
        super(name, age, weight, height, gender);
    }

    public Dog() {
    }

    public Dog(boolean status) {
        this.status = status;
    }

    @Override
    public String getName() {
        return "Hello cả nhà";
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("aaaaaaaaaaaa", 1, 10, 0.5, "Male");
//        System.out.println(dog1.age);
        System.out.println(dog1.weight);
        System.out.println(dog1.height);
        System.out.println(dog1.getName());
    }
}
