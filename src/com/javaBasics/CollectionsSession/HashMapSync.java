package com.javaBasics.CollectionsSession;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {
    public static void main(String[] args){

        // https://www.youtube.com/watch?v=UwurUtvil7w&list=PLFGoYjJG_fqooGAq7UKpkXb8l4xjyEQUr&index=11&ab_channel=NaveenAutomationLabs

        // synchronizedMap method in collections:
        Map<String,String> mp1 = new HashMap<String,String>(); // simple hashmap
        mp1.put("1","Tom");
        mp1.put("2","Lisa");
        mp1.put("3","Steve");

        //create synchronized map: convert hashMap to SynchronizedHashMap
        Map<String,String> syncMap = Collections.synchronizedMap(mp1);
        System.out.println(syncMap);


        // Con-currentHashMap : It does not throw any ConcurrentModificationException
        ConcurrentHashMap<String,String> concurMap = new ConcurrentHashMap<String,String>();
        concurMap.put("A","Java");
        concurMap.put("B","Python");
        concurMap.put("C","Ruby");
        System.out.println(concurMap.get("A"));
    }
}
