package com.trainingmug.java.oop.features.abstraction;

public class PostGreSQLRepository implements Repository{
    @Override
    public void connectToDb() {
        System.out.println("connect : PostGreSQL");
    }

    @Override
    public void addCustomerToDb(Customer customer) {
        System.out.println("customer: PostGreSQL");
    }
}
