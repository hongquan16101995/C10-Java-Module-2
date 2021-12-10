package bai6.lythuyet;

public class Bird extends Animal{
    public String color;

    public Bird() {
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    public Bird(String name) {
        super(name);
    }

    public Bird(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void fly() {
        System.out.println("Chim có thể bay!!");
    }

    @Override
    public void bark() {
        System.out.println("aaaaaaaaa");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
