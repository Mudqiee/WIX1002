import java.util.Random;

public class L5Q2 {
    public static void main(String[] args) {
     
        // Write a program that generates 10 non-duplicate random integers within the range from 0 to 20.

        Random rand = new Random();
        int random_integers[] = new int[10];
        int new_integers;
        boolean is_duplicate = false;

        for (int i = 0; i < 10; i++) {
            do {
                is_duplicate = false;
                new_integers = rand.nextInt(21);
                for (int j = 0; j < i; j++) {
                    if (random_integers[j] == new_integers) {
                        is_duplicate = true;
                        break;
                    }
                } 
            } while (is_duplicate);
            random_integers[i] = new_integers;
        }

        System.out.print("[");
        for (int i = 0; i < random_integers.length; i++) {
            System.out.print(random_integers[i]);
            if (i < random_integers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
}