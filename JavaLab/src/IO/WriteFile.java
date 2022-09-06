package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.sql.ClientInfoStatus;

public class WriteFile {

	public static void main(String[] args) {

		try( FileOutputStream fos = new FileOutputStream("c:\\java\\2.txt"); ) {
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			String message = "Java課"; 
			byte[] bytes = message.getBytes();//String轉成byte[]
			bos.write(bytes);//寫byte[]到檔案
					)}
	}

}
