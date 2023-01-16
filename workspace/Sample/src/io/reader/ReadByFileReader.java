package io.reader;

import java.io.*;
import java.nio.charset.Charset;

public class ReadByFileReader {
    public static void main(String[] args) throws IOException {
    	
        System.out.println("JVM Encoding="+Charset.defaultCharset());
        try( FileInputStream fis = new FileInputStream(file);
        		InputStreamReader isr = new InputStreamReader(fis,"UTF8");
        		//FileReader fr = new FileReaders(file)
         File file = new File("C:\\java\\workspace\\JavaLab\\char_MS950.txt");
        try(FileInputStream fis File new FileReader(file)){
            
            //改成InputSteamReader
            /*  FileInputStream fis = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(fis, "MS950");
                BufferedReader br = new BufferedReader(isr)
                */
                String line;
                while ( (line = br.readLing()) != null ) {
					System.out.println(line);
					
				}
                }
            //}

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
