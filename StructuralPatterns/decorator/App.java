package decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class App {

	public static void main(String[] args) throws Exception{
		File file = new File("./data/sample.txt");
		Reader reader = new FileReader(file);
		//int chr = 0;
		//while((chr = reader.read()) != -1){
		//	System.out.print((char)chr);
		//}
		
		//Decorator
		BufferedReader buff = new BufferedReader(reader);
		buff.lines().forEach(System.out::println);
		
		buff.close();
	}
}
