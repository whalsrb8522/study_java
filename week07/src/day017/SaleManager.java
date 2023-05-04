package day017;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	// 멤버 변수
	private ArrayList<Sale<String, Integer>> product = new ArrayList<>();
	private ArrayList<Sale<String, Integer>> order = new ArrayList<Sale<String, Integer>>();

	public SaleManager() {
		product.add(new Sale("햄버거", 10000));
	}

	public void addProduct(Scanner sc) {
		System.out.printf("제품명: ");
		String menu = sc.next();
		System.out.printf("가격: ");
		int price = sc.nextInt();

		product.add(new Sale(menu, price));
	}

	public void printProduct() {
		for (int i = 0; i < product.size(); i++) {
			System.out.printf("%d. ", i + 1);
			System.out.println(product.get(i));
		}
	}

	public void addOrder(Scanner sc) {
		System.out.printf("제품명: ");
		String menu = sc.next();
		System.out.printf("수량: ");
		int count = sc.nextInt();

		for (int i = 0; i < product.size(); i++) {
			if (product.get(i).getMenu().equals(menu)) {
				int price = product.get(i).getPrice();
				order.add(new Sale(menu, count * price));

				return;
			}
		}

		System.out.println("없는 메뉴입니다.");
	}

	public void printOrde() {
		int sum = 0;

		for (int i = 0; i < order.size(); i++) {
			System.out.printf("%d. ", i + 1);
			System.out.println(order.get(i));
			sum = sum + order.get(i).getPrice();
		}

		System.out.printf("총 금액: %d, \n", sum);
	}
}
