package bai5.tu_khoa_static;

public class Student{
    //thuộc tính - biến static: biến tĩnh
    public static int id_basic_value = 0;
    public int id;
    public static String school = "CG";
    public String name;

    public Student() {
        id_basic_value++;
        this.id = id_basic_value;
    }

    public int getId() {
        return id; //phương thức thường gọi biến static
    }

    public String getSchool() {
        return school;
    }

//    public static String getName() {
//        return name; //phương thức static thì k gọi được biến non-static
//    }

    //phương thức static
    public static int getId1() {
        return id_basic_value; //phương thức static gọi biến static
    }

    public static String getSchool1() {
        return school;
    }

    public static void display() {
        System.out.println(getId1()); //phương thức non-static gọi phương thức static
    }

//    public static void display1() {
//        System.out.println(getId()); //phương thức static không gọi được phương thức non-static
//    }
}