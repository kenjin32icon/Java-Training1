package libraryManagementSystem;

//You're developing a library management system. The Book class has attributes like title, author, isbn, and availableCopies.

//Implement a Java class Book with:
//
//Private fields: title, author, isbn, availableCopies.
//Public getters and setters where appropriate.
//Methods borrowBook() and returnBook().
//Ensure data integrity using encapsulation.
public class Book {
    private String title;
    private  String author;
    private  String ISBN;
    private int availableCopies;

    public Book(String title, String author, String ISBN, int availableCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    //Method of borrowng a book
    public boolean borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            return true;
        } else {
            return false;
        }
    }

    //Method for returning books
    public void returnBook() {
        availableCopies++;
    }
}
