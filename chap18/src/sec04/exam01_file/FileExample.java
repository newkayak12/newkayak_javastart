package sec04.exam01_file;

import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;

public class FileExample {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("/Users/sanghyeonkim/Downloads/dir");
		File file1 = new File("/Users/sanghyeonkim/Downloads/file1.txt");
		File file2 = new File("/Users/sanghyeonkim/Downloads/file2.txt");
		File file3 = new File(new URI("file:/Users/sanghyeonkim/downloads/file3.txt"));
		
			if(dir.exists() == false	) {
				dir.mkdirs()	;
			}
			
			if(file1.exists() == false) {
				file1.createNewFile();
			}
			
			if(file2.exists() == false) {
				file2.createNewFile();
			}
			
			if(file3.exists() == false) {
				file3.createNewFile();
			}
			
		File temp = new File("/Users/sanghyeonkim/Downloads/");
			File[] contents = temp.listFiles();
			System.out.println("날짜		시간 	   형태 	       크기	이름");
			System.out.println("------------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd    a HH:mm");
				for(File file : contents) {
						System.out.print(sdf.format(new Date(file.lastModified())));
						if(file.isDirectory()) {
							System.out.println("\t  <DIR>\t\t\t"+file.getName());
						} else {
							System.out.println("\t\t\t" + file.length()+"\t"+file.getName());
						}
				}
	}

}
