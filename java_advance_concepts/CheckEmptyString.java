package java_advance_concepts;
// Problem 2
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckEmptyString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","","bc","efg","abcd","","jkl");

        boolean isEmpty = list.contains("");
        if(isEmpty) {
            System.out.println("list contains empty strings");
        } else {
            System.out.println("There is no empty strings in the list");
        }
        System.out.println("Non Emptry Strings are : ");
        List<String> newList = list.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
        for (String i :newList
             ) {
            System.out.println(i);
        }

    }
}

//  Output :
//
//        list contains empty strings
//        Non Emptry Strings are :
//        abc
//        bc
//        efg
//        abcd
//        jkl