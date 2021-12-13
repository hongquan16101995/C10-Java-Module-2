package bai7.lythuyet;

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
