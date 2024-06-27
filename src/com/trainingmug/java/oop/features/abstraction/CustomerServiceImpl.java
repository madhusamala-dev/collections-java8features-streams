package com.trainingmug.java.oop.features.abstraction;

public class CustomerServiceImpl extends CustomerService{

    Repository repository;

    public CustomerServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    void addCustomertoDb(Customer customer) {
        repository.connectToDb();
        repository.addCustomerToDb(customer);
    }
}
