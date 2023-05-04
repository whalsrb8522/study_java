package day015;

import java.util.Scanner;

public interface Program {
	// interface - program
	// 1. 학생 리스트 출력
	// 2. 학생 등록
	// 3. 학생 검색
	// 4. 수강 신청
	// 5. 수강 철회
	
	void printStudent();
	void insertStudent(Scanner sc);
	void searchStudent(Scanner sc);
	void registerSubject(Scanner sc);
	void deleteSubject(Scanner sc);
}
