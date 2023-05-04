package day009;

public class Card {
	/*
	 * 한장의 카드정보를 출력하는 기능
	 * 생성자 : 클래스의 멤버변수들을 초기화하는 기능 메서드
	 * 생성자가 하나라도 있으면 기본생성자는 생성되지 않음
	 */
	
	private int num;
	private char shape;
	
	// 생성자 : 객체의 초기값을 결정
	public Card() {
		this.num = 1;
		this.shape = '♥';
	}
	
	public Card(int num, char shape) {
		this.setNum(num);
		this.setShape(shape);
	}
	
	public void print() {
		System.out.print(shape);
		switch (num) {
		case 1:
			System.out.print("A");
			break;
		case 11:
			System.out.print("J");
			break;
		case 12:
			System.out.print("Q");
			break;
		case 13:
			System.out.print("K");
			break;
		default:
			System.out.print(num);
			break;
		}
		System.out.print(" ");		
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

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		switch (shape) {
		case '♥': case '◆': case '♠': case '♣':
			this.shape = shape;
			break;
		default:
			this.shape = '♥';
			break;
		}
	}
}