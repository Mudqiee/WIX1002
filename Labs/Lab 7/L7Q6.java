import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class L7Q6 {
    
    public static void main(String[] args) {

        // Write programs that merge data from two text files namely product.txt and order.txt.
        // The product.txt contains the ProductID, ProductName, ProductPrice separated by comma.
        // The order.txt contains the OrderID, ProductID, OrderQuantiy separated by comma.
        // Your program will display the ProductID, ProductName, OrderQuantity, PricePerUnit and TotalPrice for each order.
        // ProductID  ProductName         Quantity   PricePerUnit   Total
        // SK079      Dettol Natural      20         4.99           99.80
        // SK013      100 Plus            74         6.49           480.26
        // SK088      Jasmine Pearl       27         37.99          1025.73
        // SK042      Ayamas Nuget Crispy 60         9.99           599.40
        // SK066      Ali Cafe            79         8.99           710.21s

        //Might not the most efficient solution but it's what it's

        try {

            //Extract the order data
            // {
            //     {orderID_0, productID_0, orderQuantity_0}, 
            //     {orderID_1, productID_1, orderQuantity_1}, 
            //     {orderID_2, productID_2, orderQuantity_2}, 
            //     ...
            // }
            Scanner orderCountStream = new Scanner(new FileInputStream("./Labs/Lab 7/data/order.txt"));
            int orderCount = 0;
            while(orderCountStream.hasNextLine()) {
                orderCountStream.nextLine();
                orderCount++;
            }
            orderCountStream.close();
            Scanner orderInputStream = new Scanner(new FileInputStream("./Labs/Lab 7/data/order.txt"));
            String[][] order = new String[orderCount][3];
            for (int i = 0; i < orderCount; i++) {
                String[] currentLine = orderInputStream.nextLine().split(",");
                for (int j = 0; j < 3; j++) {
                    order[i][j] = currentLine[j];
                }
            }
            orderInputStream.close();

            //Extract the product data
            // {
            //     {productID_0, productName_0, productPrice_0}, 
            //     {productID_1, productName_1, productPrice_1}, 
            //     {productID_2, productName_2, productPrice_2}, 
            //     ...
            // }
            Scanner productCountStream = new Scanner(new FileInputStream("./Labs/Lab 7/data/product.txt"));
            int productCount = 0;
            while(productCountStream.hasNextLine()) {
                productCountStream.nextLine();
                productCount++;
            }
            productCountStream.close();
            Scanner productInputStream = new Scanner(new FileInputStream("./Labs/Lab 7/data/product.txt"));
            String[][] product = new String[productCount][3];
            for (int i = 0; i < productCount; i++) {
                String[] currentLine = productInputStream.nextLine().split(",");
                for (int j = 0; j < 3; j++) {       
                    product[i][j] = currentLine[j];
                }
            }
            productInputStream.close();

            //Merging da order and product
            // {
            //     {productID_0, productName_0, quantity_0, pricePerUnit_0, total_0},
            //     {productID_1, productName_1, quantity_1, pricePerUnit_1, total_1},
            //     {productID_2, productName_2, quantity_2, pricePerUnit_2, total_2},
            //     ... 
            // }
            String[][] mergedArray = new String[orderCount][5];
            for (int i = 0; i < orderCount; i++) {
                mergedArray[i][0] = order[i][1];
                for (int j = 0; j < productCount; j++) {
                    if (order[i][1].equals(product[j][0])) {
                        mergedArray[i][1] = product[j][1];
                        mergedArray[i][2] = order[i][2];
                        mergedArray[i][3] = product[j][2];
                        mergedArray[i][4] = String.format("%.2f", Integer.parseInt(mergedArray[i][2]) * Double.parseDouble(mergedArray[i][3]));
                        break;
                    }
                }//im so damn tired rn T-T
            }

            //Displaying the merged array
            System.out.println("Product ID   Product Name        Quantity   Price per Unit   Total");
            for (int i = 0; i < orderCount; i++) {    
                System.out.printf("%-13s%-20s%-11s%-17s%-5s\n", mergedArray[i][0], mergedArray[i][1], mergedArray[i][2], mergedArray[i][3], mergedArray[i][4]);
            }


        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
