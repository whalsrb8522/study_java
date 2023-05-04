package day005;

import java.util.Scanner;

public class 과제03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int computerNumber = (int) (Math.random() * 3);
		String computerChoice = (computerNumber == 0)? "가위" : (computerNumber == 1)? "바위" : "보";
	
		System.out.print("입력(가위/바위/보) : ");
		String playerChoice = sc.next();
		
		System.out.printf("플레이어 : %s\n", playerChoice);
		System.out.printf("컴퓨터 : %s\n", computerChoice);
		
		if (playerChoice.equals(computerChoice)) {
			System.out.println("무");
		} else if (playerChoice.equals("가위")) {
			System.out.println((computerChoice == "보"? "승" : "패"));
		} else if (playerChoice.equals("바위")) {
			System.out.println((computerChoice == "가위"? "승" : "패"));
		} else if (playerChoice.equals("보")){
			System.out.println((computerChoice == "바위"? "승" : "패"));
		}
		
		sc.close();
	}
}
