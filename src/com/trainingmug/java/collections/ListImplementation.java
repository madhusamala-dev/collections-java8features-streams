package com.trainingmug.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListImplementation {

    public static void main(String[] args) {
        LinkedList<Customer> customerList = new LinkedList<>();
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

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);

        System.out.println(customerList.size());
        System.out.println(customerList);

        Customer firstCustomer = customerList.get(0);
        System.out.println(firstCustomer);
        CustomerService customerService = new CustomerService();
        for(Customer customer : customerList){
           // System.out.println(customer);
            customerService.displayCustomerDetails(customer);
        }
    }
}
