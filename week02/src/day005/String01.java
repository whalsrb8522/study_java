package day005;

public class String01 {
	public static void main(String[] args) {
		/*
		 * String 클래스 : 문자열을 다루는 클래스
		 * String str = new String();
		 * String str = "가나다";		// 일반 자료형처럼 이용 가능
		 */
		String str = "Hello world~!";
		System.out.println(str);
		
		
		/*
		 * charAt(index) : index 번지에 있는 문자열을반환
		 */
		System.out.println("-----charAt-----");
		System.out.println(str.charAt(0));
		
		
		/*
		 * length : 전체글자의 길이
		 */
		System.out.println("-----length-----");
		System.out.println(str.length());
		
		
		/*
		 * compareTo(str) : str 문자와 비교하여 같으면 0, 사전순으로 앞이면 -1, 뒤면 1
		 */
		System.out.println("-----compareTo-----");
		System.out.println("b".compareTo("a"));	
		
		
		/*
		 * concat(str) : 이어붙이기 (+ 연산자와 같은 의미
		 */
		System.out.println("-----ocncat-----");
		System.out.println("abc".concat("def"));
		System.out.println("abc" + "def");
		
		
		/*
		 * equals(str) : 두 문자열이 같은지 확인 (대소문자 구분)
		 */
		System.out.println("-----equals-----");
		System.out.println("abc".equals("def"));
		System.out.println("abc".equals("abc"));
		System.out.println("abc" == "abc");
		
		
		/*
		 * indexOf(str) : 문자의 위치를 찾아주는 기능, 찾는 문자가 없으면 -1을 반환
		 */
		System.out.println("-----indexOf-----");
		System.out.println("abc".indexOf("b"));
		String email = "whalsrb8522@naver.co.kr";
		System.out.println(email.indexOf("@"));
		System.out.println(email.indexOf("."));		// 첫발견 위치
		System.out.println(email.lastIndexOf("."));	// 끝에서무터 찾기
		
		
		/* 
		 * substring(시작 인덱스, 끝 인덱스) : 문자열 추출 (끝 인덱스 생략시 끝까지)
		 */
		System.out.println("-----substring-----");
		System.out.println(email.substring(2));
		System.out.println(email.substring(0, 5));		// 이상~미만
		System.out.println(email.substring(0, email.indexOf("@")));		// 특정 문자까지 추출
		System.out.println(email.substring(email.indexOf("@") + 1));	// 특정 문자부터 추출
		
		
		/*
		 * trim() : 불필요한 공백 삭제
		 */
		System.out.println("-----trim-----");
		System.out.println("        Hello      ".trim());
		
		
		/* 
		 * replace : 글자 치환 (해당되는 모든 값이 변경됨)
		 */
		System.out.println("-----replace-----");
		System.out.println("Hello World".replace('W', 'w'));
		System.out.println("Hello World".replace('l', 'L'));
		System.out.println("Hello World".replace("World", "JAVA"));
		
		
		/*
		 * split : 특정 값을 기준으로 나누기
		 */
		System.out.println("-----split-----");
		String str1 = "dog, cat, tiger";
		String[] arr = str1.split(",");
		for (String i : arr) System.out.printf("%s ", i);
		System.out.println();
		
		
		/* 
		 * parseInt : 문자를 숫자로 변환
		 */
		System.out.println("-----parseInt-----");
		String num1 = "1";
		String num2 = "2";
		String sum = num1 + num2;	// 문자열이기 때문에 1 + 2 = 12
		System.out.println(sum);
		
		int num3 = Integer.parseInt(num1) + Integer.parseInt(num2);		// Integer : 정수 클래스
		System.out.println(num3);
		
		
		/*
		 * contains : 해당 글자가 포함되어있는지를 체크
		 */
	}
}
