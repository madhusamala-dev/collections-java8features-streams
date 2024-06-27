package com.trainingmug.java.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {

    public static  void main(String[] args) {
        //Predicate

        // number is even or odd
        Predicate<Integer> isEvenPredicate = num -> num % 2 == 0 ;
        System.out.println(isEvenPredicate.test(101));

        //Consumer
        //accept(Object)

        List<String> customerNamesList = Arrays.asList("customer1", "customer2","customer3");

      //  Consumer<String> printNameConsumer = name -> System.out.println(name);
      //  customerNamesList.forEach(printNameConsumer);
        //using lambda expression without method reference
        customerNamesList.forEach(name -> System.out.println(name));

        //using lambda expression with method reference
        customerNamesList.forEach(System.out::println);

        Function<String,String> upperCaseFunction = name -> {
            name = name.toUpperCase();
            return name;
        } ;

        customerNamesList.forEach(name -> System.out.println(upperCaseFunction.apply(name)));
        for (String name : customerNamesList) {
            System.out.println(name);
        }

    }

}
