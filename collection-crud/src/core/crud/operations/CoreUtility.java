package core.crud.operations;

import java.util.Scanner;

import core.crud.pojo.Employee;

/**
 * <code>CoreUtility</code> Acts as a core utility class of an Application.
 *
 * @author darshan.dalwadi
 */
public class CoreUtility {

	private static final String SEPARATION_LINE = "------------------------------\n";

	public static void performOperation() {

		final Scanner sc = new Scanner(System.in);
		final int userChoice = sc.nextInt();

		final Operations operations = new Operations();

		switch (userChoice) {
		case 1:
			operations.getAllEmployees();
			System.out.println(SEPARATION_LINE);
			break;
		case 2:
			System.out.println("Enter employee details to enter a new record: \n1)Id (Numeric), 2)Name, 3)City");
			final Employee addEmp = new Employee();
			addEmp.setId(sc.nextInt());
			addEmp.setName(sc.next());
			addEmp.setCity(sc.next());
			operations.addEmployee(addEmp);
			System.out.println(SEPARATION_LINE);
			break;
		case 3:
			System.out.println("Enter employee details to update a record:");
			final Employee updateEmp = new Employee();
			updateEmp.setId(sc.nextInt());
			updateEmp.setName(sc.next());
			updateEmp.setCity(sc.next());
			operations.updateEmployee(updateEmp);
			System.out.println(SEPARATION_LINE);
			break;
		case 4:
			System.out.println("Enter employee id to delete a record:");
			operations.deleteEmployee(sc.nextInt());
			System.out.println(SEPARATION_LINE);
			break;
		case 5:
			System.out.println("Thank You.!");
			System.exit(1);
			break;
		default:
			System.err.println("Excuse me, You've entered wrong option.");
			break;
		}

	}
}
