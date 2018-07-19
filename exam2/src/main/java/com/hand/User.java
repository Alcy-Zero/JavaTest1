package com.hand;

public class User {
    private double pay;
    private double tax;

    public User(double pay) {
        this.pay = pay;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }



}
