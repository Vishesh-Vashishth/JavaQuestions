package com.Vishesh.access;

public class A {
    private int num; //Data member // you can access this num anywhere in this class
    //but not anywhere else;
    String name; // Data member
    int[] arr; // Data member

    public int getNum() { // as this method is public you can use this
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    A(int num , String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
