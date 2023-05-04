package day002;

import java.util.Scanner;

public class If예제 {
	
	public static void main(String[] args) {
		/*
		 * Q. 정수를 입력 받아 정수가 짝수인지 홀수인지 판단하여 출력.
		 */
		Scanner scan = new Scanner(System.in);		// ctrl + shift + o
		
		System.out.println("값을 입력해주세요.");
		int num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		scan.close();
	}

}
