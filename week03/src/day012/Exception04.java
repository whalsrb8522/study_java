package day012;

public class Exception04 {
	public static void main(String[] args) {
		/*
		 * try {
		 * 		예외발생구문;
		 * } catch (예외클래스명 객체) {
		 * 		처리문;
		 * } catch (...) {		// cat 구문은 여러개 사용 가능
		 * 		처리문;
		 * } finally {
		 * 		실행문; (예외 처리와는 별개로 무조건 실행)
		 * }
		 */
		
		double res = 0;
		
		try {
			res = 1 / 0;
			
			int arr[] = new int[3];
			arr[5] = 10;
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("예외발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println("배열의 범위가 넘어갔습니다.");
		} catch (Exception e) { 		// 항상 마지막에
			e.printStackTrace();
		}
	}
}
