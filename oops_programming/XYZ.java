package oops_programming;

import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****** Employee Details ******");
        System.out.print("Enter Employee ID : ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name : ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary : ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        Employee employee = new Employee(empId, name, salary);
        double incomeTaxAmount = employee.calcTax(salary);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Income Tax Amount based on salary (year) : " + incomeTaxAmount);
        System.out.println("---------------------------------------------------------------------");

        System.out.println("****** Product Details ******");
        System.out.print("Enter Product ID : ");
        int pid = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter price : ");
        double price = scanner.nextDouble();
        System.out.print("Enter Quantity : ");
        int qty = scanner.nextInt();
        scanner.nextLine();
        Product product = new Product(pid, price, qty);
        double salesTaxAmount = product.calcTax(price);
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("Sales Tax Amount based on price (include qty) %.2f " , salesTaxAmount);
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
    }
}
