package app;

public class BookImpl implements Books {
    private String title;
    private String author;
    private int year;


    public BookImpl(String title,String author,int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }
}
