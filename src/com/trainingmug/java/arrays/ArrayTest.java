package com.trainingmug.java.arrays;

public class ArrayTest {
    public static void main(String[] args) {
        // Arrays are objects in Java
        // 1. Array declaration
        int[] ids; // reference variable ( no array will be created here )
        // 2. Array Instantiation (creating an object)
        ids = new int[5];
        System.out.println(ids[4]);
        //3. Initialize
        ids[0] = 111;
        ids[1] = 222;
        ids[2] = 333;
        ids[3] = 444;
        ids[4] = 555;


        // shortcut array
        byte[] marks = {75,45,56,57,57,45};
        System.out.println(marks.length);

        //4. Accessing elements
        for(int index = 0 ; index < marks.length ; index++){
            System.out.print(marks[index] + " ");
        }

        //for-each element in array
        //for each id in ids
        for(int id : ids){
            System.out.println(id);
        }
        /*
        for(byte mark : marks){
            mark += 5;
            System.out.print( mark + " ");
        }*/
        for(int index = 0 ; index < marks.length ; index++){
            marks[index] += 5;
        }

        System.out.println("\nAfter updating marks");
        for(byte mark : marks){
            System.out.print (mark + " ");
        }

    }
}
