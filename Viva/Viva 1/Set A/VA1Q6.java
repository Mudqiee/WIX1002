import java.util.Scanner;

public class VA1Q6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int inquiries, count = 0;
        boolean isValid = true; // Initialize the validity to true
        // the word will always presumed valid until proven otherwise

        // Getting the number of inquiries
        System.out.print("Enter the number or word to test: ");
        inquiries = input.nextInt();

        // Creating the stuttered word array to the size of the inquiries
        String[] stutteredWords = new String[inquiries];

        // Looping throught the array until the number or inquiries
        for (int i = 0; i < inquiries; i++) {

            // Adding the stuttered word  in each iteration
            // and lowercase it
            stutteredWords[i] = input.next().toLowerCase();

            // Looping each character in the word
            for(int j = 0; j < stutteredWords[i].length(); j++) {
                // Assigning the current character
                char current = stutteredWords[i].charAt(j);
                
                // Chech if the current character is digit or not
                if(Character.isDigit(current)) {
                    if (j == 0) {
                        // If its digit and the first char, Invalid
                        isValid = false;
                        break;
                    } else if (j > 0 && Character.isDigit(stutteredWords[i].charAt(j - 1))) {
                        // If the current is digit and the char before it a digit, Invalid
                        isValid = false;
                        break;
                    } else if (current == '0' || current == '1') {
                        // If the digit is 1 or 0, Invalid
                        isValid = false;
                        break;
                    }
                }
            }
            // If the word passed the check
            if (isValid) {
                // Looping through each of the char in the word
                for (int j = 0; j < stutteredWords[i].length(); j++) {
                    // Assignning the ch to the current char
                    char ch = stutteredWords[i].charAt(j); 
                    if (Character.isLetter(ch)) {
                        // If the char is a letter, count + 1
                        count++;
                    } else if (Character.isDigit(ch)) { // If the char is a digit
                        int repeatCount = Character.getNumericValue(ch) - 1;
                        for (int k = 0; k < repeatCount; k++) {
                            // Count + (digitValue - 1)
                            count++;
                        }
                    }
                }
                System.out.print(count + " "); // Printing the final count
                count = 0; // Reset the count for the next word
            } else { // If the word failed the check, ie isValid = false
                System.out.print("Invalid Log "); 
                isValid = true; // The isValid reset to true
            }
        }
        input.close();
    }
}
