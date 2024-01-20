package java_advance_concepts;
// problem 3
import java.util.List;
import java.util.stream.Collectors;

public class StudentWithListInterface {
    public static void main(String[] args) {
        List<String> list = List.of("Ambiga", "Raji", "Aadhvik", "Lishanth", "Karthik", "Harini", "Harshini","Anirudh", "Vijay", "Nazii");
        List<String> newList = list.stream()        // Stream API
                                .filter(name -> name.startsWith("A")) // lambda expressions
                                .collect(Collectors.toList());

        System.out.println("Name list which is Starts with 'A' : ");
        for (String s : newList) {  // Name list which is Starts with 'A'
            System.out.println(s);
        }
    }
}

// Output :
//    Name list which is Starts with 'A' :
//    Ambiga
//    Aadhvik
//    Anirudh