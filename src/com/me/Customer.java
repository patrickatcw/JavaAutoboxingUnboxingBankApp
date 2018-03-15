package com.me;

import java.util.ArrayList;

//step 1 make this class
public class Customer {

    //step 2 create fields
    private String name;
    private ArrayList<Double> transactions;

    //step 3 create constructor
    public Customer(String name, double initialAmount) {
        this.name = name;

        //step 5 initialize transactions
        this.transactions = new ArrayList<Double>();

        //step 6 adding this to arraylist
        addTransaction(initialAmount);  //passing initial amount and adding to arraylist

    }

    //step 4 add method for transaction
    public void addTransaction(double amount) {
        this.transactions.add(amount);

    }

    //step 7 create getter
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;

        //next step, step 8 is to create the Branch class

    }

}
