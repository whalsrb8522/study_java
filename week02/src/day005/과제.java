package day005;

import java.util.Scanner;

public class 과제 {
	public static void main(String[] args) {
		/*
		 * 가위바위보게임 만들기
		 * 컴퓨터가 가위 바위 보 중 랜덤으로 선택 (0 = 가위, 1 = 바위, 2 = 보)
		 * 내가 가위, 바위, 보 중 선택 입력
		 * 승 패 무 결과 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		String temp;
		int pGame = 0;
		int cGame = 0;
		
		System.out.print("입력(가위/바위/보) : ");
		temp = sc.next();
		
		switch (temp) {
		case "가위":
			pGame = 0;
			break;
		case "바위":
			pGame = 1;
			break;
		case "보":
			pGame = 2;
			break;
		default:
			break;
		}
		
		cGame = (int) (Math.random() * 3);
		
		if (pGame == cGame) {
			System.out.println("무");
		} else {
			switch (pGame) {
			case 0:
				System.out.println(cGame == 1? "패" : "승");
				break;
			case 1:
				System.out.println(cGame == 2? "패" : "승");
				break;
			case 2:
				System.out.println(cGame == 0? "패" : "승");
				break;
			default:
				break;
			}
		}
		
		System.out.println(check(pGame));
		System.out.println(check(cGame));
		
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
