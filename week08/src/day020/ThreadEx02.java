package day020;

public class ThreadEx02 {
	public static void main(String[] args) {
		// runnable로 구현하는 방법
		
		MyThread1 mt = new MyThread1();
		Thread th = new Thread(mt);
		th.start();
		
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread th1 = new Thread(new MyThread1());
		th1.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main End");
	}
}

class MyThread1 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.printf("%d번째 %s\n", i, Thread.currentThread()); 
		}
	}
}