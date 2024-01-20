package java_advance_concepts;
// Problem 4
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

// problem 4
public class AgeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Date of Birth to Calculate age (yyyy-mm-dd) : ");
        String dob = scanner.nextLine();     // Get daate of birth from user and store it as string
        LocalDate birthdate = LocalDate.parse(dob); // using localDate class convert string to date format
        LocalDate today = LocalDate.now(); // get today date for age calculation

        Period period = Period.between(birthdate, today); // calculate period between birthdate and today date
        // print year , month and day count using date functions
        System.out.println("Your age is " + period.getYears() + " years, " +
                period.getMonths() + " months, and " +
                period.getDays() + " days.");
    }
}

//      Output
//
//        Enter Date of Birth to Calculate age (yyyy-mm-dd) :
//        1990-05-15
//        Your age is 33 years, 8 months, and 5 days.