package day003;

public class 소수구하기_다른방법 {
	public static void main(String[] args) {
		/*
		 * 소수 구하기
		 */
		boolean flag = false;		// 소수 판별
		
		for (int i = 2; i <= 100; i++) {		// 2~100
			for (int j = 2; j < i; j++) {
				if (i % j == 0) { 		// 자기자신보다 낮은 수로 나누었을때, 나머지가 0이면 소수가 아님
					flag = false;
					break;
				} else { 		// 자기자신보다 낮은 수로 나누었을때, 나머지가 0이 아니면 소수
					flag = true;
				}
			}
			if (flag == true) {
				System.out.print(i + " ");
			}
		}
	}
}
