package bai7.lythuyet;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Gâu gâu");
    }

    @Override
    public void run() {
        System.out.println("Đang chạy đấy");
    }

    @Override
    public void eat() {
        System.out.println("Đang ăn đấy");
    }
}
