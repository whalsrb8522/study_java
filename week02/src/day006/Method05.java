package day006;

public class Method05 {
	public static void main(String[] args) {
		/*
		 * 2~100까지 for문을 돌려 isPrime 호출 후 true라면 출력
		 */
		int sum = 0;
		
		for (int i = 2, cnt = 0; i <= 100; i++) {
			if (isPrime(i)) {
				cnt++;
				sum += i;
				System.out.printf("%d\t", i);
			}
			
			if (cnt == 5) {
				System.out.println();
				cnt = 0;
			}
		}
		
		System.out.printf("\n합계 : %d", sum);
	}
	
	/*
	 * 정수가 주어지면 소수인지 아닌지 판별
	 */
	public static boolean isPrime(int num) {
		boolean check = true;
		
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				check = false;
				break;
			}
		}		
		
		return check;
	}
	
//	public static boolean isPrime(int num) {
//		int cnt = 0;
//		
//		for (int i = 2; i <= num; i++) {
//			for (int j =1; j <= num; j++) {
//				if (num % j == 0) {
//					cnt++;
//				}
//			}
//	
//			if(cnt == 2) {
//				return true;
//			}
//			
//			cnt = 0;
//		}
//		
//		return false;
//	}
}
