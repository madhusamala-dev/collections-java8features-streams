package com.trainingmug.java.oop.features;

import java.util.List;

public class Customer {

    int id;
    public String name;
    String email;
    String contactNo;
    int salary;
    byte age;

    public Customer() {
        System.out.println("Customer() is called....");
    }

    public Customer(int id, String name, String email, String contactNo, int salary, byte age) {
        System.out.println("Customer(int,String,String,String,int,byte) is called...");
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.salary = salary;
        this.age = age;
    }

     void displayCustomerDetails(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("E-mail : " + email);
        System.out.println("Contact No : " + contactNo);
        System.out.println("Salary : " + salary);
        System.out.println("Age : " + age);
    }
    /*
    void displayCustomerDetails(int fromAge,int toAge){

    }

    List<Customer> getCustomers(){

    }

    List<Customer> getCustomers(int fromAge, int toAge){

    }
    List<Customer> getCustomers(String location){

    }
    List<Customer> getCustomers(String membershipType){

    } */
}
