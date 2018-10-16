package com.company;

import java.util.ArrayList;

public class Author {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private ArrayList<Book> booksWrittenByAuthor;

    public Author() {
        this.booksWrittenByAuthor = new ArrayList<>();

    }

    public Author(String firstName, String lastName, String emailAddress, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.booksWrittenByAuthor = new ArrayList<>();

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public ArrayList<Book> getBooksWrittenByAuthor() {
        return booksWrittenByAuthor;
    }


    @Override
    public String toString() {
        return "First name " + getFirstName() + " Last name " + getLastName() + " email Address " + getEmailAddress() + " phone number " + getPhoneNumber();
    }
}
