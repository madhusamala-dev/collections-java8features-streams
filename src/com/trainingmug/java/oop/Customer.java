package com.trainingmug.java.oop;

public class Customer {
    //state (data)
    //instance variables
    int id;
    public String name;
    String email;
    String contactNo;
    int salary;
    byte age;

    final static String VENDOR_NAME = "TrainingMug";
    final static String VENDOR_CONTACTNO = "+91-98689768";

    // constructors
    // no-arg
    public Customer(){
        System.out.println("Customer() is called..");
        id = 1111;
        name = "Customer1";
        email = "Customer1@gmail.com";
        contactNo = "+91-8987987";
        salary = 234234;
        age = 23;
    }
    /*alt+insert */
    public Customer(int id, String name, String email, String contactNo, int salary, byte age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.salary = salary;
        this.age = age;
        configuration();
    }

    private void configuration() {
        System.out.println("Some configuration after creating the object");
    }

    //behavior (methods)
    /*
    1. without returntype without parameters
     */

    public void displayCustomerDetails(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("E-mail : " + email);
        System.out.println("Contact No : " + contactNo);
        System.out.println("Salary : " + salary);
        System.out.println("Age : " + age);
    }

    /*
    2. without returntype with parameters
     */

    void displayProducts(String membershipType){
        //business logic
        System.out.println("Displaying Products for membership : " + membershipType);
    }
    /*
    3. with returntype without parameters
    age >= 60 discountPercentage = 30;
    40 - 60 , 20
    20-40 15
    5
     */
    byte discountPercentageByAge(){
        System.out.println("discountPercentageByAge() is called ...");
        byte discountPercentage = 0;
        if(age >= 60)
            discountPercentage = 30;
        else if(age >= 50 && age < 60)
            discountPercentage = 20;
        else if(age >= 20 && age < 40)
            discountPercentage = 15;
        else
            discountPercentage = 5;

        return discountPercentage;
    }

    /*
    4. With returntype and with parameters
    finalPrice after discount
    1. Product Price (parameter)
    2. discount Percentage
    3. Calculate Final Price ( productPrice - productPrice * discountPercentage / 100 )
    4. Return the final price
     */

    double finalProductPriceAfterDiscount(double productPrice){
        byte discountPercentage = discountPercentageByAge();
        return productPrice - (productPrice * discountPercentage) / 100;

    }

    static void displayVendorDetails(){
        System.out.println("Vendor Name : " + VENDOR_NAME);
        System.out.println("Vendor Contact No : " + VENDOR_CONTACTNO);
    }


}
