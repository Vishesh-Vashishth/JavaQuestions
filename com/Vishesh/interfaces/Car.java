package com.Vishesh.interfaces;

public class Car implements Engine , Brake {

    int a = 10;

    @Override
    public void start(){
        System.out.println("I Start like normal car");
    }

    @Override
    public void stop(){
        System.out.println("I Stop like normal car");
    }

    @Override
    public void accelerate(){
        System.out.println("I Acc like normal car");
    }

    @Override
    public void brake(){
        System.out.println("I brake like normal car");
    }



}
