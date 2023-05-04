package day002;

public class MathClass {

	public static void main(String[] args) {
		/*
		 * Math.method
		 * 수학적 기능을 하기위한 클래스
		 * 반올림, 올림, 버림, 최대값, 최소값, 랜덤값
		 */
		
		double num1 = 5.123456;
		
		// Math.round : 반올림
		System.out.println(Math.round(num1));		// 반올림만 정수형으로
		
		// Math.ceil : 올림
		System.out.println(Math.ceil(num1));
		
		// Math.floor : 버림
		System.out.println(Math.floor(num1));
		
		// Math.max, Math.min : 최대값, 최소값
		System.out.println(Math.max(5, 3));
		System.out.println(Math.min(5, 3));
		
		// Math.abs : 절대값 (마이너스를 플러스로)
		System.out.println(Math.abs(-5));
		
		// Math.pow : 제곱, Math.sqrt : 루트, Math.random : 0~1 사이의 랜덤값
		System.out.println(Math.pow(3, 2));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.random());
		
		// 1~10 까지의 랜던값 추출
		// (int)(Math.randome() * 개수) + 시작값
		int random = (int)(Math.random() * 10) + 1;
		System.out.println(random);
	}

}
