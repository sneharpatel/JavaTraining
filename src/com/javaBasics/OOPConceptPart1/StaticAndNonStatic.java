package com.javaBasics.OOPConceptPart1;

public class StaticAndNonStatic {

    // global variables: the scope of global variables will be available across all the functions with specific conditions
    String name = "Tom"; // non-static global variable
    static int age = 25; // static global variable

    public static void main(String[] args){

        // How to call static methods and vars
        // 1. direct calling
        sum();
        //2. calling by classname
        StaticAndNonStatic.sum();
        System.out.println(age);
        System.out.println(StaticAndNonStatic.age);

        // How to call non-static methods and vars
        StaticAndNonStatic obj = new StaticAndNonStatic();
        obj.sendMail();
        System.out.println(obj.name);

        // Can i access static method by using object reference? yes, but it is not good practice
        obj.sum(); // warning will be given
    }
    public void sendMail(){ // non-static method
        System.out.println("SendMail method");

    }

    public static void sum(){ // static method
        System.out.println("sum method");

    }

}
