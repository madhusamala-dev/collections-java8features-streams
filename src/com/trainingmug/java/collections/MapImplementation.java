package com.trainingmug.java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapImplementation {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setId(111);
        customer1.setName("customer1");
        customer1.setEmail("customer1@gmail.com");

        Customer customer2 = new Customer();
        customer2.setId(222);
        customer2.setName("customer2");
        customer2.setEmail("customer2@gmail.com");

        Customer customer3 = new Customer();
        customer3.setId(333);
        customer3.setName("customer3");
        customer3.setEmail("customer3@gmail.com");

        Customer customer4 = new Customer();
        customer4.setId(333);
        customer4.setName("customer3");
        customer4.setEmail("customer3@gmail.com");
        TreeMap<Integer,Customer> customerMap = new TreeMap<>();
        customerMap.put(333,customer3);
        customerMap.put(222,customer2);
        customerMap.put(111,customer1);
        customerMap.put(333,customer4);

        System.out.println(customerMap);

        System.out.println(customerMap.get(222));
    }
}
