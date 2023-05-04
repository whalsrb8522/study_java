package day001;

// 클래스
public class 변수 {

	// 메소드 : 클래스 안에서 동작이 가능하게 해주는 부분 (반드시 클래스 안에 있어야 함)
	public static void main(String[] args) {
		// 변수명, 클래스명은 한글 사용 가능
		
		
		// print는 항상 main 메소드 안에서만 동작
		System.out.println("method 내부");
		
		
		// 변수 : 리터럴 값을 담는 메모리 공간
		// 변수타입 변수명;
		int num, num2, num3, num4;		// 변수 선언 (같은 자료형일 경우 여러 변수 동시 선언 가능)
		num = 123;						// 값 지정
		int num1 = 456;	// 변수 선언과 값 지정을 한줄에
		byte num5;
		char ch1;
		float fl1;
		boolean bool;
		int appleCount;		// 변수명은 의미 있게 지정
		int applecount;		// 변수명은 대소문자 구분
		// int num;		// 중복 선언 불가
		// 노란 및줄 : 경고, 변수 선언 후 사용하지 않았을 경우
		// 빨간 및줄 : 에러,
		
		
		System.out.println("num의 값 : " + num);
		System.out.println("num1의 값 : " + num1);
		
		
		// Q. a라는 int 변수를 선언, a 변수의 값을 출력하세요.
		int a = 1;
		System.out.println("a의 값은 " + a + "입니다.");
		
		
		// Q. num1과 a변수의 값을 하나의 구문으로 출력
		System.out.println("num1 = " + num1 + ", a = " + a);
		
		
		// 문자
		char ch = '\'';			// "" 문자열, '' 1글자 (변수타입 char는 1글자만 가능)
		// "\" 하고 "'" 표시 가능
		System.out.println("ch : " + ch);
		String str = "abc";		// String 클래스, 문자열 출력 (일반적인 class는 객체를 만들어서 객체로 사용해야하지만, String은 사용 빈도가 높어 자료형처럼 사용 가능)
		System.out.println("str : " + str);
		
		
		//
		int b = 10;				// 10진수의 수 10을 저장 (0~9)
		int c = 010; 			// 8진수의 수 10을 저장 (0~7)
		int d = 0x10;			// 16진수의 수 10을 저장 (0~9~F)
		//int e = 123456789012;	// int 영역의 범위를 넘어섰을 경우 error
		long e = 123456789012L;	// 변수타입 long은 접미사로 L을 붙여야한다.
		
		
		// 기본 실수형은 double로 인식 
		// float형의 실수값을 접미사 f/F를 반드시 써야함
		float f = 1.234F;
		
		
		bool = true;
		boolean bool2 = false;
		
		
		int kor = 100;
		int kor1 = kor;	// = : 대입(오른쪽의 값을 왼쪽에 담아라), kor1 == 100
		
		
		int g = 10, h = 20, y = 50;
		int k, z = 10;
		
			
		// 주석 : 코드에 영향을 미치지 않는 구문, 설명을 위해 사용
		/*
		 * 주석 : 여러 줄도 가능
		 */
	}
	
}