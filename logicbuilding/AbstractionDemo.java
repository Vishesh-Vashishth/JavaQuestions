package com.Vishesh.logicbuilding;
// File: AbstractionDemo.java
public class AbstractionDemo {
    public static void main(String[] args) {
        PaymentMethod pm = new CreditCard("1234-5678-9012-3456");
        processPayment(pm, 100.0);
    }

    static void processPayment(PaymentMethod method, double amount) {
        if (method.validate()) {
            method.pay(amount);
        } else {
            System.out.println("Payment validation failed.");
        }
    }
}

interface PaymentMethod {
    boolean validate();
    void pay(double amount);
}

class CreditCard implements PaymentMethod {
    private String cardNumber;

    public CreditCard(String number) {
        this.cardNumber = number;
    }

    @Override
    public boolean validate() {
        return cardNumber.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using credit card " + cardNumber);
    }
}

