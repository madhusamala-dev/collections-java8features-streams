package com.trainingmug.java.oop.features.abstraction;



public class Main {
    public static void main(String[] args) {
        Customer customer2 = new Customer(2222, "Customer2", "customer2@gmail.com", "+91-232323", 23232323, (byte) 35);
        /*CustomerService customerService = new CustomerService();
        customerService.addCustomertoDb(customer2); */
        MySQLRepository repository = new MySQLRepository();
        PostGreSQLRepository repository1 = new PostGreSQLRepository();
        CustomerServiceImpl customerService = new CustomerServiceImpl(repository1);
        customerService.addCustomertoDb(customer2);
        customerService.displayCustomerDetails(customer2);
    }
}
