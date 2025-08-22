package com.Vishesh.interfaces;

public class NewCar {
    private Engine engine;
    private Media player = new CDplayer();

    public NewCar(){
        engine = new PowerEngine();
    }

    public NewCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void upgradeEngine(){
        this.engine = new Electricengine();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }
}
