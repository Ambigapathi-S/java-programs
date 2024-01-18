package branching_and_looping;

import java.util.Scanner;

public class FindPayableAmoutWithDiscount {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Purchase Amount : ");
        double purchaseAmount = obj.nextDouble();
        double withDiscount = 0;
        if(purchaseAmount < 500) {
            withDiscount = purchaseAmount;
        }
        else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            withDiscount = purchaseAmount + (purchaseAmount * ((double) 10 / 100));
        }
        else if(purchaseAmount > 1000) {
            withDiscount = purchaseAmount + (purchaseAmount * ((double) 20 / 100));
        }
        else {
            withDiscount = purchaseAmount;
        }

        System.out.println("Final Payable Amount after appliying the discount : " + withDiscount);
    }
}
