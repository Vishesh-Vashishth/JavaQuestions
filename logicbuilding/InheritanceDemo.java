package com.Vishesh.logicbuilding;

public class InheritanceDemo {
    public static void main(String[] args) {
        Vechile car = new Car("BMW", 2000000);
        car.run();


    }
}

class Vechile{
    String brand;

    public Vechile(String brand){
        this.brand = brand;
    }
     public void run(){
         System.out.println(brand + " Car is running!!!!");
     }
}

class Car extends Vechile{
    private int doorcount;
    public Car(String brand, int doorcount){
        super(brand);
        this.doorcount = doorcount;
    }

    public void openCarTrunck(){
        System.out.println(brand + "Car trunk is opened!!");
    }
}
