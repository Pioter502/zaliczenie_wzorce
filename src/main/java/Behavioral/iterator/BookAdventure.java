package Behavioral.iterator;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookAdventure implements BookIterator {

    private final List<BookInfo> bestBooks;

    public void addBook(String name, String author, int year){
        BookInfo bookInfo = new BookInfo(name, author, year);
        this.bestBooks.add(bookInfo);
    }
    public BookAdventure(){
        this.bestBooks = new ArrayList<>();
        this.addBook("Les Trois Mousquetaires", "Alexandre Dumas", 1844);
        this.addBook("Tarzan of the Apes", "Edgar Rice Burroughs", 1914);
    }


    @Override
    public Iterator<BookInfo> createIterator() {
        return this.bestBooks.iterator();
    }
}
