package day012;

public class 익명클래스 {
	public static void main(String[] args) {
		/*
		 * 익명클래스 :이름이 없는 클래스
		 * 인터페이스르 잉용하여 객체를 만들 때 크래스 없이 바로 구현
		 * 익명 클래스 사용하는 이유 
		 * 인터페이스의 기능이 적고, 해당 객체가 하나만 필요한 경우
		 * 메서드의 매개변수로 주로사용
		 */
		
//		Tv tv = new Tv();
//		product(tv);
		
		// 익명클래스로 작업한 경우
		product(new Power() {
			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다.");
			}
		});
	}
	
	public static void product(Power p) {
		p.turnOn();
		System.out.printf("Tv가 작동중입니다.\n");
		p.turnOff();
	}
}

interface Power {
	void turnOn();
	void turnOff();
}

//class Tv implements Power {
//	boolean power = false;
//	
//	@Override
//	public void turnOn() {
//		power = true;
//		System.out.printf("전원이 켜졌습니다.");
//	}
//	
//	@Override
//	public void turnOff() {
//		power = false;
//		System.out.printf("전원이 꺼졌습니다.");		
//	}
//}