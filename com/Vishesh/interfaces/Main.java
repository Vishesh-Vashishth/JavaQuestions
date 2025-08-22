package com.Vishesh.interfaces;

public class Main {
    public static void main(String[] args) {
        Car mycar = new Car();

       // int b = mycar.a;
//
//        mycar.accelerate();
//        mycar.brake();

        NewCar car = new NewCar();

        car.start();
        car.startMusic();

        car.upgradeEngine();
        car.start();
    }
}
