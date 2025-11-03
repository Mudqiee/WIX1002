import java.util.Random;
import java.util.Scanner;

public class L5Q5 {
    public static void main(String[] args) {
        
        // Write a program that generates 20 random integers within the range from 0 to 100.
        // Sort the array in descending order. Then, accepts an integer input from the user. Then,
        // search the array using this number. Compare the performance of linear search and binary search.

        // A list of 20 random integer within 0 to 100
        // 57, 53, 46, 83, 74, 99, 30, 75, 61, 89, 28, 30, 56, 41, 27, 32, 79, 48, 46, 88

        // Array in descending order
        // 99, 89, 88, 83, 79, 75, 74, 61, 57, 56, 53, 48, 46, 46, 41, 32, 30, 30, 28, 27
        
        // Enter a number to search: 41
        // 41 found
        // Linear Search - 14 loop(s)
        // 41 found
        // Binary Search - 2 loop(s)

        //Creating the array
        Random rand = new Random();
        int[] random_integers = new int[20];
        for (int i = 0; i < random_integers.length; i++) {
            random_integers[i] = rand.nextInt(101);
        }

        //For printing the unsorted array
        System.out.println("A list of 20 random integer within 0 to 100:");
        System.out.print("[");
        for (int i = 0; i < random_integers.length; i++) {
            System.out.print(random_integers[i]);
            if (i < random_integers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");

        //Sorting algorithms
        for (int i = 0; i < random_integers.length - 1; i++) {
            int largest_index = i;
            for (int j = i + 1; j < random_integers.length; j++) {
                if (random_integers[j] > random_integers[largest_index]) {
                    largest_index = j;
                }
            }
            int temp = random_integers[largest_index];
            random_integers[largest_index] = random_integers[i];
            random_integers[i] = temp;
        }
       
        //For printing the sorted array
        System.out.println("The sorted array in descending order: ");
        System.out.print("[");
        for (int i = 0; i < random_integers.length; i++) {
            System.out.print(random_integers[i]);
            if (i < random_integers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");

        //User input of an integer to search for the number in the array.
        System.out.print("Enter a integer to search: ");
        Scanner input = new Scanner(System.in);
        int number_to_search = input.nextInt();
        input.close();

        //Linear search 
        for (int i = 0; i < random_integers.length; i++) {
            if (random_integers[i] == number_to_search) {
                System.out.printf("Linear search: %d found - %d Loop(s)\n", number_to_search, i + 1);
                break;
            }
        }

        //Binary search
        int low = 0;
        int high = random_integers.length - 1;
        int loop_counter = 0;
        while (low <= high) {
            loop_counter += 1;
            int mid = low + (high - low) / 2;
            if (random_integers[mid] == number_to_search) {
                System.out.printf("Binary search: %d found - %d Loop(s)\n", number_to_search, loop_counter);
                break;
            }
            if (random_integers[mid] < number_to_search) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }
}
