package bai7.lythuyet;

public abstract class AnimaAbstract implements Animal{

    public abstract void makeSound();

    @Override
    public void run() {
        System.out.println("Đang chạy đấy");
    }

    @Override
    public void eat() {
        System.out.println("Đang ăn đấy");
    }

    public void sleep() {
        System.out.println("Đang ngủ đấy");
    }

    public abstract void seen();
}
