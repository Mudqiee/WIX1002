public class T4Q2 {
    public static void main (String[] args) {

        // Correct the error for the following statements.

        // a. for (x = 10; x > 0; x++)
        // sum += x;

        int sum = 0;
        for (int x = 10; x > 0; x--) {
            sum += x;
        }
        System.out.println(sum);

        // b. do
        // x += 2;
        // y += x;
        // System.out.println(x + " and " + y);
        // while (x < 100)

        int x = 0, y= 0;
        do {
        x += 2;
        y += x;
        System.out.println(x + " and " + y);
        } while (x < 100);

        // c. for ( x==1, y==20; x < y, x++, y-=2);
        // System.out.println(x & " " & y);

        for (int i = 1, j = 20; i < j; i++,j-=2) {
            System.out.println(i + " " + j);
        }

        // d. i =1;
        // while(i<10) {
        // if (i==10)
        // System.out.println("Program End");
        // }

        int i = 1;
        while(i < 10) {
            i++;
            if (i == 10) {
                System.out.println("Program End");
            }
        }
    }
}