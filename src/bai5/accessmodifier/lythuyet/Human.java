package bai5.accessmodifier.lythuyet;

public class Human {
    private String address; //private: trong class
    String phoneNumber;
    protected int age;
    public String name;

    public Human() {
    }

    public Human(String address, String phoneNumber, int age, String name) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}