package exception;

import java.io.File;
import java.io.FileNotFoundException;

public class TestCheckException2 {

	public static void main(String[] args) {

		try {
			checkFile("c:\\java\\HelloABC.java");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("finish");
	}

	public static void checkFile(String filepath) throws FileNotFoundException {
		File file = new File(filepath);
		if (!file.exists()) {
			//FileNotFoundException fne = new FileNotFoundException("檔案不存在");
			//實務上會寫成一行如下
			throw new FileNotFoundException(filepath+ " 檔案不存在");
		}
	}
}