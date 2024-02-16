package Behavioral.iterator;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookSciFi implements BookIterator{


    private final List<BookInfo> bestBooks;

    public void addBook(String name, String author, int year){
        BookInfo bookInfo = new BookInfo(name, author, year);
        this.bestBooks.add(bookInfo);
    }
    public BookSciFi(){
        this.bestBooks = new ArrayList<>();
        this.addBook("Leviathan Wakes", "James S.A. Corey", 2010);
        this.addBook("Caliban's War", "James S.A. Corey", 2012);
    }

    @Override
    public Iterator<BookInfo> createIterator() {
        return this.bestBooks.iterator();
    }
}
