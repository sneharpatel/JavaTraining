package com.javaBasics.CollectionsSession;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args){

        Vector<Integer> myVector = new Vector<Integer>();

        myVector.add(2);
        myVector.add(4);
        myVector.add(6);
        myVector.add(8);
        myVector.add(10);
        myVector.add(12);
        myVector.add(14);
        myVector.add(16);
        myVector.add(18);
        myVector.add(20);

        System.out.println(myVector.size());
        System.out.println(myVector.get(2));

        myVector.remove(3);
        System.out.println(myVector);

        Vector<Integer> yourVector = new Vector<Integer>();

        yourVector.add(10);
        yourVector.add(11);

        myVector.addAll(yourVector);
        System.out.println(myVector);

        System.out.println("**************");
        for(Integer e : myVector){
            System.out.println(e);
        }

        System.out.println("**************");
        for(int i=0; i< myVector.size(); i++){
            System.out.println(myVector.get(i));
        }

        System.out.println("**************");
        Iterator<Integer> it = myVector.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Collections.sort(myVector);
        System.out.println(myVector);
    }
}
