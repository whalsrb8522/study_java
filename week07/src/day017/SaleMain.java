package day017;

import java.util.Scanner;

public class SaleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SaleManager sm = new SaleManager();

		char menu = '0';

		do {
			System.out.println("1. 제품 추가");
			System.out.println("2. 제품 리스트 보기");
			System.out.println("3. 제품 주문");
			System.out.println("4. 주문 내역");
			System.out.println("0. 프로그램 종료");
			System.out.print("입력: ");
			menu = sc.next().charAt(0);
			
			System.out.println();
			switch (menu) {
			case '1':
				sm.addProduct(sc);
				break;
			case '2':
				sm.printProduct();
				break;
			case '3':
				sm.addOrder(sc);
				break;
			case '4':
				sm.printOrde();
				break;
			case '0':
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			System.out.println();
		} while (menu != '0');
	}
}