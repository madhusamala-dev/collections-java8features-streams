package com.trainingmug.java.oop.features;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        //customer.displayCustomerDetails();

        Customer customer2 = new Customer(2222, "Customer2", "customer2@gmail.com", "+91-232323", 23232323, (byte) 35);
       // customer2.displayCustomerDetails();

        RegularCustomer regularCustomer = new RegularCustomer(3333, "Customer3", "customer3@gmail.com", "+91-232323", 23232323, (byte) 35,876);
        //regularCustomer.displayCustomerDetails();

        PremiumCustomer premiumCustomer = new PremiumCustomer(4444, "Customer4", "customer4@gmail.com", "+91-232323", 23232323, (byte) 35, "Gold");
        //premiumCustomer.displayCustomerDetails();

        CustomerService customerService = new CustomerService();
        customerService.displayCustomerDetails(premiumCustomer);
    }
}
