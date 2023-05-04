package day001;

public class 연산자 {

	public static void main(String[] args) {
		/* 대입연산자 : = 을 기준으로 오른쪽에 있는 값을 왼쪽에 저장
		 * a = b : b의 값을 a에 저장(대입)
		 * 기존에 있던 a값은 사라진다 (덮어쓰기)
		 * a는 반드시 변수여야만 한
		 */
		int a = 10;
		int b = 20;
		a = 30;			// 기존 a의 값은 사라짐
		b = b + 10;		// 연산 결과를 대입 (== b += 10;)
		System.out.println("a = " + a + ", b = " + b);
		// b + 30 = a	// error 발생

		
		// 산술연산자 : = - * / %
		System.out.println(4 + 3);
		System.out.println(4 - 3);
		System.out.println(4 * 3);
		System.out.println(4 / 3);	// 정수를 정수로 나눌경우 소숫점을 버림 (하나라도 실수가 들어가면 소숫점이 포함됨)
		System.out.println(3 / 2.0);
		System.out.println(4 % 3);	// % : 나머지 연산자
		System.out.println(1.2 + 3.4);
		System.out.println(1.2 - 3.4);
		System.out.println(1.2 * 3.4);
		System.out.println(1.2 / 3.4);
		System.out.println(1.2 % 3.4);
		
		
		// 형변환 : 자료형(==변수 타입)을 바꾸는 것
		int num1 = 3;
		int num2 = 2;
		System.out.println(num1 / num2);
		System.out.println(num1 / (double)num2);	// (double)을 붙여서 형변환
		

		// Q. 국어 70점, 영어 35점, 수학 97점일 때 세과목의 합과 평균을 구하기)
		int kor = 70, eng = 35, mat = 97;
		
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		
		System.out.println("세과목의 합은 " + sum + "점, 평균은 " + avg + "점 입니다.");
		
		
		// 비교 연산자(결과가 true or false), 논리연산자는 if문에서 체크
		
		
		// 삼항연산자 (조건식) ? TRUE : FALSE)
		// 평균이 80이상이면 합격, 아니면 탈락을 표시
		System.out.println(avg >= 80 ? "합격" : "탈락");
	}

}