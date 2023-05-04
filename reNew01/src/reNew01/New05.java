package reNew01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class New05 {
	
	public static void main(String[] args) {
		// 단어장, map, 단어 : 의미
		// hello : 안녕
		// 입력받을 단어의 개수를 입력받아서 그만큼 map에 단어의 의미를 추가
		// 콘솔에 찍기
		HashMap<String, String> wordList;
		
		wordList = wordInput();
		
		wordOutput(wordList);
	}
	
	// 단어 : 의미를 입력받아서 map으로 구성한 후 리턴
	static HashMap<String, String> wordInput() {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> map = new HashMap<String, String>();
		int cnt = 0;

		System.out.printf("입력할 단어 개수 : ");
		cnt = sc.nextInt();
		
		for (int i = 1; i <= cnt; i++) {
			System.out.printf("%d/%d 단어 입력\n", i, cnt);
			
			System.out.printf("단어 : ");
			String word = sc.next();
			System.out.printf("의미 : ");
			String mean = sc.next();;
			
			map.put(word, mean);
		}
		
		sc.close();
		return map;
	}
	
	static void wordOutput(HashMap<String, String> map) {
		System.out.printf("----- 단어장 -----\n");
		Iterator<String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			String word = iter.next();
			System.out.printf("▷ 단어 : %s, 의미 : %s\n", word, map.get(word));
		}
	}
}
