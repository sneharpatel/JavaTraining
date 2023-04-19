package com.javaBasics.OOPConceptPart1;

public class CallByValAndCallByRef {
    int p;
    int q;

    public static void main(String[] args){
        CallByValAndCallByRef obj = new CallByValAndCallByRef();
        int x = 10;
        int y = 20;
        int i = obj.sum(10,20); //call by value or pass by value
        System.out.println(i);
        obj.p = 50;
        obj.q = 60;
        obj.swap(obj); // call by reference
        System.out.println(obj.p);
        System.out.println(obj.q);
    }

    public int sum(int a, int b){
         a = 30;
         b = 40;
        int c = a+b;
        return c;
    }

    // call by reference  --
    // interview que: is it possible to call by ref?
    // --> yes, it is possible by object reference

    public void swap(CallByValAndCallByRef t){
        int temp;
        temp = t.p; //temp = 50
        t.p = t.q; // t.p=60
        t.q = temp; // t.q=50
    }
}
