package com.javaBasics;

public class IfElseConcept {
    public static void main(String[] args){
        int a =20;
        int b = 30;

        if(b>a){
            System.out.println("b is greater than a");
        }else{
            System.out.println("a is greater than b");
        }

        // comparator operatior:
        // < > <= >= == !=

        int c = 40;
        int d = 40;

        if(c==d){
            System.out.println("c and d are equal");
        }else{
            System.out.println("c and d are not equal");
        }

        //nested if-else

        int a1 = 200;
        int b1 = 300;
        int c1 = 400;

        if(a1>b1 & a1>c1){
            System.out.println("a1 is greatest");
        }else if(b1>c1){
            System.out.println("b1 is greatest");
        }else{
            System.out.println("c1 is greatest");
        }
    }
}
