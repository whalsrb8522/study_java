package day007;

import java.util.Scanner;

public class 과제 {
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		/*
		 * 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성 (1~9 랜덤) : 배열
		 * 유저가 3자리의 숫자를 맞추는 게임 : 배열
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball
		 * 아무것도 안맞으면 out
		 * 몇번째만에 맞추었는지 카운트
		 */		
		int[] computerNumber = new int[3];
		int[] userNumber = new int[3];
		
		generateNumber(computerNumber);
		
		inputNumber(userNumber);
		
		resultGame(computerNumber, userNumber);
		
		sc.close();
	}
	
	// 배열 출력
	public static void printArray(int[] arr) {
		for (int tmp : arr) {
			System.out.printf("%d ", tmp);
		}
	}
	
	// 배열 입력
	public static void inputNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 숫자 입력 : ", i + 1);
			arr[i] = sc.nextInt();
		}
	}
	
	// 랜덤 수 생성
	public static int randomNumber() {
		return (int) (Math.random() * 9 + 1);
	}
	
	// 게임 생성
	public static void generateNumber(int[] arr) {
		int i = 0;
		
		do {
			int random = randomNumber();
			
			if (!checkDuplication(arr, random)) {
				arr[i] = random;
				i++;
			}
		} while (i < arr.length);
	}
	
	// 배열과 정수의 중복 확인
	public static boolean checkDuplication(int[] arr, int random) {
		for (int tmp : arr) {
			if (tmp == random) {
				return true;
			}
		}
		
		return false;		
	}
	
	// 결과 확인
	public static void resultGame(int[] computerNumber, int[] userNumber) {
		int cnt = 0;
		
		while (true) {
			int strike = 0;
			int ball = 0;
			cnt++;
			
			for (int i = 0; i < computerNumber.length; i++) {
				for (int j = 0; j < userNumber.length; j++) {
					if (computerNumber[i] == userNumber[j]) {
						if (i == j) strike++;
						else ball++;
					}
				}
			}

			System.out.printf("strike : %d, ", strike);
			System.out.printf("ball : %d\n\n", ball);
			
			if (strike == 3) {
				System.out.printf("정답 : %d번만에 맞추셨습니다.", cnt);
				break;
			} else {
				inputNumber(userNumber);
			}
		}
	}
}