package branching_and_looping;

import java.util.Scanner;

public class ReverseNumbersUsingLoops {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = obj.nextInt();
        obj.close();

        int reverseNumber = 0;
        while (n != 0) {
            int remainder = n % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            n /= 10;
        }

        System.out.println("Reversed number : " + reverseNumber);

    }
}
