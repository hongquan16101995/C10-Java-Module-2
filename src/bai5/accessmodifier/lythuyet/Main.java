package bai5.accessmodifier.lythuyet;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("HN", "0923232132", 24, "Toàn");
//        System.out.println(human.address); //không gọi được dù là trong cùng package
//        System.out.println(human.phoneNumber); //default trong cùng package thì gọi đk
//        System.out.println(human.age); //protect trong cùng package thì gọi đk
    }
}
