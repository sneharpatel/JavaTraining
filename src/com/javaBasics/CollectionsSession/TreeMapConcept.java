package com.javaBasics.CollectionsSession;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapConcept {
    public static void main(String[] args){
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(10000,"Tom");
        map.put(7000,"Peter");
        map.put(5000,"Steve");
        map.put(6000,"John");
        map.put(2500,"Lisa");

        map.forEach((k,v) -> System.out.println("key = " + k + ", " + "Value = " + v));

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        Set<Integer> keyLessThan3k = map.headMap(5000).keySet();
        System.out.println(keyLessThan3k);

        Set<Integer> keyGreaterThan3k = map.tailMap(5000).keySet();
        System.out.println(keyGreaterThan3k);


        TreeMap<String,Integer> map1 = new TreeMap<>();
        map1.put("James",100);
        map1.put("Brad",200);
        map1.put("Albert",300);
        map1.put("George",400);
        map1.put("Larry",50);
        map1.put("Ted",120);
        map1.put("Paul",300);

        map1.forEach((k,v) -> System.out.println("key = " + k + ", " + "value = " + v));

        TreeMap<Integer,String> map2 = new TreeMap<>(Comparator.reverseOrder());
        map2.put(10000,"Tom");
        map2.put(7000,"Peter");
        map2.put(5000,"Steve");
        map2.put(6000,"John");
        map2.put(2500,"Lisa");

        System.out.println(map2);






    }
}
