package bai6.lythuyet;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("A", 1);
        Bird bird = new Bird("Vẹt", 1, "Red");
        System.out.println(animal.getName());
        System.out.println(bird.getName());
        bird.bark();
    }
}
