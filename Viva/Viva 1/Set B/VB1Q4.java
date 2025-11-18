import java.util.Scanner;

public class VB1Q4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Getting IC number and determining
        System.out.print("Enter IC number(YYMMDD-##-####): ");
        String icNumber = input.nextLine();
        // Determining gender
        String gender = (icNumber.charAt(13) % 2 == 0) ? "Female" : "Male";
        // Determining birth year
        int year = Integer.valueOf(icNumber.substring(0, 2)); 
        if ((year >= 0 ) && (year <= 25)) {
            year += 2000;
        } else {
            year += 1900;
        }
        // Determining birth month
        int month = Integer.valueOf(icNumber.substring(2, 4));
        // Determining the month type
        char monthType = 'L';
        int[] shortMonth = {1, 3, 5, 7, 8, 10, 12};
        for (int i = 0; i < 7; i++) {
            if (shortMonth[i] == month) {
                monthType = 'S';
            }
        }
        // Determining the day
        int day = Integer.valueOf(icNumber.substring(4, 6));
        // Calculating the sum of all digits
        int sumOfDigits = 0;
        for (int i = 0; i < icNumber.length(); i++) {
            if (Character.isDigit(icNumber.charAt(i))) {
                sumOfDigits += Character.getNumericValue(icNumber.charAt(i));
            }
        }
        // Determining the Lucky Winner
        String isLucky;
        if ((gender.equals("Male")) && (sumOfDigits % 5 == 0) && (monthType == 'S')) {
            isLucky = "Yes";
        } else if ((gender.equals("Female")) && (sumOfDigits % 7 == 0) && (monthType == 'L')) {
            isLucky = "Yes";
        } else {
            isLucky = "No";
        }

        // Displaying the results
        System.out.printf("%-15s: %d/%d/%d\n", "Birth Date", day, month, year);
        System.out.printf("%-15s: %s\n", "Gender", gender);
        System.out.printf("%-15s: %d\n", "Sum of Digits", sumOfDigits);
        System.out.printf("%-15s: %s\n", "Lucky Winner", isLucky);
        input.close();
    }
}
