package day007;

public class Method08 {
	public static void main(String[] args) {
		/*
		 * 배열이 주어졌을 때, 배열을 출력하는 메서드 생성
		 */
		int[] arr = {5, 4, 9, 7, 8, 2, 11, 15, 6, 17, 20, 18, 16, 1, 3, 10, 13, 12, 14, 19};
		
		System.out.printf("-----정렬전-----\n");
		printArr(arr);

		System.out.printf("\n-----정렬후-----\n");
		printArr(sortArr(arr));

		System.out.printf("\n-----랜덤배열-----\n");		
		printArr(randomArr(30));

		System.out.printf("\n-----랜덤배열 (정렬후)-----\n");
		printArr(sortArr(randomArr(30)));
	}
	
	/*
	 * 옆으로 출력, 한줄에 5개
	 */
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 5 == 0 && i != 0) {
				System.out.println();
			}
			
			System.out.printf("%d\t", arr[i]);
		}
		System.out.println();
	}
	
	/* 
	 * 정수 배열을 정렬하는 기능
	 */
	public static int[] sortArr(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}					
		}
		
		return arr;
	}
	
	/*
	 * 새로운 배열에 랜덤수를 채워 리턴하는 메서드 (1 ~ 100)
	 */
	public static int[] randomArr(int size) {
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}

		return arr;
	}
}
