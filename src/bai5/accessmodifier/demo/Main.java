package bai5.accessmodifier.demo;

import bai5.accessmodifier.lythuyet.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("HN", "0923232132", 24, "Toàn");
//        System.out.println(human.age); //protect ngoài package nhưng không là con, thì không gọi đk
//        System.out.println(human.name); //public goi được trong cả project (file src)
    }
}
