import java.util.Scanner;
import java.util.Random;

public class VA2Q2 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter message: ");
        String str = input.nextLine();

        System.out.println(encode(str));

        input.close();
    }

    static String insert(String str) {

        Random rand = new Random();

        String[] originalString = str.split("");
        String[] specialCharacters = {"@", "#", "$", "!", "%", "^", "&", "*", "`", "~", "?"};
        String insertedString = "";

        for (int i = 0; i < str.length(); i++) {
            insertedString += originalString[i];
            insertedString += specialCharacters[rand.nextInt(specialCharacters.length)];
        }

        return insertedString;
    }

    static String breakAndFlip(String str) {

        String result = "";

        for (int i = 0; i < (str.length() / 2) ; i++) {
            result += str.charAt(((str.length() / 2) - 1) - i);
        }

        for (int i = 0; i < str.length() / 2; i++) {
            result += str.charAt(str.length() - 1 - i);
        }

        return result;
    }

    static String shift(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int currentAscii = (int) str.charAt(i);
            
            if (Character.isUpperCase(str.charAt(i))) {
                result += (char) (currentAscii + 2);
            } else if (Character.isLowerCase(str.charAt(i))) {
                result += (char) (currentAscii + 3);
            } else if (Character.isDigit(str.charAt(i))) {
                result += (char) (currentAscii + 10);
            } else {
                result += str.charAt(i);
            }
        }

        return result;
    }

    static String encode(String str) {
        return shift(breakAndFlip(insert(str)));
    }
}
