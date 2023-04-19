package com.javaBasics;

public class LoopingConcept {
    public static void main(String[] args){
        // 1. while loop
        // dis-advantage of while loop: it will generate infinite loop if don't give
        // incremental/decremental statement
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i=i+1;
        }

        System.out.println("*********");


        // 2. for loop: print 1 to 10
        for(int j=1; j<=10; j++){ // initialization, conditional, incremental
            System.out.println(j);
        }
        System.out.println("**********");
        // print in 10 to 1
        for(int k=10; k>=1; k--){ //initialization, conditional, decremental
            System.out.println(k);

        }


    }
}
