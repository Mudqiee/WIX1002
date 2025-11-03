public class T5Q1 {
    public static void main(String[] args) {
        
        // Write statements for each of the following
        
        // a. Declare an array that used to store 12 floating point numbers.
        float numbers[];
         
        // b. Initialize an array that used to store the value of A to E.
        char characters[] = {'A', 'B', 'C', 'D', 'E'};

        // c. Declare an array that used to store 100 students name.
        String students_name[] = new String[100];

        // d. Declare an array for a table with 6 rows 2 columns that used to store integer value.
        int value[][] = new int[6][2];

        // e. Initialize an array with the following value:
        // | 6 9 |
        // | 2 5 |
        // | 4 6 |
        int an_array[][] = {{6, 9}, {2, 5}, {4, 6}};

        // f. After initialize the array, modify the value of the above array to 
        // | 6 9 |
        // | 2 4 |
        // | 3 7 |
        an_array[1][1] = 5;
        an_array[2][0] = 3;
        an_array[2][1] = 7;

        //g. Display all the values of an array name contact in separate lines.
        String name_contact[] = {"Abu", "Ali", "Eugene", "Anas", "Mark", "Khalid", "Tyrone"};
        for (int i = 0; i < name_contact.length; i++) {
            System.out.println(name_contact[i]);
        }
    }
}
