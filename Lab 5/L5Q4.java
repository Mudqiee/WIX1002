public class L5Q4 {
    public static void main(String[] args) {
     
        // Write a program that rotates 90 degrees clockwise a 3 by 3 matrix.
        // 3 by 3 Matrix
        // 1 5 7
        // 3 6 9
        // 5 3 8
        // After rotates 90 degrees clockwise
        // 5 3 1
        // 3 6 5
        // 8 9 7

        int[][] matrix = {
            {1, 5, 7},
            {3, 6, 9},
            {5, 3, 8}
        };
        int[][] rotated_matrix = new int[3][3];

        // for the corners [0][0] -> [0][2] -> [2][2] -> [2][0] 
        // for the edge [0][1] -> [1][2] -> [2][1] -> [1][0]

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rotated_matrix[j][2 - i] = matrix[i][j];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", rotated_matrix[i][j]);
            }
            System.out.println(" ");
        }
    }    
}
