package com.javaBasics.OOPConceptPart1;

public class MethodOverloading {
    public static void main(String[] args){
        MethodOverloading obj = new MethodOverloading();
        obj.sum();
        obj.sum(10);
        obj.sum(15, 25);
    }

    // we can overload main method also, but usually we don't overload main method
    public static void main(int i){

    }
    public static void main(int p, int q){

    }

    //you can not create a method inside a method
    // duplicate method --> i.e same method name with same number of arguments are not allowed
    //Method overloading --> when the method name is same with different arguments or input parameters with different data-types within the same class
    public void sum(){ //0 input parameter
        System.out.println("Sum method -- with zero parameter");
    }

    public void sum(int i){ // one para
        System.out.println("Sum method -- with 1 para");
        System.out.println(i);
    }

    public void sum(double j){ // one para with same method and different data-type

    }
    public void sum(int j, int k){ // Two params
        System.out.println("Sum method -- with 2 param");
        System.out.println(j+k);
    }
}
