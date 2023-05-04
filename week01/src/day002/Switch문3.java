package day002;

public class Switch문3 {

	public static void main(String[] args) {
		/* 
		 * Q. 계절을 출력
		 * 1~12월까지 랜덤으로 생성 후 월과 계절을 출력
		 * 봄 : 3~5월
		 * 여름 : 6~8
		 * 가을 : 9~11
		 * 겨울 : 12~2
		 * 
		 * case가 여러가지일 경우 case 1: case 2: case 3:
		 */
		
		int season = (int)(Math.random() * 12) + 1;
		System.out.println(season + "월입니다.");
		
		switch (season) {
		case 3: case 4: case 5:
			System.out.println("봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울입니다.");
			break;	
		default:
			break;
		}
	}

}
