import java.util.Arrays;

// a. Define a class Student
class Student {

    // b. Declare the instance variable to store contact number
    private String contactNumber;

    // c. Constructor that initializes the contact number to null
    public Student() {
        this.contactNumber = null;
    }

    // d. Constructor that assigns the parameter value
    public Student(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // e. Accessor method (getter)
    public String getContactNumber() {
        return this.contactNumber;
    }

    // e. Mutator method (setter)
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // f. Method to display the contact number
    public void displayContact() {
        System.out.println("Student Contact: " + this.contactNumber);
    }
}

class Animal {
    String type;

    // Constructor for (i)
    public Animal() {
        this.type = "Unknown";
    }

    // Constructor for (j)
    public Animal(String type) {
        this.type = type;
    }

    public void displayType() {
        System.out.println("Animal Type: " + this.type);
    }
}

class Number {
    int[] values;

    // Constructor for (k)
    public Number(int val1, int val2) {
        this.values = new int[]{val1, val2};
    }

    public void displayValues() {
        System.out.println("Number Values: " + Arrays.toString(this.values));
    }
}

public class T8Q1 {
    
    public static void main(String[] args) {

        // g. Create an object of the class Student
        Student student1 = new Student();
        System.out.print("Initial state: ");
        student1.displayContact();

        // h. Change the contact number using the mutator method
        student1.setContactNumber("012-3456789");
        System.out.print("After mutator: ");
        student1.displayContact();

        // i. Create an object of the class Animal
        Animal animal1 = new Animal();
        animal1.displayType();

        // j. Create an object of the class Animal that used to represent a cat
        Animal cat = new Animal("Cat");
        cat.displayType();

        // k. Create an object of the class Number with the value 20 and 40
        Number myNumbers = new Number(20, 40);
        myNumbers.displayValues();
    }
}