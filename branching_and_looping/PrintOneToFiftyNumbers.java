package branching_and_looping;
// Problem :  Write a program to print numbers from  10 to 50 using loop

import java.util.Scanner;
public class PrintOneToFiftyNumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Starting Number: ");
        int a = obj.nextInt();
        System.out.println("Enter Ending Number: ");
        int b = obj.nextInt();
        obj.close();

        System.out.println("Numbers between " + a + " and " + b + " :");
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
