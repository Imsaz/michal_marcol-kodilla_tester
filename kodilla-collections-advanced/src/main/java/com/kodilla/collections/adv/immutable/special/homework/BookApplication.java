package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager manager = new BookManager();
        Book book1 = manager.createBook("HP", "Rowling");
        Book book2 = manager.createBook("HP", "Rowling");
        Book book3 = manager.createBook("LotR", "Tolkien");

        System.out.println(book1 == book2);
        System.out.println("Hashcode: " + (book1.hashCode() == book2.hashCode()));
        System.out.println(book1.equals(book2));
        System.out.println("---------------------");

        System.out.println(book1 == book3);
        System.out.println("Hashcode: " + (book1.hashCode() == book3.hashCode()));
        System.out.println(book1.equals(book3));
        System.out.println("---------------------");

        System.out.println(book2 == book3);
        System.out.println("Hashcode: " + (book2.hashCode() == book3.hashCode()));
        System.out.println(book2.equals(book3));
        System.out.println("---------------------");
    }
}
