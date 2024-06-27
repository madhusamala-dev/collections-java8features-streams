package com.trainingmug.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetImplementation {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setId(111);
        customer1.setName("customer5");
        customer1.setEmail("customer1@gmail.com");

        Customer customer2 = new Customer();
        customer2.setId(222);
        customer2.setName("customer2");
        customer2.setEmail("customer2@gmail.com");

        Customer customer3 = new Customer();
        customer3.setId(333);
        customer3.setName("customer4");
        customer3.setEmail("customer3@gmail.com");

        Customer customer4 = new Customer();
        customer4.setId(333);
        customer4.setName("customer3");
        customer4.setEmail("customer3@gmail.com");


        System.out.println(customer1);
        System.out.println("Id :" + customer1.getId());

    /*
        TreeSet<String> set = new TreeSet<>();
        set.add("trainingmug");
        set.add("x");
        set.add("hyrecruitai");
        set.add("madhusamala");
        set.add("trainingmug");
        System.out.println(set.size());

        System.out.println(set);
        for (String str : set) {
            System.out.println(str);
        } */
        TreeSet<Customer> customerSet = new TreeSet<>();
        customerSet.add(customer1);
        customerSet.add(customer2);
        customerSet.add(customer3);
        customerSet.add(customer4);


        System.out.println(customerSet);
        System.out.println(customerSet.size());
    }
}
