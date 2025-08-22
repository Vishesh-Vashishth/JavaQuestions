package com.Vishesh.generics;

import java.util.Arrays;

public class CustomArraylist {

    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value;

    public CustomArraylist(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    private void resize() {
        int[] temp = new int[data.length*2];

        //copy the elements of previous array into this one

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
                
    }

    public int get(int index ){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index , int value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "{" + Arrays.toString(data) + "}";
    }

    public static void main(String[] args) {
        CustomArraylist list = new CustomArraylist();
        list.add(4);
        list.add(3);
        list.add(2);

        System.out.println(list);
    }

}
