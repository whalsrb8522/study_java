package day005;

import java.util.Scanner;

public class ArrayEx03 {
	public static void main(String[] args) {
		/*
		 * 5자리 숫자를 입력받아, 입력받은 숫자를 거꾸로 출력, 각 자리수 합계
		 * 
		 * ex) 11456 => 65411 => 6 + 5 + 4 + 1 + 1
		 * ex) 19874 => 47891 => 4 + 7 + 8 + 9 + 1  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];

		do {
			System.out.printf("입력 : ");
			num = sc.nextInt();
		} while (num < 0 || num > 99999);
		
		for (int i = 0; i < arr1.length; i++) { 
			arr1[i] = num % 10;
			num /= 10;
			sum = sum + arr1[i];
		}
		
//		int cnt = 0;
//		while (num > 0) {
//			arr1[cnt] = num % 10;
//			num /= 10;
//			sum += arr1[cnt];
//			cnt++;
//		}
		
		for (int i = arr1.length - 1, j = 0; i>= 0; i--, j++) {
			arr2[j] = arr1[i];
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("%d ",arr1[i]);
		}
		System.out.printf("\n합계 : %d\n", sum);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.printf("%d ",arr2[i]);
		}
		
		sc.close();
	}
}
