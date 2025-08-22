package com.Vishesh.abstractDemo;

public class Daughter extends Parent {

    Daughter(int age){
        super(age);
    }


    @Override
    void career() {
        System.out.println("I want to be a Influencer");
    }

    @Override
    void partner() {
        System.out.println("I love Harry potter");
    }
}
