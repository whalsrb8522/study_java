package day020;

public class ThreadEx01 {
	public static void main(String[] args) {
		// 스레드
		// - 실행중인 프로그램이 OS로부터 메모리를 할당받아 프로세스 상태가 됨
		// - 하나의 프로세스는 하나 이상의 스레드를 가지게 됨
		// - 실제 작업을 수행하는 단위는 스레드 단위
		// - 스레스 단위는 실제 CPU가 처리하는 단위
		// - 멀티 스레드는 여러 스레드가 동시에 수행디는 프로그래밍
		// - CPU는 시간을 잘게 쪼개어 스레드들을 수행하며, 사용자들은 동시에 처리되는 듯한 효과를 가짐
		// - 스레드는 각각 자신만의 작업 공간을 가짐 (context)
		// - 각 스레드 사이에 공유하는 자원이 있을 수 있음
		// - 여러 스레드가 공유하는 자원중 경쟁이 발생하는 부분을 critical section (임계 영역)
		// - critical section에 대한 동기화(순차적 수행)을 구현하여 오류를 막음
		
		// 스레드 구현 방식
		// - 스레드 클래스 상속 (반드시 run() 메서드를 구현해야 함)
		// - runable 인터페이스 구현
		
		System.out.println(Thread.currentThread());
		 
		MyThread mt = new MyThread();
		mt.start();
		
		MyThread mt1 = new MyThread();
		mt1.start();
	}
}

// 스레드 클래스를 상속
class MyThread extends Thread {
	// 스레드를 상속받으면 반드시 run() 메서드를 구현해야 함
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.printf("%d번째 %s\n", i, getName());
		}
	}
}
