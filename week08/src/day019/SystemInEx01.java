package day019;

import java.io.IOException;

public class SystemInEx01 {
	public static void main(String[] args) {
		// 알파벳 하나를 쓰고 Enter를 누루면 알파벳을 콘솔에 출력

		System.out.println("알파벳 하나를 쓰고 Enter: ");

		int i;
		try {
			while ((i = System.in.read()) != '\n') {
//				System.out.println(i);
				System.out.print((char) i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
