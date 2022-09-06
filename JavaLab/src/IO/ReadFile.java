package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		
		try (FileInputStream bis = new FileInputStream("c:\\workspace\\io_1.txt");){
			
			BufferedInputStream bis = new BufferedInputStream(bis) {
				
			}
			
			System.out.printf("available = %d%n", bis.available());
			int b = bis.read();
			System.out.println("byte = "+b);
			System.out.println((char)b);
			System.out.printf("available = %d%n", bis.available());
			
			while ((b= bis.read()) !=-1) {
				System.out.println((char)b);
			}
			bis.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
