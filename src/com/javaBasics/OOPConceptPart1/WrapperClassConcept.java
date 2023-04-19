package com.javaBasics.OOPConceptPart1;

public class WrapperClassConcept {
    public static void main(String[] args){
        String x = "100";
        System.out.println(x+20);

        // data conversion --> String into Integer conversion
        int i = Integer.parseInt(x);
        System.out.println(i+20);

        // Integer, Double,Boolean
        //String to Double conversion

        String y = "12.33";
        double j = Double.parseDouble(y);
        System.out.println(j+20);

        //String to boolean conversion
        String z = "true";
        boolean b = Boolean.parseBoolean(z);
        System.out.println(b);

        // int to string conversion

        int k = 200;
        System.out.println(k+20);

        String s1 = String.valueOf(k); //"200"
        System.out.println(s1+20);

        String u = "100A"; // for str -->int conversion string should be in pure numeric form
        Integer.parseInt(u); // will give an error: NumberFormatException --> for input string 100A



    }
}
