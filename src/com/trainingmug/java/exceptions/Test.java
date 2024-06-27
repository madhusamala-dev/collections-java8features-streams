package com.trainingmug.java.exceptions;

public class Test {
    public static void main(String[] args) {
        String username = null;
        String password = "trainingmug@123";
        boolean isValid = false;
        try {
            if(isValid(username, password))
            System.out.println("Valid user");
        } catch(NullPointerException e){
            System.out.println("username or password is null");
        } catch(InvalidUserException e){
            System.out.println(e.getMessage());
        }

    }

    private static boolean isValid(String username, String password) throws NullPointerException, InvalidUserException {
        boolean isValid = false;
            if (username.equalsIgnoreCase("trainingmug") && password.equals("trainingmug@123"))
                isValid = true;
            else
                throw new InvalidUserException("wrong username or password");
        return isValid;
    }

}
