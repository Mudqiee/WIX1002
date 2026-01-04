import java.util.Scanner;

public class VB2Q6 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Array A: ");
        String[] arrayA = input.nextLine().split(",");
        System.out.print("Array B: ");
        String[] arrayB = input.nextLine().split(",");
        
        System.out.println("Mirror pattern: " + isMirror(convert(arrayA), convert(arrayB)));
    }

    static boolean isMirror(int[] a, int[] b) {
        
        for(int i = 0; i < a.length; i++) {
            if (a[i] != b[a.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    static int[] convert(String[] array) {

        int[] convertedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            convertedArray[i] = Integer.parseInt(array[i]);
        }
        return convertedArray;
    }
}
