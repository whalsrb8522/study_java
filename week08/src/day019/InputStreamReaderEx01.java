package day019;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx01 {
	public static void main(String[] args) {
		// 한글 입출력
		System.out.println("한글로 입력해주세요. (Enter)");
		int i;
		
		//InputStreamReader
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			while((i = isr.read()) != '\n') {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
