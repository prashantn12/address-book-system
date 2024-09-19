package com.addressbooksystem;
import java.util.*;


public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        boolean running = true;

        while (running) {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add a new contact");
            System.out.println("2. Edit a contact");
            System.out.println("3. Delete a contact");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // UC2: Add a new contact
                    System.out.println("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.println("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.println("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.println("Enter State: ");
                    String state = scanner.nextLine();
                    System.out.println("Enter Zip: ");
                    String zip = scanner.nextLine();
                    System.out.println("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Enter Email: ");
                    String email = scanner.nextLine();

                    Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    addressBook.addContact(newContact);
                    break;

                case 3:
                    // UC3: Edit a contact
                    System.out.println("Enter the First Name of the contact to edit: ");
                    String editFirstName = scanner.nextLine();
                    System.out.println("Enter the Last Name of the contact to edit: ");
                    String editLastName = scanner.nextLine();
                    addressBook.editContact(editFirstName, editLastName, scanner);
                    break;

                case 4:
                    // UC4: Delete a contact
                    System.out.println("Enter the First Name of the contact to delete: ");
                    String deleteFirstName = scanner.nextLine();
                    System.out.println("Enter the Last Name of the contact to delete: ");
                    String deleteLastName = scanner.nextLine();
                    addressBook.deleteContact(deleteFirstName, deleteLastName);
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
