// Define a class name Number.  The class is used to handle an integer array. The class 
// Number will display all the item of the array, the even number, the prime number, the 
// maximum  number,  the  minimum  number,  the  average,  the  square  number.
// Create  a Tester class to test the program.   
// Number a = new Number() // generate 10 random integers within 0 to 100. 
// Number b = new Number(5) // generate 5 random integers within 0 to 100. 
// Number c = new Number(4, 50) // generate 4 random integers within 0 to 50.

import java.util.Random;
import java.util.StringJoiner;

class Number {
    
    int[] number;
    int numberOfRandomInteger;
    int upperBound;

    public Number() {
        this(10);
    }

    public Number(int numberOfRandomInteger) {
        this.numberOfRandomInteger = numberOfRandomInteger;
        this.upperBound = 100;
        creatingArray(this.numberOfRandomInteger, this.upperBound);
    }

    public Number(int numberOfRandomInteger, int upperBound) {
        this.numberOfRandomInteger = numberOfRandomInteger;
        this.upperBound = upperBound;
        creatingArray(this.numberOfRandomInteger, this.upperBound);
    }

    private void creatingArray(int numberOfRandomInteger, int upperBound ) {
        Random rand = new Random();
        number = new int[numberOfRandomInteger];
        for (int i = 0; i < numberOfRandomInteger; i++) {
            number[i] = rand.nextInt(upperBound);
        }
    }

    public void evenNumber() {
        StringJoiner listContent = new StringJoiner(", ");
        for (int i = 0; i < numberOfRandomInteger; i++) {
            if (number[i] % 2 == 0) {
                listContent.add(String.valueOf(number[i]));
            }   
        }
        System.out.printf("Even number: [%s]\n", listContent);
    }

    public void maximumNumber() {
        int max = number[0];
        for (int i = 0; i < numberOfRandomInteger; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }
        System.out.printf("Maximum number: %d\n", max);
    }

    public void minimumNumber() {
        int min = this.upperBound;
        for (int i = 0; i < numberOfRandomInteger; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.printf("Minimum number: %d\n", min);
    }

    public void average() {
        int sum = 0;
        for (int i = 0; i < numberOfRandomInteger; i++) {
            sum += number[i];
        }
        System.out.printf("The average: %.2f\n", (double) sum / numberOfRandomInteger);
    }

    public void primeNumber() {
        StringJoiner listContent = new StringJoiner(", ");
        for (int i = 0; i < numberOfRandomInteger; i++) {
            int factorCounter = 0;
            for (int j = 1; j < number[i]; j++) {
                if (number[i] % j == 0) {
                    factorCounter++;
                }
            }
            if (factorCounter == 1) {
                listContent.add(String.valueOf(number[i]));
            }
        }
        System.out.printf("Prime number: [%s]\n", listContent.toString());
    }

    public void squareNumber() {
        StringJoiner listContent = new StringJoiner(", ");
        for (int i = 0; i < numberOfRandomInteger; i++) {
            if (Math.sqrt(number[i]) % 1 == 0) {
                listContent.add(String.valueOf(number[i]));
            }
        }
        System.out.printf("Square number: [%s]\n", listContent.toString());
    }

    public void displayArray() {
        StringJoiner listContent = new StringJoiner(", ");
        for (int i = 0; i < numberOfRandomInteger; i++) {
           listContent.add(String.valueOf(number[i]));
        }
        System.out.printf("Number array: [%s]\n", listContent.toString());
    }
}

public class L8Q1 {
    public static void main(String[] args) {


        System.out.print("==== Array 1 ====\n\n");
        Number a0 = new Number();
        a0.displayArray();
        a0.evenNumber();
        a0.maximumNumber();
        a0.minimumNumber();
        a0.average();
        a0.primeNumber();
        a0.squareNumber();

        System.out.print("\n==== Array 2 ====\n\n");
        Number a1 = new Number(20);
        a1.displayArray();
        a1.evenNumber();
        a1.maximumNumber();
        a1.minimumNumber();
        a1.average();
        a1.primeNumber();
        a1.squareNumber();

        System.out.print("\n==== Array 3 ====\n\n");
        Number a2 = new Number(30, 1000);
        a2.displayArray();
        a2.evenNumber();
        a2.maximumNumber();
        a2.minimumNumber();
        a2.average();
        a2.primeNumber();
        a2.squareNumber();

    }
}
