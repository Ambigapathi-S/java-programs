package branching_and_looping;

import java.util.Scanner;

public class SmallestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int a = obj.nextInt();

        System.out.println("Enter Number 2 : ");
        int b = obj.nextInt();

        System.out.println("Enter Number 3 : ");
        int c = obj.nextInt();

        obj.close();

        int smallestNumber = Math.min(a, Math.min(b, c));
        System.out.println("Smallest number is : " + smallestNumber);

    }
}
