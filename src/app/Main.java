package app;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        BookImpl book0 = new BookImpl("Game of throne","Sergey T.",2020);
        BookImpl book1 = new BookImpl("90 mile","Andrey M.",1800);
        BookImpl book2 = new BookImpl("Supernatural","Vladimir D.",2021);
        BookImpl book3 = new BookImpl("Game of throne","Sergey",2020);
        BookImpl book4 = new BookImpl("Homeless","Anya N.",1990);

        // Add books to the library
        library.addBook(book0);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Display information about all books in the library
        library.printAllBook();

        // Removing a book from the library by title
        library.removeBook("Homeless");

        // Display information about all books in the library after deletion
        library.printAllBook();

        // Search for books by author
        library.searchByAuthor("Game of throne");




    }
}
