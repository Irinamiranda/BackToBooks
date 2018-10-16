package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Hans", "Andersen", "andersen@gmail.com", "571 425 9631"));

        ArrayList<Book> books = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("what do you wish to do? Add the book/ check booklist/check authorlist/ exit");
            String answer = s.nextLine();
            if (answer.equalsIgnoreCase("add")) {

                addBook(authors, books);

            } else if (answer.equalsIgnoreCase("booklist")) {
                System.out.println("the book list");
                for (Book eachBook : books) {

                    System.out.println(eachBook.toString());

                }

            } else if (answer.equalsIgnoreCase("authorlist")) {
                System.out.println("the author list");
                for (Author eachAuthor : authors) {
                    System.out.println(eachAuthor.toString());
                    for (Book eachBook : books) {
                        System.out.println(eachBook.toString());
                    }
                }

            } else if (answer.equalsIgnoreCase("exit")) {
                break;
            }
        }

    }

    //create a method to add the book
    public static Book addBook(ArrayList<Author> authors, ArrayList<Book> books) {
        Book newBook = new Book();
        //create a Scanner object to let user make an input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the title");
        String title = s.nextLine();
        newBook.setTitleBook(title);


        System.out.println("Enter the isbn number");
        String isbn = s.nextLine();
        newBook.setIsbnNumber(isbn);
        newBook.setAuthorBook(addAuthor(authors));
        books.add(newBook);

        return newBook;
    }

    //create a method to add author to book
    public static Author addAuthor(ArrayList<Author> authors) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the author");
        String author = s.nextLine();
        Author authorBook = null;
        for (Author eachAuthor : authors) {
            if (author.equalsIgnoreCase(eachAuthor.getLastName())) {
                authorBook = eachAuthor;

            } else {
                break;
            }
        }
        return authorBook;
    }
}
