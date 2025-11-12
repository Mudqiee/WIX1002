import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class L7Q1 {

    // Write  a  program  that  store  the  table  below  in  a  binary  file  name  coursename.dat. 
    // Then, ask the users to enter a course code. The program will display the course name  from coursename.dat.
    // Course Code      Course Name
    // WXES1116         Programming I
    // WXES1115         Data Structure
    // WXES1110         Operating System
    // WXES1112         Computing Mathematics I

    public static void write(String fileLocation, String[] courseArray) {
        try {
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileLocation, true));
            for (int i = 0; i < courseArray.length; i++) {
                outputStream.writeUTF(courseArray[i]);
            }
            outputStream.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    public static String read(String fileLocation, String courseToFind) {
        String foundedCourseName = null;
        try {
            DataInputStream inputStream = new DataInputStream(new FileInputStream(fileLocation));
            while (true) {
                String courseCode = inputStream.readUTF();
                String courseName = inputStream.readUTF();
                if (courseCode.equals(courseToFind)) {
                    foundedCourseName = courseName;
                    break;
                }
            }
            inputStream.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return foundedCourseName;
    }
    
    public static void main(String[] args) {

        String fileLocation = "./Labs/Lab 7/data/coursename.dat";
        String[] course = {
            "WXES1116", "Programming I", 
            "WXES1115", "Data Structure",
            "WXES1110", "Operating System",
            "WXES1112", "Computing Mathematics I"
            };
        write(fileLocation, course);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a course code: ");
        System.out.println(read(fileLocation, input.nextLine()));
        input.close();
    }    
}
