package com.javaBasics.CollectionsSession;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {
    public static void main(String[] args){
        //HashMap is a class implements Map interface
        //It extends AbstractMap
        //It contains only unique elements
        //It stores the value in from of key - value pair
        //It may contain one null key and multiple null values
        //It doesn't maintain order
        //HashMap is non-synchronized -- not thread safe
        //Con-current modification exception -- fail-fast condition:
        // When any thread modifies Map Structure by may be adding or removing is called fail-fast condition
        // and at the same time other threads try to access specific value from Map structure
        // but that particular value will be gone from the object & immediately it gives con-current modification exception.

        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(1,"Tom");
        hm.put(2,"Selenium");
        hm.put(3,"QA");
        hm.put(4, "TestComplete");

        System.out.println(hm.get(1));
        System.out.println(hm.get(4));

        for(Entry m : hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println(hm);
        hm.remove(3); //it doesn't maintain order
        System.out.println(hm);

        HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
        Employee e1 = new Employee("Tom",25, "Admin");
        Employee e2 = new Employee("Peter",26, "QA");
        Employee e3 = new Employee("Steve",27, "Dev");

        emp.put(1,e1);
        emp.put(2,e2);
        emp.put(3,e3);

        //traverse the hashmap

        for(Entry<Integer,Employee> m : emp.entrySet()){
            int key = m.getKey();
            Employee e = m.getValue();
            System.out.println("Employee " + key + " Info:");
            System.out.println(e.name+ " " +e.age+ " " + e.dept);
        }

    }
}
