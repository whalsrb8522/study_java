package day004;

import java.util.Scanner;
import java.util.InputMismatchException;

public class 문제 {
	public static void main(String[] args) {
		/*
		 * 1~50 사이의 랜덤 수 하나 생성 후 맞추는 게임
		 * 예) 컴퓨터가 랜덤수를 생성했습니다.
		 * 사용자 입력 : 20
		 * up!
		 * 사용자 입력 : 30
		 * up!
		 * 사용자 입력 : 49
		 * down!
		 * 사용자 입력 : 45
		 * 정답!
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int pNum = 0;
		int cNum = (int)(Math.random() * 50) + 1;		
		int cnt = 0;
		
		System.out.println("1부터 50사이의 수를 입력해주세요. 기회는 5번!");
		System.out.printf("컴퓨터가 랜덤수를 생성했습니다. (%d)\n", cNum);
		
		do {
			try {
				System.out.print("사용자 입력 : ");
				pNum = sc.nextInt();
				cnt++;
				
				if (pNum < 1 || pNum > 50) {
					System.out.println("다시 입력해주세요. (범위 : 1 ~ 50)");
					cnt--;		// 범위를 벗어나는 수 입력시 cnt 차감
					continue;
				} else if (pNum < cNum) {
					System.out.print("up! ");
				} else if (pNum > cNum ) {
					System.out.print("down! ");
				} else if (pNum == cNum) {
					System.out.printf("정답! %d번만에 맞추셨습니다.", cnt);
					break;
				}
				
				if (cnt >= 5) {
					System.out.printf("횟수 초과! 정답은 %d입니다.", cNum);
					break;
				} else {
					System.out.printf("%d회 남았습니다.\n", 5 - cnt);					
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력해주세요. (범위 : 1 ~ 50)");
				sc.nextLine();		// 입력값 제거 (제거하지 않으면 무한 반복됨)
				continue;
			}
		} while (true);

		sc.close();
	}
}
