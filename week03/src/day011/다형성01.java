package day011;

public class 다형성01 {
	public static void main(String[] args) {
  		/* 
  		 * 모든 클래스의 최고 조상은 Object 클래스
  		 * 모든 클래스는 Object가 제공하는 클래스를 사용할 수 있다. (Overriding 가능)
  		 * 
  		 * 상속은 단일 상속이 원칙
  		 * 부모:자식 = 1:N 관계
  		 */
		
		A a = new A();
		a.num = 10;
		System.out.println(a);
		
		B b = new B();
		b.num = 20;
		System.out.println(b);
	}
}

class A {
	int num;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A [num = " + num + "]";
	}
}

class B extends A {
	int num;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}