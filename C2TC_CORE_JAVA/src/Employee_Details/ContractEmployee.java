package Employee_Details;

public class ContractEmployee extends employee {
	private double hourlyRate;
    private int hours;

    public ContractEmployee(int id, String name, String dept, double hourlyRate, int hours) {
        super(id, name, dept);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pay: " + (hourlyRate * hours);
    }
}
