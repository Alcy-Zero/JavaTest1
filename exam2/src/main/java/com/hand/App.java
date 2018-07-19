package com.hand;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        User userA = new User(5000);
        User userB = new User(10000);
        User userC = new User(15000);
        User userD = new User(60000);
        userA.setTax(CaculateTax.INSTANCE.caculate(userA.getPay()));
        System.out.println("A需缴纳税费："+ userA.getTax());
        userB.setTax(CaculateTax.INSTANCE.caculate(userB.getPay()));
        System.out.println("B需缴纳税费："+ userB.getTax());
        userC.setTax(CaculateTax.INSTANCE.caculate(userC.getPay()));
        System.out.println("C需缴纳税费："+ userC.getTax());
        userD.setTax(CaculateTax.INSTANCE.caculate(userD.getPay()));
        System.out.println("D需缴纳税费："+ userD.getTax());
        System.out.println();
    }
}
