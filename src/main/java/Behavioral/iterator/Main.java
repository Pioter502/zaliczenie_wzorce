package Behavioral.iterator;

import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        BookSciFi bookSciFi = new BookSciFi();
        BookAction bookAction = new BookAction();
        BookAdventure bookAdventure = new BookAdventure();

        BookReadlist bookReadlist = new BookReadlist(bookSciFi, bookAction, bookAdventure);
        bookReadlist.showBooks();
    }
}
