package com.me;


import java.util.ArrayList;

//step 8, making this class
public class Branch {

    //step 9 fields
    private String name;
    private ArrayList<Customer> customers;

    //step 10 constructor
    public Branch(String name) {
        this.name = name;

        //step 11 initialize arraylist
        this.customers = new ArrayList<Customer>();

    }

    //step 12 getter
    public String getName() {
        return name;

    }

    //step 13 method for new customer, boolean b/c it will varify if customer exists
    public boolean newCustomer(String customerName, double initialAmount) {

        if (findCustomer(customerName)==null) {  //initial use of findCustomer is error,
                                                // until method is created
            this.customers.add(new Customer(customerName, initialAmount));
            return true;

        }

        return false;

    }

    //step 14 method to add customer transaction
    public boolean addCustomerTransaction(String customerName, double amount) {

        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer!=null) {
            existingCustomer.addTransaction(amount);
            return true;

        }

        return false;

    }

    //step 15 find customer method
    private Customer findCustomer(String customerName) {

        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i); //going through each customer in arraylist

            //checking each customer name
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }

        }

        return null;  //means that there were no matches

        //step 16 create bank class

    }

}

