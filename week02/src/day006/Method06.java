package day006;

import java.util.Scanner;

public class Method06 {
	public static void main(String[] args) {
		/*
		 * 구구단 1단을 출력하는 메서드
		 * 7단
		 */
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		System.out.printf("구구단 입력 : ");
		dan = sc.nextInt();
		
		gugudan(dan);

		sc.close();
	}
	
	public static void gugudan(int num) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
		}
	}
}