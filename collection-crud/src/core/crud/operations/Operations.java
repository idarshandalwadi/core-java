package core.crud.operations;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import core.crud.pojo.Employee;

/**
 * <code>Operations</code> class contains operations to perform on in-memory
 * collection.
 *
 * @author darshan.dalwadi
 */
public class Operations {

	public static final Map<Integer, Employee> empMap = new HashMap<>();

	/**
	 * Used to get all employees.
	 */
	public void getAllEmployees() {
		if (empMap.isEmpty()) {
			System.out.println("There are no records available.");
		}
		empMap.forEach((k, v) -> {
			System.out.println(v);
		});
	}

	/**
	 * Used to enter an employee.
	 */
	public boolean addEmployee(Employee emp) {

		// If object is there then return error.
		if (!Objects.isNull(empMap.get(emp.getId()))) {
			System.out.println("Record with given ID is already present.");
			return false;
		}
		empMap.put(emp.getId(), emp);
		System.out.println("Record entered successfully.!");
		return true;
	}

	/**
	 * Used to update an employee.
	 */
	public boolean updateEmployee(Employee emp) {

		// If object is not there then return error.
		if (Objects.isNull(empMap.get(emp.getId()))) {

			return false;
		}
		empMap.put(emp.getId(), emp);
		System.out.println("Record updated successfully.!");
		return true;
	}

	/**
	 * Used to delete an employee.
	 */
	public boolean deleteEmployee(int empId) {

		// If object is not there then return error.
		if (Objects.isNull(empMap.get(empId))) {

			return false;
		}
		empMap.remove(empId);
		System.out.println("Record deleted successfully.!");
		return true;
	}
}
