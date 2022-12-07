package FileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		FileReader file=new FileReader("C:\\Users\\HP\\Desktop\\fileWriter.txt");
		BufferedReader buf=new BufferedReader(file);
		
		/*String str;
		while((str=buf.readLine())!=null) {
			System.out.println(str);
		}*/
		System.out.println(buf.readLine());
		buf.close();
	}

}
