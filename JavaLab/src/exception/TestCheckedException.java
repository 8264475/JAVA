package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestCheckedException {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("c:\\java\\aaa.txt");
		}catch (FileNotFoundExceptione e) {
			e.printStackTrace();
		}
		
		
	}

}
