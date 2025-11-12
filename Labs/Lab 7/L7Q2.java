import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class L7Q2 {
    public static void main(String[] args) {

        // Write the contents of the Web page into a text file name index.htm.

        try {
            URL u = new URL("https://fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            PrintWriter output = new PrintWriter(new FileOutputStream("./Labs/Lab 7/data/index.html"));
            while(in.hasNextLine()) {
                String currentLine = in.nextLine();
                output.println(currentLine);
            }
            output.close();
            in.close();
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
