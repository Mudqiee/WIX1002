import java.util.Scanner;

public class VB2Q2 {

    public static boolean isBalanced(String expression){

        int sumOpening = 0, sumClosing = 0;
        String[] expressionArray = expression.split("");
        for (int i = 0; i < expressionArray.length; i++) {
            if (expressionArray[i].equals("(")) {
                sumOpening++;
            } else if (expressionArray[i].equals(")")) {
                sumClosing++;
            } else {
                continue;
            }
        }
        if (sumOpening == sumClosing) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        System.out.print("Enter expression: ");
        Scanner input = new Scanner(System.in);
        String expression = input.next();
        System.out.println((isBalanced(expression)) ? ("Balanced") : ("Not balanced"));
    }
}
