package com.viswa.patterns.behavioralpatterns.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Books> booklist = Arrays.asList(
                new Books("science", 100),
                new Books("Maths", 200),
                new Books("Physics", 250),
                new Books("Zology", 150));

        Library library = new Library(booklist);
        Iterator iterator = library.createIterator();
        while (iterator.hasNext()) {
            Books bokk = (Books) iterator.next();
            System.out.println(bokk.getName() + " Price: " + bokk.getPrice());
        }
    }
}
