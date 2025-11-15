// Define class money. The class is used to calculate the number of note and coins for a given  amount  of  money.  
// The  available  notes  are  RM100,  RM50,  RM10,  RM5  and RM1.  The  available  coins  are  50cent,
// 20cent,  10cent  and  5  cent.  The  class  needs  to 2 round  up  the  amount  according  to  the
// table  below.  The  class  also  contains  addition and subtraction method to add or subtract two objects.
//          Before Rounding          After Rounding 
//      10.11, 10.12                    10.10 
//      10.13, 10.14, 10.16, 10.17      10.15 
//      10.18, 10.19                    10.20 
 


class Money {

    private double amount;

    public Money(double amount) {
        this.amount = round(amount);
    }

    public double getAmount() {
        return this.amount;
    }

    private double round(double amount) {
        int totalCents = (int) Math.round(amount * 100.0);
        
        int centsModulo10 = totalCents % 10;
        int baseCents = totalCents / 10 * 10;
        int roundedCents;

        if (centsModulo10 == 1 || centsModulo10 == 2) {
            roundedCents = baseCents;
        } else if (centsModulo10 == 3 || centsModulo10 == 4 || centsModulo10 == 6 || centsModulo10 == 7) {
            roundedCents = baseCents + 5;
        } else if (centsModulo10 == 8 || centsModulo10 == 9) {
            roundedCents = baseCents + 10;  
        } else { 
            roundedCents = totalCents;     
        }
        return roundedCents / 100.0;
    }

    public Money addition(Money other) {
        return new Money(this.amount + other.amount);
    }

    public Money subtraction(Money other) {
        return new Money(this.amount - other.amount);
    }
}

public class L8Q7 {
    public static void main(String[] args) {
        
        Money m0 = new Money(19.29);
        System.out.println(m0.getAmount());
        Money m1 = new Money(20.78);
        System.out.println(m1.addition(m0).getAmount());
    }
}
