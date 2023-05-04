package day013;

import java.util.ArrayList;
import java.util.Scanner;

public class List02 {
	public static void main(String[] args) {
		/*
		 * --메뉴판--
		 * 1. 햄버거 : 7000 
		 * 2. 피자 : 20000
		 * 3. 음료 : 2000
		 * 4. 과자 : 2000
		 * 5. 사탕 : 500
		 * 6. 프로그램 종료
		 * 
		 * 메뉴를 선택해주세요. 1, 수량을 선택해주세요. 2
		 * => 1번 메뉴 햄버거 2개
		 * 주문을 끝내시려면 0을 눌러주세요.
		 * 메뉴를 선택해주세요. 3, 수량을 선택해주세요. 2
		 * => 3번 메뉴 음료 2개
		 * 주문을 끝내시려면 0을 눌러주세요. 0
		 * 
		 * --선택한메뉴--
		 * 햄버거 2개, 음료 2개 선택 총금액 : 
		 */
		
		Scanner sc = new Scanner(System.in);

		FoodManager store = new FoodManager();
		
		store.add("햄버거", 7000);
		store.add("피자", 20000);
		store.add("음료", 2000);
		store.add("과자", 2000);
		store.add("사탕", 500);
		
		while(true) {
			int menu = 0;
			int count = 0;
	
			store.printMenu();
			
			System.out.printf("메뉴를 선택해주세요. ");
			menu = sc.nextInt();
			if(menu == 0) {
				System.out.printf("프로그램 종료\n");
				break;
			}	
			System.out.printf("수량을 선택해주세요. ");
			count = sc.nextInt();
			
			store.sale(menu, count);
		}
		
		System.out.printf("\n--선택한메뉴--\n");
		for (int i = 0; i < store.menu.size(); i++) {
			if (store.count.get(i) != 0) {
				System.out.printf("%s %d개, ", store.menu.get(i), store.count.get(i));
			}
		}
		System.out.printf("총 지불금액 : %d원", store.total);
		
		sc.close();
	}
}

class FoodManager {
	// 멤버변수 ArrayList 메뉴, 가격
	ArrayList<String> menu = new ArrayList<String>();
	ArrayList<Integer> price = new ArrayList<Integer>();
	ArrayList<Integer> count = new ArrayList<Integer>();
	int total = 0;
	
	// 메소드 정의
	public void printMenu() {
			System.out.printf("----- 메뉴판 -----\n");
		for (int i = 0; i < menu.size(); i++) {
			System.out.printf("%d. %s : %d원\n", i + 1, menu.get(i), price.get(i));
		}
		System.out.printf("0. 프로그램 종료 (계산)\n\n");
	}
	
	public void add(String menu, int price) {
		this.menu.add(menu);
		this.price.add(price);
		this.count.add(0);
	}
	
	public void sale(int menu, int count) {
		int index = menu - 1;
		System.out.printf("=> %d번 메뉴 %s %d개\n\n", menu, this.menu.get(index), count);
		this.count.set(index, this.count.get(index) + count);
		total = total + price.get(index) * count;
	}
}
