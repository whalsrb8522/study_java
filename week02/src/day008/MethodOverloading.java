package day008;

public class MethodOverloading {
	public static void main(String[] args) {
		/*
		 * 메서드 오버로딩
		 * - 동일한 이름을 가지는 메서드를 여러개 만드는 경우
		 * 1. 매개변수의 개수가 다르면 가능
		 * 2. 매개변수의 종류(자료형)가 다르면 가능
		 * 리턴타입/매개변수 이름은 상관 없음
		 */
		System.out.println(sum(1, 2));
		System.out.println(sum(1.2, 3.4));
		
		int arr[] = {11, 22, 33, 44, 55, 66, 77};
		System.out.println(sum(1, 2, 3, 4, 5, 6));
		System.out.println(sum(arr));
	}
	
	/*
	 * 더하기 하는 메서드 생성
	 * 정수 num1, num2를 매개변수로 받아 더한 연산결과를 리턴
	 * 메서드명 : sum
	 */
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	/* 위와 동일한 더하는 메서드
	 * 매개변수와 리턴이 소수점까지 계산 가능하도록
	 */
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	/*
	 * 가변 길이 메서드
	 * 1 + 2, 1 + 2 + 3, ...
	 * 피연산자의 값이 일정하지 않을경우 매개변수의 개수와 상관없이 매개값을 줄때 사용
	 */
	public static int sum(int ...num) {
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum += i;
		}
		
		return sum;
	}
}

