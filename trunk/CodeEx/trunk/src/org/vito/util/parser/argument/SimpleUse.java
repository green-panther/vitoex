package org.vito.util.parser.argument;

public class SimpleUse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Args arg = new Args("l,p#,d*", args);
			boolean logging = arg.getBoolean('l');
			int port = arg.getInt('p');
			String directory = arg.getString('d');
			executeApplication(logging, port, directory);
		} catch (ArgsException e) {
			System.out.printf("Argument error: %s\n", e.errorMessage());
		}
	}

	private static void executeApplication(boolean logging, int port,
			String directory) {
		System.out.println(logging + ", " + port + ", " + directory);
		
	}
}
