public class T4Q3 {
    public static  void main(String[] args) {
        
        // Write the statements that display the first ten values of the Fibonacci sequence. Given
        // the formula f1 = 1, f2 =1, fn = fn-1 + fn-2.
        
        int Fn = 0, Fn1 = 1, Fn2 = 0;
        System.out.print("[0, 1, ");
        for (int i = 1; i <= 8; i++) {
            Fn = Fn1 + Fn2;
            System.out.print(Fn);
            Fn2 = Fn1;
            Fn1 = Fn;
            if (i < 8) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
}
