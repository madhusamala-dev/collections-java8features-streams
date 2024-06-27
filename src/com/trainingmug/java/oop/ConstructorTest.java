package com.trainingmug.java.oop;

public class ConstructorTest {
    static{
        System.out.println("static block");
    }
    public static void main(String[] args) {
        Customer customer1; // reference variable
        customer1 = new Customer();
        customer1.displayCustomerDetails();

        Customer customer2;
        customer2 = new Customer();
        customer2.displayCustomerDetails();

        Customer customer3 = new Customer(3333, "Customer3", "customer3@gmail.com", "+91-232323", 23232323, (byte) 35);
        customer3.displayCustomerDetails();
       /// System.out.println(customer3.vendorName); not recommended
        System.out.println("Vendor : " + Customer.VENDOR_NAME);
        //customer3.vendorName = "TrainingMug Pvt Ltd";

        System.out.println("Vendor : " + Customer.VENDOR_NAME);

        Customer.displayVendorDetails();
    }
}
