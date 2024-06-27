package com.trainingmug.java.oop.features.abstraction;

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
}
