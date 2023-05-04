package reNew01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class New04 {
	public static void main(String[] args) {
		/*
		 * 컬렉션 프레임워크 - list : 순서보장, 중복가능 - set : 순서보장X, 중복불가능 - map : 2가지 데이터를 쌍으로 저장,
		 * 순서보장X - key(중복 불가능) : value(중복가능)
		 */

		// 리스트를 생성하고, 1~10까지 저장한 후 출력

		ArrayList<Integer> arrList = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			arrList.add(i);
		}

		System.out.printf("리스트 출력 : ");
		for (Integer i : arrList) {
			System.out.printf("%d ", i);
		}

		System.out.println();

//		Iterator<Integer> it = arrList.iterator();
//		while (it.hasNext()) {
//			Integer i = it.next();
//			
//			System.out.printf("%d ", i);
//		}

		// 정수를 입력받아 1부터 정수까지 리스트에 추가하고
		// 리스트와 합을 출력
		Scanner sc = new Scanner(System.in);

		int inputInt = 0;
		int sum = 0;
		ArrayList<Integer> arrList2 = new ArrayList<Integer>();

		System.out.printf("정수 입력 : ");
		inputInt = sc.nextInt();

		for (int i = 1; i <= inputInt; i++) {
			arrList2.add(i);
			sum += i;
		}
		System.out.printf("총합 : %d\n", sum);

		System.out.printf("리스트 출력 : ");
		for (Integer i : arrList2) {
			System.out.printf("%d ", i);
		}

		System.out.println();

		// map을 이용하여 이름:점수 형태로 3명의 이름과 점수를 입력
		// map 출력하고, 합계, 평균 출력
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		int sum2 = 0;

		hashMap.put("김경아", 100);
		hashMap.put("양휘원", 80);
		hashMap.put("조민규", 0);

		for (String key : hashMap.keySet()) {
			sum2 += hashMap.get(key);
			System.out.printf("%s : %d점\n", key, hashMap.get(key));
		}
		System.out.printf("합계 : %d, 평균 : %d\n", sum2, sum2 / hashMap.size());

		Iterator<String> it = hashMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.printf("%s : %s점\n", key, hashMap.get(key));
		}

		// 새로운 맵 하나 생성
		// 스캐너로 이름과 점수를 5명 입력받아 map, 합계, 평균 출력
		HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();

		int sum3 = 0;

		for (int i = 0; i < 5; i++) {
			System.out.printf("이름 입력 : ");
			String name = sc.next();
			System.out.printf("점수 입력 : ");
			int score = sc.nextInt();

			sum3 += score;
			hashMap2.put(name, score);
		}

		for (String key : hashMap2.keySet()) {
			System.out.printf("이름 : %s, 점수 : %d\n", key, hashMap2.get(key));
		}
		System.out.printf("합계 : %d\n", sum3);
		System.out.printf("평균 : %d\n", sum3 / hashMap2.size());

		sc.close();
	}
}
