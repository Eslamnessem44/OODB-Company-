import java.util.ArrayList;
import java.util.List;

public class Department {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "Department{id=" + id + ", name='" + name + "', employees=" + employees.size() + "}";
    }
}
