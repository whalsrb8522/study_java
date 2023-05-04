package day011;

public class 인터페이스01 {
	public static void main(String[] args) {
		/*
		 * 인터페이스 : 추상메서드와 상수로만 이루어진 추상 클래스의 일종
		 * 추상 메서드 : 선언부만 작성하고, 구현부는 작성하지 않는 메서드
		 */
		
		Tv tv = new Tv();
		tv.turnOn();
		tv.ch = 99;
		tv.chUp();
		tv.chUp();
		tv.chUp();
		tv.chDown();
		tv.chDown();
		tv.turnOff();
	}
}

interface Power {
	abstract void turnOn();
	abstract void turnOff();
}

interface Remocon {
	abstract void chUp();
	abstract void chDown();
}

class Tv implements Power, Remocon {
	boolean power;
	int ch;
	
	@Override
	public void chUp() {
		ch++;
		if (ch > 100) {
			ch = 1;
		} 
		System.out.printf("ch : %d\n", ch);
	}
	
	@Override
	public void chDown() {
		ch--;
		if (ch < 1) {
			ch = 100;
		}
		System.out.printf("ch : %d\n", ch);
	}
	
	@Override
	public void turnOn() {
		power = true;
		System.out.printf("Tv가 켜졌습니다.\n");
	}
	
	@Override
	public void turnOff() {
		power = false;
		System.out.printf("Tv가 꺼졌습니다.\n");
	}
}