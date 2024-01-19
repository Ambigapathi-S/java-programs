package oops_in_java;
//Problem 1.4
public class Employee extends PersonBase{
    int employeeID;
    double salary;
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Raji", 20, 1, 50000);
        System.out.println("Employee ID : " + employee.employeeID + " Name : " + employee.getName() + " Age : " + employee.getAge() + " Salary : " + employee.salary);
    }
}

//      Output
//        Employee ID : 1 Name : Raji Age : 20 Salary : 50000.0
