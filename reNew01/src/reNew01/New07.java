package reNew01;

import java.util.HashMap;
import java.util.Scanner;

public class New07 {
	// 상품 클래스를 생성
	// 상품 추가, 상품 리스트 출력, 상품 내용 수정, 상품 삭제
	// 상품 클래스
	// manager 사용하여 추가, 출력, 수정, 삭제 기능
	// main 이용하여 menu 출력
	// menu 1. 추가 2. 출력 3. 수정 4. 삭제

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Product product = new Product(sc);

		char menu = 0;

		while (menu != '5') {
			System.out.printf("1. 추가 | 2. 출력 | 3. 수정 | 4. 삭제 | 5. 종료\n");
			System.out.printf("입력 : ");
			menu = sc.next().charAt(0);
			product.manager(menu);
		}
		
		sc.close();
	}
}

class Product {
	HashMap<String, Integer> productList = new HashMap<String, Integer>();
	Scanner sc; 
	
	Product(Scanner sc) {
		this.sc = sc;
	}

	void manager(char menu) {
		
		String name = null;
		int price = 0;

		switch (menu) {
		case '1':
			System.out.printf("----- 상품 추가 -----\n");
			System.out.printf("상품 이름 : ");
			name = sc.next();
			System.out.printf("상품 가격 : ");
			price = sc.nextInt();
			
			productList.put(name, price);
			break;
		case '2':
			System.out.printf("----- 상품 출력 -----\n");
			for (String tmp : productList.keySet()) {
				String key = tmp;
				Integer val = productList.get(key);
				
				System.out.printf("▷ %s : %d원\n", key, val);
			}
			break;
		case '3':
			System.out.printf("----- 상품 수정 -----\n");
			System.out.printf("상품 이름 : ");
			name = sc.next();
			if (productList.containsKey(name)) {
				System.out.printf("상품 가격 : ");
				price = sc.nextInt();
				productList.replace(name, price);
			} else {
				System.out.printf("없는 상품입니다.\n");
			}
			break;
		case '4':
			System.out.printf("----- 상품 삭제 -----\n");
			System.out.printf("상품 이름 : ");
			name = sc.next();
			if (productList.containsKey(name)) {
				productList.remove(name);
				System.out.printf("삭제되었습니다.\n");
			} else {
				System.out.printf("없는 상품입니다.\n");
			}
			break;
		case '5':
			System.out.printf("종료되었습니다.\n");
			break;
		default:
			System.out.printf("다시 입력해주세요.\n");
			break;
		}
	}
}
