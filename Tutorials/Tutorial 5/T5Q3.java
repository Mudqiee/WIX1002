public class T5Q3 {
    public static void main(String[] args) {
        
        // 3. Determine the values of each element of array marks. Assume the array was declared as:
        int[] marks = new int[5];
        int i = 0, j = 1;
        marks[i] = 12;
        marks[j] = marks[i] + 19;
        marks[j - 1] = marks[j] * marks [j];
        marks[j * 3] = marks[i + 1];
        marks[++j] = marks[i] % 5;
        marks[2 * j] = marks[j - 1];

        //[961, 31, 1, 31, 31]

        System.out.print("[");
        for (int k = 0; k < marks.length; k++) {
            System.out.print(marks[k]);
            if (k < marks.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
