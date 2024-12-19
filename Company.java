import java.util.List;

public class Company {
    private int id;
    private String name;
    private List<Department> departments;

    public Company(int id, String name, List<Department> departments) {
        this.id = id;
        this.name = name;
        this.departments = departments;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        return "Company{id=" + id + ", name='" + name + "', departments=" + departments.size() + "}";
    }
}
