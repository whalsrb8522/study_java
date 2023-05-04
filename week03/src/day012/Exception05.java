package day012;


public class Exception05 {
	public static void main(String[] args) {
		try {
			int[] arr1 = createRandomArray(-1, 1, 10);
			
			for (int tmp : arr1) {
				System.out.printf("%d ", tmp);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			int[] arr2 = null;
			
			inputRandomArray(arr2, 1, 10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	/*
	 * 메서드 생성
	 * 기능 : 배열의 길이(size 매개변수)가 주어지면 길이만큼 배열을 생성해서 배열을 돌려주는 메서드
	 * 값은 random으로 반환 => random의 범위는 max/min 매개변수로 결정
	 * 
	 * 예외처리
	 * - size가 0보다 작다면
	 * - max가 0보다 작다면 
	 */
	
	public static int[] createRandomArray(int size, int min, int max) throws RuntimeException {
		if (size < 0 || max < 0) {
			throw new RuntimeException("배열 또는 최대값의 크기가 0보다 작습니다.");
		}
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (max - min + 1) + min);
		}
		
		return arr;
	}
	
	/*
	 * 배열을 받아서, 배열에 랜덤값을 채우는 메서드
	 * 
	 * 예외처리
	 * - 배열이 null일경우
	 * - 배열의 길이가 0보다 작을경우
	 */
	
	public static int[] inputRandomArray(int[] arr, int min, int max) throws RuntimeException {
		if (arr == null || arr.length == 0) {
			throw new RuntimeException("배열이 null이거나, 길이가 0입니다.");
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (max - min + 1) + min);
		}
		
		return arr;
	}
}
