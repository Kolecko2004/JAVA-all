package org.example;

import java.util.*;

public class ContactList {
    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Contact contact : contacts) {
            result.append(contact.toString()).append("\n-----------------------------------------------\n");
        }
        return result.toString();
    }


    public void sortByLastNameAndFirstName() {
        contacts.sort(new Comparator<Contact>() {
            @Override
            public int compare(Contact contact1, Contact contact2) {
                int lastNameComparison = contact1.lastName.compareTo(contact2.lastName);
                if (lastNameComparison == 0) {
                    lastNameComparison = contact1.firstName.compareTo(contact2.firstName);
                    if (lastNameComparison == 0) {
                        return contact1.phoneNumber.compareTo(contact2.phoneNumber);
                    }
                }
                return lastNameComparison;
            }
        });
    }
}
