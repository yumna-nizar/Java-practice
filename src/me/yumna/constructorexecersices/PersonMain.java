package me.yumna.constructorexecersices;

public class PersonMain {

    public static void main(String[] args) {
        Person p1 = new Person("yumna", 21, "female");
        p1.displaydetails();
        p1.setAge(22);
        p1.displaydetails();
        System.out.println(p1.getAge());
        p1.setGender("maLe");
        System.out.println(p1.getGender());
    }
}
