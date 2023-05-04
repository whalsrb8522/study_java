package day007;

public class 클래스01 {
	public static void main(String[] args) {
		/*
		 * 클래스 : 설계도
		 * 객체를 생성하기위한 설계도
		 * 
		 * 메서드 : 기능
		 * 
		 * 클래스 구성정보
		 * - 속성
		 * - 기능
		 * 
		 * 프린터 클래스
		 * - 속성(정보) : 크기, 색, 제조사, 이름 ...
		 * - 기능 : 인쇄, 스캔, 팩스, 복사 ...
		 * 
		 * 멤버변수는 클래스 안, 메서드 위에 작성
		 * 멤버변수는 클래스안에서 사용할 수 있다. (모든 메서드에서)
		 * 
		 * 접근제한자 class 클래스명 {
		 * 		// 클래스명은 반드시 대문자로 시작
		 * {
		 * 
		 * 객체선언
		 * 클래스명 객체명;
		 * 
		 * 객체선언 / 초기화
		 * 클래스명 객체명 = new 클래스명();
		 * 
		 * 멤버 메서드 사용하는 법
		 * 객체명.메서드명();
		 * 
		 * 같은 클래스 안에서 메서드를 호출할 때는 메서드명으로 호출가능. => 메서드명();
		 * 다른 클래스에서는 메서드를 호출할 때 객체를 이용하여 사용 => 객체명.메서드명();
		 */
		
		/*
		 * 접근제한자(= 접근제어자)
		 * - public : 모두 사용 가능
		 * - protected : 내 클래스 + 같은 패키지 + 자식 클래스
		 * - default : 생략가능, 내 클래스 + 같은 패키지
		 * - private : 내 클래스
		 * 
		 * 클래스에서 public을 붙일 수 있는 건 파일명과 클래스명이 같을 때만 가능
		 * 멤버변수나, 메서드는 public을 붙이는 것에 제한이 없음
		 * 
		 * private : 멤버변수/메서드를 다른 클래스에서 사용할 수 없게 할때
		 * - 일반적으로 멤버변수는 private, 메서드는 public으로 사용
		 * - 일반적으로 private로 선언된 멤버변수는 getter/setter를 통해 변수에 접근할 수 있음
		 */
		
		// 객체생성
//		Point p = new Point();
//
//		p.print();
//		
//		p.move(5, 3);
//		p.print();
//		
//		p.x = 7;
//		p.print();
//		
//		System.out.println(p.x);
//		System.out.println(p.y);
//		System.out.println(p.getX());
//		System.out.println(p.getY());
//		
//		p.setX(100);
//		System.out.println(p.getX());
//		p.setY(200);
//		System.out.println(p.getY());
		
		Point1 p1 = new Point1();
		
		p1.print();
		
		p1.move(1, 2, 3);
		p1.print();
		
		p1.setX(4);
		p1.setY(5);
		p1.setZ(6);
		System.out.printf("%d, %d, %d", p1.getX(), p1.getY(), p1.getZ());
	}
}

/*
 * 다른 클래스 밖에서 생성
 * 접근제한자 class 클래스명 {}
 */
class Point {
	// 멤버변수는 초기화하지 않아도 기본적으로 0또는 null로 초기화되어있음
	private int x;
	private int y;
	
	// x, y 좌표를 프린트하는 메서드
	public void print() {
		System.out.printf("(%d, %d)\n", x, y);
	}
	
	// x, y 좌표를 변경하는 메서드
	// 매개변수 : x, y 값을 주고 멤버변수의 x, y를 변경
	// this.변수명 = 매개변수 호출
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
		
	}
}

class Point1 {
	private int x, y, z;
	
	public void print() {
		System.out.printf("%d, %d, %d\n", x, y, z);
	}
	
	public void move(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// getter, setter 자동생성 : 우클릭 -> Source -> Generate Getters and Setters
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}
}
