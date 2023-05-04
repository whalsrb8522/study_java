package day014;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Subject {
	static Scanner sc = new Scanner(System.in);
	static TreeMap<String, Integer> grade = new TreeMap<String, Integer>();
	
	public static void main(String[] args) {
		/*
		 * map을 이용 성적관리 프로그램
		 * >> menu
		 * 1. 성적 추가 (국어 97)
		 * 2. 성적 조회 (전체 출력) : 합계 평균
		 * 3. 성적 조회 (과목) : 서치 후 일치하는 과목 추력
		 * 4. 성적 수정 : 서치 후 수정
		 * 5. 성적 삭제
		 * 6. 종료
		 * 
		 * CRUD : Create, Read, Update, Delete
		 */

		int input = 0;
		
		do {
			try {
				System.out.println("==== MENU ====");
				System.out.println("1. 성적 추가");
				System.out.println("2. 전체 성적 조회");
				System.out.println("3. 과목 성적 조회");
				System.out.println("4. 성적 수정");
				System.out.println("5. 성적 삭제");
				System.out.println("6. 종료");
				System.out.println("==============");
				System.out.print("입력 : ");
				input = sc.nextInt();
		
				switch (input) {
				case 1:
					m1();
					break;
				case 2:
					m2();
					break;
				case 3:
					m3();
					break;
				case 4:
					m4();
					break;
				case 5:
					m5();
					break;
				case 6:
					System.out.println("종료되었습니다.");
					break;
				default:
					System.out.println("다시 입력해주세요.");
					break;
				}
			} catch (Exception e) {
				System.out.println("입력이 잘못되었습니다.");
				System.out.println("다시 입력해주세요.");
			}
		} while (input != 6);
	}
	
	public static void m1() {
		System.out.print("과목 점수 : ");
		sc.nextLine();
		String tmp = sc.nextLine();
		
		String subject = tmp.substring(0, tmp.indexOf(" "));
		int score = Integer.parseInt(tmp.substring(tmp.indexOf(" ") + 1));
		
		if (score < 0 || score > 100) {
			System.out.println("잘못된 점수입니다.");
			return;
		} else if (!grade.containsKey(subject)) {
			grade.put(subject, score);
		} else {
			System.out.println("이미 등록된 과목입니다.");
		}
	}
	
	public static void m2() {
		int sum = 0;
		
		if (!grade.isEmpty()) {
			Iterator<String> it = grade.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.printf("%s : %d\n", key, grade.get(key));
				sum += grade.get(key);
			}
			System.out.printf("합계 : %d\n", sum);
			System.out.printf("평균 : %.2f\n", (double) sum / grade.size());
		} else {
			System.out.println("등록된 과목이 없습니다.");
		}
	}
	
	public static void m3() {
		String search = null;
		System.out.print("검색 과목 : ");
		search = sc.next();
		
		Iterator<String> it = grade.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			if (key.equals(search)) {
				System.out.printf("%s : %d\n", key, grade.get(key));
			}
		}
	}
	
	public static void m4() {
		System.out.print("수정 과목 : ");

		String tmp = sc.nextLine();
		
		String subject = tmp.substring(0, tmp.indexOf(" "));
		int score = Integer.parseInt(tmp.substring(tmp.indexOf(" ") + 1));
		
		if (!grade.containsKey(subject)) {
			System.out.println("검색된 과목이 없습니다.");			
		} else {
			System.out.print("수정 점수 : ");
			score = sc.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("잘못된 점수입니다.");
				return;
			} else {
				grade.put(subject, score);
				System.out.println("수정이 완료되었습니다.");
			}
		}
	}
	
	public static void m5() {
		String search = null;
		System.out.print("삭제 과목 : ");
		search = sc.next();
		
		if (!grade.containsKey(search)) {
			System.out.println("검색된 과목이 없습니다.");
		} else {
			grade.remove(search);
			System.out.println("삭제가 완료되었습니다.");
		}
	}
}
