package day009;

public class CardPackMain {
	public static void main(String[] args) {
//		Card c = new Card();
//		c.print();
//		System.out.println();
		
		CardPack cp = new CardPack();

		System.out.println("==========기본 출력==========");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cp.pick().print();	
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("==========초기화 후 셔플==========");
		cp.init();
		cp.shuffle();
		
		for (int j = 0; j < cp.getPack().length; j++) {
			Card temp = cp.pick();
			
			if (temp != null) {
				temp.print();
			} else {
				System.out.println("카드가 없습니다.");
				break;
			}
			
			if (cp.getCnt() % 13 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
