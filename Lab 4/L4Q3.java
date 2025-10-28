import java.util.Scanner;

public class L4Q3 {
    public static void main (String[] args) {

        // Write a program that calculates the minimum, maximum, average and standard
        // deviation (s) of the exam score in a subject. The program will accepts the score and
        // quit if negative score is enter. A sample output is given below.
        // Formula: s = sqrt( (ΣX² - (ΣX)²/N) / (N-1) )
        
        // Console Output
        // Enter a score [negative score to quit]:75
        // Enter a score [negative score to quit]:34
        // Enter a score [negative score to quit]:58
        // Enter a score [negative score to quit]:12
        // Enter a score [negative score to quit]:96
        // Enter a score [negative score to quit]:-1
        // 1095.0
        // Minimum Score: 12
        // Maximum Score: 96
        // Average Score: 55.00
        // Standard Deviation: 33.09

        Scanner input = new Scanner(System.in);
        int score_input, score_count = 0;
        double score_sum = 0, score_max = 0, score_min = 0, score_squared = 0;

        while (true) {

            System.out.print("Enter a score [negative score to quit]: ");
            score_input = input.nextInt();

            if (score_input < 0) {
                break;
            } else {
                score_count += 1;
                score_sum += score_input;
                score_squared += (score_input * score_input);

                if (score_count == 1) {
                    score_min = score_input;
                } else if (score_input < score_min) {
                    score_min = score_input;
                }

                if (score_input > score_max) {
                    score_max = score_input;
                }
            }
        }
        double score_average = (double) score_sum / score_count;
        double score_standard_deviation = Math.sqrt((score_squared - (Math.pow(score_sum, 2) / score_count)) / (score_count - 1));
        System.out.printf("Minimum score: %.2f\n", score_min);        
        System.out.printf("Maximum score: %.2f\n", score_max);
        System.out.printf("Average score: %.2f\n", score_average);
        System.out.printf("Standard deviation: %.2f\n", score_standard_deviation);
        input.close();
    }    
}
