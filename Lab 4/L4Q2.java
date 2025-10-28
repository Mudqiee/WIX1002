public class L4Q2 {
    public static void main (String[] args) {

        // Write a program that accepts an integer n from user and then sum the following series.
        // 1 + (1+2) + (1+2+3) + … + (1+2+3+…+n)
        
        int number_input = 4, inner_sum = 0, outer_sum = 0;
        for (int i = 1; i <= number_input; i++) {
            for (int j = 1; j <= i; j++) {
                inner_sum += j;
            }
            outer_sum += inner_sum;
            inner_sum = 0;
        }
        System.out.println(outer_sum);
    }    
}
