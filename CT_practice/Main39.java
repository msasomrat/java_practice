import java.util.ArrayList;
import java.util.Collections;


public class Main39{
    public static void main(String[] args)
    {
        Library library = new Library();
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");
        library.displayAvailableBooks();
        library.issueBook("Book 1");
        library.displayIssuedBooks();
        library.displayAvailableBooks();
        library.returnBook("Book 1");
        library.displayIssuedBooks();
        library.displayAvailableBooks();

    }
}

class Library {
    ArrayList<String> books;
    ArrayList<String> issuedBooks;

    public Library()
    {
        books = new ArrayList<>();
        issuedBooks = new ArrayList<>();
    }

    public void addBook(String bookTitle)
    {
        books.add(bookTitle);
    }

    public void issueBook(String bookTitle)
    {
        if (books.contains(bookTitle)) {
            books.remove(bookTitle);
            issuedBooks.add(bookTitle);
            System.out.println(bookTitle + " has been issued.");
        } else {
            System.out.println(bookTitle + " is not available in the library.");
        }


    }

    public void returnBook(String bookTitle)
    {
        if (issuedBooks.contains(bookTitle))
        {
            issuedBooks.remove(bookTitle);
            books.add(bookTitle);
            Collections.sort(books);
            System.out.println(bookTitle + " has been returned.");
        } else
        {
            System.out.println(bookTitle + " is not available in the issued library.");
        }


    }

    public void displayAvailableBooks()
    {
        System.out.println("Available Books:");
        for (int i =0 ; i< books.size() ; i++) {
            System.out.println("- " + books.get(i));
        }


    }

    public void displayIssuedBooks()
    {
        System.out.println("Issue Books:");
        for (int i =0 ; i< issuedBooks.size() ; i++) {
            System.out.println("- " + issuedBooks.get(i));
        }
       
       
    }


}