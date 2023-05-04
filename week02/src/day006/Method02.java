package day006;

public class Method02 {
	public static void main(String[] args) {
		/*
		 * Method : 메소드 => 기능 함수
		 * 접근제한자 리턴타입 메소드명 (매개변수) {}
		 * - 접근제한자 : 접근한수 있는 주체의 제한범위
		 * - 리턴타입 : 메소드 실행 후 결과로 얻을수 있는 값의 자료형
		 * 		- void : 리턴값이 없을 경우
		 * - 메소드명 : 메소드를 구분하는 이름, 소문자로 시작
		 * - 매개변수 : 기능을 수행하기 위해 필요한 정보값
		 * - 위치 : 클래스 안쪽, 다른 메소드 밖
		 */
		int sum = doSum(12, 34);
//		int mul = doMul(12, 34);
		
		System.out.println(sum);
		doSum2(12, 34);
		doMul(12, 34);
	}
	

	/*
	 * 두 정수가 주어지면 합을 알려주는 메서드
	 */
	public static int doSum(int a, int b) {
		return a + b;		
	}
	
	public static void doSum2(int a, int b) {
		System.out.println(a + b);
	}
	
	/*
	 * 두 정수의 곱을 알려주는 메소드
	 */
	public static int doMul(int a, int b) {
		System.out.println(a * b);
		return a * b;
	}
}
