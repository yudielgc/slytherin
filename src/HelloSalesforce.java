package com.salesforce.slytherin;

import com.salesforce.hufflepuff.*;

public class HelloSalesforce {

    public static void main(String[] args) {
    	Team team = new Team("Slytherin");
        System.out.println("Hello, Salesforce");
        System.out.println("My favorite team is " + team.getName());
        System.out.println("Hello, Salesforce");
    }

}