package day005;

import java.util.Scanner;

public class 과제02 {
	public static void main(String[] args) {
		/*
		 * 가위바위보게임 만들기
		 * 컴퓨터가 가위 바위 보 중 랜덤으로 선택 (0 = 가위, 1 = 바위, 2 = 보)
		 * 내가 가위, 바위, 보 중 선택 입력
		 * 승 패 무 결과 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		String pGame = null;
		String cGame = null;

		System.out.print("입력(가위/바위/보) : ");
		pGame = sc.next();
		
		while (!(pGame.equals("가위") || pGame.equals("바위") || pGame.equals("보"))) {
			System.out.printf("잘못 입력하셨습니다. 다시입력해주세요.\n입력(가위/바위/보) : ");
			pGame = sc.next();
		}
		
//		while (!(pGame.equals("가위") || pGame.equals("바위") || pGame.equals("보"))) {
//			System.out.printf("입력(가위/바위/보) : ");
//			pGame = sc.next();			
//		}
		
		cGame = check((int) (Math.random() * 3));

		System.out.printf("플레이어 : %s\n", pGame);
		System.out.printf("컴퓨터 : %s\n", cGame);
		
		if (pGame.equals(cGame)) {
			System.out.println("무");
		} else {
			switch (pGame) {
			case "가위":
				System.out.println(cGame == "바위"? "패" : "승");
				break;
			case "바위":
				System.out.println(cGame == "보"? "패" : "승");
				break;
			case "보":
				System.out.println(cGame == "가위"? "패" : "승");
				break;
			default:
				break;
			}
		}
		
		sc.close();
	}
	
	public static String check(int a) {
		String result = null;
		
		switch (a) {
		case 0:
			result = "가위";			
			break;
		case 1:
			result = "바위";			
			break;
		case 2:
			result = "보";			
			break;
		default:
			break;
		}

		return result;
	}
}
