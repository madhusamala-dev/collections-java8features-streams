package com.trainingmug.java.strings;

import com.trainingmug.java.oop.Customer;

public class StringTest {

    public static void main(String[] args) {
        //String object
        //String literal
        String str1 = new String();
        System.out.println(str1);
        String str2 = new String("trainingmug");
        System.out.println(str2);
        String str3 = new String("trainingmug");

        System.out.println(str2.charAt(2));
        System.out.println(str2.length());
        boolean isValid = false;
        int length = str2.length();
        if(length >= 4 && length <= 30)
           isValid = true;

        System.out.println(isValid);

        //String literal
        String username = "    TrainingMug   ";
        String username2 = "trainingmug";
        System.out.println(username == username2);
        System.out.println(str2 == str3);

        System.out.println(username.compareTo(str2));
        String password = "training@123";
        boolean isLoginSuccess = false;
        if(username.trim().equalsIgnoreCase("trainingmug") && password.equals("training@123"))
            isLoginSuccess = true;

        System.out.println("Login Sucesss ? " + isLoginSuccess);

        username = username.toLowerCase();
        System.out.println(username);
        //CSV files (comma separated values)
        String empDetails = "111,customer1,customer1@gmail.com,786876,7655,35";
       String[] values =  empDetails.split(",");


       for(String value : values){
           System.out.println(value);
       }
    }
}
