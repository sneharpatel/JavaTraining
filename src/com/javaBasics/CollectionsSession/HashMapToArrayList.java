package com.javaBasics.CollectionsSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapToArrayList {
    public static void main(String[] args){
        HashMap<String,Integer> compMap = new HashMap<String,Integer>();
        compMap.put("Walmart", 10000);
        compMap.put("Amazon", 20000);
        compMap.put("Facebook", 30000);
        compMap.put("Google", 40000);
        compMap.put("Cisco", 5000);
        System.out.println("Size of compMap is " + compMap.size());
        Iterator it = compMap.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry pairs = (Map.Entry)it.next();
            System.out.println(pairs.getKey() + " = " + pairs.getValue());
        }

        //Convert HashMap keys to ArrayList
        System.out.println("*** HashMap keys to ArrayList ***");
        ArrayList<String> compList = new ArrayList<String>(compMap.keySet());
        System.out.println(compList); // print company name in array form
        // print company names in separate row
        System.out.println("*******");
        for(String t : compList){
            System.out.println(t);
        }

        // Convert HashMap values to ArrayList
        System.out.println("*** Hashmap Values to ArrayList ***");
        ArrayList<Integer> empValuesList = new ArrayList<Integer>(compMap.values());
        System.out.println(empValuesList); // print company name in array form
        // print Employees numbers in separate row
        System.out.println("*******");
        for(Integer e : empValuesList){
            System.out.println(e);

        }




    }
}
