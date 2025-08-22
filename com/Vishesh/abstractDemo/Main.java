package com.Vishesh.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(23);
        son.career();
        System.out.println(son.age);

        Daughter a = new Daughter(19);
        a.career();
    }
}
