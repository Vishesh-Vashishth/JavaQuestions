package com.Vishesh.stack;

public class StackMain {
    public static void main(String[] args) throws Exception{
        CustomStack stack = new CustomStack();
        stack.push(45);
        stack.push(45555);
        stack.push(455);
        stack.push(4555);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
