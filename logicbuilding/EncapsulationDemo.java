package com.Vishesh.logicbuilding;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Person p = new Person("Alice", 25);
        System.out.println(p.getName() + " is " + p.getAge() + " years old.");
        p.setAge(26);
        System.out.println("After birthday, age is " + p.getAge());

    }
}

// class person
class Person{
    private String name ;
    private int age;

    public Person(String name , int age){
        this.name = name;
        setAge(age);
    }

    public void setAge(int age) {
        if (age >= 0 && age <=150){
            this.age = age;
        }else {
            throw new IllegalArgumentException("Invalid age");
        }
    }

    //getter for name

    public String getName(){
        return name;
    }

    // getter for age

    public int getAge(){
        return age;
    }
}
