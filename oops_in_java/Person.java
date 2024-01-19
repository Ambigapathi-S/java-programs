package oops_in_java;
//Problem 1.1
public class Person {

    private String name;
    private static int age = 18;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person = new Person("Aniii" , 19);
        System.out.println("Person Name : " + person.getName());
        System.out.println("Person Age : " + person.getAge());
    }
}

//  Output :
//        Person Name : Aniii
//        Person Age : 19