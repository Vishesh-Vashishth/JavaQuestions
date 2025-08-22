package com.Vishesh.Properties.polymorphism;

public class Numbers {

    int sum(int a , int b){
        return a+b;
    }

    int sum(int a , int b , int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(2,3,4)); // static/compile time polymorphism
        // in this at compile time it will decide what method to call its also known as
        // method overloading.

    }
}
