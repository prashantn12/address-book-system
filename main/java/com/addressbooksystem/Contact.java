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

class AddressBook {
    private Contact[] contacts;
    private int contactCount;
    private final int MAX_CONTACTS = 100;

    // Constructor for AddressBook
    public AddressBook() {
        contacts = new Contact[MAX_CONTACTS];
        contactCount = 0;
    }

    // UC1 & UC2: Add new contact to the address book
    public void addContact(Contact contact) {
        if (contactCount < MAX_CONTACTS) {
            contacts[contactCount] = contact;
            contactCount++;
            System.out.println("Contact added successfully!");
        } else {
            System.out.println("Address book is full.");
        }
    }


    // UC3: Edit existing contact by name
    public void editContact(String firstName, String lastName, Scanner scanner) {
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i].firstName.equalsIgnoreCase(firstName) && contacts[i].lastName.equalsIgnoreCase(lastName)) {
                System.out.println("Enter new address: ");
                contacts[i].address = scanner.nextLine();
                System.out.println("Enter new city: ");
                contacts[i].city = scanner.nextLine();
                System.out.println("Enter new state: ");
                contacts[i].state = scanner.nextLine();
                System.out.println("Enter new zip: ");
                contacts[i].zip = scanner.nextLine();
                System.out.println("Enter new phone number: ");
                contacts[i].phoneNumber = scanner.nextLine();
                System.out.println("Enter new email: ");
                contacts[i].email = scanner.nextLine();
                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // UC4: Delete a contact by name
    public void deleteContact(String firstName, String lastName) {
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i].firstName.equalsIgnoreCase(firstName) && contacts[i].lastName.equalsIgnoreCase(lastName)) {
                for (int j = i; j < contactCount - 1; j++) {
                    contacts[j] = contacts[j + 1];  // Shift contacts to fill the gap
                }
                contacts[--contactCount] = null;
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("Contact not found.");

    }
}
