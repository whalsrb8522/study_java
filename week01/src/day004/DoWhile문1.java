package day004;

import java.util.Scanner;

public class DoWhile문1 {
	public static void main(String[] args) {
		/*
		 * for, while문은 실행문이 한번도 실행이 안될 수도 있음
		 * do~while은 우선 실행문을 실행 후, 조건문을 확인
		 * 
		 * do {
		 * 		실행문;
		 * } while (조건문)
		 */
		
		/*
		 * 1~10까지 출력
		 */
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 10);
		System.out.println();
		
		/*
		 * 값을 입력하면 그대로 출력하는 구문
		 * 단, y/Y 입력시 종료
		 */
		Scanner sc = new Scanner(System.in);
		char ch;		// 변수 선언
		
		do {
			System.out.print("입력 : ");
			ch = sc.next().charAt(0);		// 입력
			if (ch == 'y' || ch == 'Y') {		// 입력받은 값이 y 또는 Y인 경우 종료
				System.out.println("종료");
				break;
			}
		} while (true);		// 무한반복
		
		do {
			System.out.print("입력 : ");
			ch = sc.next().charAt(0);		// 입력
			System.out.println(ch);
		} while (!(ch == 'y' || ch == 'Y'));
		sc.close();
	}
}
