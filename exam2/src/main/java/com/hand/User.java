package com.hand;

public class User {
    private double salary;
    private double tax;

    public User(double salary) {
        this.salary = salary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getPay() {
        return salary;
    }

    public void setPay(double salary) {
        this.salary = salary;
    }

}
