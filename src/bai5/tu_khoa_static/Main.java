package bai5.tu_khoa_static;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
//        student.id = 10;
//        System.out.println(student.getId());
//        System.out.println(student.getSchool());
//        System.out.println(Student.school);
//        System.out.println(Student.getId1());
//        System.out.println(Student.getSchool1());
//        Student.display();
//        System.out.println(student.getSchool());

        System.out.println(student.getId());
        System.out.println(student1.getId());
        System.out.println(student2.getId());
        System.out.println(student.getSchool());
        System.out.println(student1.getSchool());
        System.out.println(student2.getSchool());
        System.out.println(Student.id_basic_value);
        Student.school = "Đại học TM";
        student.school = "Đại học GTVT";
        System.out.println(student.getSchool());
        System.out.println(student1.getSchool());
        System.out.println(student2.getSchool());
    }

    //khối static
    static {
        System.out.println("Hello");
    }

    static {
        System.out.println("Bye");
    }
}