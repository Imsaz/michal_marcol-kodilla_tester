package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.Collection;

public class BookManager {
    Collection<Book> bookExample = new ArrayList<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if (bookExample.contains(book))
            System.out.println("This book has already existed");

        bookExample.add(book);
        return book;
    }
}
