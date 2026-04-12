package com.viswa.patterns.behavioralpatterns.iterator;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator {
    private List<Books> books;
    private int index = 0;

    public BookIterator(List<Books> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return books.get(index++);
        }
        return "";
    }
}
