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

//      Output :
//        Enter Starting Number:
//        10
//        Enter Ending Number:
//        50
//        Numbers between 10 and 50 :
//        10
//        11
//        12
//        13
//        14
//        15
//        16
//        17
//        18
//        19
//        20
//        21
//        22
//        23
//        24
//        25
//        26
//        27
//        28
//        29
//        30
//        31
//        32
//        33
//        34
//        35
//        36
//        37
//        38
//        39
//        40
//        41
//        42
//        43
//        44
//        45
//        46
//        47
//        48
//        49
//        50
