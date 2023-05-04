package day006;

import java.util.Scanner;

public class study01 {
	public static void main(String[] args) {
		/*
		 * 계산기 작성
		 * +, -, *, /, %
		 */
		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;
		char operator;
		
		System.out.println("---계산기---");
		System.out.print("연산자 : ");
		operator = sc.next().charAt(0);
		System.out.print("첫번째 수 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		num2 = sc.nextInt();
		
		switch (operator) {
		case '+':
			System.out.println(sum(num1, num2));
			break;
		case '-':
			System.out.println(min(num1, num2));			
			break;
		case '*':
			System.out.println(mul(num1, num2));			
			break;
		case '/':
			System.out.println(div(num1, num2));			
			break;
		case '%':
			System.out.println(rem(num1, num2));			
			break;
		default:
			break;
		}
		
		sc.close();
	}

	public static int sum(int a, int b) {
		return a + b;
	}
	public static int min(int a, int b) {
		return a - b;
	}
	public static int mul(int a, int b) {
		return a * b;
	}
	public static double div(int a, int b) {
		return (double) a / b;
	}
	public static int rem(int a, int b) {
		return a % b;		
	}
}
