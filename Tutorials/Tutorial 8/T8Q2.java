
// a. Define a class Digit. 
class Digit {
    
    // b. Declare the instance variable that used to store a number. 
    int number;
    int multipliedDigit;

    // c. Create a constructor that assign the parameter value to the number.
    public Digit(int number) {
        this.number = number;
    }

    // d. Create  a  digitMultiplication  method  that  returns  the  multiplication  of  the number.
    // If the number is 1345, the method will return 60
    public int digitMultiplication() {
        String[] number = String.format("%d", this.number).split("");
        int product = 1;
        for (int i = 0; i < number.length; i++) {
            product *= Integer.parseInt(number[i]);
        }
        this.multipliedDigit = product;
        return product;
    }

    // e. Create a method that used to display the digit multiplication of the number.
    public void displayDigitMultiplication() {
        System.out.println(this.multipliedDigit);
    }
}

// f. Create a tester class that displays the digit multiplication of 4567. 

public class T8Q2 {
    
    public static void main(String[] args) {
        Digit hello = new Digit(4567);
        System.out.println(hello.digitMultiplication());
        hello.displayDigitMultiplication();
    }
    
}
