package day003;

import java.util.Scanner;

public class For문4 {
	public static void main(String[] args) {
		/*
		 * Break문 : 반복문을 빠져나오는 역활을 하는 키워드
		 * 반복문에서 조건(if)문을 동반한다.
		 */
		
		/*
		 * 1~100까지의 합계		
		 */

		int i = 1;
		int sum = 0;

		for (;;) {
			System.out.print(i + " ");
			sum += i;
			if (i == 100) {
				break;
			}			
			i++;
		}
		System.out.println();
		System.out.println("1~100까지의 합 : " + sum);
		
		/*
		 * 한글자를 입력받아 그대로 출력
		 * y를 입력받으면 종료
		 */
		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.print("입력(y/Y : 종료) : ");
			char ch = scan.next().charAt(0);		// charAt : 지정한 문자의 위치를 추출
			if (ch == 'y' || ch == 'Y') {
				System.out.println("종료");
				scan.close();
				break;
			} else {
				System.out.println("출력 : " + ch);
			}
		}
	}
}
