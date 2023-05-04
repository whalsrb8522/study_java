package day005;

public class ArrayCopy {
	public static void main(String[] args) {
		/*
		 * String 배열 생성 후 3개의 값을 입력
		 * 배열은 길이를 가지고 있음
		 * 한번 정해진 길이는 이후 추가/삭제가 불가능
		 * 배열의 길이를 늘리거나, 줄이고 싶은 경우 배열복사 ArrayCopy를 이용
		 */
		
		String[] arr1 = {"국어", "영어", "수학"};
		
		System.out.printf("arr1 : ");
		for (String i : arr1) System.out.printf("%s ", i);
		System.out.println();
		
		
		
		/*
		 * 사회, 과학 추가
		 */
		
		String arr2[] = new String[6];
//		arr2 = arr1;		// 하나의 객체를 공유 (arr1의 값이 바뀌면 arr2도 바뀜)
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.printf("arr2 : ");
		for (String i : arr2) System.out.printf("%s ", i);
		System.out.println();
		
		String arr3[] = new String[arr1.length * 2];		// arr1보다 2배의 크기로 arr3 선언
		
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);		// System.arraycopy(복사할 배열, 시작번지, 새배열, 시작번지, 개수);
		
		arr3[3] = "사회";

		System.out.printf("arr3 : ");
		for (String i : arr3) System.out.printf("%s ", i);
	}
}
