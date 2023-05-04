package day009;

public class CardPack {
	/*
	 * CardPack클래스
	 * 5장의 카드들
	 * 
	 *  메서드
	 *  - 카드 셔플
	 *  - 한장 선택
	 *  - 카드 초기화
	 *  - 출력 (Card 클래스에서 가져오기)
	 *  - 생성자 - 52장의 카드를 모두 생성
	 */
	
	/*
	 * 멤버 변수
	 * - 카드를 담을수 있는 배열 52장
	 */
	private Card[] pack = new Card[52];		// 카드 팩 배열
	private int cnt = 0;	// 카드가 남아있는 개수
	
	/*
	 * 생성자
	 */
	public CardPack() {
		// ♥ ◆ ♠ ♣
		char shape = '♥';
		
		for (int i = 0; i < 4; i++) {
			switch (i) {
			case 0: shape = '♥'; break;
			case 1: shape = '◆'; break;
			case 2: shape = '♠'; break;
			case 3: shape = '♣'; break;
			}
			
			for (int j = 1; j <= 13; j++) {
				Card c = new Card(j, shape);	// 카드 한장 생성
				pack[cnt] = c;
				cnt++;
			}
		}
	}

	/*
	 * 카드를 섞는 기능
	 * 메서드명 : shuffle
	 */
	public void shuffle() {
		int min = 0;
		int max = pack.length;
		for (int i = 0; i < pack.length; i++) {
			min = i;
			int randomIndex = (int) (Math.random() * (max - min - i) + min);
			Card temp = pack[i];
			pack[i] = pack[randomIndex];
			pack[randomIndex] = temp;
		}
	}
	
	/*
	 * 카드를 한장 빼내는 기능
	 * 메서드명 : pick
	 * cnt == 52 가정 
	 */
	public Card pick() {
		if (cnt < 1) {
			return null;
		} else {
			cnt--;
			return pack[cnt];
		}
	}
	
	/*
	 * 초기화
	 */
	public void init() {
		cnt = 52;
	}

	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
