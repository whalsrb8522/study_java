package day005;

public class ArrayEx02 {
	public static void main(String[] args) {
		/*
		 * 1~10까지 담고있는 배열 arr 생성 후 출력
		 */
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		
		
		/*
		 * 배열을 섞는 코드, random을 이용
		 * int b = 20;
		 * int a = 10;
		 * int b = 20;
		 * int temp = a;
		 * a = b;
		 * b = temp;
		 * System.out.println(a);
		 * System.out.println(b);
		 * 
		 * 랜덤한 번지를 선택, 다른 번지와 교환
		 */
		
		int min = 0;
		int max = arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * max) + min;		// min부터 max개 랜덤
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		}
		
		System.out.printf("----- 섞은 후 -----\n");
		for (int i : arr) System.out.printf("%d ", i);
		System.out.println();
		
		System.out.printf("----- 오른차순 정렬 후 -----\n");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int i : arr) System.out.printf("%d ", i);
		System.out.println();
		
		System.out.printf("----- 내림차순 정렬 후 -----\n");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int i : arr) System.out.printf("%d ", i);
		System.out.println();
	}
}