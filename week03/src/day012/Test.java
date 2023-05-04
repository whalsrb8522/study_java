package day012;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a = 'N';
		
		while(true) {
			System.out.printf("입력 : ");
			a = sc.next().charAt(0);
			
			if (a == 'Y') {
				break;
			}
		}
		
		System.out.printf("끝");
	}
}
