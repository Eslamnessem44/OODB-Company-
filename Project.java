import java.util.List;

public class Project {
    private int id;
    private String projectName;
    private List<Employee> employees;

    public Project(int id, String projectName, List<Employee> employees) {
        this.id = id;
        this.projectName = projectName;
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Project{id=" + id + ", projectName='" + projectName + "', employees=" + employees.size() + "}";
    }
}
