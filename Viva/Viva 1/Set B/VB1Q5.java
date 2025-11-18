import java.util.Scanner;

public class VB1Q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Original Message: ");
        String originalMessage = input.nextLine();
        input.close();

        System.out.println("Encoded Message: ");
        for (int i = 0; i < originalMessage.length(); i++) {
            System.out.print(Integer.parseInt(String.format("%8s", Integer.toBinaryString(originalMessage.charAt(i))).replace(' ', '0').replace('0', 't').replace('1', '0').replace('t', '1'), 2) + " ");
        }
        System.out.println();
    }
}
