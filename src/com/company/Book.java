package com.company;

public class Book {

    private String titleBook;
    private String isbnNumber;
    private Author authorBook;

    public Book(){

    }

    public Book(String titleBook, String isbnNumber){
        this.titleBook = titleBook;
        this.isbnNumber = isbnNumber;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public Author getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(Author authorBook) {
        this.authorBook = authorBook;
    }


    @Override
    public String toString() {
        return "Book title " + getTitleBook() + " ISBN number " + getIsbnNumber() + " Book author " + getAuthorBook();
    }
}
