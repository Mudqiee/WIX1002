import java.util.Scanner;

public class T4Q4 {
    public static void main (String[] args) {

        // Write the statements that display the string in reverse order. (use String.length() to get the length of the string)
        
        System.out.print("Enter a string to be reversed: ");
        Scanner input = new Scanner(System.in);
        String old_string = input.nextLine();
        String new_string = "";
        input.close();
        
        for (int i = old_string.length(); i >= 1; i--) {
            new_string += old_string.charAt(i - 1);
        }
        
        System.out.printf("The reversed string: %s\n", new_string);
    }
}
