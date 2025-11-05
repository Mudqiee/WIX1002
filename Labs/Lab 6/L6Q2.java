public class L6Q2 {

    // Write a Java method multiPrint(int n, char c) that prints n copies of character c.
    // Then, write a Java program to use the method to display the triangles and diamonds.

    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

    public static int oddNumber(int n) {
        int total = 0;
        for (int i = 1; i <= n; i += 2) {
            total += i; 
        }
        return total;
    }

    public static void main(String[] args) {

        int size = 10;
        for (int i = 1; i <= size; i++) {
            multiPrint(size - i, ' ');
            multiPrint(2 * i - 1, '#');
            System.out.print("\n");
        }
        for (int i = 1; i <= size; i++) {
            multiPrint(size - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.print("\n");
        }
        for (int i = size - 1; i >= 1; i--) {
            multiPrint(size - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
    }
}
