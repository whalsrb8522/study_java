package day001;

public class If문2 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수의 합계와 평균을 출력, 
		 * 평균이 80 이상이면 합격, 아니면 불합격
		 * 출력 : 합계, 평균, 평가
		 */
		
		int kor = 80;
		int eng = 80;
		int mat = 80;
		
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		if (avg >= 80) {
			System.out.println("평가 : 합격");
		} else {
			System.out.println("평가 : 불합격");
		}
		
		
		// 평가를 A(평균 >= 90), B(>= 80), C(>= 70), D(>= 60), F(< 60)
		if (avg >= 90) { 
			System.out.println("등급 : A");
		} else if (avg >= 80) { 
			System.out.println("등급 : B");
		} else if (avg >= 70) { 
			System.out.println("등급 : C");
		} else if (avg >= 60) { 
			System.out.println("등급 : D");
		} else {
			System.out.println("등급 : F");
		}
	}

}
