package com.Vishesh.interfaces;

public class CDplayer implements Media {

    @Override
    public void start() {
        System.out.println("You are now Rocking!!!");
    }

    @Override
    public void stop() {
        System.out.println("Music Stopped!!!");
    }
}
