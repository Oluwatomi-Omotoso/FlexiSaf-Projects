
import java.util.Scanner;

public class Variables_and_Fields {
    // Fields (belong to the class, not just inside main)
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "1234";
    
    

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables (local to main)
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // If/ else logic
        if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials. Try again.");
        }

        scanner.close();
    }

}




