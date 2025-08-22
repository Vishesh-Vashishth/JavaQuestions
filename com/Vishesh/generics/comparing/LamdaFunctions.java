package com.Vishesh.generics.comparing;

import java.lang.classfile.Interfaces;
import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(i+1);
        }

       // list.forEach((item) -> System.out.println(item*2));

        Consumer<Integer> fun = (item) -> System.out.println(item*2);
        list.forEach(fun);

        Operation sum = (a,b)-> (a+b);
        Operation sub = (a,b)-> (a-b);
        Operation product = (a,b)-> (a*b);

        LamdaFunctions myCalculator = new LamdaFunctions();
        System.out.println(myCalculator.operate(4,5,sum));


    }

    private int operate(int a , int b , Operation op){
        return op.operation(a,b);
    }

    int sum(int a , int b){
        return a+b;
    }

    interface Operation {
        int operation(int a, int b);
    }
}
