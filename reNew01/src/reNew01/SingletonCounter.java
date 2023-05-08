package reNew01;

public class SingletonCounter {
	public static void main(String[] args) {
		/*
		 * 싱글톤 패턴을 활용한 카운터 만들기 
		 */
		Counter c1 = Counter.getInstance();
		Counter c2 = Counter.getInstance();
		
		System.out.printf("%s\n", c1.countMethod());
		System.out.printf("%s\n", c1.countMethod());
		System.out.printf("%s\n", c2.countMethod());
		System.out.printf("%s\n", c2.countMethod());
		System.out.printf("%s\n", c1.countMethod());
	}
}

class Counter {
	// 싱글톤 패턴으로 객체 생성
	private static Counter instance;
	private int count;

	// private 생성자
	private Counter() {}

	// getInstance
	public static Counter getInstance() {
		if (instance == null) {
			instance = new Counter();
		}
		return instance;
	}

	// countMethod
	public int countMethod() {
		count++;
		return count;
	}
}	
