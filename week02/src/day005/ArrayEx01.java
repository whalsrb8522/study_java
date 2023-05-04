package day005;

public class ArrayEx01 {
	public static void main(String[] args) {
		/*	
		 * 5개 값을 가지는 배열 생성
		 * 1~50 사이의 랜덤값을 저장 후 출력 
		 */
		
		int aNum = 6;
		int[] arr = new int[aNum];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 50) + 1;
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		/*
		 * 향상된 for문
		 */
		for (int i : arr) System.out.printf("%d ", i);
	}
}
