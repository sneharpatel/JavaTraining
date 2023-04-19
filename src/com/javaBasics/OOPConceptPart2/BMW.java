package com.javaBasics.OOPConceptPart2;

public class BMW extends Car{ // has-a relationship

    // when same method is present in parent class as well as child class with same name and same number of arguments,
    // it is called Method-overriding.
    public void start(){
        System.out.println("BMW......start");
    }
    public void theftSafety(){
        System.out.println("BMW......theftSafety");
    }
}
