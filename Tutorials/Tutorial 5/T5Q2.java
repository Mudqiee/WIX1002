public class T5Q2 {
    public static void main(String[] args) {
        
        // 2. Correct the error for the following statements.
        
        // a.
        // String[] code = {'AAA', 'AAB', 'AAC', 'AAD'};
        String code[] = {"AAA", "AAB", "AAC", "AAD"};
        
        // b.
        // int[] num = new num[10];
        // for(int k=0; k<=num.length(); k++)
        // sum+=num;
        int sum;
        int num[] = new int[10];
        for(int k = 0; k < num.length; k++) {
            sum =+ num[k];
        }
        
        // c.
        // int [][]t = new int[3][];
        // t[1][2] = 5;

        int t[][] = new int[3][6];
        t[1][2] = 5;
        
        // d.
        // int i=4;
        // int []score = new int[5];
        // score [1] = 78;
        // score[++i] = 100;

        int i = 4;
        int score[] = new int[5];
        score[1] = 78;
        score[i] = 100;
    }
}
