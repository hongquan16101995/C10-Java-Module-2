package bai6.lythuyet;

public class MainUpDown {
    public static void main(String[] args) {
        //downcasting
        Animal animal = new Bird("Vẹt", 1);
        Animal animal2 = new Animal("AA", 3);
        Bird bird = (Bird) animal;
//        Bird bird2 = (Bird) animal2;
//        animal.fly();
//        bird.fly();
//        bird2.fly();

        //upcasting
        Bird bird1 = new Bird("Chích", 2, "Green");
//        Animal animal1 = bird1;
//        bird.fly();
//        animal1.fly();

        Bird[] birds = new Bird[3];
        birds[0] = (Bird)animal;
    }
}