import java.util.Scanner;

public class VB1Q3 {
    public static void main(String[] args) {
        
        // Getting username and password
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();

        // Validating username
        boolean isUsernameValid = true;

        // Username validation rules
        if ((username.length() < 5) || (username.length() > 15)) { // Length check
            System.out.println("Invalid username length!");
            isUsernameValid = false;
        } else if (!Character.isLetter(username.charAt(0))) { // Starting character check
            System.out.println("Username must start with a letter!");
            isUsernameValid = false;
        } else if (!username.equals(username.toLowerCase())) { // Lowercase check
            System.out.println("Username must be in lowercase!");
            isUsernameValid = false;
        } else if (!username.matches("[a-z0-9_]+")) { // Allowed characters check
            System.out.println("Username can only contain lowercase letters, digits, and underscores!");
            isUsernameValid = false;
        }

        // Evaluating password strength if username is valid
        if (isUsernameValid) {
            int metRules = 0; // Counter for met rules

            // Password strength rules
            if (password.length() >= 8) {
                metRules++;
            }
            // At least one uppercase letter
            if (password.matches(".*[A-Z].*")) {
                metRules++;
            }
            // At least one lowercase letter
            if (password.matches(".*[a-z].*")) {
                metRules++;
            }
            // At least one digit
            if (password.matches(".*[0-9].*")) {
                metRules++;
            }
            // At least one special character
            if (password.matches(".*[!@#$%^&*].*")) {
                metRules++;
            }
            // No spaces
            if (!password.contains(" ")) {
                metRules++;
            }
            // Does not contain username
             if (!password.toLowerCase().contains(username.toLowerCase())) {
                metRules++;
            }
            // Displaying password strength
            System.out.print("Password Strength: ");
             if (metRules == 7) {
                System.out.println("Very Strong");
            } else if (metRules == 6) {
                System.out.println("Strong");
            } else if (metRules >= 4) { 
                System.out.println("Moderate");
            } else { 
                System.out.println("Weak");
            }
        }
    }
}
