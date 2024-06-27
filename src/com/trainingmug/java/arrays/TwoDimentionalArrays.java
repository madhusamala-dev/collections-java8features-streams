package com.trainingmug.java.arrays;

public class TwoDimentionalArrays {
    public static void main(String[] args) {
        /*int[][] twoD;
        twoD = new int[2][2];*/
        int[][] twoD = { {1,2,3,4}, {4,5,6}};

        for(int[] oneD : twoD){
            for(int value : oneD){
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}
