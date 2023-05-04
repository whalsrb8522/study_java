package day010;

public class 클래스04 {
	public static void main(String[] args) {
		System.out.printf("=====기본 생성자=====\n");
		Car c1 = new Car();
		c1.print();
		
		System.out.println("\n=====매개변수 입력 생성자=====");
		Car c2 = new Car("노랑", 2, true, false, 0);
		c2.print();
		
		System.out.println(c2);
	}
}

class Car {
	// 멤버 변수
	private String color;
	private int door;
	private boolean airback;
	private boolean power;
	private int speed;
	
	//생성자 : 빈생성자, color, color/door, color/door/airback, 전체
	public Car() {
		this.color = "검정";
		this.door = 4;
		this.airback = true;
		this.power = false;
		this.speed = 0;
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public Car(String color, int door) {
		this(color);
		this.door = door;
	}
	
	public Car(String color, int door, boolean airback) {
		this(color, door);
		this.airback = airback;
	}
	
//	public Car(String color, int door, boolean airback, boolean power, int speed) {
//		this(color, door, airback);
//		this.power = power;
//		this.speed = speed;
//	}
	
	public Car(String color, int door, boolean airback, boolean power, int speed) {
//		super();	// 부모의 생성자를 호출
		this.color = color;
		this.door = door;
		this.airback = airback;
		this.power = power;
		this.speed = speed;
	}

	// method : print, powerOn, powerOff, speedUp, speedDown
	public void print() {
		System.out.println("color : " + this.color);
		System.out.println("door : " + this.door);
		System.out.println("airback : " + this.airback);
		System.out.println("power : " + this.power);
		System.out.println("speed : " + this.speed);
	}
	
	public boolean powerOn() {
		System.out.println("시동을 켰습니다.");
		return this.power = true;
	}
	
	public 	boolean powerOff() {
		System.out.println("시동을 껐습니다.");
		return this.power = false;
	}
	
	public 	int speedUp() {
		this.speed += 10;
		System.out.print("속도를 올렸습니다. 현재 속도 : " + this.speed);
		return this.speed;
	}
	
	public 	int speedDown() {
		this.speed -= 10;
		if (this.speed <= 0) {
			this.speed = 0;
		}
		System.out.print("속도를 내렸습니다. 현재 속도 : " + this.speed);
		return this.speed;
	}
	
	public boolean checkAirback() {
		if (this.airback) {
			System.out.println("에어백이 장착되어있습니다.");
		} else {
			System.out.println("에어백이 장착되어있지않습니다.");
		}
		return this.airback;
	}
	
	// getter/setter
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

	public boolean isAirback() {
		return airback;
	}

	public void setAirback(boolean airback) {
		this.airback = airback;
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

	public String toString() {
		return "Car [color=" + color + ", door=" + door + ", airback=" + airback + ", power=" + power + ", speed="
				+ speed + "]";
	}
}