package day019;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx01 {
	public static void main(String[] args) throws IOException {
		// PrintWriter: 개체의 형식화된 표현을 텍스트 출력 스트림으로 출력
		// print, printf, println

		PrintWriter pw = new PrintWriter(System.out);
		String str = "Hello";

		pw.print(str);
		pw.println();
		pw.println(str);
		pw.printf("%.2f", Math.PI);

		pw.flush(); // Memory 내부의 잔류 바이트 청소
		pw.close(); // flush + close

		PrintWriter pw1 = new PrintWriter("test2.txt");

		for (int i = 1; i <= 10; i++) {
			String data = i + " Test2 입니다.";
			pw1.println(data);
		}

		pw1.close();

		// 추가 모드로 파일에 데이터 추가
		// PrintWriter는 추가 모드가 없음, 파일 객체로 생성해서 추가
		PrintWriter pw2 = new PrintWriter(new FileWriter("test2.txt", true));
		
		for (int i = 11; i <= 20; i++) {
			String data = i + " Test2 append 입니다.";
			pw2.println(data);
		}
		
		pw2.append("+");
		pw2.append("Hello");
		
		pw2.close();
	}
}
