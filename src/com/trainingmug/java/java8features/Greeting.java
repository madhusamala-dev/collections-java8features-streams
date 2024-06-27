package com.trainingmug.java.java8features;

public class Greeting implements Greet{
    @Override
    public void greet() {
        System.out.println("Hello, Welcome to TrainingMug !");
    }

    @Override
    public void greet(String msg) {
        System.out.println(msg);
    }
}
