package reNew01;

public class SingletonCounter {
	public static void main(String[] args) {
		/*
		 * 싱글톤 패턴을 활용한 카운터 만들기 
		 */
		
		
	}
}

class Counter {
	// 싱글톤 패턴으로 객체 생성
	private static Counter instance;
	private int count;

	// private 생성자
	private Counter() {}
	
	public static Counter getInstance() {
		if (instance == null) {
			instance = new Counter();
		}
		return instance;
	}
}