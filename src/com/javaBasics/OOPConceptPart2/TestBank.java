package com.javaBasics.OOPConceptPart2;

public class TestBank {

    public static void main(String[] args){
        System.out.println(USBank.min_bal);
        //static polymorphism - compile time polymorphism
        HSBCBank hs = new HSBCBank();
        hs.debit();
        hs.credit();
        hs.transferMoney();
        hs.educationLoan();
        hs.carLoan();

        //dynamic polymorphism - runtime polymorphism
        // child class object can be referred by parent interface reference var
        //only overridden methods will be called
        USBank b = new HSBCBank();
        b.credit();
        b.debit();
        b.transferMoney();
    }
}
