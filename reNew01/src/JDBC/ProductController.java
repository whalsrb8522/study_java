 package JDBC;

import java.util.List;
import java.util.Scanner;

public class ProductController {
	// 상품 등록, 상품 전체 리스트 보기, 상품 상세 페이지 보기, 상품 수정, 상품 삭제
	// 데이터베이스에서 연동한 후 컨트롤러에서 모든 메뉴를 분기 처리
	// 컨트롤러 -> 서비스를 호출, 서비스 -> DAO를 호출(DB 구문 연결 호출)
	// controller -> service(interface) -> serviceimpl(구현체)
	private Scanner scan;
	private Service svc;
	private boolean flag;		// 종료 변수 (flag = false == 종료)
	
	// 생성자
	public ProductController() {
		scan = new Scanner(System.in);
		svc = new ProductService();		// service 구현 객체
		flag = true;
		printMenu();
	}
	
	private void printMenu() {
		while(flag == true) {
			System.out.printf("----- 상품관리시스팀 -----\n");
			System.out.printf("1. 등록 | 2. 목록 | 3. 찾기 | 4. 수정 | 5. 삭제 | etc. 종료\n");
			System.out.printf("입력 : ");
			char menu = scan.next().charAt(0);
			
			switch (menu) {
			case '1':
				System.out.printf("--- 등록 메뉴 ---\n");
				register();
				break;
			case '2':
				System.out.printf("--- 목록 메뉴 ---\n");
				list();
				break;
			case '3':
				System.out.printf("--- 찾기 메뉴 ---\n");
				detail();
				break;
			case '4':
				System.out.printf("--- 수정 메뉴 ---\n");
				edit();
				break;
			case '5':
				System.out.printf("--- 삭제 메뉴 ---\n");
				delete();
				break;
			default:
				this.scan.close();
				System.out.printf("종료되었습니다.\n");
				flag = false;
				break;
			}
		}
	}
	
	private void delete() {
		System.out.println("상품 번호 : ");
		int pno = scan.nextInt();

		int isOk = svc.delete(pno);
		System.out.printf("상품 삭제 : %s\n", isOk > 0 ? "성공" : "실패");
	}
	
	// 수정 메뉴
	private void edit() {
		String old_pname;
		String new_pname;
		int price;
		String madeby;
		
		System.out.printf("기존 상품명 : ");
		old_pname = scan.next();
		
		if (svc.edit_check(old_pname)) {
			System.out.printf("변경 상품명 : ");
			new_pname = scan.next();
			System.out.printf("변경 가격 : ");
			price = scan.nextInt();
			scan.nextLine();	// 위쪽 공백(Enter)를 하단에서 인식하는것을 막기 위함 
			System.out.printf("변경 설명 : ");
			madeby = scan.next();

			int isOk = svc.edit(new Product(new_pname, price, madeby), old_pname);
			System.out.printf("상품 수정 : %s\n", isOk > 0 ? "성공" : "실패");
		}
	}
	
	// 세부리스트 보기
	private void detail() {
		System.out.printf("상품명 : ");
		String pname = scan.next();
		
		Product detail= svc.detail(pname);
		System.out.println(detail);
	}
	
	// 전체 리스트 보기
	private void list() {
		// 전체 DB의 리스트
		// select pno, pname, regdate from product
		List<Product> list = svc.list();
		// 출력
		for(Product p : list) {
			System.out.println(p);
		}
	}
	
	// 각종 메뉴들에 대한 분기 처리
	// 등록 메뉴
	private void register() {
		System.out.printf("상품명 : ");
		String pname = scan.next();
		System.out.printf("상품 가격 : ");
		int price = scan.nextInt();
		scan.nextLine();	// 위쪽 공백(Enter)를 하단에서 인식하는것을 막기 위함 
		System.out.printf("상품 상세 설명 : ");
		String madeby = scan.nextLine();
		
		// DB에 등록 요청을 하고, 요청이 올바르게 이루어졌다면 리턴을 받는 값
		// 0 : 실패, 1 : 성공
		// 원래 처리는 method 구문을 먼저 만들고, main에서 호출해오는 형태
		// main에서 호출하면 역으로 method를 생성(메소드명, 매개면수, 결정해서 생성)
		int isOk = svc.register(new Product(pname, price, madeby));
		System.out.printf("상품등록 : %s\n", isOk > 0 ? "성공" : "실패");
	}
}
