package day019;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamEx01 {
	public static void main(String[] args) throws IOException {
		// FileInputStream: 바이트 단위 기반 스트림
		
		byte[] b = new byte[1024];
		
		FileInputStream input = new FileInputStream("out.txt");
		input.read(b);
		System.out.println(new String(b));
		
		input.close();
	}
}
