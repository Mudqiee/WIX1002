public class L6Q1 {

    // Write a Java method that returns a triangular number. A triangular number is defined as 1+2+3+...+ n.
    // Then, write a Java program to use the method to display the first 20 triangular numbers. 

    public static int triangularNumber(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d ", triangularNumber(i));
        }
        System.out.print("\n");
        
    }
}