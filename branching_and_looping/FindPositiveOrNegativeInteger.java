package branching_and_looping;

import java.util.Scanner;
// Problem : find the entered number is positive or negative
public class FindPositiveOrNegativeInteger {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = obj.nextInt();
        obj.close();

        if(n == 0) {
            System.out.println("Zero is neither positive nor negative.");
        } else if (n > 0) {
            System.out.println("Entered Number is positive Interger");
        } else {
            System.out.println("Entered number is negative Integer");
        }
    }
}
