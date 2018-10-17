package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Hans", "Andersen", "andersen@gmail.com", "571 425 9631"));
        authors.add(new Author("Name1", "Last1", "1@gmail.com", "571 425 9631"));
        authors.add(new Author("Name2", "Last2", "2@gmail.com", "571 425 9631"));

        ArrayList<Book> books = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("what do you wish to do? [add] new book / [register] new author / list [books] / list [authors] / [exit]");
            String answer = s.nextLine();
            if (answer.equalsIgnoreCase("add")) {
                Book newBook = createNewBook(null, authors);
                books.add(newBook);
            } else if (answer.equalsIgnoreCase("register")) {
                Author newAuthor = registerNewAuthor(books);
                authors.add(newAuthor);
            } else if (answer.equalsIgnoreCase("books")) {
                System.out.println("---- book list ----");
                for (Book eachBook : books) {
                    System.out.println(eachBook);
                }
            } else if (answer.equalsIgnoreCase("authors")) {
                System.out.println("---- author list ----");
                for (Author eachAuthor : authors) {
                    System.out.println(eachAuthor);
                    System.out.println("  books written:");
                    for (Book eachBook : books) {
                        if (eachBook.getAuthor().equals(eachAuthor)) {
                            System.out.println("  - " + eachBook.getTitle() + " (" + eachBook.getIsbn() + ")");
                        }
                    }
                }
            } else if (answer.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }

    //create a method to add the book
    public static Book createNewBook(Author definedAuthor, ArrayList<Author> authors) {
        Book newBook = new Book();
        //create a Scanner object to let user make an input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the title");
        String title = s.nextLine();
        newBook.setTitle(title);

        System.out.println("Enter the isbn number");
        String isbn = s.nextLine();
        newBook.setIsbn(isbn);

        Author author = (definedAuthor == null) ? selectAuthor(authors) : definedAuthor;
        newBook.setAuthor(author);

        System.out.println("new book: " + newBook);
        return newBook;
    }

    public static Author selectAuthor(ArrayList<Author> authors) {
        System.out.println("----");
        for (int i = 0; i < authors.size(); i++) {
            Author a = authors.get(i);
            System.out.println((i + 1) + ": " + a);
        }
        System.out.println("Please select author (or 0 to skip):");
        int idx = new Scanner(System.in).nextInt();
        return idx == 0 ? null : authors.get(idx - 1);
    }

    public static Author registerNewAuthor(ArrayList<Book> books) {
        Scanner s = new Scanner(System.in);
        Author newAuthor = new Author();
        System.out.println("Enter the first name");
        String firstName = s.nextLine();
        newAuthor.setFirstName(firstName);

        System.out.println("Enter the last name");
        String lastName = s.nextLine();
        newAuthor.setLastName(lastName);

        System.out.println("Enter eMail address");
        String eMail = s.nextLine();
        newAuthor.setEmailAddress(eMail);

        System.out.println("Enter phone number");
        String phoneNumber = s.nextLine();
        newAuthor.setPhoneNumber(phoneNumber);

        while (true) {
            System.out.println("add book? y/n ");
            String answer = s.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                Book newBook = createNewBook(newAuthor, null);
                books.add(newBook);
            } else {
                break;
            }
        }

        return newAuthor;
    }
}
