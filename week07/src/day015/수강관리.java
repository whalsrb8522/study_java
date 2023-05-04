package day015;

import java.util.Scanner;

public class 수강관리 {
	// 배열을 이용
	//
	// interface - program
	// 1. 학생 리스트 출력
	// 2. 학생 등록
	// 3. 학생 검색
	// 4. 수강 신청
	// 5. 수강 철회

	// class - subject (별도 생성)
	// 1. 과목 클래스: 한 과목의 정보를 나타내는 클래스
	// - 과목 코드, 과목 명, 학점, 시수, 교수명, 학기, 분류

	// class - student (별도 생성)
	// 1. 학생 클래스: 한 학생의 정보를 나타내는 클래스
	// - 학번, 이름, 주민번호, 학부, 학과, 수강과목(과목 클래스를 배열로 생성)
	// - 수강과목에 대한 번지를 대신할 count 변수 필요
	// - 메서드
	// ㄴ 수강과목 추가 (배열이 다 찼다면 늘려주기)
	// ㄴ 수강과목 삭제

	// class - programManager - program 인터페이스 구현
	// 1. 학생 리스트 출력
	// 2. 학생 등록
	// 3. 학생 검색
	// 4. 수강 신청
	// 5. 수강 철회

	// class - main - 메뉴 구성
	// 1. 학생등록
	// 2. 학생확인(학생 리스트)
	// 3. 학생검색
	// 4. 수강신청
	// 5. 수강철회
	// 6. 종료

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProgramManager pm = new ProgramManager();
		char menu = 0;

		do {
			System.out.println("==== 수강 관리 ====");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생확인");
			System.out.println("3. 학생검색");
			System.out.println("4. 수강신청");
			System.out.println("5. 수강철회");
			System.out.println("0. 종료");
			System.out.printf("입력 : ");

			menu = sc.next().charAt(0);

			switch (menu) {
			case '1':
				System.out.println("==== 학생 등록 ====");
				pm.insertStudent(sc);
				break;
			case '2':
				System.out.println("==== 학생 확인 ====");
				pm.printStudent();
				break;
			case '3':
				System.out.println("==== 학생 검색 ====");
				pm.searchStudent(sc);
				break;
			case '4':
				System.out.println("==== 수강 신청 ====");
				pm.registerSubject(sc);
				break;
			case '5':
				System.out.println("==== 수강 철회 ====");
				pm.deleteSubject(sc);
				break;
			case '0':
				System.out.println("종료되었습니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		} while (menu != '0');
		
		sc.close();
	}
}
