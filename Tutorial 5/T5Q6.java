import java.util.Random;

public class T5Q6 {
    public static void main(String[] args) {
        
        // Write the statements that generate 1 random integer within 0 – 255. Convert the
        // number to binary and store the bit into an 8 bit array. Then, display the binary number.

        Random rand = new Random();
        int random_integer = rand.nextInt(256);
        int[] array = new int[8];

        System.out.printf("The binary for %d is ", random_integer);

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = random_integer % 2;
            random_integer /= 2;
        }

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
        System.out.println(" ");
    }
}
