package assignment_problems;

class Employee {
    String empName;
    double salary;

    // Static fields
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    // Constructor
    Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    // Static method
    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class EmployeeCompany {
    public static void main(String[] args) {

        // Create three Employee objects
        Employee e1 = new Employee("Arjun", 30000);
        Employee e2 = new Employee("Priya", 35000);
        Employee e3 = new Employee("Divya", 40000);

        // Call static method using class name
        Employee.printCompanyInfo();
    }
}