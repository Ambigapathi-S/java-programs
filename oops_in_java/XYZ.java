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
