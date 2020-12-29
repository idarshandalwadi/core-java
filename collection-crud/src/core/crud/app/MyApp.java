package core.crud.app;

import core.crud.streams.Writer;

/**
 * Driver class of an Application.
 *
 * @author darshan.dalwadi
 */
public class MyApp {

	public static void main(String[] args) {
		new Writer().start();
	}

}
