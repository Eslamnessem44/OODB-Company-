import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Departments
        Department sales = new Department(1, "Sales");
        Department engineering = new Department(2, "Engineering");

        // Create Employees
        Employee john = new Employee(1, "John Doe", "Sales Executive", sales);
        Employee jane = new Employee(2, "Jane Smith", "Engineer", engineering);
        
        // Create Manager
        Manager manager = new Manager(3, "Mark Jones", "Sales Manager", sales, "Sales");

        // Add Employees to Departments
        sales.addEmployee(john);
        engineering.addEmployee(jane);

        // Create Projects
        List<Employee> projectEmployees = new ArrayList<>();
        projectEmployees.add(john);
        Project projectA = new Project(1, "Project A", projectEmployees);

        // Create Company
        List<Department> departments = new ArrayList<>();
        departments.add(sales);
        departments.add(engineering);
        Company company = new Company(1, "TechCorp", departments);

        // Display Information
        System.out.println("Company: " + company);
        System.out.println("Sales Department: " + sales);
        System.out.println("Employees: " + john);
        System.out.println("Manager: " + manager);
        System.out.println("Project: " + projectA);
    }
}
