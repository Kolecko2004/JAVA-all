package org.example;

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class Contact implements Comparable<Contact> {
    String firstName;
    String lastName;
    String phoneNumber;
    private final String address;

    public Contact(String firstName, String lastName, String phoneNumber, String address) throws InvalidPhoneNumberException, InvalidNameException {
        if (phoneNumber.length() < 9) {
            throw new InvalidPhoneNumberException("Invalid phone number format.");
        }
        if (firstName == null || lastName == null  || lastName.length() < 3 || firstName.length() < 3) {
            throw new InvalidNameException("First name and last name cannot be empty or too short.");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nPhone: " + phoneNumber + "\nAddress: " + address;
    }

    @Override
    public int compareTo(Contact other) {
        return this.phoneNumber.compareTo(other.phoneNumber);
    }
}
