package day004;

import java.util.Scanner;

public class DoWhile문2 {
	public static void main(String[] args) {
		/*
		 * ----------menu---------
		 * 1. 저장 | 2. 출력 | 3. 종료
		 * -----------------------
		 * 입력 : 1
		 * 저장되었습니다.
		 * 입력 : 2
		 * 출력되었습니다.
		 * 입력 : 3
		 * 종료되었습니다. (반복문 종료)
		 */
		Scanner sc = new Scanner(System.in);
		char menu;
		
		do {
			System.out.println("----------menu---------");
			System.out.println("1. 저장 | 2. 출력 | 3. 종료");
			System.out.println("-----------------------");
			System.out.print("입력 : ");
			menu = sc.next().charAt(0);
			switch (menu) {
			case '1':
				System.out.printf("(입력 : %c) 저장되었습니다.\n", menu);
				break;
			case '2':
				System.out.printf("(입력 : %c) 출력되었습니다.\n", menu);
				break;
			case '3':
				System.out.printf("(입력 : %c) 종료되었습니다.\n", menu);
				break;
			default:
				System.out.printf("(입력 : %c) 다시입력해주세요.\n", menu);
				break;
			}
			System.out.println();
		} while (menu != '3');

		sc.close();
	}
}
