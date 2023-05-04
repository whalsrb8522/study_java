package day006;

import java.util.Scanner;

public class 과제02 {
	static Scanner sc = new Scanner(System.in);
	
	static int[] numArr = new int[2];
	
	public static void main(String[] args) {
		/* 
		 * 계산기 (+ - * / %) 작성
		 * 메서드 각각 작성 후 출력도 포함
		 * 
		 * 1. 숫자를 입력받는 메서드 (배열로 받을것)
		 * 
		 * 2. 메뉴 메서드 (원하는 계산 선택)
		 * ex)	1: 덧셈
		 * 		2: 뺄셈
		 * 		3: 곱셈
		 * 		4: 나눗셈
		 * 		5: 나머지
		 * main에서 switch로 계산 메서드 호출
		 * 
		 * 3. 각 기능 메서드 => 메서드에서 바로 출력 
		 * 
		 * 
		 * main에서
		 * 		1) 1번 메서드 호출 => 숫자를 배열로 저장
		 * 		2) 2번 메서드 호출 => 선택한 번호 가져오기
		 * 		3) switch (2번 리턴)
		 * 		4) case에 따라 계산기 호출 
		 */
		input();
		
		switch (menu()) {
			case 1:
				doSum();
				break;
			case 2:
				doSub();
				break;
			case 3:
				doMul();
				break;
			case 4:		
				doDiv();	
				break;
			case 5:
				doRem();
				break;
			default:
				break;
		}
		
		sc.close();
	}
	
	public static int[] input() {
		for (int i = 0; i < numArr.length; i++) {
			System.out.printf("%d번째 숫자 입력 : ", i + 1);
			numArr[i] = sc.nextInt();
		}				
		return numArr;
	}
	
	public static int menu() {
		int operator;
		
		System.out.printf("\n-----계산기-----\n");
		System.out.printf("1: 덧셈\n");
		System.out.printf("2: 뺄셈\n");
		System.out.printf("3: 곱셈\n");
		System.out.printf("4: 나눗셈\n");
		System.out.printf("5: 나머지\n");
		System.out.printf("입력 : ");
		
		operator = sc.nextInt();

		return operator;
	}
	
	public static void doSum() {
		System.out.printf("\n결과 : %d", numArr[0] + numArr[1]);
	}
	
	public static void doSub() {
		System.out.printf("\n결과 : %d", numArr[0] - numArr[1]);
	}
	
	public static void doMul() {
		System.out.printf("\n결과 : %d", numArr[0] * numArr[1]);
	}
	
	public static void doDiv() {
		System.out.printf("\n결과 : %f", (double) numArr[0] / numArr[1]);
	}
	
	public static void doRem() {
		System.out.printf("\n결과 : %d", numArr[0] % numArr[1]);
	}
}
