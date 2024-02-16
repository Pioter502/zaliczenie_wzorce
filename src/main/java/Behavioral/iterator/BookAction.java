package Behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookAction implements BookIterator{

    private final List<BookInfo> bestBooks;

    public void addBook(String name, String author, int year){
        BookInfo bookInfo = new BookInfo(name, author, year);
        this.bestBooks.add(bookInfo);
    }
    public BookAction(){
        this.bestBooks = new ArrayList<>();
        this.addBook("The Godfather", "Mario Puzo", 1969);
        this.addBook("Topgun. An American Story", "Dan Pedersen", 2019);
    }


    @Override
    public Iterator<BookInfo> createIterator() {
        return this.bestBooks.iterator();
    }
}
