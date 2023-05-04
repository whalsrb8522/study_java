package day003;

import java.util.Scanner;

public class 소수구하기 {
	public static void main(String[] args) {
		/*
		 * 소수 : 약수가 1과 자기자신의 수만 가지는 수
		 * 소수 : 3 5 7 11 13 ...
		 * 소수는 약수가 2개인 수
		 * num을 입력받아 소수인지 아닌지 확인
		 */

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int cnt = 0;
		
		System.out.print("입력 : ");
		num = scan.nextInt();
		System.out.print("약수 : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cnt += 1;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		if (cnt == 2) {
			System.out.println("소수 : O");
		} else {
			System.out.println("소수 : X");
		}
		
		scan.close();
		System.out.println();
		
		/*
		 * 1~100까지 소수만 출력
		 */
				
		for (int i = 1; i <= 100; i++) {
			cnt = 0;
			
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt += 1;
				}
			}
			
			if (cnt == 2) {
				System.out.print(i + " ");
			}
		}
	}
}
