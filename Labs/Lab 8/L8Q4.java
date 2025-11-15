    // Define a class Fraction. The class has an input method that accepts the numerator and 
    // the  denominator  from  the  user.  Use  the  mutator  method  to  set  the  numerator  and 
    // denominator and the accessor method to get the value of numerator and denominator. 
    // This class also has a method to display the fraction reduced to lowest terms. (find the 
    // greatest common divisor for the numerator and denominator. Create a Tester class  to 
    // test the program.

    import java.util.Scanner;

    class Fraction {

        int numerator;
        int denominator;

        public Fraction() {
            this.numerator = 0;
            this.denominator = 1;
        }

        public void input() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the numerator: ");
            this.numerator = input.nextInt();
            System.out.print("Enter the denominator: ");
            this.denominator = input.nextInt();
        }

        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        public void setDenominator(int denominator) {
            this.denominator = denominator;
        }

        public int getNumerator() {
            return this.numerator;
        }

        public int getDenominator() {
            return this.denominator;
        }

        private int gcd(int numerator, int denominator) {
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
            if (denominator == 0) {
                return numerator;
            }
            return gcd(denominator, numerator % denominator);
        }

        private int[] reducedFraction() {
            int gcd = gcd(this.numerator, this.denominator);
            int displayNumerator = this.numerator / gcd;
            int displayDenominator = this.denominator / gcd;

            if (this.denominator < 0) {
                this.numerator *= -1;
                this.denominator *= -1;
            }
            int[] fraction = {displayNumerator, displayDenominator};
            return fraction;
        }

        public void display() {
            System.out.printf("%d / %d\n", reducedFraction()[0], reducedFraction()[1]);
        }
    }


    public class L8Q4 {

        public static void main(String[] args) {

            Fraction f1 = new Fraction();
            f1.input();
            
            f1.display();
            System.out.printf("Numerator = %d, Denominator = %d\n", f1.getNumerator(), f1.getDenominator());

            Fraction f2 = new Fraction();
            
            f2.setNumerator(20);
            f2.setDenominator(30);
            f2.display();
            
            f2.setNumerator(15); 
            f2.display(); 
            
            f2.setNumerator(18);
            f2.setDenominator(24);
            f2.display();
            
            f2.setDenominator(12); 
            f2.display();
            System.out.printf("Numerator = %d, Denominator = %d\n", f2.getNumerator(), f2.getDenominator());
        
            f2.setNumerator(-10);
            f2.setDenominator(20);
            f2.display();

        }
    }
