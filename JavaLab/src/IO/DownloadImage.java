package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {

	public static void main(String[] args) throws MalformedURLException {
		//https://graph.facebook.com/AppStore/picture?type=large
		URL url = new URL("https://graph.facebook.com/AppStore/picture?type=large");
		
		try {InputStream is = url.openStream();
			BufferedInputStream bis = new BufferedInputStream(is);
			//寫到檔案
			FileOutputStream fos = new FileOutputStream("c:\\java\\3.jpg");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		} catch (Exception e) {
		 byte[] buffer = new byte[1024];
		 int length;
		 while ( (length = bis.read(buffer)) != -1 {
			bos.write(buffer,0,length);			
		}
		 System.out.println("檔案寫完,請檢查");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
