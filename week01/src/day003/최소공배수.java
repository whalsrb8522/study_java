package day003;

public class 최소공배수 {
	public static void main(String[] args) {
		/*
		 * 최소공배수
		 * 배수 : 곱해서 나타나는 수
		 * 공배수 : 두 정수에서 공통적으로 있는 배수
		 * 최소공배수 : 공통된 배수 중 가장 작은 수
		 * 
		 * 10의 배수 : 10 20 30 40 ...
		 * 15의 배수 : 15 30 45 60 ...
		 * 공배수 : 30 60 90 ...
		 * 
		 * 10%10=0	20%10!=0 30%10=0 ...
		 * 15%10!=0	30%10=0 ....
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		for(int i = num1; ; i += num1) {
			if (i % num1 == 0 && i % num2 == 0) {
				System.out.printf("%d와(과) %d의 최소공배수는 %d입니다.", num1, num2, i);
				break;
			}
		}
		System.out.println();
		
		/*
		 * 최소공배수 구하는 다른 방법
		 * 두 수를 곱해서 최대공약수로 나누기
		 * 
		 * 10 * 15 = 150
		 * 150 / 5 = 30
		 */
		
		for (int i = num1; ; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.printf("%d와(과) %d의 최대공약수는 %d입니다.\n", num1, num2, i);
				System.out.printf("%d와(과) %d의 최소공배수는 %d입니다.", num1, num2, num1 * num2 / i);
				break;
			}
		}
	}
}
