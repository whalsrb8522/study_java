package day002;

public class 과제 {
	public static void main(String[] args) {
		/*
		 * Q. 1~100까지 2의 배수를 출력
		 * 
		 * 2 4 6 8 20
		 * 12 13 16 18 20
		 * 22 24 26 28 30 
		 * ~~~
		 */		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d\t", i);
				if (i % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
}
