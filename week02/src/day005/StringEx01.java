package day005;

import java.util.Scanner;

public class StringEx01 {
	public static void main(String[] args) {
		/*
		 * 5개의 파일명이 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가 있는 파일들을 출력
		 * ex) java => "java"가 포함된 배열값 표시
		 */
		
		Scanner sc = new Scanner(System.in);
		String[] fileName = {
			"java의 정석.txt",
			"이것이 java다.jpg",
			"String 메서드.txt",
			"String 함수.jpg",
			"java의 정석 표시.jpg"
		};
		String search;
		int cnt = 0;
		
		System.out.printf("입력 : ");
		search = sc.next();
		
		System.out.println("결과 : ");
		for (String i : fileName) {
			if (i.contains(search)) {
				System.out.println(i);
				cnt++;
			}
		}
		
		if (cnt == 0) {
			System.out.println("검색값이 없습니다.");
		} else {
			System.out.printf("총 %d건", cnt);
		}
		
		sc.close();
	}
}
