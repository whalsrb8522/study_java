package day003;

public class 최대공약수 {
	
	public static void main(String[] args) {
		/*
		 * 최대공약수
		 * 공약수 : 두수의 공통된 약수
		 * 최대공약수 : 두 수의 공통된 약수중 가장 큰값
		 */
		
		int num1 = 8;
		int num2 = 12;
		int gcd = 0;		// 최대공약수

		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.printf("%d와(과) %d의 최대공약수는 %d입니다.\n", num1, num2, gcd);
		
		for (int i = num1;;i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
				break;
			}
		}
		System.out.printf("%d와(과) %d의 최대공약수는 %d입니다.\n", num1, num2, gcd);
	}
}
