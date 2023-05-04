package day009;

import java.util.Scanner;

public class BaseBallGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] comNum = new int[3];
		int[] userNum = new int[3];
		int strikeNum = 0;
		int ballNum = 0;
		int cnt = 0;
		int max = 9;
		int min = 1;
		
		System.out.printf("======야구게임 시작======\n");
		randomArray(comNum, min, max);
		System.out.printf("컴퓨터가 수를 결정하였습니다.\n");
		
		while (strikeNum != 3) {
			strikeNum = 0;
			ballNum = 0;
			cnt++;
			
			System.out.printf("1~9까지 숫자 3개 입력 : ");
			for (int i = 0; i < userNum.length; i++) {
				userNum[i] = sc.nextInt();
			}
			
			// 결과 판정
			strikeNum = strikeCnt(comNum, userNum);
			ballNum = ballCnt(comNum, userNum);
			if (strikeNum != 0) {
				System.out.printf("S : %d   ", strikeNum);
			}
			if (ballNum != 0) {
				System.out.printf("B : %d", ballNum);
			} System.out.println();
			if (strikeNum == 0 && ballNum == 0) {
				System.out.println("OUT!");
			}
		}
		
		System.out.printf("게임회수 : %d\n정답!\n종료!", cnt);
		sc.close();
	}
	
	// 랜덤 수 생성
	static int randomNumber (int min, int max) {
		if (max < min) {
			return (int) (Math.random() * (min - max + 1) + max);
		} else {
			return (int) (Math.random() * (max - min + 1) + min);
		}
	}
	
	// 배열에 랜덤수 대입	
	static boolean randomArray(int[] arr, int min, int max) {
		int cnt = 0;
		
		if (arr == null) {
			return false;
		} else if ((max - min + 1) < arr.length) {
			return false;
		}
		
		do {
			int ranNum = randomNumber(min, max);
			
			if (!isContain(arr, ranNum)) {
				arr[cnt] = ranNum;
				cnt++;
			}
		} while (cnt < 3);
		
		return true;
	}
	
	// 정수와 배열 중복 비교
	static boolean isContain(int arr[], int num) {
		for (int temp : arr) {
			if (temp == num) {
				return true;
			}
		}
		
		return false;
	}
	
	// 배열 출력 메서드
	public static void printArray(int[] arr) {
		for (int tmp : arr) {
			System.out.printf("%d   ", tmp);
		}
		System.out.println();
	}
	
	// 스트라이크 메서드 (배열 2개 입력받아 같은 index의 숫자가 동일한 개수)
	public static int strikeCnt(int[] arr1, int[] arr2) {
		int cnt = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	// 볼 메서드 (배열 2개 입력받아 동일한 수의 개수, index가 같으면 x)
	public static int ballCnt(int[] arr1, int[] arr2) {
		int cnt = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			if (isContain(arr2, arr1[i])) {
				cnt++;
			}
		}
		
		return cnt - strikeCnt(arr1, arr2);
	}
}