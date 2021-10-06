package com.company;

public class Customer {

    String fristName;
    //String lanstName;
    String username;
    //int id;

    public Customer(String firstNameX, String usernameX) {
        this.fristName = firstNameX;
        //this.lanstName=lastNameX;
        this.username = usernameX;
        // this.id=idX;
        //print();
    }

    private void print() {
        System.out.println("hello " + getFristName() + " your username is: " + getUsername());
    }

    public String getFristName() {
        return fristName;
    }

    public String getUsername() {
        return username;
    }


}
