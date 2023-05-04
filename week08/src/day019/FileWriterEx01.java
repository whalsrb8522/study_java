package day019;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx01 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("test.txt");

		for (int i = 1; i <= 10; i++) {
			String data = i + " test\n"; // "\r\n": 줄바꿈
			fw.write(data);
		}

		fw.close();

		// 파일을 추가모드로 열기 ("파일명", true)
		FileWriter fw1 = new FileWriter("test.txt", true);

		for (int i = 11; i <= 20; i++) {
			String data = i + " test append\n";
			fw1.write(data);
		}
		
		fw1.close();
	}
}
