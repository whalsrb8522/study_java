package day013;

import java.util.HashMap;
import java.util.Scanner;

public class 과제02 {	
	public static void main(String[] args) {
		/*
		 * 과목과 점수를 입력받아 출력 (합계 평균 같이)
		 * 종료 키워드가 나올때까지 반복 후 전체 값을 0으로
		 * 
		 * ex)
		 * 국어 : 80
		 * 수학 : 97
		 * 0   => 종료
		 * 
		 * 국어 : 80
		 * 수학 : 97
		 * 합계 : ???
		 * 평균 : ???
		 */
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> grade = new HashMap<String, Integer>();
		
		int sum = 0;
		int avg = 0;
		
		while (true) {
			String subject = null;
			int score = 0;
			
			System.out.println("과목 및 점수 순서대로 입력해주세요. 0을 입력하면 종료됩니다.");
			subject = sc.next();
			if (subject.equals("0")) {
				break;
			}
			score = sc.nextInt();
			grade.put(subject, score);
			
			sum += score;
		}

		if (grade.size() != 0) {
			avg = sum / grade.size();
			
			System.out.println("==== 출력 ====");
			for (String tmp : grade.keySet()) {
				System.out.printf("%s : %d\n", tmp, grade.get(tmp));
			}
			System.out.printf("합계 : %d\n", sum);		
			System.out.printf("평균 : %d\n", avg);
		} else {
			System.out.println("입력된 값이 없습니다.");
		}
		
		grade.clear();
		
		sc.close();
	}
}
