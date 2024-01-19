package oops_programming;

public class Employee implements Taxable{

    int empId;
    String name;
    double salary;
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public double calcTax(double salary) { // employee salary tax calculation for year
        double incomeTaxAmount = (salary * 12) * (incomeTax / 100);
        return incomeTaxAmount;
    }
}
