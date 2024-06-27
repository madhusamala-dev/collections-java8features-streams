package com.trainingmug.java.java8features;

//Functional interfaces are used for simplifying anonymous inner classes especially in functional programming
@FunctionalInterface
public interface Hello {
    void sayHello(String helloMsg);  // single abstract method (SAM)

}
