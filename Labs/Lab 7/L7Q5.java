import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class L7Q5 {
    
    public static void main(String[] args) {

    // Write  a  program  that  read  data  from  a  binary  file  person.dat.
    // Then, display the name, age and gender (M – Male, F –  Female)  in  ascending  order  sort  by  name.
    //  The  structure  of  the  binary  file  is  as below: 
    // <intVariable-TotalNumberofRecord> 
    // <StringVariable-Name><IntVariable-Age><CharVariable-Gender>

    String fileLocation = "./Labs/Lab 7/data/person.dat";

    try {

        //Extract the data and put it in the array
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileLocation));

        int numberOfRecord = inputStream.readInt();
        String[] name = new String[numberOfRecord];
        int[] age = new int[numberOfRecord];
        char[] gender = new char[numberOfRecord];

        for (int i = 0; i < numberOfRecord; i++) {
            name[i] = inputStream.readUTF();
            age[i] = inputStream.readInt();
            gender[i] = inputStream.readChar();

        }

        //Sorting the array
        for (int i = 0; i < numberOfRecord; i++) {
            int largestIndex = i;
            for (int j = i + 1; j < numberOfRecord; j++) {
                if (name[j].compareTo(name[largestIndex]) < 0) {
                    largestIndex = j;
                }
            }//If yr seeing this, say hi

            String tempName = name[largestIndex];
            name[largestIndex] = name[i];
            name[i] = tempName;

            int tempAge = age[largestIndex];
            age[largestIndex] = age[i];
            age[i] = tempAge;

            char tempGender = gender[largestIndex];
            gender[largestIndex] = gender[i];
            gender[i] = tempGender;
        }

        //Display the array
        System.out.println("Name          Age   Gender");
        for (int i = 0; i < numberOfRecord; i++) {
            System.out.printf("%-14s%-7d%-4c\n", name[i], age[i], gender[i]);
        }
        
        inputStream.close();

        } catch (IOException e) {
        System.out.println("File not Found");
            }
    }

}
