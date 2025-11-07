import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Random;

public class T7Q1 {
    public static void main(String[] args) {

        // a. Store ten random integers within 0 to 1000 to a text file name integer.txt. 

        Random rand = new Random();
        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("./Tutorials/Tutorial 7/data/integer.txt"));

            for (int i = 0; i < 10; i++) {
                outputStream.println(rand.nextInt(1001));
            }

            outputStream.close();
        } catch (IOException e){
            System.out.println("Problem with file output");
        }
        
        // b. Read  from  the  text  file  generated  in  a.  Display  all  the  integer  and  the  largest integer.
        try {
            Scanner inputStream = new Scanner(new FileInputStream("./Tutorials/Tutorial 7/data/integer.txt"));

            System.out.println("\nFrom the integer.txt:");

            int[] integerArray = new int[10];
            int largestInteger = 0;
            for (int i = 0; i < integerArray.length; i++) {
                integerArray[i] = inputStream.nextInt();
                largestInteger = (integerArray[i] > largestInteger) ? (integerArray[i]) : (largestInteger);
                System.out.printf("%d ", integerArray[i]);
            }
            System.out.printf("\nThe largest integer is %d\n", largestInteger);

            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // c. Store ten random integers within 0 to 1000 to a binary file name integer.dat.
        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("./Tutorials/Tutorial 7/data/integer.dat"));

            for (int i = 0; i < 10; i++) {
                outputStream.println(rand.nextInt(1001));
            }

            outputStream.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }

        // d. Read from the binary file generated in a c. Display the all the integer and the average.
        try {
            Scanner inputStream = new Scanner(new FileInputStream("./Tutorials/Tutorial 7/data/integer.dat"));

            System.out.println("\nFrom the integer.dat:");

            int sum = 0;
            int[] integerArray = new int[10];
            for (int i = 0; i < integerArray.length; i++) {
                integerArray[i] = inputStream.nextInt();
                sum += integerArray[i];
                System.out.printf("%d ", integerArray[i]);
            }
            System.out.printf("\nThe average of the integer is %d\n\n", sum / integerArray.length);

            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }    
}
