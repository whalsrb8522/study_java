package day014;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx01 {
	// 멤버변수 자리
	private HashMap<String, String> map = new HashMap<String, String>();
	Scanner sc = new Scanner(System.in);
	private int size = 5;
	
	public static void main(String[] args) {
		/*
		 * 단어장 -> 메서드로 변경
		 * 단어를 입력받는 메서드 생성
		 * 
		 * 1. 저장공간을 어디에다가 둘지
		 * - 멤버변수 : 공용 변수
		 * - main : 외부 메서드에서 매개변수로 받는 형태
		 * - 메서드 내부에 생성 : 리턴의 형태
		 * 
		 * 2. 저장공간에따른 매개변수와 리턴타입, 메서드명 결정 => interface 생성
		 */
		
//		HashMap<String, String> map = new HashMap<String, String>();
		
		MapEx01 ex = new MapEx01();
//		HashMap<String, String> map1 = ex.make3();
		
		
		// 1번 형태
		ex.make();
		
		// 3번형태
		HashMap<String, String> map = ex.make3();
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();
			String mean = ex.map.get(word);
			System.out.printf("단어 : %s, 의미 : %s", word, mean);
		}
	}

	/* 
	 * 메서드 자리 : 리턴타입, 매개변수, 메서드명을 결정
	 * 매개변수로 map이 있는 형태 (공용) 리턴X 매개변수X
	 */
	public void make() {
		while(map.size() < size) {
			System.out.print("단어 : ");
			String word = sc.next();
			System.out.print("의미 : ");
			String mean = sc.next();
			
			map.put(word, mean);
		}
	}
	
	/*
	 * 외부에 map이 있는 형태 (매개변수로 map을 가져오기)
	 */
	public void make2(HashMap<String, String> map) {
		
	}
	
	/*
	 * 메서드 내부에서 map 생성하는 형태 (리턴이 map인 형태)
	 */
	public HashMap<String, String> make3() {
		HashMap<String, String> map = new HashMap<String, String>();

		while(map.size() < size) {
			System.out.print("단어 : ");
			String word = sc.next();
			System.out.print("의미 : ");
			String mean = sc.next();
			
			map.put(word, mean);
		}
		
		return map;
	}
}