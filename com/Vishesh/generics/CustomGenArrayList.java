package com.Vishesh.generics;

import java.util.Arrays;

public class CustomGenArrayList <T> {
    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value;

    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];

        //copy the elements of previous array into this one

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;

    }

    public T  get(int index ){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index , T value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "{" + Arrays.toString(data) + "}";
    }


}
