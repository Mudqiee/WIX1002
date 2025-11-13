// Create  a  class  Payment  that  accept  different  type  of  payment  methods  such  as  cash 
// payment,  cheque  payment  and  credit  card  payment. For  cash  payment,  the  class accepts 
// the amount in cash; for cheque payment, the class accepts the amount and the cheque  number;  
// for  credit  card  payment,  the  class  accepts  the  amount,  card  holder name, cardType,
// expiration date and validation code. Use the same method name for the payment.

class Payment {

    double outstandingFee;

    public Payment(double outstandingFee) {
        this.outstandingFee = outstandingFee;
    }

    public void pay(double amount) {
        double balance = this.outstandingFee - amount;
        System.out.println("=== Payment Succesful ===");
        System.out.printf("Payment method: Cash\nAmount: %.2f \n", amount);
        if (balance == 0) {
            System.out.println();
            this.outstandingFee = 0;
        } else if (balance > 0) {
            System.out.printf("Outstading fee: %.2f\n", balance);
            this.outstandingFee = balance;
        } else {
            System.out.printf("Here is your change of %.2f\n", -balance);
            this.outstandingFee = 0;
        }
    }

    public void pay(double amount, int chequeNumber) {
        double balance = this.outstandingFee - amount;
        System.out.println("=== Payment Succesful ===");
        System.out.printf("Payment method: Cheque\nAmount: %.2f\nCheque number: %d\n", amount, chequeNumber);
        if (balance == 0) {
            System.out.println();
            this.outstandingFee = 0;
        } else if (balance > 0) {
            System.out.printf("Outstading fee: %.2f\n", balance);
            this.outstandingFee = balance;
        } else { // FIX: Handles overpayment
            System.out.println("Paid in full. (Overpayment of " + (-balance) + " charged).");
            this.outstandingFee = 0;
        } 
    }

    public void pay(double amount, String cardHolderName, String cardType, String expirationDate, int validationCode) {
        double balance = this.outstandingFee - amount;
        System.out.println("=== Payment Succesful ===");
        System.out.printf("Payment method: Card\nAmount: %.2f\nCard Holder: %s\nCard type: %s\nExpiration data: %s\nValidation code: %d\n", amount, cardHolderName, cardType, expirationDate, validationCode);
        if (balance == 0) {
            System.out.println();
            this.outstandingFee = 0;
        } else if (balance > 0) {
            System.out.printf("Outstading fee: %.2f\n", balance);
            this.outstandingFee = balance;
        } else { // FIX: Handles overpayment
            System.out.println("Paid in full. (Overpayment of " + (-balance) + " charged).");
            this.outstandingFee = 0;
        }
    }
}

public class T8Q4 {
    public static void main(String[] args) {
        
        Payment hr = new Payment(12.30);
        hr.pay(6);
        hr.pay(0.30,1234);
        hr.pay(6, "Adam", "Visa", "03/32", 9872);
    }
}
