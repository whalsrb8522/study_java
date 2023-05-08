package reNew01;

public class New10 {
	public static void main(String[] args) {
		/*
		 * 디자인 패턴 : 아이디어임, 특정한 구현은 아님
		 * 재사용성, 유지보수, 호환성을 쉽게 처리하기 위해 사용
		 * 싱글톤 패턴 : 하나의 인스턴스만 생성하기위한 디자인 패턴
		 * 인스턴스가 필요할 때, 똑같은 인스턴스를 만들지 않고, 기존의 인스턴를 활용하는 것!
		 * 
		 * 생성자를 private로 선언, 다른 곳에서는 생성하지 못하다록 막고, 
		 * 		getInstance() 메서드를 이용하여 객체 생성을 할 수 있도록 구현
		 * 
		 * 공통된 객체를 여러개 생성해서 사용해야 하는 경우 싱글톤 패턴을 사용하면 유리함.
		 * ex) DB 커넥션 풀, 스레드 풀, 캐시, 로그기록 객체 등은 싱글톤 패턴을 사용
		 */
		
		// new로 객체 선언 불가 (private이기 때문에)
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
		
		Singleton s1 = Singleton.geInstance();
		Singleton s2 = Singleton.geInstance();
		
		if (s1 == s2) {
			System.out.printf("s1과 s2는 같은 객체입니다.\n");
		} else {
			System.out.printf("s1과 s2는 다른 객체입니다.\n");
		}
	}
}
