package getStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import javax.sound.midi.Patch;

public class FileExample {

	public static void main(String[] args) throws IOException{
		
		Path path = Paths.get("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter16_Stream/getStream/fileExample.txt");
		Stream<String> stream;
		
		
		stream = Files.lines(path,Charset.defaultCharset());
		stream.forEach(System.out::println);
		

		//혹은 파일 객체로 읽어 들이기
		File file  = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream= br.lines();
		stream.forEach(System.out::println);
	}
}
