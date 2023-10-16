package lab07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.printf("%9s %18s %15s %17s %10s\n", "ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");

        try {
            Scanner orderStream = new Scanner(new FileInputStream("src/lab07/order.txt"));

            while (orderStream.hasNextLine()) {
                String order = orderStream.nextLine();
                String[] orderInfo = order.split(",");

                String productID = orderInfo[1];
                String productName = "";
                int orderQuantity = Integer.parseInt(orderInfo[2]);
                double pricePerUnit = 0;
                double totalPrice = 0;

                Scanner productStream = new Scanner(new FileInputStream("src/lab07/product.txt"));

                while (productStream.hasNextLine()) {
                    String product = productStream.nextLine();
                    String[] productInfo = product.split(",");

                    if (productID.equals(productInfo[0])) {
                        productName = productInfo[1];
                        pricePerUnit = Double.parseDouble(productInfo[2]);
                        totalPrice = pricePerUnit * orderQuantity;

                        productStream.close();
                        break;
                    }
                }
                System.out.printf("%-9s %-25s %8d %17.2f %10.2f\n", productID, productName, orderQuantity, pricePerUnit, totalPrice);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        }
    }
}
