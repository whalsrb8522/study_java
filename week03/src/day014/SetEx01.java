package day014;

import java.util.*;

public class SetEx01 {
	public static void main(String[] args) {
		/*
		 * 로또 번호 출력 : set
		 * random으로 생성 1~45까지 중 6개
		 */
		
		TreeSet<Integer> lotto = new TreeSet<Integer>();		// TreeSet : set이 정렬됨
		
		while (lotto.size() < 6) {
			int random = new Random().nextInt(45) + 1;
			lotto.add(random);
		}
		
		System.out.println(lotto.pollFirst());		// 첫번째 값 반환 후 제거
		System.out.println(lotto.pollFirst());
		System.out.println(lotto.pollFirst());
		System.out.println(lotto.pollFirst());
		System.out.println(lotto.pollFirst());
		
//		Iterator<Integer> it = lotto.iterator();
//		while (it.hasNext()) {
//			System.out.printf("%d ", it.next());			
//		}
	}
}
