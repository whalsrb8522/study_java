package day005;

public class Method01 {
	public static void main(String[] args) {
		/*
		 * 메소드 : 기능/함수
		 * 
		 * 접근제한자 : 접근할수 있는 주체의 제한범위
		 * - public : 
		 * - static :  
		 * 
		 * 리턴타입 : 메소드의 실행 결과로 받을 수 있는 정보의 값
		 * - void : 리턴값 없음
		 * 
		 * 메소드명 : 소문자로 시작
		 * 
		 * 매개변수 : 메소드를 실행하기위해서 필요로하는 값
		 * 
		 * 메소드 선언 및 구현 : 
		 * 접근제한자 리턴타입 메소드명(매개변수) {
		 * 		기능 구현;
		 * }
		 * 
		 * 메소드를 선언하는 위치 : 클래스 안에 있어야 하며, 
		 * 					다른 메소드 밖에 있어야 함
		 */
		
		int hap = doSum(100, 200);
		
		System.out.println(hap);
	}
	
	/*
	 * 두 정수가 주어지면, 두 정수의 합을 알려주는 메소드 구현 
	 */
	public static int doSum(int num1, int num2) {
		int sum = num1 + num2;		
		return sum;
	}
}
