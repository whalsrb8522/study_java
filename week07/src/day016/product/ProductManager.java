package day016.product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements ProductInterface {
	private ArrayList<Product> productList = new ArrayList<Product>();
	private ArrayList<Order> orderList = new ArrayList<Order>();

	public ProductManager() {
		productList.add(new Product("햄버거", 10000));
		productList.add(new Product("치킨", 30000));
		productList.add(new Product("피자", 20000));
	}

	@Override
	public void addProduct(Scanner sc) {
		System.out.printf("제품명: ");
		String prodName = sc.next();
		System.out.printf("가격: ");
		int prodPrice = sc.nextInt();

		productList.add(new Product(prodName, prodPrice));
	}

	@Override
	public void printProduct() {
		for (int i = 0; i < productList.size(); i++) {
			System.out.printf("%d. 제품명: %s, 가격: %d\n", i + 1, productList.get(i).getProdName(),
					productList.get(i).getProdPrice());
		}
	}

	@Override
	public void addOrder(Scanner sc) {
		System.out.printf("제품명: ");
		String prodName = sc.next();

		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getProdName().equals(prodName)) {
				System.out.printf("개수: ");
				int prodCount = sc.nextInt();

				Order order = new Order();
				order.setProdName(productList.get(i).getProdName());
				order.setProdPrice(productList.get(i).getProdPrice());
				order.setProdCount(prodCount);
				order.setProdTotal(prodCount * productList.get(i).getProdPrice());
				orderList.add(order);

				return;
			}
		}

		System.out.println("없는 메뉴입니다.");
	}

	@Override
	public void printOrder() {
		int sum = 0;

		for (int i = 0; i < orderList.size(); i++) {
			System.out.printf("%d. 제품명: %s, 가격: %d, 개수: %d, 합계: %d\n", i + 1, orderList.get(i).getProdName(),
					orderList.get(i).getProdPrice(), orderList.get(i).getProdCount(), orderList.get(i).getProdTotal());
			sum += orderList.get(i).getProdTotal();
		}
		System.out.printf("총 합계: %d\n", sum);

	}

	@Override
	public void deleteProduct(Scanner sc) {
		System.out.printf("제품명: ");
		String prodName = sc.next();

		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getProdName().equals(prodName)) {
				productList.remove(i);
				System.out.println("삭제되었습니다.");
				
				for (int j = 0; j < orderList.size(); j++) {
					if (orderList.get(j).getProdName().equals(prodName)) {
						orderList.remove(j);
					}
				}

				return;
			}
		}

		System.out.println("없는 메뉴입니다.");
	}

	@Override
	public void updateProduct(Scanner sc) {
		System.out.printf("제품명: ");
		String prodName = sc.next();

		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getProdName().equals(prodName)) {
				System.out.printf("기존 가격: %d\n", productList.get(i).getProdPrice());
				System.out.printf("변경 가격: ");
				int prodPrice = sc.nextInt();

				productList.get(i).setProdPrice(prodPrice);
				System.out.println("변경되었습니다.");
				
				for (int j = 0; j < orderList.size(); j++) {
					if (orderList.get(j).getProdName().equals(prodName)) {
						orderList.remove(j);
					}
				}
				
				return;
			}
		}

		System.out.println("없는 메뉴입니다.");
	}
}
