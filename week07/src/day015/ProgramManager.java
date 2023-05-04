package day015;

import java.util.Scanner;

public class ProgramManager implements Program {
	// class - programManager - program 인터페이스 구현
	// 1. 학생 리스트 출력
	// 2. 학생 등록
	// 3. 학생 검색
	// 4. 수강 신청
	// 5. 수강 철회

	// 멤버 변수
	private Student[] stdList = new Student[5];
	private int stdCount;

	@Override
	public void printStudent() {
		for (int i = 0; i < stdCount; i++) {
			System.out.println("---- 학생 정보 ----");
			stdList[i].stdPrint();	// 학생 정보만 출력
//			printStudentOne(stdList[i]); // 학생 정보 + 수강 정보
		}
	}

	@Override
	public void insertStudent(Scanner sc) {
		if (stdCount == stdList.length) {
			Student[] temp = new Student[stdList.length + 5];
			System.arraycopy(stdList, 0, temp, 0, stdList.length);
			stdList = temp;
		}

		System.out.printf("학번: ");
		String stdNum = sc.next();
		System.out.printf("이름: ");
		String stdName = sc.next();
		System.out.printf("주민번호: ");
		String stdRegNum = sc.next();
		System.out.printf("학부: ");
		String stdFaculty = sc.next();
		System.out.printf("학과: ");
		String stdMajor = sc.next();

		stdList[stdCount] = new Student(stdNum, stdName, stdRegNum, stdFaculty, stdMajor);
		stdCount++;
	}

	@Override
	public void searchStudent(Scanner sc) {
		System.out.printf("이름 검색: ");
		String stdName = sc.next();

		for (int i = 0; i < stdCount; i++) {
			if (stdList[i].getStdName().equals(stdName)) {
				printStudentOne(stdList[i]);
				return;
			}
		}

		System.out.println("검색 결과가 없습니다.");
	}

	@Override
	public void registerSubject(Scanner sc) {
		System.out.printf("이름 검색: ");
		String stdName = sc.next();

		for (int i = 0; i < stdCount; i++) {
			if (stdList[i].getStdName().equals(stdName)) {
				System.out.printf("과목명: ");
				String subName = sc.next();

				stdList[i].insertSubject(new Subject(subName));
				return;
			}
		}

		System.out.println("검색 결과가 없습니다.");
	}

	@Override
	public void deleteSubject(Scanner sc) {
		System.out.printf("이름 검색: ");
		String stdName = sc.next();

		for (int i = 0; i < stdCount; i++) {
			if (stdList[i].getStdName().equals(stdName)) {
				System.out.printf("강의명 검색: ");
				String subName = sc.next();

				stdList[i].deleteSubject(subName);
				return;
			}
		} 

		System.out.println("검색 결과가 없습니다.");
	}

	public void printStudentOne(Student s) {
		System.out.println("---- 학생 정보 ----");
		s.stdPrint();
		System.out.println("- 수강 정보:");
		s.subPrint();
	}
}
