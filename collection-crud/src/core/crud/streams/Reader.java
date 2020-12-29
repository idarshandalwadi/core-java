package core.crud.streams;

import core.crud.operations.Operations;

/**
 * <code>Reader</code> class used to display output on the console.
 *
 * @author darshan.dalwadi
 */
public class Reader extends Thread {

	private final Operations operations = new Operations();

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				operations.getAllEmployees();
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {
		new Reader().start();
	}
}
