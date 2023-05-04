package day017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class WordMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Word> wordList = new ArrayList<Word>();
		char menu = 0;
		String word = null;
		String mean = null;

		wordList.add(new Word("orange", "오렌지"));
		wordList.add(new Word("banana", "바나나"));
		wordList.add(new Word("apple", "사과"));

		do {
			System.out.println("----- 단어장");
			System.out.println("1. 단어 추가");
			System.out.println("2. 단어 수정");
			System.out.println("3. 단어 삭제");
			System.out.println("4. 단어 검색");
			System.out.println("5. 전체 출력");
			System.out.println("0. 종료");
			System.out.printf("입력: ");
			menu = sc.next().charAt(0);

			System.out.println();
			switch (menu) {
			case '1':
				System.out.println("----- 단어 추가");
				System.out.printf("단어: ");
				word = sc.next();
				System.out.printf("의미: ");
				mean = sc.next();
				wordList.add(new Word(word, mean));
				break;
			case '2':
				System.out.println("----- 단어 수정");
				System.out.printf("단어: ");
				word = sc.next();
				mean = null;

				for (int i = 0; i < wordList.size(); i++) {
					if (wordList.get(i).getWord().equals(word)) {
						System.out.printf("(기존 의미) %s\n", wordList.get(i));
						System.out.printf("의미 수정: ");
						mean = sc.next();
						wordList.get(i).setMean(mean);
						break;
					}
				}

				if (mean == null) {
					System.out.println("단어를 찾을 수 없습니다.");
				}

				break;
			case '3':
				System.out.println("----- 단어 삭제");
				System.out.printf("단어: ");
				word = sc.next();
				mean = null;

				for (int i = 0; i < wordList.size(); i++) {
					if (wordList.get(i).getWord().equals(word)) {
						wordList.remove(i);
						System.out.println("삭제되었습니다.");
						mean = "0";
						break;
					}
				}

				if (mean == null) {
					System.out.println("단어를 찾을 수 없습니다.");
				}

				break;
			case '4':
				System.out.println("----- 단어 검색");
				System.out.printf("단어: ");
				word = sc.next();
				mean = null;

				for (int i = 0; i < wordList.size(); i++) {
					if (wordList.get(i).getWord().equals(word)) {
						System.out.println(wordList.get(i));
						mean = "0";
						break;
					}
				}

				if (mean == null) {
					System.out.println("검색 결과가 없습니다.");
				}

				break;
			case '5':
				System.out.println("----- 전체 출력");

//				wordList.sort(new Comparator<Word>() {
//					@Override
//					public int compare(Word o1, Word o2) {
//						return o1.getWord().compareTo(o2.getWord());
//					}
//				});
				
				Collections.sort(wordList);

				for (int i = 0; i < wordList.size(); i++) {
					System.out.println(wordList.get(i));
				}
				
				break;
			case '0':
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			System.out.println();
		} while (menu != '0');

		sc.close();
	}
}
