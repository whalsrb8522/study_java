package day004;

public class 이중For문2 {
	public static void main(String[] args) {
		/*
		 * 아래 출력
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 */
		int num = 9;
		int num2 = 3;

		for (int i = 1; i <= num; i += 3) {
			for (int j = i; j <= i + 2; j ++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
	
		int cnt = 0;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(++cnt + " ");		// ++cnt, cnt++의 차이
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			if (i %  num2 == 0) {
				System.out.println();
			}
		}
	}
}
