package day012;

public class 익명내부클래스 {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		
		runner.run();
	}
}

class Outer {
	int outNum = 10;
	static int sNum = 200;
	
	// 예전에는 매개변수와 지역변수는 final이 아니면 선언 불가능했음 (지금은 자동으로 설정됨)
	Runnable getRunnable(int i) {
		int num = 100;
				
		class MyRunnable implements Runnable {
			int localNum = 1000;
			
			@Override
			public void run() {
				// i = 10;		// 매개변수와 지역변수는 값이 들어올때 final로 변경되서 들어옴
				// num = 1;		// 매개변수와 지역변수는 값이 들어올때 final로 변경되서 들어옴
				localNum = 1;
				outNum = 1;
				sNum = 1;
				
				System.out.printf("매개변수 = %d\n", i);
				System.out.printf("메서드 안 num = %d\n", num);
				System.out.printf("내부 클래스 localNum = %d\n", localNum);
				System.out.printf("외부 클래스 outNum = %d\n", outNum);
				System.out.printf("외부 클래스 sNum = %d\n", sNum);
			}
		}
		
		return new MyRunnable();
	}
}
