public class L6Q6 {

    // Write  a  Java  method  that  determine  whether  a  number  is  a  palindromic  prime  and 
    // another  method  that  determine  whether  a  number  is  emirp  (the  number  is  a  prime 
    // number  and  the  reverse  also  a  prime  number  and  is  not  palindromic  prime).  Then, 
    // write a Java program to use the methods to display the first 20 palindromic prime and emirp. 

    public static boolean isPalindrome(int number) {
        StringBuilder reverseNumber = new StringBuilder(String.valueOf(number)).reverse();
        return (String.valueOf(number).equals(reverseNumber.toString())) ? (true) : (false);
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= number; i = i + 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPalindromicPrime(int number) {
        return isPrime(number) && isPalindrome(number);
        
    }

    public static boolean isEmirp(int number) {
        String reverseNumber = new StringBuilder(String.valueOf(number)).reverse().toString();
        return isPrime(number) && isPrime(Integer.valueOf(reverseNumber)) && !isPalindrome(number);
    }

    public static void main(String[] args) {
        int total = 20;
        int palindromicPrimeCounter = 0;
        int emirpCounter = 0;
        int index = 1;
        int[] palindromicPrime = new int[total];
        int[] emirp = new int[total];
        while ((palindromicPrimeCounter < total) || (emirpCounter < total)) {
            if (isPalindromicPrime(index) && (palindromicPrimeCounter < 20)) {
                palindromicPrime[palindromicPrimeCounter] = index;
                palindromicPrimeCounter++;
            }
            if (isEmirp(index) && (emirpCounter < 20)) {
                emirp[emirpCounter] = index;
                emirpCounter++;
            }
            index++;
        }
        System.out.println("Index   Palindromic Prime   Emirp   ");
        for (int i = 0; i < total; i++) {
            System.out.printf("%-8d%-20d%-8d\n", i + 1, palindromicPrime[i], emirp[i]);
        }
    }
}
