package com.company;

public class Main {

    public static void main(String[] args) {
        Book book = new Book ("Nabokov", "Lolita");
        Reader newRead = new Reader ("Sergey", "Petrov", "Ivanovich",
                98005, "FKSS", 1995, 6293875, book);
        System.out.print(newRead.surname+" "+newRead.name); newRead.takeBook(3);
        System.out.print(newRead.surname+" "+newRead.name); newRead.takeBook("poems", "fantacy"," fairytales");
        System.out.print(newRead.surname+" "+newRead.name); newRead.takeBook(book.author, book.title);
        Book book1 = new Book ("Chehov", "3 sisters");
        Reader newRead1 = new Reader("Katerina", "Ivanova", "Vladimirovna", 9866,
                "IEF", 1999, 6412531, book1);
        System.out.print(newRead1.surname+" "+newRead1.name); newRead1.returnBook(5);
        System.out.print(newRead1.surname+" "+newRead1.name); newRead1.returnBook("poems", "fantacy"," fairytales");
        System.out.print(newRead1.surname+" "+newRead1.name); newRead1.returnBook(book1.author, book1.title);
}
}