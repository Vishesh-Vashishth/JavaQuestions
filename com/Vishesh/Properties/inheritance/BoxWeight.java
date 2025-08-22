package com.Vishesh.Properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l , double w, double h , double weight){
        super(l,w,h);
        this.weight = weight;
    }

    public BoxWeight(BoxPrice other) {
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
