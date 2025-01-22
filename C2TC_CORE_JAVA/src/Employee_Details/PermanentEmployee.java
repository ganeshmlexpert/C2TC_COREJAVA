package Employee_Details;

public class PermanentEmployee extends employee {
	private double salary;

    public PermanentEmployee(int id, String name, String dept, double salary) {
        super(id, name, dept);
        this.salary = salary;
        System.out.println("pe working");
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
}
