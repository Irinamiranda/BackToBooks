package com.company;

public class Book {

    private String title;
    private String isbn;
    private Author author;

    public Book(){

    }

    public Book(String titleBook, String isbnNumber){
        this.title = titleBook;
        this.isbn = isbnNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book title " + getTitle() + " ISBN number " + getIsbn() + " Book author " + getAuthor();
    }
}
