package day013;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 과제01 {
	public static void main(String[] args) {
		/*
		 * 단어장 단어:의미 => hello : 안녕
		 * 
		 * 5개의 단어를 입력하고, 단어장 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// key 및 value의 자료형이 String인 HashMap 객체 생성
		HashMap<String, String> wordBook = new HashMap<String, String>();
		
		// 5번 반복
		for(int i = 0; i < 5; i++) {
			String word = null;
			String mean = null;
			
			System.out.println("==== 입력 ====");
			System.out.printf("단어 : ");
			word = sc.next();
			System.out.printf("의미 : ");
			mean = sc.next();
			
			// 생성했던 HashMap 객체에 입력받은 단어와 의미 넣기 
			wordBook.put(word, mean);
		}
		
		System.out.println("==== 출력 ====");
//		// 향상된 for문을 사용하여 HashMap 객체의 값 출력
//		for (String tmp : wordBook.keySet()) {
//			System.out.printf("%s : %s\n", tmp, wordBook.get(tmp));
//		}
		
		Iterator<String> it = wordBook.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.printf("%s : %s\n", key, wordBook.get(key));
		}
		
		sc.close();
	}
}
