package day018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDictionary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Word w = new Word();
		char menu = '0';

		do {
			System.out.println("1. 단어 추가");
			System.out.println("2. 단어 출력");
			System.out.println("0. 종료");
			System.out.printf("입력: ");
			menu = sc.next().charAt(0);

			System.out.println();
			switch (menu) {
			case '1':
				w.makeWord(sc);
				break;
			case '2':
				w.printWord();
				break;
			case '0':
				System.out.println("종료하였습니다.");
				return;
			default:
				break;
			}
			System.out.println();
		} while (menu != '0');
	}
}

class Word {
	// hello
	// 1. 안녕
	// 2. 아침인사
	// 3. 반가움
	// => 하나의 단어에 대한 여러 뜻

	// makeWord 메소드
	// y를 입력하면 단어를 입력, n을 입력하면 종료
	// 단어가 이미 있다면 등록 할 수 없게

	// printWord 메소드
	// 단어 출력

	private Map<String, ArrayList<String>> words = new HashMap<>();

	void makeWord(Scanner sc) {
		ArrayList<String> listTmp = new ArrayList<>();

		System.out.printf("단어: ");
		String word = sc.next();

		for (String keyTmp : words.keySet()) {
			if (keyTmp.equals(word)) {
				System.out.println("이미 있는 단어입니다.");
				return;
			}
		}

		System.out.printf("의미 개수: ");
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			System.out.printf("%d번째 의미 : ", i + 1);
			String strTmp = sc.next();
			listTmp.add(strTmp);
		}

		words.put(word, listTmp);
	}

	void printWord() {
		for (String keyTmp : words.keySet()) {
			System.out.printf("단어: %s\n", keyTmp);
			for (String meanTmp : words.get(keyTmp)) {
				System.out.printf("- %s\n", meanTmp);
			}
		}
	}
}