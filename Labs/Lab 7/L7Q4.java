import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class L7Q4 {
    
    public static void main(String[] args) {
        
        // Write a program that display the number of characters, words and lines in a text file. 
        // Assume that each word is separated by one space character.

        try {

            String fileLocation = "./Labs/Lab 7/data/loremIpsum.txt";
            Scanner inputStream = new Scanner(new FileInputStream(fileLocation));

            int numberOfLines = 0;
            int numberOfWords = 0;
            int numberOfCharacters = 0;

            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                numberOfLines++;

                numberOfCharacters += line.length();

                Scanner currentLine = new Scanner(line);
                while (currentLine.hasNext()) {
                    currentLine.next();
                    numberOfWords++;
                }
                currentLine.close();

            }
            System.out.printf("Number of line: %d\n", numberOfLines);
            System.out.printf("Number of words: %d\n", numberOfWords);
            System.out.printf("Number of characters: %d\n", numberOfCharacters);

            inputStream.close();

        } catch (IOException e) {
            System.out.println("File not found");
        }

    }
}
