class Employee {

    // Instance fields
    String empName;
    double salary;

    // Static field
    static String companyName =
            "Bright Horizon Technologies";

    // Static counter
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

        System.out.println(
                "Employees created: " +
                employeeCount
        );
    }
}

public class EmployeeStaticDemo {

    public static void main(String[] args) {

        Employee employee1 =
                new Employee("Ravi", 50000);

        Employee employee2 =
                new Employee("Priya", 60000);

        Employee employee3 =
                new Employee("Arjun", 45000);

        Employee.printCompanyInfo();
    }
}
