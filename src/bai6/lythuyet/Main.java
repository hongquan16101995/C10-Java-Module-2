package bai6.lythuyet;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Pig pig = new Pig();
        Bird bird = new Bird();
        //overloading
        human.eat(pig);
        human.eat(bird);
    }
}
