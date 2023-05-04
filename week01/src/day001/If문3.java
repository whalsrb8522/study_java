package day001;

import java.util.Scanner;

public class If문3 {

	public static void main(String[] args) {
		/* Scanner 클래스 사용
		 * 값을 입력 받을 때 사용하는 클래스
		 */
		Scanner scan = new Scanner(System.in);		// new : 클래스를 실제 객체로 생성하여 동작하게 하는 것

		int kor = 0, eng = 0, math = 0;		// 지역변수는 무조건 초기화가 필수		
		try {
			System.out.println("점수를 입력해주세요. (0~100)");
			System.out.print("국어 : ");
			kor = scan.nextInt();
			for (; kor < 0 || kor > 100;) {
				System.out.print("(값이 잘못되었습니다. 다시 입력해주세요.) 국어 : ");
				kor = scan.nextInt();
			}
			System.out.print("영어 : ");
			eng = scan.nextInt();
			for (; eng < 0 || eng > 100;) {
				System.out.print("(값이 잘못되었습니다. 다시 입력해주세요.) 영어 : ");
				eng = scan.nextInt();
			}
			System.out.print("수학 : ");
			math = scan.nextInt();
			for (; math < 0 || math > 100;) {
				System.out.print("(값이 잘못되었습니다. 다시 입력해주세요.) 수학 : ");
				math = scan.nextInt();
			}

			// 합계, 평균 계산
			int sum = 0;
			double avg = 0;
			sum = kor + eng + math;
			avg = sum / 3.0;

			
			// 평가를 A(평균 >= 90), B(>= 80), C(>= 70), D(>= 60), F(< 60)
			char ch = 'F';
			if (avg >= 90) {
				ch = 'A';				
			} else if (avg >= 80) {
				ch = 'B';
			} else if (avg >= 70) {
				ch = 'C';
			} else if (avg >= 60) {
				ch = 'D';
			}
			
			System.out.println("");
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("등급 : " + ch);
			
		} finally {
			scan.close();		// 한번 닫으면 다시 열 수 없음
		}
	}

}