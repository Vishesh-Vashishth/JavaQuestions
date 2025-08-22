package com.Vishesh.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student vishesh = new Student(12,56.78f);
        Student akshat = new Student(13,60.45f);
        Student don = new Student(11,61.45f);
        Student systum = new Student(15,49.45f);
        Student bhaisahab = new Student(21,68.45f);

        Student[] list = {vishesh,akshat,don,systum,bhaisahab};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));



        if (vishesh.compareTo(akshat) < 0) {
            System.out.println("akshat has more marks");
        }


    }
}
