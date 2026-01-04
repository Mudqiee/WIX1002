import java.util.Scanner;

public class VA2Q1 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = Integer.parseInt(input.nextLine());
        
        if (isPrime(number)) {
            System.out.println(number);    
        } else {
            System.out.println(getNearestPrime(number));
        }
        
    }

    static boolean isPrime(int num) {

        if ((num == 1) || (num == 0)) {
            return false;
        }
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    static int getNearestPrime(int num) {
        
        int upper = num + 1;
        int lower = num - 1;
        int range = 0;

        while ((!isPrime(upper)) && (!isPrime(lower))) {
            upper += range;
            lower -= range;
            range++;
        }

        if(isPrime(lower)) {
            return lower;
        }

        if (isPrime(upper)) {
            return upper;
        }

        return 0;
    }
}
