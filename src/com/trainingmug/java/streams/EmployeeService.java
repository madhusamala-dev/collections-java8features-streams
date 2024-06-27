package com.trainingmug.java.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees(){
        return this.employeeRepository.getEmployees();
    }

    public List<Employee> filterBySalary(double minSalary){
        //Intermediate operations
        // filter (intermedidate)
        return this.employeeRepository.getEmployees().stream()
                .filter(employee -> employee.getSalary() >= minSalary)
                .collect(Collectors.toList());


    }

    public void displayEmployeeDetails(){
        this.employeeRepository.getEmployees().stream().forEach(employee -> {
            System.out.println("Id : " + employee.getId());
            System.out.println("Name : " + employee.getName());
        });
    }

    public List<String> getAllEmployeeEmails(){
       return this.employeeRepository.getEmployees().stream().map(Employee::getEmail).collect(Collectors.toList());
    }

    public Employee getEmployeeById(int id) throws EmployeeNotFoundException {
        Optional<Employee> optional = this.employeeRepository.getEmployeeById(id);
        if(optional.isPresent())
            return optional.get();
        else
            throw new EmployeeNotFoundException("Employee Not Found with Id : " + id);
    }

    //use case methods
}
