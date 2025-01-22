package Employee_Details;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        List<employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("\nType (Permanent/Contract): ");
            String type = scanner.next();

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Department: ");
            String dept = scanner.nextLine();

            if (type.equalsIgnoreCase("Permanent")) {
                System.out.print("Salary: ");
                double salary = scanner.nextDouble();
                employees.add(new PermanentEmployee(id, name, dept, salary));
            } else if (type.equalsIgnoreCase("Contract")) {
                System.out.print("Hourly Rate: ");
                double rate = scanner.nextDouble();
                System.out.print("Hours: ");
                int hours = scanner.nextInt();
                employees.add(new ContractEmployee(id, name, dept, rate, hours));
            } else {
                System.out.println("Invalid type!");
                i--;
            }
        }

        System.out.println("\nEmployee Details:");
        employees.forEach(System.out::println);
        scanner.close();

	}

}
