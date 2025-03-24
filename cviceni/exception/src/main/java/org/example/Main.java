package org.example;
import java.util.Collections;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidNameException, InvalidPhoneNumberException {
//        Scanner scanner = new Scanner(System.in);
        ContactList contactList = new ContactList();

        contactList.addContact(new Contact("Vojta", "Drozd", "733741431", "kolec"));
        contactList.addContact(new Contact("Vojta", "Drozd", "733741431", "kolec"));
        contactList.addContact(new Contact("Vojta3", "Drozd3", "3733741431", "kolec3"));
        contactList.addContact(new Contact("Vojta4", "Drozd4", "4733741431", "kolec4"));
        contactList.addContact(new Contact("Vojta5", "Drozd5", "5733741431", "kolec5"));
        contactList.addContact(new Contact("Vojta6", "Drozd5", "6733741431", "kolec6"));
        contactList.addContact(new Contact("Vojta6", "Drozd6", "1111111111", "kolec6"));
        contactList.addContact(new Contact("Vojta7", "Drozd6", "1111111111", "kolec6"));
        contactList.addContact(new Contact("Vojta7", "Drozd6", "2111111111", "kolec6"));

//        while (true) {
//            try {
//                System.out.print("Enter first name: ");
//                String firstName = scanner.nextLine();
//
//                System.out.print("Enter last name: ");
//                String lastName = scanner.nextLine();
//
//                System.out.print("Enter phone number: ");
//                String phoneNumber = scanner.nextLine();
//
//                System.out.print("Enter address: ");
//                String address = scanner.nextLine();
//
//                Contact contact = new Contact(firstName, lastName, phoneNumber, address);
//                contactList.addContact(contact);
//                System.out.println("Contact added successfully.");
//
//                System.out.print("Do you want to add another contact? (yes/no): ");
//                String response = scanner.nextLine();
//                if (response.equalsIgnoreCase("no")) {
//                    break;
//                }
//            } catch (InvalidPhoneNumberException | InvalidNameException e) {
//                System.out.println("Error: " + e.getMessage());
//            }
//        }

        System.out.println("\nAll contacts:");
        System.out.println(contactList);

        Collections.sort(contactList.contacts);
        System.out.println("Contacts sorted by phone number:");
        System.out.println(contactList);

        contactList.sortByLastNameAndFirstName();
        System.out.println("Contacts sorted by last name and first name:");
        System.out.println(contactList);
    }
}