package day012;


public class 내부클래스 {
	public static void main(String[] args) {
		/*
		 * 내부 클래스 : 클래스 내부에 선언한 클래스
		 * - 내부 클래스를 포함한 외부 클래스와 밀접한 연관이 있고, 다른 외부에서 내부 클래스를 사용할 일이 없을경우 사용
		 * - 중첩 클래스라고도 함
		 * - 인스턴스 내부클래스, 정적(static) 내부 클래스, 지역(local) 내부 클래스, 익명(anonymous) 내부 클래스
		 * 
		 * - 내부적으로 활용할 목적으로 만드는 클래스이기 때문에 private으로 선언하는것을 권장
		 * - 내부 클래스 생성시기 : 외부 클래스가생성된 후 생성됨. (static은 별도)
		 * - private가 아닌 내부 클래스는 다른 외부 클래스에서 생성할 수 있음
		 */
		
		System.out.println("====외부 클래스를 이용하여 내부 클래스의 메서드를 호출====");
		OutClass oc = new OutClass();
		oc.usingClass();
		
		System.out.println();
		
		//외부 클래스에서 내부 클래스를 생성
		System.out.println("==== 외부 클래스 변수를 이용하여 내부 클래스 생성 ====");
		OutClass.InClass ic = oc.new InClass();
		ic.inclassprint();
		
		System.out.println();
		
		// 외부 클래스에서 바로 정적 내부 클래스 생성
		System.out.println("==== 정적(static) 내부 클래스의 static 메서드 호출 ====");
		OutClass.InStaticClass.sTest();		// static 클래스라서 바로 호출 가능
		
		System.out.println();
		
		System.out.println("==== 정적(static) 내부 클래스의 일반 메서드 호출 ====");
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
	}
}

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass in;
	
	public OutClass() {
		in = new InClass();
	}
	
	class InClass {
		int inNum = 100;

		void inclassprint() {
			System.out.printf("Outclass num = %d, 외부클래스의 인스턴스 변수\n", num);
			System.out.printf("Outclass sNum = %d, 외부클래스의 static 변수\n", sNum);
			System.out.printf("Inclass inNum = %d, 내부클래스의 인스턴스 변수\n", inNum);
		}
	}
	
	public void usingClass() {
		in.inclassprint();		// 내부 클래스 변수를 사용하여 메서드를 호출
	}
	
	static class InStaticClass {
		int inNum = 1000;
		static int sInNum = 2000;
		
		void inTest() {
			// System.out.printf("Outclass num = %d, 외부클래스의 인스턴스 변수\n", num);		// static이 아니기때문에 사용불가
			System.out.printf("Outclass sNum = %d, 외부클래스의 static 변수\n", sNum);
			System.out.printf("Inclass inNum = %d, 내부클래스의 인스턴스 변수\n", inNum);
		}
		
		static void sTest() {
			// System.out.printf("Outclass num = %d, 외부클래스의 인스턴스 변수\n", num);
			System.out.printf("Outclass sNum = %d, 외부클래스의 static 변수\n", sNum);		// static 변수만 가능
			// System.out.printf("Inclass inNum = %d, 내부클래스의 인스턴스 변수\n", inNum);
		}
	}
}