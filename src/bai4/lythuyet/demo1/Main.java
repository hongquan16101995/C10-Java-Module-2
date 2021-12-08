package demo1;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog", 1, 10, 0.5, "Male");
        System.out.println(dog.age);
        System.out.println(dog.weight);
        System.out.println(dog.height);
        System.out.println(dog.getName());
//        Animal animal1 = new Animal();
//        System.out.println(dog.getName());
//        System.out.println(dog.getAge());
//        System.out.println(dog.getWeight());
//        System.out.println(dog.getHeight());
//        System.out.println(dog.getGender());
//        System.out.println(dog);
//        dog.getInfo();
//        changeName(dog);
//        System.out.println(dog.getName());
//        String a = "abc";
    }

    public static void changeName(Animal animal) {
        animal.setName("Cat");
    }
}
