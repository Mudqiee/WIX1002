public class T6Q2 {

    //Write  a  program  that consists  of  a  method  that  can  display  three numbers  in decreasing order.

    public static void sort(int a, int b, int c) {
        int[] array = {a, b, c};
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < 2) {System.out.print(", ");} else {System.out.print("]\n");}
        }
    }

    public static void main (String[] args) {
        sort(5, 2, 6);
        sort(20439, 2, 3);
    }
}
