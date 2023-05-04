package day008;

public class 클래스03 {
	public static void main(String[] args) {
		Card c1 = new Card();		
		c1.print();
		
		System.out.printf("\n----------\n");
		
		Card c2 = new Card(13, '◆');		
		c2.print();		
		
		System.out.printf("\n----------\n");
		
		Card c3 = new Card(2, '◆');		
		c3.print();

		System.out.printf("\n----------\n");
		
		Card c4 = new Card(0, '0');
		c4.print();
	}
}

/*
 * Card 클래스 생성 : 포커게임에서 사용하는 카드를 나타내는 클래스
 * 모양 : 하트(♥), 클로버(♣), 스페이드(♠), 다이아(◆)
 * 숫자 : A, 2 ~ 10, J, Q, K
 * 
 * 멤버변수 : char shape, int num
 * 메서드 : print, getter/setter
 * 생성자 : 하트A (♥A)
 */
class Card {
	private int num;
	private char shape;
	
	public Card() {
		this.num = 1;
		this.shape = '♥';
	}
	
	public Card(int num, char shape) {
		this.setNum(num);
		this.setShape(shape);
	}
	
	public void print() {
		switch (num) {
		case 1:
			System.out.printf("%c", 'A');
			break;
		case 11:
			System.out.printf("%c", 'J');
			break;
		case 12:
			System.out.printf("%c", 'Q');
			break;
		case 13:
			System.out.printf("%c", 'K');
			break;
		default:
			System.out.printf("%d", this.num);
			break;
		}
		
		System.out.printf("%c", this.shape);
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
//		if (shape == '♥' || shape == '♣' || shape == '♠' || shape == '◆') {
//			this.shape = shape;
//		} else {
//			this.shape = '♥';
//		}
		switch (shape) {
		case '♥': case '♣': case '♠': case '◆':
			this.shape = shape;
			break;
		default:
			this.shape = '♥'; 
			break;
		}
	}

	public int getNum() {
		return num;
	}	  

	public void setNum(int num) {
		if (num < 1 || num > 13) {
			this.num = 1;
		} else {
			this.num = num;
		}
	}
}