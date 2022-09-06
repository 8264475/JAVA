package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.zip.ZipException;

public class TestCheckedException {

	public static void main(String[] args) throws FileNotFoundException, ZipException{

		//方法1 try catch
		try {
			FileReader fr = new FileReader("c:\\java\\aaa.txt");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//方法2 throws->在第9行加入throws FilrNotFoundException, ZipException
		FileReader fr = new FileReader("c:\\java\\HelloWorld.java");
				
	}

}
