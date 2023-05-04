package day013;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {
	public static void main(String[] args) {
		/*
		 * Map
		 * - 값을 2개 저장, key / value 값으로 저장
		 * - key는 중복 불가, value는 중복 가능
		 * - ex) ID/PW, 주문/수량, ...
		 * 
		 * HashMap<K, V> = map = new HashMap<K, V>();
		 * Map은 값이 2개여서 Iterator를 쓸 수 없음
		 * Map -> Set으로 변경 후 출력
		 * 
		 * list, set => .add()/get()
		 * map => .put()/getKey(), getValue()
		 */
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("햄버거", 15000);
		map.put("피자", 20000);
		map.put("음료", 2000);
		map.put("과자", 2000);
		map.put("사탕", 500);
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.get("햄버거"));	// key가 햄버거인 value 가져오기
		
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.printf("%s = %d\n", key, map.get(key));
		}
		System.out.println();
		
		for(String tmp : map.keySet()) {
			System.out.printf("%s = %d\n", tmp, map.get(tmp));
		}
		System.out.println();
		
		System.out.println(map);
		System.out.println(map.entrySet());
		System.out.println();
		
		for (Map.Entry<String, Integer> tmp : map.entrySet()) {
			System.out.printf("%s = %d\n", tmp.getKey(), tmp.getValue());
		}
		System.out.println();
		
		int sum = 0;
		for (int tmp : map.values()) {
			sum += tmp;
		}
		System.out.printf("합계 = %d", sum);
	}
}
