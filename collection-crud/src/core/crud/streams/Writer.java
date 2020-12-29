package core.crud.streams;

import core.crud.operations.CoreUtility;

/**
 * <code>Writer</code> class used for user interaction.
 *
 * @author darshan.dalwadi
 */
public class Writer extends Thread {

	@Override
	public void run() {

		while (true) {

			System.out.println("Select an operation you want to perform: \n" + "1) Get all employees \n"
					+ "2) Insert a new employee \n" + "3) Update an existing one \n" + "4) Delete an emloyee \n"
					+ "5) Terminate the program\n" + "===============================================");

			CoreUtility.performOperation();
		}
	}
}
