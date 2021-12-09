package bai5.accessmodifier.demo;

import bai5.accessmodifier.lythuyet.Human;

public class Student extends Human {
    public int getAge() {
        return age; //bản thân Student không có age nhưng vẫn lấy được
        //do age là thuộc tính của cha
        //protected trua cập ngoài package, nhưng phải là con (tính kế thừa)
    }

    public String getName() {
        return name; //public lấy được ở tất cả
    }
}
