// Define a class name BankAccount. The class allows the customer to open the saving 
// account  with  their  name,  IC  or  passport  number  and  the  deposit  amount.  The  class 
// consists of deposit method and withdraws method. Besides, the class can display the 
// current balance. Create a Tester class to test the program.

class BankAccount {

    String name;
    String ic; 
    double balance;

    public BankAccount(String name, String ic, double deposit) {
        
        this.name = name;
        this.ic = ic;
        this.balance = deposit;
    }

    public void deposit(double amount) {
        System.out.printf("Depositing RM %.2f...\n", amount);
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Error: Insufficient balance!");
        } else {
            System.out.printf("Withdrawing RM %.2f...\n", amount);
        this.balance -= amount;
        }
    }

    public void display() {
        System.out.printf("--------------\nName   : %s\nIC     : %s\nBalance: %.2f\n--------------\n", this.name, this.ic, this.balance);
    }
}

public class L8Q2 {
    public static void main(String[] args) {

        BankAccount aliAccount = new BankAccount("Ali", "901020-14-1234", 1000.00);

        System.out.println("Initial State:");
        aliAccount.display();

        aliAccount.deposit(500);
        aliAccount.display();

        aliAccount.withdraw(1500);
        aliAccount.display();

    }
}
