import java.util.Scanner;

public class VA1Q4 {

    public static void main(String[] args) {
        
        // Getting the user input
        Scanner input = new Scanner(System.in); //Creating the input object taking the keyboard as input
        System.out.print("Enter the word (Must be less than 50 characters): "); //Getting the word input
        String word = input.nextLine().toLowerCase(); //Use the toLowerCase() method so that the word will be all lowercased 
        //Checking if the word is more than 50 characters
        if (word.length() > 50) {
            System.out.println("The word must be less than 50 characters");
            System.exit(0); //To exit the program
        }

        System.out.print("Enter the length of the gem word: "); //Getting the length of the gem word input
        int gemWordLength = input.nextInt();
        input.close();
        
        char[] wordArray = word.toCharArray(); //Split all characters into an array
        String firstWhisper = word.substring(0, gemWordLength); //Initialize the firstWhisper to the first substring
        String lastEcho = word.substring(0, gemWordLength); //Initialize the lastEcho to the first substring
        String coreValue = word.substring(0, gemWordLength); //Initialize the coreValue to the first substring
        String currentWord;

        int coreValueAscii = 0; //Initialize the coreValue to the first substring ascii value

        //Looping throughout the word until the word length - gem word length + 1
        for (int i = 0; i < wordArray.length - gemWordLength + 1; i++) {

            //Initialize the currentWord with the current substring
            currentWord = word.substring(i, i + gemWordLength);
            //Initialize the currentWordValue with the current substring ascci value
            int currentWordAscii = 0;
            for (int j = 0; j < gemWordLength; j++) {
                currentWordAscii += wordArray[i + j];
            }

            //Compare the ascii value of the currentWord to the already initialized coreValue ascii value 
            if (currentWordAscii > coreValueAscii) {
                coreValue = currentWord; 
                coreValueAscii = currentWordAscii; //Updating the ascii value
            }
            //Compare the current word value to the initialize firstwhisper value lexicographically
            if (currentWord.compareTo(firstWhisper) < 0) {
                firstWhisper = currentWord;
            }
            //Compare the current word value to the initialize firstwhisper value lexicographically
            if (currentWord.compareTo(lastEcho) > 0) {
                lastEcho = currentWord;
            }
        }
        //Displaying the results
        System.out.println(firstWhisper + " // First Whisper");
        System.out.println(lastEcho + " // Last Echo");
        System.out.println(coreValue + " // Core Value");
    }
}