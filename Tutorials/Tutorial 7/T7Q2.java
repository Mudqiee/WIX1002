import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util. Scanner;

public class T7Q2 {
    public static void main(String[] args) {

        //Correct all the errors

        // a. PrintWriter out = new PrintWriter(new FileOutputStream("d:\data\matrix.txt"));
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(".Tutorials/Tutorial 7/data/matrix.txt")); // I change the file location so that it won't just create a file in a random location.
            out.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }

        // b. try {    PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));    out.close(); } catch (FileNotFoundException e) {    System.out.println("Problem with file output"); }
        
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(".Tutorials/Tutorial 7/data/data.txt"));
            out.println(90);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Problem with the file output");
        }

        // c. int num; Scanner a = new Scanner(new FileInputStream("data.dat")); num = a.readInt(); a.close();

        try {
            int num;
            Scanner a = new Scanner(new FileInputStream(".Tutorials/Tutorial 7/data/data.txt"));
            num = a.nextInt();
            a.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // d. ObjectOutputStream o = new ObjectOutputStream (new FileOutputStream("data.dat")); o.print('A'); o.close();

        try {
            PrintWriter o = new PrintWriter(new FileOutputStream(".Tutorials/Tutorial 7/data/data.dat"));
            o.print('A');
            o.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
