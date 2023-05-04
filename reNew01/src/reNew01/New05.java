package reNew01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class New05 {
	static HashMap<String, String> wordList = new HashMap<String, String>();
	
	public static void main(String[] args) {
		// 단어장, map, 단어 : 의미
		// hello : 안녕
		// 입력받을 단어의 개수를 입력받아서 그만큼 map에 단어의 의미를 추가
		// 콘솔에 찍기
		Scanner sc = new Scanner(System.in);
		
		wordInput(sc);
		
		wordOutput();
		
		sc.close();
	}
	
	// 단어 : 의미를 입력받아서 map으로 구성한 후 리턴
	static void wordInput(Scanner sc) {
		int cnt = 0;

		System.out.printf("입력할 단어 개수 : ");
		cnt = sc.nextInt();
		
		for (int i = 1; i <= cnt; i++) {
			System.out.printf("%d/%d 단어 입력\n", i, cnt);
			
			System.out.printf("단어 : ");
			String word = sc.next();
			System.out.printf("의미 : ");
			String mean = sc.next();;
			
			wordList.put(word, mean);
		}
	}
	
	static void wordOutput() {
		System.out.printf("----- 단어장 -----\n");
		Iterator<String> iter = wordList.keySet().iterator();
		while (iter.hasNext()) {
			String word = iter.next();
			System.out.printf("▷ 단어 : %s, 의미 : %s\n", word, wordList.get(word));
		}
	}
}
