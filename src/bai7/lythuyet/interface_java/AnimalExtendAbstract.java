package bai7.lythuyet.interface_java;

public abstract class AnimalExtendAbstract extends AnimaAbstract{
    private int age;
    @Override
    public void seen() {
        System.out.println("Đang nhìn đấy");
    }

    public int age() {
        return age;
    }
}
