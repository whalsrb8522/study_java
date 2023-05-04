package reNew01;

public class New03 {
	public static void main(String[] args) {
		// car 객체 생성 후 전원 켜기, 스피드 올리기

		Car myCar1 = new Car(2, "red");
		Car myCar2 = new Car(4, "black");

		System.out.printf("myCar1의 문의 개수는 %d개 입니다.\n", myCar1.getDoor());
		System.out.printf("myCar2의 문의 개수는 %d개 입니다.\n", myCar2.getDoor());

		System.out.printf("myCar1의 색상은 %s입니다.\n", myCar1.getColor());
		System.out.printf("myCar2의 색상은 %s입니다.\n", myCar2.getColor());

		myCar1.powerOnOff();
		myCar1.powerOnOff();
		myCar1.powerOnOff();
		myCar1.speedUp();
		myCar1.speedUp();
		myCar1.speedUp();
		myCar1.speedUp();
		myCar1.speedUp();
		myCar1.speedDown();
		myCar1.speedDown();
		myCar1.speedDown();
		myCar1.speedDown();
		myCar1.speedDown();
		myCar1.speedDown();
		myCar1.powerOnOff();
		myCar1.speedUp();
	}
}

// car 클래스 생성
// power, speed, door, color
class Car {
	private boolean power;
	private int speed;
	private int door;
	private String color;

	public Car() {
		this.power = false;
		this.speed = 0;
	}
	
	public Car(int door, String color) {
		this.power = false;
		this.speed = 0;
		this.door = door;
		this.color = color;
	}
	
	public void powerOnOff() {
		if (power == false) {
			setPower(true);
			System.out.printf("시동을 걸었습니다.\n");
		} else if (power == true) {
			setPower(false);
			System.out.printf("시동을 껐습니다.\n");
		}
	}

	public void speedUp() {
		if (power == true) {
			setSpeed(speed + 10);
			System.out.printf("속도를 올렸습니다. 현재속도 : %dkm/h\n", speed);
		} else {
			System.out.printf("시동이 꺼져있습니다.\n");
		}
	}

	public void speedDown() {
		setSpeed(speed <= 0 ? 0 : speed - 10);
		System.out.printf("속도를 내렸습니다. 현재속도 : %dkm/h\n", speed);
	}

	// getter, setter
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

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}