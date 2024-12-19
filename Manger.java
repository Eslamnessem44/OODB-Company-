public class Manager extends Employee {
    private String managedDepartment;

    public Manager(int id, String name, String position, Department department, String managedDepartment) {
        super(id, name, position, department);
        this.managedDepartment = managedDepartment;
    }

    public String getManagedDepartment() {
        return managedDepartment;
    }

    @Override
    public String toString() {
        return super.toString() + ", Managed Department='" + managedDepartment + "'";
    }
}
