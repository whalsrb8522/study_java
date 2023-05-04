package day003;

import java.util.Scanner;

public class For문3 {
	public static void main(String[] args) {
		/*
		 * Q. 1~10까지 합계
		 */
		int sum = 0;
		for (int i = 1; i <=100; i++) { 
			sum += i;
		}
		System.out.println(sum);
		
		/*
		 * Q. 약수 구하기
		 * 약수 : 나누어서 떨어지는 수들의 모임.
		 * 12의 약수 : 1, 2, 3, 4, 6, 12
		 */
		int num = 12;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		/*
		 * 입력 받아서 약수 구하기
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("약수를 구하려는 값 입력 : ");
		num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}
}
