import java.util.Scanner;

public class VB2Q1 {
    
    public static String digitalRoot(String digit) {

        if (digit.length() == 1) {
            return digit;
        } else {
            String[] array = digit.split("");
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += Integer.valueOf(array[i]);
            }
            return digitalRoot(Integer.toString(sum));
        }
    }

    public static void main(String[] args) {
        
        System.out.print("Enter number: ");
        Scanner input = new Scanner(System.in);
        String array = input.nextLine();
        System.out.println("Digital root: " + digitalRoot(array));
    }
}
