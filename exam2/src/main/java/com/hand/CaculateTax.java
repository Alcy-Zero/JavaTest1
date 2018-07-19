package com.hand;

public enum CaculateTax {
    INSTANCE;
    public double caculate(double pay) {
        double payreal = pay - 3500;
        int level = 0;
        double tax = 0;
        if (payreal <= 1500) {
            level = 1;
        } else if (payreal <= 4500) {
            level = 2;
        } else if (payreal <= 9000) {
            level = 3;
        } else if (payreal <= 35000) {
            level = 4;
        } else if (payreal <= 55000) {
            level = 5;
        } else if (payreal <= 80000) {
            level = 6;
        } else {
            level = 7;
        }
        switch (level) {
            case 1:
                tax = payreal * 0.03;
                break;
            case 2:
                tax = 45 + (payreal-1500) * 0.1;
                break;
            case 3:
                tax = 45+450 + (payreal-4500) * 0.2;
                break;
            case 4:
                tax = 45+450+1800 + (payreal-9000) * 0.25;
                break;
            case 5:
                tax = 45+450+1800+8750+ (payreal-35000) * 0.3;
                break;
            case 6:
                tax = 45+450+1800+8750+16500 +(payreal-55000) * 0.35;
                break;
            case 7:
                tax = 45+450+1800+8750+16500+28000 +(payreal-80000)* 0.45;
                break;
        }
        return tax;
    }
}
