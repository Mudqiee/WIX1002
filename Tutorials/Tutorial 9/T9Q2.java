public class T9Q2 {

    // Define  a  class  Organism.  The  class  contains  the  initial  size  of  the  organism  and  the 
    // growth  rate.  Create  a  constructor  to  initialize  the  instance  variables.  Then,  define  a 
    // class  Animal.  Animal  is  an  organism  that  has  extra  instance  variable  which  is  the 
    // amount  of  eating  need.  Create  a  constructor  to  initialize  the  instance  variable  and  a 
    // method to display the Animal instance variables.
    
    static class Organism {

        double initialSize, growthRate;

        public Organism(double initialSize, double growthRate) {
            this.initialSize = initialSize;
            this.growthRate = growthRate;
        }
    }

    static class Animal extends Organism {
        
        double amountEatingNeeded;

        public Animal(double initialSize, double growthRate, double amountEatingNeeded) {
            super(initialSize, growthRate);
            this.amountEatingNeeded = amountEatingNeeded;
        }

        public void displayAnimal() {
            System.out.println("--- Animal Stats ---");
            System.out.println("Initial Size: " + initialSize);
            System.out.println("Growth Rate: " + growthRate);   
            System.out.println("Eating Needed: " + amountEatingNeeded);
        }
    }

    public static void main(String[] args) {
        Animal Oyen = new Animal(0.1, 0.15, 5.0);
        Oyen.displayAnimal();
    }
}
