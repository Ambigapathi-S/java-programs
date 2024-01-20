package exceptions_and_collections;
// problem Q4
import java.util.HashMap;
import java.util.Scanner;

public class StudentsGrade {
    private String name;
    private int grade;

    public StudentsGrade(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> list = new HashMap<>();
        boolean isQuit = false;
        while(!isQuit) {
            System.out.println("-------------------------------------------------------");
            System.out.println("1. Add a Student");
            System.out.println("2. Remove a Student");
            System.out.println("3. Display up Student's grade by Name");
            System.out.println("Press 0 to quit the process");
            System.out.println("-------------------------------------------------------");
            int n = scanner.nextInt();
            scanner.nextLine();

            if(n == 1) {
                System.out.print("Enter Name : ");
                String name = scanner.nextLine();
                System.out.print("Enter Grade (1-10) : ");
                int grade = scanner.nextInt();
                scanner.nextLine();
                list.put(name, grade);
                System.out.println("************ Student Added ************");
            } else if (n == 2) {
                System.out.print("Enter name to remove student : ");
                String removeName = scanner.nextLine();
                removeStudent(list, removeName);
            } else if (n == 3) {
                System.out.print("Enter Student name to find grade : ");
                String studentName = scanner.nextLine();
                findStudentGrade(list, studentName);
            } else if (n == 0) {
                scanner.close();
                isQuit = true;
            }
            else {
                System.out.println("Press Valid Key or Press 0 to quit");
            }
        }
    }

    private static void findStudentGrade(HashMap<String, Integer> list, String studentName) {
        for (String key : list.keySet()) {
            if(key.equals(studentName)) {
                System.out.println("Name: " + key + " Grade : " + list.get(key));
            }
        }
    }

    private static void removeStudent(HashMap<String, Integer> list, String removeName) {
        for (String key : list.keySet()) {
            if(key.equals(removeName)) {
                list.remove(key);
            }
        }
        System.out.println("************ Removed Student name is " + removeName + " ************");
    }
}


//  Output :
//        -------------------------------------------------------
//        1. Add a Student
//        2. Remove a Student
//        3. Display up Student's grade by Name
//        Press 0 to quit the process
//        -------------------------------------------------------
//        1
//        Enter Name : Ambiga
//        Enter Grade (1-10) : 1
//        ************ Student Added ************
//        -------------------------------------------------------
//        1. Add a Student
//        2. Remove a Student
//        3. Display up Student's grade by Name
//        Press 0 to quit the process
//        -------------------------------------------------------
//        1
//        Enter Name : Raji
//        Enter Grade (1-10) : 2
//        ************ Student Added ************
//        -------------------------------------------------------
//        1. Add a Student
//        2. Remove a Student
//        3. Display up Student's grade by Name
//        Press 0 to quit the process
//        -------------------------------------------------------
//        1
//        Enter Name : Ani
//        Enter Grade (1-10) : 3
//        ************ Student Added ************
//        -------------------------------------------------------
//        1. Add a Student
//        2. Remove a Student
//        3. Display up Student's grade by Name
//        Press 0 to quit the process
//        -------------------------------------------------------
//        3
//        Enter Student name to find grade : Ambiga
//        Name: Ambiga Grade : 1
//        -------------------------------------------------------
//        1. Add a Student
//        2. Remove a Student
//        3. Display up Student's grade by Name
//        Press 0 to quit the process
//        -------------------------------------------------------
//        2
//        Enter name to remove student : Ani
//        ************ Removed Student name is Ani ************
//        -------------------------------------------------------
//        1. Add a Student
//        2. Remove a Student
//        3. Display up Student's grade by Name
//        Press 0 to quit the process
//        -------------------------------------------------------
//        0