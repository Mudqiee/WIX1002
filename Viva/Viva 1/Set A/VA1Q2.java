import java.util.Scanner;

public class VA1Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Getting the input
        int inquiries = input.nextInt(); 

        // Creating the array for the numbers and luckydigits
        int[] numbers = new int[inquiries];
        int[] luckyDigits = new int[inquiries];

        // Getting the input for the number and luckydigits
        for (int i = 0; i < inquiries; i++) {
            numbers[i] = input.nextInt();
            luckyDigits[i] = input.nextInt();
        }

        for (int i = 0; i < inquiries; i++) {

            // Separating each of the digits inside the character array
            char[] digits =  String.valueOf(numbers[i]).toCharArray();
            // Converting the lucky digit to char
            char L = (char)(luckyDigits[i] + '0');

            // Initialize the count
            int luckyCount = 0;
            int zeroCount = 0;
            int evenCount = 0;
            int oddCount = 0;

            // Looping through the char array
            for (char d : digits) {
                if (d == L) {
                    luckyCount++;
                } 
                else if (d == '0' && L != '0') {
                    zeroCount++;
                } 
                else if ((d - '0') % 2 == 0) {
                    evenCount++;
                } 
                else {
                    oddCount++;
                }
            }

            // Determine signature
            if (luckyCount > zeroCount && luckyCount > evenCount && luckyCount > oddCount) {
                System.out.println("LUCKY");
            } 
            else if (evenCount > luckyCount && evenCount > zeroCount && evenCount > oddCount) {
                System.out.println("BALANCED");
            } 
            else if (oddCount > luckyCount && oddCount > zeroCount && oddCount > evenCount) {
                System.out.println("ENERGETIC");
            } 
            else {
                System.out.println("NEUTRAL");
            }
        }
        input.close();
    }
}
