package com.trainingmug.java.oop.features;

public class PremiumCustomer extends Customer{

     String membershipType;

    public PremiumCustomer() {
    }

    public PremiumCustomer(int id, String name, String email, String contactNo, int salary, byte age, String membershipType) {
        super(id, name, email, contactNo, salary, age);
        this.membershipType = membershipType;
    }

    void displayCustomerDetails(){
        super.displayCustomerDetails();
        System.out.println("Membership Type : " + membershipType);
    }
}
