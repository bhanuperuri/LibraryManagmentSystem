import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    public void displayBooks() {
        System.out.println("\n--- Book List ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(String isbn, int userId) {
        Book bookToIssue = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToIssue = book;
                break;
            }
        }

        if (bookToIssue == null) {
            System.out.println("Book not found.");
            return;
        }

        if (bookToIssue.isIssued()) {
            System.out.println("Book is already issued.");
        } else {
            bookToIssue.issueBook();
            System.out.println("Book issued: " + bookToIssue.getTitle() + " to User ID: " + userId);
        }
    }

    public void returnBook(String isbn) {
        Book bookToReturn = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToReturn = book;
                break;
            }
        }

        if (bookToReturn == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!bookToReturn.isIssued()) {
            System.out.println("Book was not issued.");
        } else {
            bookToReturn.returnBook();
            System.out.println("Book returned: " + bookToReturn.getTitle());
        }
    }
}
