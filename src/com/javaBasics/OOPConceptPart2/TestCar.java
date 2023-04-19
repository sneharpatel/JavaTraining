package com.javaBasics.OOPConceptPart2;

public class TestCar {
    public static void main(String[] args){
        // important interview question
        // static polymorphism /compile-time polymorphism:
        // polymorphism means: one to many,
        // many methods, i.e method overriding with the same name and same no.of arguments created inside
        // parent and child class
        BMW b = new BMW();
        b.start(); // What will happen,when parent and child classes have similar method? Method overriding: java compiler compile BMW's(child) start method not parent method
        b.stop();
        b.refuel();
        b.theftSafety();
        b.engine();

        System.out.println("***********");

        // Top -casting - Dynamic polymorphism
        Car c = new Car();
        c.start();
        c.stop();
        c.refuel(); // parent class can't inherit child class properties

        System.out.println("***********");
        Car c1 = new BMW();// Dynamic polymorphism - Run time polymorphism : child class object can be referred by parent class reference variable -

        // Down-casting is not allow: parent class object can't be referred by child class ref veriable
        //BMW b1 = new Car(); // not possible
        BMW b1 = (BMW)new Car(); // it will give error -->ClassCastingException
    }
}
