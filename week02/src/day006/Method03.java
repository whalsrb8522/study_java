package day006;

import java.util.Scanner;

public class Method03 {
	public static void main(String[] args) {
		/*
		 * 계산기 작성
		 * +, -, *, /, %
		 */
		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;
		char operator;
		
		System.out.println("----계산기----");
//		System.out.print("연산자 : ");
//		operator = sc.next().charAt(0);
		System.out.print("첫번째 수 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		num2 = sc.nextInt();
		
//		calc(num1, num2, operator);
		
		System.out.println("몫 : " + rem(num1, num2)[0]);
		System.out.println("나머지 : " + rem(num1, num2)[1]);
		
		sc.close();
	}
	
	public static void calc(int num1, int num2, char operator) {
		System.out.printf("결과 : %d %s %d = ", num1, operator, num2);
		
		switch (operator) {
		case '+':
			System.out.printf("%d", num1 + num2);
			break;
		case '-':
			System.out.printf("%d", num1 - num2);
			break;
		case '*':
			System.out.printf("%d", num1 * num2);
			break;
		case '/':
			System.out.printf("%f", (double) num1 / num2);
			break;
		case '%':
			System.out.printf("%d", num1 % num2);
			break;
		default:
			System.out.println("잘못 입력하였습니다.");
			break;
		}
		
	}
	
	/*
	 * 두 정수를 나눈 몫과 나머지를 double 배열로 리턴
	 */
	public static double[] rem(int num1, int num2) {
		double[] arr = new double[2];
		
		arr[0] = (double) num1 / num2;
		arr[1] = num1 % num2;
		
		return arr;
	}
}
