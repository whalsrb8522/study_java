package day018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class LambdaEx2 {
	public static void main(String[] args) {
		// stream: 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		// 요소가 하나씩 흘러가는 형태로 처리
		// 스트림을 생성하여 연산을 수해하면 스트림은 소모가 됨
		// 재사용 불가
		// 스트림 연산은 기존 자료를 변경하지 않음
		// 중간 연산: filter(조건에 맞는 요소 추천), distinct(중복 제거), sorted(정렬), map(추출)
		// 최종 연산: sum(), forEach(), reduce()

		Stream<Integer> iStream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		int[] iArr = { 1, 2, 3, 4, 5 };
		int iCnt = (int) Arrays.stream(iArr).count();
		System.out.println(iCnt);
		int iSum = (int) Arrays.stream(iArr).sum();
		System.out.println(iSum);
		OptionalDouble avg = Arrays.stream(iArr).average();
		System.out.println(avg);

		int[] a = { 50, 78, 89, 68, 54, 94, 81 };
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 70) {
				sum1 += a[i];
			}
		}
		System.out.println(sum1);

		int sum2 = Arrays.stream(a).filter(i -> i >= 70).sum();
		System.out.println(sum2);
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(50);
		list.add(78);
		list.add(89);
		list.add(68);
		list.add(54);
		list.add(94);
		list.add(81);
		
		int listSum = list.stream().filter(b -> b >= 70).mapToInt(n -> n.intValue()).sum();
		System.out.println(listSum);		
	}
}
