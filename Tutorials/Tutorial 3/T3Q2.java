public class T3Q2 {
    public static void main (String[] args) {
        
        //A. if (num1 = num2)
        // System.out.println("Number 1 is equal to number 2.");
        int num1 = 3, num2 = 3;
        if (num1 == num2) {
            System.out.println("Number 1 is equal to number 2.");
        }

        //B. if (x > y > z)
        // System.out.println("x is the largest number");
        int x = 54, y = 2, z = 3;
        if ((x > y) && (x > z)) {
            System.out.println("x is the largest number");
        }

        //C. String s1, s2;
        // if (s1==s2)
        // System.out.println("They are equal strings.");
        // else (s1!=s2)
        // System.out.println("They are not equal strings.");
        String s1 = "Hello", s2 = "Hello";
        if (s1 == s2) {
            System.out.println("They are equal strings.");
        } else {
            System.out.println("They are not equal strings.");
        }

        //D. if x>0 or y>0;
        // System.out.println("Either x or y is positive");
        if ((x > 0) || (y > 0)) {
            System.out.println("Either x or y is positive");
        }
    }
}