package FileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFileUsingBufferdWritter {

	public static void main(String[] args) throws IOException {

		FileWriter file = new FileWriter("C:\\Users\\HP\\Desktop\\fileWriter.txt");

		BufferedWriter buf = new BufferedWriter(file);
		buf.write("hello naveen, ");

		buf.write("hi dude i will join software company soon, i am seaching for job");
		System.out.println("finished");
		buf.close();
	}

}
