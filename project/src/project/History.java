package project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class History {
	

	public static void write(double num1, double num2, char operator, double result) throws IOException {
		File file = new File("history.txt");
		FileOutputStream fOut = new FileOutputStream(file, true);
		OutputStreamWriter osw = new OutputStreamWriter(fOut);
		osw.write(String.valueOf(num1));
		osw.write(String.valueOf(operator));
		osw.write(String.valueOf(num2));
		osw.write("=");
		osw.write(String.valueOf(result));
		osw.write("\n");
		
		osw.flush();
		osw.close();
	}
}
