package com.trainingmug.java.oop.features;

public class RegularCustomer extends Customer{

    int cashbackPoints;

    public RegularCustomer() {
        super();
        System.out.println("RegularCustomer() is called.. ");
    }


    public RegularCustomer(int id, String name, String email, String contactNo, int salary, byte age, int cashbackPoints) {
        super(id, name, email, contactNo, salary, age);
        this.cashbackPoints = cashbackPoints;
    }

    void displayCustomerDetails(){
        super.displayCustomerDetails();
        System.out.println("Cash Back Points : " + cashbackPoints);
    }
}
