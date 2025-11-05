public class L6Q3 {
    
    // Write a Java method that accepts an array of 10 integers. The method should reverse the  integer  
    // in  the  array.  Example,  if  the  number  is  1234,  the  number  will  change  to 4321.  

    public static int[] reverse(int[] array) {
        int[] yarra = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            yarra[i] = array[array.length - 1 - i];
        }
        return yarra;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int [] reverse = reverse(numbers);
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", reverse[i]);
        }
        System.out.println();
    }
}
