package reNew01;

public class New02 {
	public static void main(String[] args) {
		// for문을 이용, 1부터 10까지 출력
		// 1~10까지 합계 출력
		// 1~10까지 짝수합, 홀수합 출력
		
		int sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		
		System.out.printf("1~10 출력 : ");
		for (int i = 1; i <= 10 ; i++) {
			System.out.printf("%d ", i);
			
			sum += i;
			if(i % 2 == 0) {
				evenSum += i;
			} else if (i % 2 == 1) {
				oddSum += i;
			}
		}
		
		System.out.printf("\n합계 : %d", sum);
		System.out.printf("\n홀수 합계 : %d", evenSum);
		System.out.printf("\n짝수 합계 : %d", oddSum);
	}
}
