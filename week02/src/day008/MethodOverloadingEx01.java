package day008;

import java.util.Scanner;

public class MethodOverloadingEx01 {
	static Scanner sc = new Scanner(System.in);
	
	static int n1, n2;
	static char op;
	
	public static void main(String[] args) {
		/*
		 * calc(1, 2, "+")
		 * calc(1, "+", 2)
		 * calc("+", 1, 2)
		 * 메서드 오버로딩을 이용, 정수와 연산자를 입력받아 연산자의 위치에 상관없이 결과를 출력하는 calc 메서드
		 */
		System.out.printf("\n---입력---\n");
		read();
		calc(n1, n2, op);
		
		sc.close();
	}
	
	public static void read() {
		System.out.printf("1번째 입력 : ");
		n1 = sc.nextInt();
		System.out.printf("2번째 입력 : ");
		n2 = sc.nextInt();
		System.out.printf("연산자 입력 : ");
		op = sc.next().charAt(0);
	}
	
	public static void calc(int num1, int num2, char opr) {
		resultPrint(num1, num2, opr);
	}
	
	public static void calc(int num1, char opr, int num2) {
		resultPrint(num1, num2, opr);
	}
	
	public static void calc(char opr, int num1, int num2) {
		resultPrint(num1, num2, opr);
	}
	
	public static void resultPrint(int num1, int num2, char opr) {
		switch (opr) {
		case '+':
			System.out.printf("%d %c %d = %d\n", num1, opr, num2, (num1 + num2));
			break;
		case '-':
			System.out.printf("%d %c %d = %d\n", num1, opr, num2, (num1 - num2));
			break;
		case '*':
			System.out.printf("%d %c %d = %d\n", num1, opr, num2, (num1 * num2));
			break;
		case '/':
			System.out.printf("%d %c %d = %.2f\n", num1, opr, num2, (double) (num1 / num2));
			break;
		case '%':
			System.out.printf("%d %c %d = %d\n", num1, opr, num2, (num1 % num2));
			break;
		default :
			System.out.printf("%c는 잘못된 연산자입니다.\n", opr);
			System.out.printf("다시 입력해주세요.\n");
			read();
			calc(n1, n2, op);
			break;
		}
	}
}
	