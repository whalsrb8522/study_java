package day004;

public class 배열2 {
	public static void main(String[] args) {
		/*
		 * 5개 값을 담는 배열을 생성하여 1~5까지의 값을 입력하고 출력 (for문으로 구현)
		 * 출력모양 => 배열이름[번지] = 값
		 */
		int size = 5;
		int[] arr1 = new int[size];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
			System.out.printf("arr[%d] = %d\n", i, arr1[i]);
		}
		System.out.println();
		
		/*
		 * 10개 값을 갖는 배열을 생성하고, 짝수만을 저장하고 출력
		 */
		size = 10;
		int[] arr2 = new int[size];

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (i + 1) * 2;
			System.out.printf("arr[%d] = %d\n", i, arr2[i]);
		}
	}
}