// You  operate  several  burger  stalls  distributed  throughout  town.  Each  burger  stall  has 
// an ID and the number of burger sold for the day. The class consists of a constructor to 
// initialize  the  instance  variables  and  a  sold  method  that  increment  the  number  of 
// burger  sold  by  parameter  value.  The  class  also  contains  a  variable  and  method  that 
// tracks  the  total  number  of  burgers  sold  in  all  stalls.  Display  the  total  burger  sold  by 
// each stall and the total number of burgers sold in all stalls.

class Stall {

    private String id;
    private int sales = 0;
    static int totalSales;
    
    public Stall(String id) {
        this.id = id;
    }

    public void sold(int sales) {
        this.sales += sales;
        Stall.totalSales += sales;
    }

    public String getId() {
        return this.id;
    }

    public int getSales() {
        return this.sales;
    }

    public int getTotalSales() {
        return Stall.totalSales;
    }
}

public class L8Q6 {
    public static void main(String[] args) {

        Stall JamilahBurger = new Stall("Jamilah78");
        JamilahBurger.sold(2232);

        Stall BurgerKacipPunya = new Stall("Kacip67s");
        BurgerKacipPunya.sold(4522);

        Stall CarlsJr = new Stall("CarlsJr");
        CarlsJr.sold(9387);

        System.out.println("Stall Id   Burger sold");
        System.out.printf("%-11s%-11d\n", JamilahBurger.getId(), JamilahBurger.getSales());
        System.out.printf("%-11s%-11d\n", BurgerKacipPunya.getId(), BurgerKacipPunya.getSales());
        System.out.printf("%-11s%-11d\n", CarlsJr.getId(), CarlsJr.getSales());
        System.out.printf("%-11s%-11d\n", "Total:",  CarlsJr.getTotalSales());
    }
}
