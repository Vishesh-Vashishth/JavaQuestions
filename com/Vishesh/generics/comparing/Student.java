package com.Vishesh.generics.comparing;

public class Student implements Comparable<Student> {
    int age;
    float marks;

    public Student(int age , float marks){
        this.age = age;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;

        // if diff == 0 the both are equal;
        // if diff < 0 means o is greater else o is smaller;
    }

    public String toString(){
        return "{" + marks + age + "}";
    }
}
