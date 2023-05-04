package day004;

public class While문1 {
	public static void main(String[] args) {
		/*
		 * while (조건식) {
		 * 		실행문;	// 조건식이 false가 될수있는 구문을 포함해야 함.
		 * }
		 */
		
		/*
		 * 1~10 출력
		 */
		int i = 1;						// 초기화
		while (i <= 10) {				// 조건식
			System.out.print(i + " ");	// 실행문
			i++; 						// 증감식
		}
		System.out.println();
		
		for (i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		/*
		 * 1~10 짝수 출력
		 */
		i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		
		i = 0;
		while (i <= 10) {
			i++;
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
