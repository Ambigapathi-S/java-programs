package oops_in_java;
//Problem 1.2
import java.util.HashMap;
import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Product> productInfo = new HashMap<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("**** Product " + i + " Details ****");
            System.out.println("Enter product ID:");
            int pid = scanner.nextInt();

            System.out.println("Enter product price:");
            double price = scanner.nextDouble();

            System.out.println("Enter product quantity:");
            int quantity = scanner.nextInt();

            Product product = new Product(pid, price, quantity);

            productInfo.put(pid, product);
        }

        System.out.println("Highest Price Product : ");
        int tempPid = 0;
        double tempPrice = 0;
        for (int id : productInfo.keySet()) {
            Product product = productInfo.get(id);
            if(tempPrice < product.getPrice()) {
                tempPrice = product.getPrice();
                tempPid = product.getPid();
            }
        }
        for (int id : productInfo.keySet()) {
            Product product = productInfo.get(id);
            if(tempPid == product.getPid()) {
                System.out.print("ID: " + product.getPid() + " Price: " + product.getPrice() + " Quantity: " + product.getQuantity());
                System.out.println();
            }
        }
        totalAmountOfAproduct(productInfo);
    }

    private static void totalAmountOfAproduct(HashMap<Integer, Product> productInfo) {
        System.out.println("Total Amount of each product : ");
        for (int id : productInfo.keySet()) {
            Product product = productInfo.get(id);
            System.out.println("ID: " + product.getPid());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("Total Amount: " + product.getPrice() * product.getQuantity());
            System.out.println();
        }
    }
}


//  output
//        **** Product 1 Details ****
//        Enter product ID:
//        1
//        Enter product price:
//        1000
//        Enter product quantity:
//        5
//        **** Product 2 Details ****
//        Enter product ID:
//        2
//        Enter product price:
//        522
//        Enter product quantity:
//        10
//        **** Product 3 Details ****
//        Enter product ID:
//        3
//        Enter product price:
//        250
//        Enter product quantity:
//        15
//        **** Product 4 Details ****
//        Enter product ID:
//        10
//        Enter product price:
//        125
//        Enter product quantity:
//        10
//        **** Product 5 Details ****
//        Enter product ID:
//        5
//        Enter product price:
//        1222
//        Enter product quantity:
//        1
//        Highest Price Product :
//        ID: 5 Price: 1222.0 Quantity: 1
//        Total Amount of each product :
//        ID: 1
//        Price: 1000.0
//        Quantity: 5
//        Total Amount: 5000.0
//
//        ID: 2
//        Price: 522.0
//        Quantity: 10
//        Total Amount: 5220.0
//
//        ID: 3
//        Price: 250.0
//        Quantity: 15
//        Total Amount: 3750.0
//
//        ID: 5
//        Price: 1222.0
//        Quantity: 1
//        Total Amount: 1222.0
//
//        ID: 10
//        Price: 125.0
//        Quantity: 10
//        Total Amount: 1250.0