package com.javaBasics.OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank { // achieving multiple interface
    // Is-a relationship

    //If a class is implementing any interface, then its mandatory to define/override all the methods of interface
    //overriding from USBank
    @Override
    public void debit() {
        System.out.println("hsbc.....debit");
    }

    @Override
    public void credit() {
        System.out.println("hsbc.....credit");
    }

    @Override
    public void transferMoney() {
        System.out.println("hsbc.....transferMoney");
    }

    // separate methods of HSBCBank class
    public void educationLoan(){
        System.out.println("hsbc.....edu loan");
    }

    public void carLoan(){
        System.out.println("hsbc.....Car Loan");
    }

    // Brazil bank method: overriding from Brazil bank
    public void mutualFund(){
        System.out.println("Brazil bank.....mutual fund");
    }
}
