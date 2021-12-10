package bai6.lythuyet;

public class Human {
    String name;
    int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(Pig pig) {
        System.out.println("Đang ăn thịt heo");
    }

    public void eat(Bird bird) {
        System.out.println("Đang ăn thịt chim");
    }
}
