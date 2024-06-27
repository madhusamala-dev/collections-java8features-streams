package com.trainingmug.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeRepository {

    private List<Employee> employeeList;

    public EmployeeRepository() {
        this.employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Alice Smith", "alice.smith@example.com", "Engineering", 85000, 30));
        employeeList.add(new Employee(2, "Bob Johnson", "bob.johnson@example.com", "Marketing", 75000, 28));
        employeeList.add(new Employee(3, "Charlie Brown", "charlie.brown@example.com", "Sales", 70000, 35));
        employeeList.add(new Employee(4, "David Wilson", "david.wilson@example.com", "HR", 65000, 40));
        employeeList.add(new Employee(5, "Eva White", "eva.white@example.com", "Finance", 90000, 32));
        employeeList.add(new Employee(6, "Frank Green", "frank.green@example.com", "Engineering", 80000, 29));
        employeeList.add(new Employee(7, "Grace Lee", "grace.lee@example.com", "Marketing", 77000, 27));
        employeeList.add(new Employee(8, "Hank Adams", "hank.adams@example.com", "Sales", 72000, 36));
        employeeList.add(new Employee(9, "Ivy Clark", "ivy.clark@example.com", "HR", 67000, 42));
        employeeList.add(new Employee(10, "Jack Lewis", "jack.lewis@example.com", "Finance", 92000, 31));

    }

    public List<Employee> getEmployees(){
        return this.employeeList;
    }

    public Optional<Employee> getEmployeeById(int id){
        return this.employeeList.stream().filter(employee -> employee.getId() == id).findFirst();
    }


}
