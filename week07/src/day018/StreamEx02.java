package day018;

import java.util.Arrays;

public class StreamEx02 {
	public static void main(String[] args) {
		// 배열에서 짝수만 출력(정렬)
		// 중복되는 값은 삭제
		
		int[] arr = {5, 6, 1, 3, 5, 1, 7, 8, 6, 4, 2, 8, 4};
		
		Arrays.stream(arr).sorted().distinct().filter(a -> a % 2 == 0).forEach(System.out::println);
		
		// 짝수 배열을 생성
		
		int[] arr2 = Arrays.stream(arr).sorted().distinct().filter(a -> a % 2 == 0).toArray();

		for (int i : arr2) {
			System.out.println(i);
		}
	}
}
