package com.javaBasics.CollectionsSession;

import java.util.Vector;

public class Vector2dConcept {
    public static void main(String[] args){

        Vector<String> langVector = new Vector<String>();

        langVector.add("Java");
        langVector.add("Python");
        langVector.add("Ruby");
        langVector.add("JavaScript");
        langVector.add("C#");

        Vector osVector = new Vector();

        osVector.add(langVector); // 0th index

        for(int i=0; i< langVector.size(); i++){
           String str = (String)((Vector)osVector.get(0)).get(i);
           System.out.println(str);
        }

    }
}
