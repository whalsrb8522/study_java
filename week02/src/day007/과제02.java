package day007;

import java.util.Scanner;


public class 과제02 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] comNum = new int[3];
		int[] myNum = new int [3];
		int cnt = 0 ;
		
		// comNum에 랜덤값 대입
		int i = 0;
		while (i < comNum.length) {
			int randomNum = (int) (Math.random() * 9 + 1);
			
			if (!duplicationCheck(comNum, randomNum)) {
				comNum[i] = randomNum;
				i++;
			}
		}
		
		// myNum에 입력
//		int j = 0;
//		while (j < myNum.length) {
//			System.out.printf("%d번째 숫자 입력 : ", j + 1);
//			int inputNum = sc.nextInt();
//			
//			if (!duplicationCheck(myNum, inputNum)) {
//				myNum[j] = inputNum;
//				j++;
//			} else {
//				System.out.printf("(중복) ");
//			}
//		}
		
		inputNumber(myNum, "입력 : ");
		
		// 숫자 비교
		while (true) {
			int strike = 0;
			int ball = 0;
			cnt++;
			
			for (int k = 0; k < comNum.length; k++) {
				for (int l = 0; l < myNum.length; l++) {
					if (comNum[k] == myNum[l]) {
						if (k == l) strike++;
						else ball++;
					}
				}
			}
			
			System.out.printf("strike : %d, balls : %d", strike, ball);
			
			if (strike == 3) {
				break;
			} else {
				if (strike == 0 && ball == 0) {
					System.out.printf("\nOUT");
				}
				inputNumber(myNum, "\n입력 : ");
			}
		}
				
		//test
		for (int tmp : comNum) {		
			System.out.printf("%d ", tmp);
		}
		System.out.println();
		
		//test
		for (int tmp : myNum) {			
			System.out.printf("%d ", tmp);
		}
		
		sc.close();
	}
	
	// 배열과 값을 받아 중복 체크
	public static boolean duplicationCheck(int[] arr, int num) {
		for (int tmp : arr) {
			if (tmp == num) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void inputNumber(int[] arr, String print) {
		int i = 0;
		
		while (i < arr.length) {
			if (print != null) {
				System.out.printf(print);
			}
			
			int inputNum = sc.nextInt();
			
			if (!duplicationCheck(arr, inputNum)) {
				arr[i] = inputNum;
				i++;
			} else {
				System.out.printf("(중복) ");
			}
		}
	}
}