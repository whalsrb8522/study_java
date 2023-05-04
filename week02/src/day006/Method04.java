package day006;

public class Method04 {
	public static void main(String[] args) {
		/*
		 * 1. 랜덤 정수(1~100) 5개를 배열에 담는 메서드 
		 * 
		 * 2. 1번 메서드의 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
		 * 
		 * 3. 정수 5개와 평균을 출력하는 메서드
		 * 
		 * - main 메서드에서는 연산식이 있으면 안됨 (데이터 전달 및 호출만)
		 */
		int[] a = ranNumArr();
		double b = getAvg(a);
		print(a, b);
	}
	
	public static int[] ranNumArr() {
		int[] ranNum = new int[5];
		
		for (int i = 0; i < ranNum.length; i++) {
			ranNum[i] = (int) (Math.random() * 100 + 1);
		}
		
		return ranNum;
	}
	
	public static double getAvg(int[] arr) {
		int sum = 0;
		
		for (int i : arr) {
			sum += i;
		}
		
		return (double) sum / arr.length;	
	}
	
	public static void print(int[] arr, double avg) {
		System.out.printf("랜덤 정수 : ");
		for (int i : arr) {
			System.out.printf("%d ", i);
		}
		
		System.out.printf("\n평균 : %.2f\n", avg);
	}
}
