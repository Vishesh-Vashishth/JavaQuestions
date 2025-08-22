package com.Vishesh.stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }


    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Are Bhai Stack bhar gaya hai!!!!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty hai kya peek kar raha!!");
        }
        return data[ptr];
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Are Khali stack m se kaise pop karu bhai?????");
        }

        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public boolean isFull(){
        return ptr == data.length-1; // ptr is at the last index;
    }

    public boolean isEmpty(){
        return ptr == -1; // empty , not a single item present;
    }
}
