package com.javaBasics.CollectionsSession;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
    public static void main(String[] args){
        //It is similar to hashmap, but synchronized - Thread safe
        //stores the value on base key-val pair
        //key-->object-->HashCode-->value
        // it does not maintain order

        Hashtable h1 = new Hashtable();
        h1.put(1,"Tom");
        h1.put(2,"Test");
        h1.put(3,"Java");

        //create a clone/shallow copy

        Hashtable h2 = new Hashtable();
        h2 = (Hashtable)h1.clone();

        System.out.println("The values from h1 " + h1);
        System.out.println("The values from h2 " + h2);

        h1.clear();
        System.out.println("The values from h1 " + h1);
        System.out.println("The values from h2 " + h2);

        // contains value
        Hashtable st = new Hashtable();
        st.put("A","Steve");
        st.put("B","Manager");
        st.put("C","Selenium");

        if(st.containsValue("Steve"));
            System.out.println("Value is found");

        //print all the values of HashTable using - Enumerator - elements()
        Enumeration e = st.elements();
        System.out.println("Print values from st using Enumerator ");

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        //print all the values of HashTable using - entrySet - set of HashTable values:

        Set s = st.entrySet();
        System.out.println(s);


        // check both hashTables are equal
        Hashtable st1 = new Hashtable();
        st1.put("A","Steve");
        st1.put("B","Manager");
        st1.put("C","Selenium");
        st1.put("C","Selenium"); //it contains only unique values

        // no null key and null values
        st1.put("null","Selenium");  //  it will gives you null pointer exception error
        st1.put("C",null);  //  it will gives you null pointer exception error

        System.out.println("Print values from : " + st1);

        if(st.equals(st1))
            System.out.println("True: Both are equal");

        //get the values from a key
        System.out.println(st1.get("A"));

        //get the hashcode of the hashtable object
        System.out.println("The hashcode value of st1 :" + st1.hashCode());

        //generics:
        Hashtable<String,String> st3 = new Hashtable<String,String>();











    }
}
