package com.Vishesh.exceptionHandling;

public class Main {
    public static void main(String[] args){
        int a = 5;
        int b = 0;
        String name = "Vishesh";


        try {
            if(name.equals("Vishesh")){
                throw new MyException("uri baap re tera naam lia!");
            }
            //divide(a,b);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }finally {
            System.out.println("y to pakka chlega hi chlega!!!!");
        }
    }

    static int divide (int a , int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("zero s divide mt kar mere bhai!!");
        }
        return a/b;
    }
}
