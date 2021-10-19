package file;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception{
		File dir = new File("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/test");
		File url = new File(new URI("file:///Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/test.txt"));

		if(dir.exists() == false){dir.mkdirs();}
		if(url.exists() == false){url.createNewFile();}

		File temp = new File("/Users/sanghyeon/Downloads");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:MM");
		File[] contents = temp.listFiles();
		System.out.println("날짜		시간	형태        	 크기	이름");
		System.out.println("----------------------------------------------------------------");
		for(File file : contents){
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()){
				System.out.print("\t<DIR>\t\t\t"+file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() +"\t" + file.getName());
			}
			System.out.println();
		}

	}
}
