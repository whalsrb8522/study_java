package day016.product;

import java.util.Scanner;

public interface ProductInterface {
	void addProduct(Scanner sc);	// 메뉴 추가
	void printProduct();	// 메뉴 출력
	void addOrder(Scanner sc);	// 주문
	void printOrder();	// 주문 내역 출력
	void deleteProduct(Scanner scan);	// 메뉴 삭제
	void updateProduct(Scanner scan);	// 메뉴 수정
}
