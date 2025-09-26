import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding sample books
        library.addBook(new Book("The Alchemist", "Paulo Coelho", "ISBN101"));
        library.addBook(new Book("Atomic Habits", "James Clear", "ISBN102"));
        library.addBook(new Book("Clean Code", "Robert C. Martin", "ISBN103"));

        // Adding sample users
        library.addUser(new User("Alice", 1));
        library.addUser(new User("Bob", 2));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter ISBN of book to issue: ");
                    String issueIsbn = sc.nextLine();
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    library.issueBook(issueIsbn, userId);
                    break;
                case 3:
                    System.out.print("Enter ISBN of book to return: ");
                    String returnIsbn = sc.nextLine();
                    library.returnBook(returnIsbn);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
