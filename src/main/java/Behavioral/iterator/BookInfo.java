package Behavioral.iterator;

public class BookInfo {

    private final String name;
    private final String author;
    private final int year;

    public BookInfo(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {return name;}
    public String getAuthor() {return author;}
    public int getYear() {return year;}

}
