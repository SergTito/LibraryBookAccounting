package app;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private HashMap<String,Books> bookMap;

    public Library(){
        bookMap = new HashMap<>();
    }
    public void addBook(Books book){
        bookMap.put(book.getTitle(), book);
    }
    public void removeBook(String title){
        bookMap.remove(title);
    }
    public void searchByAuthor(String author){
        for (Map.Entry<String, Books> entry:bookMap.entrySet()){
            Books book = entry.getValue();
            if (entry.getValue().equals(author)){
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Year: " + book.getYear());
                System.out.println("------------------------");
            }
        }
    }
    public void printAllBook(){
        for (Map.Entry<String,Books> entry: bookMap.entrySet()){
            Books books = entry.getValue();
            System.out.println("Title: " + books.getTitle());
            System.out.println("Author: " + books.getAuthor());
            System.out.println("Year: " + books.getYear());
            System.out.println("------------------------");
        }
    }

}
