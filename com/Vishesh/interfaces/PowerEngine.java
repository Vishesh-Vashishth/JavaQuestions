package com.Vishesh.interfaces;

public class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("power Engine started");
    }

    @Override
    public void stop() {
        System.out.println("power Engine stopped");

    }

    @Override
    public void accelerate() {
        System.out.println("power Engine accelerated");

    }
}
