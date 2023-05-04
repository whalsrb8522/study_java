package day002;

public class For문2 {

	public static void main(String[] args) {
		/*
		 * Q. 구구단 2단 출력
		 * 2 * 1 = 2 ... 2 * 9 = 18 		
		 */
		int num = 2;
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
//			System.out.printf("%d * %d = %d\n",num, i, (2 * i));
		}
		
		/*
		 * 1~10까지의 홀수의 합, 짝수의 합 출력
		 */
		System.out.println();
		int oddNum = 0;		// 홀수의 합
		int evenNum = 0;	// 짝수의 합
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				oddNum += i;
			} else {
				evenNum += i;
			}
		}
		System.out.println("홀수의 합 : " + oddNum);
		System.out.println("짝수의 합 : " + evenNum);
		
		/*
		 * 구구단 
		 */
		System.out.println();
		for (int i = 2; i <= 9; i++) {
			System.out.printf("[%d단]\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
			System.out.println();
		}
		
		/*
		 * 구구단
		 * 2 * 1 = 2	~	9 * 1 = 9
		 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~
		 * 2 * 9 = 18	~	9 * 9 = 81 
		 */
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, (j * i));
			}
			System.out.println();
		}
	}
	
}