package Behavioral.iterator;

import java.util.Iterator;

public class BookReadlist {

    private final BookIterator bookscifi;
    private final BookIterator bookaction;
    private final BookIterator bookadventure;

    public BookReadlist(BookIterator bookaction, BookIterator bookadventure, BookIterator bookscifi){
        this.bookaction = bookaction;
        this.bookadventure = bookadventure;
        this.bookscifi = bookscifi;
    }

    private void showBookInfo(BookInfo bookInfo){
        System.out.println("Name: " + bookInfo.getName());
        System.out.println("Author: " + bookInfo.getAuthor());
        System.out.println("Year: " + bookInfo.getYear());
        System.out.println();
    }

    private void showBookInfo(Iterator<BookInfo> iterator){
        while (iterator.hasNext()){
            showBookInfo(iterator.next());
        }
        System.out.println();
    }

    public void showBooks(){
        showBookInfo(this.bookscifi.createIterator());
        showBookInfo(this.bookadventure.createIterator());
        showBookInfo(this.bookaction.createIterator());
    }
}
