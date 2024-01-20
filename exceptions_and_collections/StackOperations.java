package exceptions_and_collections;
// Problem Q5:
import java.util.Scanner;
import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        boolean isQuit = false;
        while(!isQuit) {
            System.out.println("1. Push Elements to Stack");
            System.out.println("2. Remove Elements from Stack");
            System.out.println("3. Display all Elements");
            System.out.println("Press 0 to quit");
            System.out.println("------------------------------------------");
            int n = scanner.nextInt();
            scanner.nextLine();

            if(n == 1) {
                System.out.print("Enter How many elements you want to push in Stack ? (eg : 10) : ");
                int count = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter elements one by one : ");
                for (int i = 0; i < count; i++) {
                    int number = scanner.nextInt();
                    stack.push(number);
                }
                System.out.println("******** Elements added to Stack *************");
            } else if (n == 2) {
                removeElementsFromStack(stack);
            } else if (n == 3) {
                System.out.println("Stack Elements : ");
                for (Integer i : stack) {
                    System.out.println(i);
                }
            } else if ( n == 0) {
                isQuit = true;
                scanner.close();
            } else {
                System.out.println("Press valid key or 0 to quit");
            }
        }
    }

    private static void removeElementsFromStack(Stack<Integer> stack) {
        if(!stack.isEmpty()) {
            stack.pop();
            System.out.println("Element removed from stack");
        }
        else {
            System.out.println("You can't delete any because Stack is empty");
        }
    }

}

//  Output :
//  Testcase 1 :
//
//        1. Push Elements to Stack
//        2. Remove Elements from Stack
//        3. Display all Elements
//        Press 0 to quit
//        ------------------------------------------
//        1
//        Enter How many elements you want to push in Stack ? (eg : 10) : 6
//        Enter elements one by one :
//        2
//        5
//        8
//        7
//        5
//        2
//        ******** Elements added to Stack *************
//        1. Push Elements to Stack
//        2. Remove Elements from Stack
//        3. Display all Elements
//        Press 0 to quit
//        ------------------------------------------
//        3
//        Stack Elements :
//        2
//        5
//        8
//        7
//        5
//        2
//        1. Push Elements to Stack
//        2. Remove Elements from Stack
//        3. Display all Elements
//        Press 0 to quit
//        ------------------------------------------
//        2
//        Element removed from stack
//        1. Push Elements to Stack
//        2. Remove Elements from Stack
//        3. Display all Elements
//        Press 0 to quit
//        ------------------------------------------
//        3
//        Stack Elements :
//        2
//        5
//        8
//        7
//        5
//        1. Push Elements to Stack
//        2. Remove Elements from Stack
//        3. Display all Elements
//        Press 0 to quit
//        ------------------------------------------
//        0

// Testcase 2 :
//        1. Push Elements to Stack
//        2. Remove Elements from Stack
//        3. Display all Elements
//        Press 0 to quit
//        ------------------------------------------
//        1
//        Enter How many elements you want to push in Stack ? (eg : 10) : 2
//        Enter elements one by one :
//        2
//        1
//        ******** Elements added to Stack *************
//        1. Push Elements to Stack
//        2. Remove Elements from Stack
//        3. Display all Elements
//        Press 0 to quit
//        ------------------------------------------
//        2
//        Element removed from stack
//        1. Push Elements to Stack
//        2. Remove Elements from Stack
//        3. Display all Elements
//        Press 0 to quit
//        ------------------------------------------
//        2
//        Element removed from stack
//        1. Push Elements to Stack
//        2. Remove Elements from Stack
//        3. Display all Elements
//        Press 0 to quit
//        ------------------------------------------
//        3
//        Stack Elements :
//        1. Push Elements to Stack
//        2. Remove Elements from Stack
//        3. Display all Elements
//        Press 0 to quit
//        ------------------------------------------
//        2
//        You can't delete any because Stack is empty
//        1. Push Elements to Stack
//        2. Remove Elements from Stack
//        3. Display all Elements
//        Press 0 to quit
//        ------------------------------------------