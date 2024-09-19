package com.addressbooksystem;
import java.util.*;

class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    // Constructor for Contact
    public Contact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Display Contact Details
    public void displayContact() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip: " + zip);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}
