package day016.product;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ProductManager pm = new ProductManager();
		char choice = 0;
		
		do {
			System.out.println("1. 제품 추가\t2. 제품 삭제");
			System.out.println("3. 제품 수정\t4. 제품 확인");
			System.out.println("5. 주문 하기\t6. 주문 내역");
			System.out.println("0. 프로그램 종료");
			System.out.printf("입력: ");
			choice = sc.next().charAt(0);
			
			System.out.println();
			switch (choice) {
			case '1':
				System.out.println("- 제품 추가");
				pm.addProduct(sc);
				break;
			case '2':
				System.out.println("- 제품 삭제");
				pm.deleteProduct(sc);
				break;
			case '3':
				System.out.println("- 제품 수정");
				pm.updateProduct(sc);
				break;
			case '4':
				System.out.println("- 제품 확인");
				pm.printProduct();
				break;
			case '5':
				System.out.println("- 주문 하기");
				pm.addOrder(sc);
				break;
			case '6':
				System.out.println("- 주문 내역");
				pm.printOrder();
				break;
			case '0':
				System.out.println("안녕히가세요.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			
			System.out.println();
		} while(choice != '0');
	}
}
