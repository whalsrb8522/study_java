package day010;

public class 상속01 {
	public static void main(String[] args) {
		/*
		 * 상속 : 부모의 것을 자식에게 물려주는 것
		 * 클래스 상속 : 부모 클래스의 멤버 변수/메서드를 물려주는 것
		 * 상속 이류 : 재사용을 ㅇ해서 중복 코드를 줄이는 것
		 * Class A (부모클래스) / Class B (자식 클래스)
		 * 
		 * Class B extends A {
		 *
		 * 상속을 받으면 부모의 멤버변수와 메서드를 사용할 수 있다.
		 * 접근제한자 private은 자식클래스에서 접근 불가
		 * 접근제한자 protected : 상속받는 자식에게 허용하는 제어자
		 */
		
		A a = new A();
		a.setA(10);
		a.print();
		System.out.println();
		
		B b = new B();
		b.setB(20);
		b.print();
		b.num = 100;		// A클래스의 num변수는 protected이기 때문에 직접 접근 가능
		b.print();
	}
}

class A {		// 부모 클래스
	private int a, b, c;	// private : 나만 사용 가능
	protected int num;		// protected : 상속 가능
	
	public void print() {
		System.out.printf("a : %d, b : %d, c : %d, num : %d", a, b, c, num);
	}

	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getC() {
		return c;
	}
	
	public void setC(int c) {
		this.c = c;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String toString() {
		return "A [a=" + a + ", b=" + b + ", c=" + c + ", num=" + num + "]";
	}
}

class B extends A {		// 자식 클래스 (A를 상속받음)
						// a, b, c, num, d, e, f 모두 사용 가능 (a, b, c 변수의 경우 private이기때문에 getter/setter를 통해서 사용 가능)
	private int d, e, f;
	
	
	
//	public void print() {
//		super.print();		// super : 부모의 변수/메소드를 지칭
//		System.out.printf(", d : %d, e : %d, f : %d\n", d, e, f);
//	}

	@Override		// 오버라이드 : 부모의 메서드를 재정의하여 사용하는 것을 의미
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}
	
	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

	public String toString() {
		return "B [d=" + d + ", e=" + e + ", f=" + f + "]";
	}
}