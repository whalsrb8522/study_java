package day012;

public class Exception01 {
	public static void main(String[] args) {
		/*
		 * Exception : 예외처리
		 * 실행시 발생할 수 있는 예외를 처리하여 정상처리로 유지시키는 기능
		 * try ~ catch ~ finally
		 * try : 예외가 발생할 가능성이 있는 구문
		 * catch : 예외 발생시 예외 처리
		 * finally : try 구문외 반드시 실행되어야하는 구문이 있을경우 사용 (없으며 사용X)
		 */
		
		double res = 0;
		
		int num1 = 10;
		int num2 = 0;
		
		try {
			res = num1 / num2;
		} catch (Exception e) {
			System.out.println("0으로 나누었습니다.");
		} finally {
			System.out.println("꼭 처리되어야하는 구문");
		}
	}
}
