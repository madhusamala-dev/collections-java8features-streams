package com.trainingmug.java.collections;

public class CustomerService {

    void displayCustomerDetails(Customer customer){
        System.out.println("Id : " + customer.getId());
        System.out.println("Name : " + customer.getName());
        System.out.println("E-mail: " + customer.getEmail());
    }
}
