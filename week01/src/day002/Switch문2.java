package day002;

public class Switch문2 {

	public static void main(String[] args) {
		// * Q. 주사위의 값을 출력하는 예제
		// 주사위는 1~6까지의 랜덤수로 결정		
		int dice = (int)(Math.random() * 13) - 6;		// -6 ~ -1, 0, 1 ~ 6
		System.out.println("주사위 값 : " + dice);
		
		// Q. Switch문을 이용하여 수만큼 전진
//		switch (dice) {
//		case 1:
//			System.out.println("1만큼 전진");
//			break;
//		case 2:
//			System.out.println("2만큼 전진");
//			break;
//		case 3:
//			System.out.println("3만큼 전진");
//			break;
//		case 4:
//			System.out.println("4만큼 전진");
//			break;
//		case 5:
//			System.out.println("5만큼 전진");
//			break;
//		case 6:
//			System.out.println("6만큼 전진");
//			break;
//		default:
//			break;
//		}
		
		// Q. if문을 이용하여 랜덤수 -6 ~ 6까지 값을 출력
		// -값은 후진, +값은 전진
		// -는 절대값으로 표현
		if (dice < 0) {
			System.out.println(Math.abs(dice) + "칸 후진");
		} else if (dice > 0) {
			System.out.println(dice + "칸 전진");
		} else {
			System.out.println("제자리");
		}
	}
	
}