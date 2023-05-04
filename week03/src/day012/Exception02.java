/*
 * 두 수를 입력받고, 연산자를 입력받아 4칙연산의 결과를 리턴하는 메서드 입력
 * num1, num2, 연산자 입릭 후 메서드 실행
 * 예외처리
 */

package day012;

public class Exception02 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = 0;
//		int num2 = 0;
//		char op = 0;
//		
//		System.out.printf("첫번째 수 입력 : ");
//		num1 = sc.nextInt();
//		System.out.printf("두번째 수 입력 : ");
//		num2 = sc.nextInt();
//		System.out.printf("연산자 입력 : ");
//		op = sc.next().charAt(0);
//		
//		calc(num1, num2, op);
//		
//		sc .close();
		
		try {
			System.out.println(calc(4, 0, '+'));
			System.out.println(calc(4, 0, '-'));
			System.out.println(calc(4, 0, '*'));
			System.out.println(calc(4, 0, '$'));
			System.out.println(calc(4, 0, '/'));
			System.out.println(calc(4, 0, '%'));
		} catch (Exception e) {
//			e.printStackTrace()
			System.out.println(e.getMessage());
		}
		System.out.println("계산기 종료");
	}
	
	// throw를 발생시키게 되면 예외를 메서드를 호출하는 객체에게 넘기는 현상이 발생함
	// throw를 발생시키면 메서드 선언부 끝에 "throws 발생할 수 있는 예외"를 반드시 표시해야 함
	// throws runtimeException의 경우 생략 가능
	public static double calc(int num1, int num2, char op) throws RuntimeException {
		double res = 0;
		
		if ((op == '/' || op == '%') && num2 == 0 ) {
			throw new RuntimeException("num2는 0이 될수 없습니다.");
		}
		
		switch(op) {
		case '+': res = num1 + num2; break;
		case '-': res = num1 - num2; break;
		case '*': res = num1 * num2; break;
		case '/': res = num1 / num2; break;
		case '%': res = num1 % num2; break;
		default :
			throw new RuntimeException(op + "는 산술연산자가 아닙니다.");
		}
		
		return res;
	}
}
