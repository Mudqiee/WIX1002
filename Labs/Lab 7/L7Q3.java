import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class L7Q3 {

    //Write the statements that replace each line of a text file with its reverse and save it to 
    // a new text file name reverse.txt

    public static void reverse(String fileInput, String fileOutput) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream(fileInput));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(fileOutput));
            while (inputStream.hasNextLine()) {
                String reversedString = new StringBuilder(inputStream.nextLine()).reverse().toString();
                outputStream.println(reversedString);
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    public static void main(String[] args) {

        String fileInput = "./Labs/Lab 7/data/loremIpsum.txt";
        String fileOutput = "./Labs/Lab 7/data/reverse.txt";

        reverse(fileInput, fileOutput);
    }
}
