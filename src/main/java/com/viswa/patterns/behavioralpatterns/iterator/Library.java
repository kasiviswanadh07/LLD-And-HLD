package com.viswa.patterns.behavioralpatterns.iterator;

import java.util.Iterator;
import java.util.List;

public class Library implements Aggregate {
    private List<Books> booklist;

    public Library(List<Books> booklist) {
        this.booklist = booklist;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(booklist);
    }
}
