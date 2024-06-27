package com.trainingmug.java.java8features;

public class Main {
    public static void main(String[] args) {

        Greeting greeting = new Greeting();
        greeting.greet();
        greeting.greet("Hello, How are you ! Welcome to 30 days full stack fundamentals");

        /*
        1. Anonymous inner class
        2. Object to the inner class
         */
        Greet greet = new Greet() {
            @Override
            public void greet() {
                System.out.println("Greet");
            }

            @Override
            public void greet(String msg) {
                System.out.println("Greet(String)");
            }
        };

        greet.greet();
        greet.greet("Hello");

        //Threading
        //Runnable -> run
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        //lambda expression
        // is the implementation of functional interfaces (instance of the functional interface)
        //syntax
        /*
        () -> { logic }
         */
        /*
        Hello hello = new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Hey, How are you !");
            }
        };*/


        Hello hello = (helloMsg) -> System.out.println(helloMsg);
        hello.sayHello("Hey, How are you !");




    }
}
