    import java.util.Scanner;

    public class VB2Q5 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Mode (C / D): ");
            char mode = input.nextLine().charAt(0);
            System.out.print("Text: ");
            String text = input.nextLine();
            
            if (!(mode == 'C' || mode == 'D')) {
                System.out.println("Invalid Input (Enter D or C)");
            } else if (mode == 'C') {
                System.out.println("Result: " + compress(text));
            } else { 
                if (isValid(text)) {
                    System.out.println("Result: " + decompress(text));
                } else {
                    System.out.println("Invalid Encoding");
                }
            }
        }

        static String compress(String s) {

            String result = "";
            char currentChar = s.charAt(0);
            int charCount = 1;
            for (int i = 1; i < s.length(); i++) {
                if (currentChar == s.charAt(i)) {
                    charCount++;
                } else {
                    result += charCount;
                    result += s.charAt(i - 1);
                    charCount = 1;
                }
                currentChar = s.charAt(i);
            }
            return result + charCount + s.charAt(s.length() - 1);
        }

        static String decompress(String s) {

            String result = "";
            for (int i = 0; i < s.length(); i += 2) {
                for (int j = 0; j < Character.getNumericValue(s.charAt(i)); j++) {
                    result += s.charAt(i + 1); 
                }
            }
            return result;
        }

        static boolean isValid(String s) {
            
            for (int i = 0; i < s.length(); i += 2) {
                
                if (!Character.isDigit(s.charAt(i))) {
                    return false;
                }
                if ((!Character.isLetter(s.charAt(i + 1))) && (s.charAt(i + 1) != ' ')) {
                    return false;
                }
            }
            return true;
        }
    }
