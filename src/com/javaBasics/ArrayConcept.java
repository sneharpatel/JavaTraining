package com.javaBasics;

public class ArrayConcept {
    public static void main(String[] args){
        // array: is to store the similar data type values in an array variable
        // 1. int array
        //2. lowest bound/index = 0
        //3. upper bound/index = n-1 (where n is size of array)

        //one dimension array
        // Dis adv of one dim array:
        //1. Size is fixed -- static array ---> To overcome we use Collections:
        // ArrayList, HashTable -- dynamic array
        //2. Stores only similar data type values ----> To overcome this problem,
        // we use object array

        int i[] = new int[4];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        System.out.println(i[2]);
        System.out.println(i[3]);

        /* important INTERVIEW question:
         WHAT IS ARRAY INDEX THAT DOESN'T EXIST? ==> IT WILL THROW an error:
        ArrayIndexOutOfBoundException: 4  */
        //System.out.println(i[4]);

        System.out.println(i.length); // size/length of array

        // print all the values of array: use for loop

        for(int j=0; j<i.length; j++){
            System.out.println(i[j]);
        }

        //2. double array
        double d[] = new double[3];
        d[0] = 12.22;
        d[1] = 14.44;
        d[2] = 23.33;
        System.out.println(d[2]);

        //3. char array
        char c[] = new char[3];
        c[0] = 'q';
        c[1] = '2';
        c[2] = '$';

        //4. boolean array
        boolean b[] = new boolean[2];
        b[0] = true;
        b[1] = false;

        //5.String array
        String s[] = new String[3];
        s[0] = "Java";
        s[1] = "Hello";
        s[2] = "World";
        System.out.println(s.length);
        System.out.println(s[2]);

        //6.Object array (Object is a class)- is used to store different data types value
        Object ob[] = new Object[6];
        ob[0] = "Tom";
        ob[1] = "25";
        ob[2] = "12.33";
        ob[3] = "01/01/1990";
        ob[4] = "M";
        ob[5] = "London";

        System.out.println(ob[5]);
        System.out.println(ob.length);



    }
}
