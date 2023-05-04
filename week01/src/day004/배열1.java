package day004;

public class 배열1 {
	public static void main(String[] args) {
		/*
		 * 배열 : 같은 타입/의미를가지는 변수들의 집합 (참조변수)
		 * 
		 * [배열 선언]
		 * 타입[] 배열이름; 
		 * 타입 배열이름[];
		 * 
		 * [배열 선언/초기화]
		 * 타입[] 배열이름 = new 타입[길이];	// 가장 일반적인 방법
		 * 타입[] 배열이름 = new 타입[]{값1, 값2, 값3, ...}
		 * 타입[] 배열이름 = {값1, 값2, 값3, ...}		// 선언과 동시에 초기화 할때만 가능
		 * 
		 * - 배열의 시작번지(인덱스)는 0부터
		 * - 배열의 길이는 0이상이어야만 한다
		 */
		int[] arr1;
			arr1 = new int[3];		// 초기값 0
		int[] arr2 = new int[5];		// 초기값 0
		int[] arr3 = new int[] {1, 2, 3, 4, 5};
		int[] arr4 = {1, 2, 3, 4, 5};
		
		/*
		 * 배열을 사용하는 이유
		 * 반복문을 이용할 수 있기 때문에 편리
		 * 관리가 쉽다
		 * 배열의 마지막 번지는 총길이 -1
		 * 배열의 총길이를 구하는 메서드 .length
		 */
		System.out.println(arr3);	// 실제 객체가 들어있는 주소로 나옴
		System.out.println(arr3[0]);	// 해당 배열의 0번지에 있는 값
		
		for (int i= 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		System.out.println(arr2[0]);
		arr2[0] = 10;
		System.out.println(arr2[0]);
		arr2[1] = 20;
		System.out.println(arr2[1]);
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i + 10;
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		/*
		 * arr1 배열에 1, 2, 3을 저장하고, 출력하시오
		 */
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
			System.out.print(arr1[i] + " ");			
		}
	}
}
