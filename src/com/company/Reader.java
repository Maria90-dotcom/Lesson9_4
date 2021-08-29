package com.company;

public class Reader {
    String name;
    String surname;
    String secname;
    int cardnumber;
    String faculty;
    int yearofbirth;
    int phone;
    Book book;

    Reader(String name, String surname, String secname, int cardnumber, String faculty, int yearofbirth, int phone, Book book) {
        this.name = name;
        this.surname = surname;
        this.secname = secname;
        this.cardnumber = cardnumber;
        this.faculty = faculty;
        this.yearofbirth = yearofbirth;
        this.phone = phone;
        this.book = book;
    }

    void takeBook(int num) {
        System.out.println(" takes " + num + " books");
    }

    public void takeBook(String book1, String book2, String book3) {
        System.out.println(" takes " + book1 + " " + book2 + " " + book3 + " " + " books");
    }

    public void takeBook(String author, String title) {
        System.out.println(" takes  " + author + " " + title);

    }

    public void returnBook(int num1) {
        System.out.println(" gives " + num1 + " books");
    }

    public void returnBook(String book1, String book2, String book3) {
        System.out.println(" gives " + book1 + " " + book2 + " " + book3 + " " + " books");
    }

    public void returnBook(String author, String title) {
        System.out.println(" gives  " + author + " " + title);
    }
}
