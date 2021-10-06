package com.company;

import java.util.ArrayList;

public class Main {

    static ArrayList<Customer> arrayOfCustomers = new ArrayList<>();

    public static void main(String[] args) {

        addCustomer();
        printCustomers();

    }

    public static void addCustomer() {
        Customer a1 = new Customer("Louise", "Abcdefg");
        Customer a2 = new Customer("Lars", "12345");
        Customer a3 = new Customer("Nicklas", "qwert");
        Customer a4 = new Customer("Carl", "trewq");
        Customer a5 = new Customer("Oliver", "username;)");
        Customer a6 = new Customer("Lasse", "Ost");

        arrayOfCustomers.add(a1);
        arrayOfCustomers.add(a2);
        arrayOfCustomers.add(a3);
        arrayOfCustomers.add(a4);
        arrayOfCustomers.add(a5);
        arrayOfCustomers.add(a6);


    }
    public static void printCustomers() {
        for (Customer Customer : arrayOfCustomers) {
            System.out.println("hello " + Customer.getFristName() + " your username is: " + Customer.getUsername());
        }
    }
    //private void print(){
    //  System.out.println("hello " +a1.toString() + " your username is: " + getUsername().toString());
}


