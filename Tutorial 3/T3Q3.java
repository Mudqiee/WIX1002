public class T3Q3 {
    public static void main(String[] args) {

        //Write the output for the following statements when x=9 and y=10
        int x = 9, y = 10;
        
        //Problem A
        if (x < 10) {
            if (y > 10) {
                System.out.println("*****");
            } else {
                System.out.println("#####");
            }
        }
        System.out.println("$$$$$");
        //#####
        //$$$$$

        //Problem B
        if (x < 10) {
            if (y < 10) {
                System.out.println("*****");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$"); 
            }
        }
        //#####

        //Problem C
        if (x < 10) {
            if (y < 10) {
                System.out.println("*****");
            }
            System.out.println("#####");

        } else { 
            System.out.println("$$$$$");
        }
        //#####

        //Problem D
        if (x > 10) {
            if (y > 10) {
                System.out.println("*****");
                System.out.println("#####");
            } 
            else {
                System.out.println("$$$$$");
            }
        }
        //Nothing printed in console
    }
}
