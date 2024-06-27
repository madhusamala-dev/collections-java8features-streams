package com.trainingmug.java.oop.features.abstraction;

public class MySQLRepository implements Repository{

    @Override
    public void connectToDb() {
        System.out.println("connect : mysql");
    }

    @Override
    public void addCustomerToDb(Customer customer) {
        System.out.println("customer: mysql");
    }
}
