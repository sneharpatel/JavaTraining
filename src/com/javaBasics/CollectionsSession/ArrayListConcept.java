package com.javaBasics.CollectionsSession;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static void main(String[] args){
        int a[] = new int[3]; // static array: size is fixed

        // Dynamic array:
        //1. It contains duplicate elements/values
        //2. maintains insertions order
        //3. synchronized
        //4. It allows random access to fetch the element because it stores the values on basis of indexes
        ArrayList ar = new ArrayList(); // non-generic ArrayList - ArrayList reference doesn't define type of data type to be stored
        ar.add(10); //0
        ar.add(20); //1
        ar.add(30); //2
        System.out.println(ar.size());

        ar.add(40); //3
        ar.add(50); //4
        ar.add(50); //5
        ar.add(12.33);
        ar.add("Test");
        ar.add("A");
        ar.add('$');
        System.out.println(ar.size()); // size of arrayList
        System.out.println(ar.get(4));// get value of index 4

        // to print all the elements use: for loop
        for(int i=0; i<ar.size(); i++){
            System.out.println(ar.get(i));
        }

        // generic vs non-generic:
        // ArrayList is a raw type. reference to Arraylist<> should be parameterized.
        // JDK will suggest that define the type of values to be stored (types of data) in Arraylist

        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(100);
        // ar1.add(12.33); // this is not allowed -- its float value
        // ar1.add("selenium"); // this is not allowed -- its string value

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("selenium");
        ar2.add("Test");


        // Interview question: How to store user defined class into arraylist?
        // Employee class object
        Employee e1 = new Employee("John", 27, "QA");
        Employee e2 = new Employee("Tom", 28, "Dev");
        Employee e3 = new Employee("Peter", 29, "Admin");

        // create ArrayList
        ArrayList<Employee> ar4 = new ArrayList<Employee>();
        ar4.add(e1);
        ar4.add(e2);
        ar4.add(e3);

        // iterator to traverse the values
        Iterator<Employee> it =  ar4.iterator();
        while (it.hasNext()){
            Employee emp = it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }

        // addAll method
        System.out.println("***********");
        ArrayList<String> ar5 = new ArrayList<String>();
        ar5.add("Test");
        ar5.add("Selenium");
        ar5.add("QTP");

        ArrayList<String> ar6 = new ArrayList<String>();
        ar6.add("Dev");
        ar6.add("Java");
        ar6.add("JavaScript");

        ar5.addAll(ar6);

        for(int i=0; i<ar5.size(); i++){
            System.out.println(ar5.get(i));
        }

        // removeAll method
        System.out.println("***********");
        ar5.removeAll(ar6);
        for(int i=0; i<ar5.size(); i++){
            System.out.println(ar5.get(i));
        }

        //retainAll method: which prints only common value
        System.out.println("*************");

        ArrayList<String> ar7 = new ArrayList<String>();
        ar7.add("Test");
        ar7.add("Selenium");
        ar7.add("QTP");

        ArrayList<String> ar8 = new ArrayList<String>();
        ar8.add("Test");
        ar8.add("Java");
        ar8.add("JS");

        ar7.retainAll(ar8);

        for(int i=0; i<ar7.size(); i++){
            System.out.println(ar7.get(i));
        }

        ar7.stream().forEach((i) -> System.out.println(i));

    }
}
