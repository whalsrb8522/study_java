package day003;

public class 이중For문1 {
	public static void main(String[] args) {
		/*
		 * for (초기값; 조건식; 증감식;) {
		 * 		실행문
		 * 		for (초기값; 조건식; 증감식;) {
		 * 			실행문
		 * 		}
		 * }
		 */
		
		/*
		 * 5 x 5
		 * *****	// 줄 = i, 별 = j
		 * *****
		 * *****
		 * *****
		 * *****
		 */
		int num = 5;
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print("*");
			}			
			System.out.println();
		}
		System.out.println();
		
		/*
		 * 5 x 5 까지 증가
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		num = 5;
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 * 5 x 5 까지 증가 (좌우 대칭)
		 * ----*
		 * ---**
		 * --***
		 * -****
		 * *****
		 */
		num = 5;
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {		// 공백 = num - i
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {		// 별 = i
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 * 다른 방법 (if문 활용)
		 */
		num = 5;
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if(j <= num - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}System.out.println();
		}
		System.out.println();
		
		/*
		 *    *		i 1, j 3, k 1
		 *   ***	i 2, j 2, k 3	
		 *  *****	i 3, j 1, k 5
		 * *******  i 4, j 0, k 7
		 */
		num = 5;
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}
