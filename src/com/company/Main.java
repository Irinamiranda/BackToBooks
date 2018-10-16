package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Hans", "Andersen", "andersen@gmail.com", "571 425 9631"));

        ArrayList<Book> books = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("what do you wish to do? Add the book/ check booklist/check authorlist/ exit");
            if(s.nextLine().equalsIgnoreCase("add")){

                books.add(addBook());

            }
            else if(s.nextLine().equalsIgnoreCase("booklist")) {
                System.out.println("the book list");
                for(Book eachBook: books){

                    System.out.println(eachBook.toString());

                }

            }else if(s.nextLine().equalsIgnoreCase("authorlist")){
                System.out.println("the author list");
                for(Author eachAuthor: authors){
                    System.out.println(eachAuthor);
                    for(Book eachBook: books){
                        System.out.println(eachBook.toString());
                    }
                }

            }
            else if(s.nextLine().equalsIgnoreCase("exit")){
                break;
            }
        }

    }

    //create a method to add the book
    public static Book addBook(){
        Book newBook = new Book();
        //create a Scanner object to let user make an input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the title");
        String title = s.nextLine();
        newBook.setTitleBook(title);


        System.out.println("Enter the isbn number");
        String isbn = s.nextLine();
        newBook.setIsbnNumber(isbn);
        newBook.setAuthorBook(addAuthor());

        return newBook;
    }

    //create a method to add author to book
    public static Author addAuthor(ArrayList<Author> authors, ArrayList<Book> booksWrittenByAuthor) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the author");
        String author = s.nextLine();
        Author authorBook = null;
        for(Author eachAuthor: authors) {
            if (author.equalsIgnoreCase(eachAuthor.getEmailAddress())) {
                authorBook = eachAuthor;

                }
                else {
                break;
            }
                }
return authorBook;
    }
}
