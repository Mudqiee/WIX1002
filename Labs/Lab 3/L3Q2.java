import java.util.Random;

public class L3Q2 {
    public static void main (String[] args) {
        
        // Generate a random integer within 0 to 5 and display the integer in word.
        // 2 is two.
        Random rand = new Random();
        int random_number = rand.nextInt(6);
        switch (random_number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
        }
    }
}