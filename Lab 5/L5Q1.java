import java.util.Random;
import java.util.Scanner;

public class L5Q1 {
    public static void main(String[] args) {

        // Write a program to randomly generate N student scores (0-100). The program will
        // prompt the user to enter N students and store the score in an array. Then, the program
        // will display a list of score, the highest score, the lowest score and the average score.

        System.out.print("Enter the number of students: ");

        Scanner input = new Scanner(System.in);
        int the_number_of_students = input.nextInt();
        input.close();

        Random rand = new Random();
        int[] students_score = new int[the_number_of_students];
        int highest_score = 0;
        int lowest_score = 100;
        int sum_of_score = 0;

        System.out.print("The student scores: \n[");
        for (int i = 0; i < the_number_of_students; i++) {
            students_score[i] = rand.nextInt(101);
            System.out.print(students_score[i]);
            if (i < the_number_of_students - 1) {
                System.out.print(", ");
            }
            if ((i % 10 == 0) && (i != 0)) {
                System.out.println(" ");
            }
            if (students_score[i] > highest_score) {
                highest_score = students_score[i];
            }
            if (students_score[i] < lowest_score) {
                lowest_score = students_score[i];
            }
            sum_of_score += students_score[i];
        }
        System.out.println("]");
        System.out.printf("The highest score is %d\n", highest_score);
        System.out.printf("The lowest score is %d\n", lowest_score);
        System.out.printf("The average of the score is %.2f\n", (double) sum_of_score / the_number_of_students);
    }
}
