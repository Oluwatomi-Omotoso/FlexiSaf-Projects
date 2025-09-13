import java.util.ArrayList;
import java.util.Scanner;

class Book {
    Scanner sc = new Scanner(System.in);
    //attributes
    private String title;
    private String author;
    private String ISBN;

    // Setting up book attributes
    public Book()
    {
        setTitle();
        setAuthor();
        setISBN();

    }

    public void setTitle() {
        System.out.println("Enter title: ");
        this.title = sc.nextLine();
    }
    public void setAuthor() {
        System.out.println("Enter author: ");
        this.author = sc.nextLine();
    }
    public void setISBN() {
        System.out.println("Enter ISBN: ");
        this.ISBN = sc.nextLine();
    }

    public String getTitle() {
        return title;
    }



    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }


}

class Library{
    //Collection
    private final ArrayList<Book> collection = new ArrayList<>();


    //Method to add books to collection
    public void addBook(Book book)
    {
        collection.add(book);
        System.out.println("Added Book: " + book.getTitle());
    }

    //Method to remove books from collection
    void removeBook(Book book)
    {
        if(collection.contains(book)) {
            collection.remove(book);
            System.out.println("Removed Book: " + book.getTitle());
        }
        else{
            System.out.println("Book not found");
        }
    }
}

public class Books_Program {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book();
        library.addBook(book1);

        Book book2 = new Book();
        library.addBook(book2);

        library.removeBook(book1);
        library.removeBook(book2);

    }
}