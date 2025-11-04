import java.util.Random;

public class T6Q1 {

    // A. Define  a  static  method  that  returns  the  maximum  number  from  3  integer parameters. 
    public static int maximum_number(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    // B. Define  a  static  method  that  that  determine  whether  the  given  integer  is  a square number.
    public static boolean is_square(int number) {
        if (number < 0) {
            return false;
        }
        double sqrt = Math.sqrt(number);
        if (Math.sqrt(number) % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // C. Define  a  static  method  that  use  to  compute  combination  function  C(n,k). 
    //    C(n,k) gives the number of different k-element subsets that can be found in a 
    //    given set of n elements. C(n,k) = n! / (k! (n-k)!
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive step
        }
    }
    public static int C(int n, int k) {
        return (factorial(n)) / (factorial(k) * factorial(n - k));
    }

    // D. Define  a  static  method  that  used  to  determine  whether  the  parameter  is  a 
    //    pentagonal  number.  A  pentagonal  number  is  a  figurate  number  that  extends 
    //    the concept of triangular and square numbers to the pentagon. Pn = ½ n(3n -1)
    public static boolean is_pentagon_number(int number) {
        double n = (1 + Math.sqrt(1 + 24 * number)) / 6;
        if (n % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // E. Define  a  static  method  that  displays  the  number  of  letters  and  the  number  of  
    //    digits of a String parameter.
    public static void number_of_letters_and_digits(String string) {
        int int_counter = 0;
        int letter_counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                int_counter++;
            }
            if (Character.isLetter(string.charAt(i))) {
                letter_counter++;
            }
        }
        System.out.printf("The number of letter is %d\nThe number of digits is %d\n", letter_counter, int_counter);
    }

    // F. Define a static void method that generates 10 random numbers within 0 to 100 
    //    to the method’s parameter. The random numbers can be accessed by the main method.

    public static void random_number(int[] randomNumberArray) {
        Random rand = new Random();
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = rand.nextInt(101);
        }
    }

    // G. Define  a  static  void  method  that  returns  the  area  and  the  circumference  of  a 
    //    circle given the argument is radius. Area = πr2 and Circumference = 2 πr.

    public static void circle(int radius) {
        System.out.printf("For Radius = %d, Area = %.2f and Circumference = %.2f\n", radius,Math.PI * Math.pow(radius, 2), 2 * Math.PI * radius);
    }
 
    // H. Define  a  static  method  that  generate  random  number  within  0  –  10.
    //    The method will return the first random number that generate twice.

    public static int generator() {
        Random rand = new Random();
        boolean[] seen = new boolean[11];

        while (true) {
            int num = rand.nextInt(11);
            if (seen[num]) {
                return num;
            }
            seen[num] = true;
        }
    }
 
    public static void main(String[] args) {

        System.out.println(maximum_number(10, 8, 40));

        System.out.println(is_square(4));

        System.out.println(C(8, 4));

        System.out.println(is_pentagon_number(22));
        
        number_of_letters_and_digits("HElloawjdoajmoidjq9u39qu09ue09quem9mdkas[d9q093e09qie9] my 28397");
        
        int[] randomNumberArray = new int[10];
        random_number(randomNumberArray);
        for (int i = 0; i < randomNumberArray.length; i++) {
            System.out.print(randomNumberArray[i]);
            if (i < 9) {System.out.print(", ");} else {System.out.print("\n");}
        }

        circle(9);

        System.out.println(generator());
    }    
}
