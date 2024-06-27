package com.trainingmug.java.exceptions;

import java.util.Scanner;

public class ExceptionsTest {
    static String username;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no:");
        int no1 = scanner.nextInt();
        System.out.println("Enter a no :");
        int no2 = scanner.nextInt();
        try {
            int res = no1 / no2;
            System.out.println("Result : " + res);
            // (int) = (int) / (int);
            int[] ids = {1,2,3};
            System.out.println(ids[2]);

            System.out.println(username.equals("trainingmug"));
        } /*catch(ArithmeticException e){
            System.out.println("no shouldn't be zero");
            System.out.println("Please enter the input again !");
            input();
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index should be in between 0-2");
            input();
        } catch(NullPointerException e){
            System.out.println("username shouldn't be null");
        } */ catch(Exception e){
            System.out.println("some internal error occurred, Please try again !");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("hello world");
    }

    private static void input() {
        System.out.println("input goes here");
    }
}
