import java.util.Scanner;

public class VA1Q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Getting the number of inquiries
        System.out.print("Enter the number of words to test: ");
        int inquiries = input.nextInt();

        // Creating the String array the size of the inquiries 
        String[] goldenHarmony = new String[inquiries];
        
        // Looping through each word until the number of inquiries
        for (int i = 0; i < inquiries; i++) {
            goldenHarmony[i] = input.next().toLowerCase(); // Adding the words into the array and lower case it

            // Assigning the lastChar with the last character of the each word in the array
            String lastChar = goldenHarmony[i].substring(goldenHarmony[i].length() - 1);

            if("aeiou".contains(lastChar)) { // Check if the last character is a vowel
                System.out.print("Chaos");
            } else { // Check the remaining vowel
                boolean isHarmony = true;
                for (int j = 0; j < goldenHarmony[i].length() - 1; j++) {
                    char current = goldenHarmony[i].charAt(j); // Assigning the first character
                    char next = goldenHarmony[i].charAt(j + 1); // Assigning the next character
                    // indexOf, will return the index of the char if its present
                    // but will return -1 if the char isn't present in the string
                    boolean isCurrentVowel = "aeiou".indexOf(current) != -1; // If its vowel, it will be true
                    boolean isNextVowel = "aeiou".indexOf(next) != -1;

                    if (isCurrentVowel && isNextVowel) { //  Check if its both vowel
                        System.out.print("Chaos");
                        isHarmony = false; // Assign the isHarmony to false so that the if statemenet below can't run
                        break; // Break the loop as soon as we found the consecutive vowel
                    }
                }
                if (isHarmony) { // If the upper if statement never runs, isHarmony will be true
                    System.out.print("Harmony");
                }
            }
        }
        input.close();
    }
}
