package me.yumna.constructorexecersices;

public class Person {
    String name;
    int age;
    String gender;


    Person(String name,int age,String gender)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        gender=gender.toLowerCase();
        System.out.println(gender);
        if(gender.equals("female") || gender.equals("male"))
        this.gender = gender;
    }
    public void displaydetails()
    {
        System.out.println("name: "+name+" age: "+age+" gender: "+gender);
    }
}





