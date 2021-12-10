package bai6.lythuyet;

public class Pig extends Animal{
    public int weight;

    public Pig() {
    }

    public Pig(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }
}
