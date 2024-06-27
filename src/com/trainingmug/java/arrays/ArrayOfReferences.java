package com.trainingmug.java.arrays;

import com.trainingmug.java.oop.Customer;

public class ArrayOfReferences {

    public static void main(String[] args) {
        /*Customer[] customers;
        customers = new Customer[3];
        System.out.println(customers[0]);
        customers[0] = new Customer();
        customers[1] = new Customer(222, "Customer2", "customer2@gmail.com", "+91-232323", 23232323, (byte) 35);
        customers[2] = new Customer(333, "Customer3", "customer3@gmail.com", "+91-4523423", 453453, (byte) 45);
    */
        Customer[] customers = {new Customer(),
                new Customer(222, "Customer2", "customer2@gmail.com", "+91-232323", 23232323, (byte) 35),
                new Customer(333, "Customer3", "customer3@gmail.com", "+91-4523423", 453453, (byte) 45)};
        System.out.println(customers.length);

        for(Customer customer : customers){
            customer.name = customer.name.toUpperCase();
            customer.displayCustomerDetails();
        }




    }
}
