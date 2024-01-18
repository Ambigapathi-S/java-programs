package branching_and_looping;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = obj.nextInt();
        obj.close();
        int temp = n;
        for (int i = n; i >= 1; i--) {
            temp = i;
            for (int j = n; j >= 1; j--) {
                if(i == temp) {
                    if(temp < j) {
                        System.out.print(j + " ");
                    }
                    else {
                        System.out.print(temp + " ");
                    }
                }
                else {
                    System.out.print(j + " ");
                }

            }
            System.out.println();
        }
    }
}
