package day012;

public class Exception03 {
	public static void main(String[] args) {
		/*
		 * 자주 발생하는 예외 코드들
		 */
		
		// ArithmeticException : 0으로 나누었을 때
//		double a = 1 / 0;
		
		// ArrayIndexOutOfBoundsException : 배열의 index가 범위를 벗어났을 때
//		int[] arr = new int[5];
//		for (int i = 0; i <= arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		// ClassCastException
//		P a = new P();
//		C b = (C)a;
		
		// NullPointerException : 객체가 생성되지 않은 경우
//		C c = null;
//		c.print();
	}
}

class P {
	int num = 10;
}
class C extends P {
	int num1 = 100;
	
	void print() {
		System.out.println(num1);
	}
}