package com.me;

import java.util.ArrayList;

//step 16 make this class
public class Bank {

    //step 17 create fields
    private String name;
    private ArrayList<Branch> branches;

    //step 18 create constructor
    public Bank(String name) {
        this.name = name;

        //step 19 initialize arraylist
        this.branches = new ArrayList<Branch>();

    }

    //step 20 create method for adding branch
    public boolean addBranch(String branchName) {

        if (findBranch(branchName)==null) {   //error on findBranch when created this, will need findBranch method
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;

    }

    //step 21 method for add customer
    public boolean addCustomer(String branchName, String customerName, double initialAmount) {

        Branch branch = findBranch(branchName); //testing to see if branch is on file
        if (branch!=null) {
            return branch.newCustomer(customerName, initialAmount);

        }

        return false;

    }

    //step 22 method for adding customer transaction
    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);  //note findBranch method to create to remove error
        if (branch!=null) {
            return branch.addCustomerTransaction(customerName, amount);

        }

        return false;

    }

    //step 23 add findBranch method
    private Branch findBranch(String branchName) {

        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i); //going through each branch in arraylist

            //checking each customer name
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }

        }

        return null;  //means that there were no matches

    }

    //step 24 list customers methods(purpose is to list all customers for a given branch)
    //and optionally all the transactions for those customers in those branches
    public boolean listCustomer(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);

        if (branch!=null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers(); //had to add a getter for this in branch class
                                                                        //step 25 in branch class
            for (int i = 0; i < branchCustomers.size(); i++) {  //getting a list of all customers for a particular branch

                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                if (showTransactions) {   //if true showing a list of transactions for all customers
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));

                    }

                }

            }

            return true;

        } else {

            return false;

        }

    }

}

//step //step 26 go to main
