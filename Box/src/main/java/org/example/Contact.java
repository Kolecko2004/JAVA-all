package org.example;

public class Contact {
    String name;
    String surname;
    String phone;
    String address;
    int age;

    public Contact(String name, String surname, String phone, String address, int age) throws NameFormatExceptions{
        setName(name);
        this.surname = surname;
        this.phone = phone;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameFormatExceptions{
        if (name.length() < 2) {
            throw new NameFormatExceptions("Name must be at least 2 characters");
        }
    }

    public void setSurname(String surname) throws NameFormatExceptions{
        if (surname.length() < 2) {
            throw new NameFormatExceptions("Surname must be at least 2 characters");
        }
    }

    public void setPhone(String phone) throws NameFormatExceptions{
        if (phone.length() < 9) {
            throw new NameFormatExceptions("Telephone number must be at least 9 characters");
        }
    }

    public void setAddress(String address) throws NameFormatExceptions{
        if (address.length() < 2) {
            throw new NameFormatExceptions("Address must be at least 2 characters");
        }
    }

    public void setAge(int age) throws NameFormatExceptions{
        if (age > 0 && age <= 100) {
            throw new NameFormatExceptions("Age must be between 0 and 100");
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nSurname: " + surname + "\nPhone: " + phone + "\nAddress: " + address;
    }
}
