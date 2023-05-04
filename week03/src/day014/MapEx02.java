package day014;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02 {
	static Scanner sc = new Scanner(System.in);
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	public static void main(String[] args) {
		/*
		 * map에 상품명과 가격을 입력받고 출력
		 * 총 지불 가격 출력
		 * 입력 -> 메서드, 출력 -> 메서드
		 * 
		 */
		
		MapEx02 ne = new MapEx02();
		
		for (int i = 0; i < 3; i++) {
			ne.input();
		}
		
		ne.output(ne.map);
		
		sc.close();
	}
	
	public void input() {
		System.out.printf("입력 : ");
		String name = sc.next();
		System.out.printf("출력 : ");
		int price = sc.nextInt();
		
		map.put(name, price);
	}
	
	public void output(HashMap<String, Integer> map) {
		int sum = 0;
		
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.printf("상품 : %s, 가격 : %d\n", key, map.get(key));
			sum += map.get(key);
		}
		
		System.out.printf("합계 금액 : %d", sum);
	}
}
 