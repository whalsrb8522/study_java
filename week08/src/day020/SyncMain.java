package day020;

class Bank {
	// 계좌의 돈
	private int money = 10000;

	// 입금
	// synchronized: saveMoney 메소드 호출시, 스레드를 통해 동시에 접근한다 해도
	// Bank 클래스에는 하나의 스레드만 접근 가능
	public synchronized void saveMoney(int save) {
		int m = this.money;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setMoney(m + save);
	}

	// 출금
	public synchronized void minusMoney(int minus) {
		int m = this.money;

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setMoney(m - minus);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}

class Hong extends Thread {
	public void run() {
		System.out.println("입금 시작");
		SyncMain.myBank.saveMoney(3000);
		System.out.printf("3000원 입금 후 : %s\n", SyncMain.myBank.getMoney());
	}
}

class HongWife extends Thread {
	public void run() {
		System.out.println("출금 시작");
		SyncMain.myBank.minusMoney(1000);
		System.out.printf("1000원 출금 후 : %s\n", SyncMain.myBank.getMoney());
	}
}

public class SyncMain {
	public static Bank myBank = new Bank();

	public static void main(String[] args) {
		Hong h = new Hong();
		h.start();

		HongWife hw = new HongWife();
		hw.start();
	}
}
