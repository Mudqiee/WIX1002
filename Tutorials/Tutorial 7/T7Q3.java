import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class T7Q3 {

    public static void write(String fileLocation, String sentence){
        try {
            PrintWriter output = new PrintWriter(new FileOutputStream(fileLocation));
            output.println(sentence);
            output.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    public static String convertStringToBinary(String sentence) {
        StringBuilder binaryResult = new StringBuilder();
        for (char c : sentence.toCharArray()) {
            binaryResult.append(String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'));
        }
        return binaryResult.toString();
    }

    public static String read(String fileLocation) {
        String returnedString = null;
        try {
            Scanner input = new Scanner(new FileInputStream(fileLocation));
            returnedString = input.nextLine();
            input.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return returnedString;
    }

    public static String convertBinaryToString(String sentence) {
        StringBuilder textResult = new StringBuilder();
        for (int i = 0; i < sentence.length(); i += 8) {
            textResult.append((char) Integer.parseInt(sentence.substring(i, i + 8), 2));
        }
        return textResult.toString();
    }

    public static void main(String[] args) {

        // Write  a  program  that  convert  a  sentence  into  binary  number  (ASCII  code  8  bit)  and 
        // store  it  in  a  text  file  named  data.txt.  Then,  read  from  the  text  file  and  display  the sentence. 

        String location = "./Tutorials/Tutorial 7/data/data.txt";
        write(location, convertStringToBinary("HEllo"));
        System.out.println(convertBinaryToString(read(location)));
    }
}
