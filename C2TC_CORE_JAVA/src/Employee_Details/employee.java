package Employee_Details;

public class employee {
	private int id;
    private String name, department;

    public employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Dept: " + department;
    }
}
