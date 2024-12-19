public class Employee {
    private int id;
    private String name;
    private String position;
    private Department department;

    public Employee(int id, String name, String position, Department department) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', position='" + position + "', department=" + department.getName() + "}";
    }
}
