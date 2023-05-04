package day006;

import java.util.Scanner;

public class Method07 {
	public static void main(String[] args) {
		/*
		 * 숫자와 기호를 주고, 기호를 숫자만큼 출력
		 * 
		 * ex)
		 * 3, * => ***
		 * 
		 * ex)
		 * 5, O => OOOOO
		 */
		Scanner sc = new Scanner(System.in);
		
		int num;
		char ch;
		
		System.out.printf("숫자 입력 : ");
		num = sc.nextInt();
		System.out.printf("기호 입력 : ");
		ch = sc.next().charAt(0);
		
		draw(num, ch);
		
		sc.close();
	}
	
	public static void draw(int num, char ch) {
		System.out.printf("출력 : ");
		for (int i = 1; i <= num; i++) {
			System.out.printf("%c", ch);
		}
	}
}
