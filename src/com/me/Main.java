package com.me;

//directions
/*
- create a simple banking application
- need a bank class
- shoulsd have an arraylist of branches
- each branch should have an arraylist of customers
- the customer class should have an arraylist of doubles (transactions)
- customer; name, and the arraylist of doubles
- branch; need to be able to add a new customer nd initial transaction amount
- also needs to add additional transactions for that customer / branch
- bank; add a new branch, add a customer to that branch with initial transaction
- add a transaction for an existing customer for that branch
- show a list of customers for a particular branch and optionally a list
of their transactions
- demonstrate autoboxing, and unboxing
hint; transactions
- add data validation
- ex. check if exists, or does not exist, etc.
- think about where you are adding the code to perform certain actions
 */

public class Main {

    public static void main(String[] args) {

        //step 26 from bank class
        //creating a new object for the bnk class, an instance
        Bank bank = new Bank("Huntington Bank");

        //step 27 adding a branch
        if (bank.addBranch("Berea")) {
            System.out.println("Berea branch created");

        }

        //step 28 adding customers to branch
        bank.addCustomer("Berea", "Patrick", 150.98);
        bank.addCustomer("Berea", "Aimee", 500.21);
        bank.addCustomer("Berea", "Norbit", 112.53);

        //step 29 making another different branch
        bank.addBranch("Strongsville");

        //step 30 adding customers to the strongsville branch
        bank.addCustomer("Strongsville", "Nancy", 387.56);
        bank.addCustomer("Strongsville", "Mary", 58.90);
        bank.addCustomer("Strongsville", "Amber", 209.13);

        //step 31 adding transactions
        bank.addCustomerTransaction("Berea", "Aimee", 50.99);
        bank.addCustomerTransaction("Berea", "Aimee", 10.50);
        bank.addCustomerTransaction("Berea", "Norbit", 25.25);

        //step 32 calling the list
        bank.listCustomer("Berea", false);

        //step 33 run this!!!
        /*
        results;
        Customer details for branch Berea
        Customer: Patrick[1]
        Customer: Aimee[2]
        Customer: Norbit[3]
         */

        System.out.println("-------------------------------------------------");

        //step 34 run with true
        bank.listCustomer("Berea", true);
        /*
        results;
        Customer details for branch Berea
        Customer: Patrick[1]
        Transactions
        [1] Amount 150.98
        Customer: Aimee[2]
        Transactions
        [1] Amount 500.21
        [2] Amount 50.99
        [3] Amount 10.5
        Customer: Norbit[3]
        Transactions
        [1] Amount 112.53
        [2] Amount 25.25
         */

        System.out.println("--------------------------------------------------");

        //step 35
        bank.listCustomer("Strongsville", true);
        /*
        results;
        Customer details for branch Strongsville
        Customer: Nancy[1]
        Transactions
        [1] Amount 387.56
        Customer: Mary[2]
        Transactions
        [1] Amount 58.9
        Customer: Amber[3]
        Transactions
        [1] Amount 209.13
         */

        System.out.println("------------------------------------------------");

        //step 37 adding branch to see if error goes away
        bank.addBranch("Parma");
        //error from below does go away

        //step 36 test this
        if (!bank.addCustomer("Parma", "Teena", 678.90)) {
            System.out.println("Error, the Parma Branch DOES NOT EXIST");
            /*
            result;
            Error, the Parma Branch DOES NOT EXIST
             */
        }

        System.out.println("-------------------------------------------------------");

        //step 38 checking a branch
        if (!bank.addBranch("Berea")) {
            System.out.println("The Berea branch already exists");
        }


        System.out.println("-----------------------------------------------------");

        //step 39 testing a transaction for someone whom don't exist
        if (!bank.addCustomerTransaction("Berea", "Karis", 125.50)) {
            System.out.println("Customer DOES NOT EXIST at branch");
            //result; Customer DOES NOT EXIST at branch

        }

        System.out.println("-----------------------------------------------------------");

        //step 40 testing to add a customer that already exists
        if (!bank.addCustomer("Bera", "Patrick", 67.90)) {
            System.out.println("Customer Patrick already exists at branch");
            //result; Customer Patrick already exists at branch

        }


    }

}





