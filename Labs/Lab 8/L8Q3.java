// Define a class name WeightCalculator. The class has an input method that accepts the 
// user’s  age  and  height.  Besides,  the  class  consists  a  method  that  calculating  the 
// recommend weight with this formula recommend weight = (height – 100 + age / 10) * 0.9 
// The class will display the user’s age, height  and the recommend weight.  Create  a 
// Tester class to test the program.

import java.util.Scanner;

class WeightCalculator {

    int age;
    double weight;
    double height;

    public WeightCalculator() {}

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        this.age = input.nextInt();
        System.out.print("Enter your height (cm) : ");
        this.height = input.nextDouble();

    }

    public void calculate() {
        this.weight = (this.height - 100 + (this.age / 10.0)) * 0.9;
    }

    public void display() {
        System.out.printf("Age : %d\nHeight: %.2f\nRecommmended weight (kg): %.2f\n", this.age, this.height, this.weight);
    }

}

public class L8Q3 {
    public static void main(String[] args) {

        WeightCalculator test1 = new WeightCalculator();
        test1.input();
        test1.calculate();
        test1.display();

        WeightCalculator test2 = new WeightCalculator();
        test2.input();
        test2.calculate();
        test2.display();
    }
}
