package oops_in_java;
//Problem 1.2
public class Product {
    private int pid;
    private double price;
    private int quantity;

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getPid() {
        return pid;
    }
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}
