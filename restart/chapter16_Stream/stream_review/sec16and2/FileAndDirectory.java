package stream_review.sec16and2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileAndDirectory {
	public static void main(String[] args) throws IOException {
		//File
		Path path = Paths.get("stream_review.sec16and2.stream.txt");
		Stream<String> stream;

			//files의 lines()메소드
			stream=Files.lines(path,Charset.defaultCharset());
			stream.forEach(System.out :: println);

			//bufferedReader의 lines
			File file = path.toFile();
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			stream = br.lines();
			stream.forEach(System.out::println);

		//Directory
		Path path2 = Paths.get("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart");
		Stream<Path> stream2 = Files.list(path2);
		stream2.forEach(p->System.out.println(p.getFileName()));
	}
}
