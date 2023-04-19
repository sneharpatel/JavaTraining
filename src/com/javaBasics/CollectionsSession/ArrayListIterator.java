package com.javaBasics.CollectionsSession;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {
    public static void main(String[] args){
        ArrayList<String> tvSeries = new ArrayList<String>();
        tvSeries.add("Game of Thrones");
        tvSeries.add("Breaking Bad");
        tvSeries.add("The Big Bang Theory");
        tvSeries.add("The Walking Dead");
        tvSeries.add("Prison Break");

        // 1. using java 8 with for each loop and lambda expression:
        System.out.println("------ 1.print for each loop with lambda using java 8 ------");
        tvSeries.forEach(show -> {
            System.out.println(show);
                });

        // 2. using iterator:
        System.out.println("------ 2. print using iterator ------");
        Iterator<String> it = tvSeries.iterator();
        while(it.hasNext()){
            String show = it.next();
            System.out.println(show);
        }

        // 3. using iterator and java 8 forEachRemaining() method
        System.out.println("------ 3. print using iterator and java 8 forEachRemaining() method ------");
        it = tvSeries.iterator();
        it.forEachRemaining(show ->{
            System.out.println(show);
                });

        // 4. using for each loop
        System.out.println("------ 4. print using for each loop ------");
        for(String show : tvSeries){
            System.out.println(show);
        }

        // 5. using for loop with index/order
        System.out.println("------ 5. print using for loop with index/order ------");
        for(int i=0; i<tvSeries.size(); i++){
            System.out.println(tvSeries.get(i));
        }

        // 6.using a listIterator to traverse in both directions
//        System.out.println("------ 6. print using a listIterator to traverse in both directions ------");
//        ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
//        while(tvSeriesListIterator.hasPrevious()){
//            String show = tvSeriesListIterator.hasPrevious();
//            System.out.println(show);
//        }


    }
}
