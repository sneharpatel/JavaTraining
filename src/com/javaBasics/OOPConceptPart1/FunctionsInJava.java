package com.javaBasics.OOPConceptPart1;

public class FunctionsInJava {
    /* main method--> starting point of execution
     Why main method is void? --> we never write returns statement inside main method and because of
     that main method id always void
       It never returns a value */

    public static void main(String[] args){

        FunctionsInJava obj = new FunctionsInJava();
        // one object will be created, obj is the reference variable, referring to this object
        // after creating the object, the copy of all non-static method will be given to this object
        // non-static method can't hold obj
        obj.test();

        int a = obj.pqr();
        System.out.println(a);

        String s1 = obj.qa();
        System.out.println(s1);

        int d1 = obj.division(40, 20);
        System.out.println(d1);
    }
    //non-static method

    // void --> does not return any value
    // return type: void
    public void test(){
        System.out.println("test method");
    }

    // return type: int
    public int pqr(){ // no input, some output
        System.out.println("pqr method");
        int a = 10;
        int b = 20;
        int c = a+b;
        return c;
    }

    // return type: String
    public String qa(){  // no input, some output
        System.out.println("qa method");
        String s = "Selenium";
        return s;
    }

    // return type: int
    // x,y--> input parameter
    public int division(int x, int y){
        System.out.println("division method");
        int d = x/y;
        return d;
    }
}
