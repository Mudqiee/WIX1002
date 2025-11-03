import java.util.Scanner;

public class L5Q6 {
    public static void main(String[] args) {
        
        // Write a program that used to create Pascal Triangle in the square matrix. The program
        // will accept an integer from the users and use the integer to create the Pascal Triangle.
        
        // Enter the number of row of Pascal Triangle to generate: 6
        // The Pascal Triangle with 6 row(s)
        // 1 0 0 0 0 0 
        // 1 1 0 0 0 0 
        // 1 2 1 0 0 0 
        // 1 3 3 1 0 0 
        // 1 4 6 4 1 0 
        // 1 5 10 10 5 1

        // Getting the user input
        System.out.print("Enter the size of Pascal Triangle to generate: ");
        Scanner input = new Scanner(System.in);
        int matrix_size = input.nextInt();
        input.close(); 

        // Creating the pascal triangle
        System.out.printf("The pascal Triangle with %d by %d square\n", matrix_size, matrix_size);
        int[][] pascal_triangle = new int[matrix_size][matrix_size];
        for (int i = 0; i < matrix_size; i++) {
            pascal_triangle[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                pascal_triangle[i][j] = pascal_triangle[i - 1][j - 1] + pascal_triangle[i - 1][j];
            }
        }

        // Printing the pascal triangle
        for (int i = 0; i < matrix_size; i++) {
            for (int j = 0; j < matrix_size; j++) {
                System.out.printf(" %2d", pascal_triangle[i][j]);
                if (j < matrix_size - 1) {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }    
}
