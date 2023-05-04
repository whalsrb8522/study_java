package day008;

public class 클래스02 {
	public static void main(String[] args) {
		/*
		 * 자동차 클래스 생성
		 * 멤버변수(private) : color, power, speed
		 * 
		 * 메서드 : powerOn (power true), powerOff (power false)
		 * 		speedUp (speed + 10), speedDown (speed - 10)
		 */
		Car c1 = new Car("노랑");

		System.out.printf("color : %s\n", c1.getColor());
		System.out.printf("power : %b\n", c1.isPower());
		System.out.printf("speed : %d\n", c1.getSpeed());
		System.out.printf("door : %d\n", c1.getDoor());
		System.out.println();
		
		c1.setColor("검정");
		System.out.printf("color : %s\n", c1.getColor());
		
		c1.powerOn();
		c1.speedUp();
		
		c1.powerOff();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		
		System.out.println("-----------------------------");
		
		Car c2 = new Car("빨강", 2);
		
		System.out.printf("color : %s\n", c2.getColor());
		System.out.printf("power : %b\n", c2.isPower());
		System.out.printf("speed : %d\n", c2.getSpeed());
		System.out.printf("door : %d\n", c2.getDoor());
		System.out.println();
		
		c2.setColor("파랑");
		System.out.printf("color : %s\n", c2.getColor());
		
		c2.powerOn();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
	}
}

class Car {
	// 멤버 변수
	private String color;
	private int door;
	private boolean power;
	private int speed;
	
	/*
	 * 생성자 위치
	 * 없는경우 자동으로 기본생성자가 추가됨
	 * 매개변수가 다른경우, 같은 이름으로 여러개 생성 가능 (생성자 오버로딩)
	 * 매개변수가 있는 생성자를 만들경우, 기본생성자가 자동으로 만들어지지 않는다
	 */	
	public Car() {}
	
	public Car(String color) {
		this.color = color;
	}

	public Car(String color, int door) {
		this(color);
		this.door = door;
	}
	
	void powerOn() {
		System.out.println("시동이 켜졌습니다.");
		power = true;
	}
	
	void powerOff() {
		System.out.println("시동이 꺼졌습니다.");
		power = false;
	}
	
	void speedUp() {
		if (power) {
			speed += 10;
			System.out.printf("속도를 올렸습니다. 속도 : %d\n", getSpeed());
		} else {
			System.out.println("시동이 꺼져있습니다.");
		}
	}

	void speedDown() {
		speed -= 10;
		if (speed < 0) {
			speed = 0;
			}
		System.out.printf("속도를 내렸습니다. 속도 : %d\n", getSpeed());
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}