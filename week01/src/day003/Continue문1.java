package day003;

public class Continue문1 {
	public static void main(String[] args) {
		/*
		 * Continue : 조건이 맞다면 pass
		 */
		
		/*
		 * 1~10 출력, 5만 빼고
		 */
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		/*
		 * 1~10 출력, 홀수는 pass
		 */

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}