package com.greenfox.demo.Model;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public Library() {
        books.add(new Book("Cat's Cradle", "Kurt Vonnegut", 1963));
        books.add(new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", 1968));
    }

    public List<Book> getLibrary() {
        return books;
    }

    public void setLibrary(List<Book> library) {
        this.books = library;
    }
}
