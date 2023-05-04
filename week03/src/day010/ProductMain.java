package day010;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		/*
		 * Product 클래스 : 상품을 등록하는 클래스
		 * - 멤버변수 : 상품명, 가격
		 * 
		 * 상품 등록 메서드 : insertProduct
		 * 출력 메서드
		 */
		
		/*
		 * ProductMain 클래스
		 * product 배열 생성 (10개)
		 * 
		 * 상품 등록 후 리스트 출력
		 * 
		 * 스캐너를 통해서 상품 등록.
		 * 상품을 등록하시겠습니까? (y/n)
		 * y => 상품 등록
		 * n => 종료 후 등록된 제품 리스트 출력
		 * (배열이 끝까지 돌면 끝)
		 */

		Scanner sc = new Scanner(System.in);
		Product[] pd = new Product[10];
		
		String name = null;
		int price = 0;
		char check = 'y';
		int cnt = 0;
		int sum = 0;
		
		while (true) {
			if (cnt != pd.length) {
				System.out.printf("상품을 등록하시겠습니까?(y/n) : ");
				check = sc.next().charAt(0);
				
				if (check == 'Y' || check == 'y') {
					System.out.print("상품 이름 : ");
					name = sc.next();
					System.out.print("상품 가격 : ");
					price = sc.nextInt();
 					pd[cnt] = new Product();
					pd[cnt].insertProduct(name, price);
					cnt++;
				} else if (check == 'N' || check == 'n') {
					break;
				} else {
					System.out.println("다시 입력해주세요.");
				}
			} else {
				System.out.println("등록 가능한 공간이 없습니다.");
				break;
			}
		}
		
		if (pd[0] == null) {
			System.out.println("상품 정보가 없습니다.");
		} else {
			System.out.println("====상품 출력====");
			for (int i = 0; i < cnt; i++) {
				pd[i].printProduct();
				sum += pd[i].getPrice();
				System.out.println();
			}
		}
		System.out.printf("가격 합계 : %d", sum);
		
//		while (check != 'n') {
//			System.out.print("상품을 등록하시겠습니까? (y/n) : ");
//			check = sc.next().charAt(0);
//			
//			if (check == 'Y' || check =='y') {
//				System.out.printf("상품 이름 : ");
//				name = sc.next();
//				System.out.printf("상품 가격 : ");
//				price = sc.nextInt();
//				
//				pd[cnt] = new Product();
//				pd[cnt].insertProduct(name, price);
//				cnt++;
//			} else if (check == 'N' || check == 'n') {
//				break;
//			} else {
//				System.out.println("다시 입력해주세요.");
//			}
//		}
//		
//		System.out.println("====상품 출력====");
//		for (int i = 0; i < cnt; i++) {
//			System.out.printf("%d번째 상품 : ", i + 1);
//			pd[i].printProduct();
//			System.out.println();
//		}
		
		sc.close();
	}
}
