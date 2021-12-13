package bai7.lythuyet.interface_java;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Meo meo");
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
