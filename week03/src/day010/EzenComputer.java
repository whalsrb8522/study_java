package day010;

import java.util.Scanner;

public class EzenComputer {
	public static void main(String[] args) {		
		EzenComputer c1 = new EzenComputer("조민규", "941222", 30, "010-8423-8522", "인천");
		
		c1.setName("홍길동");
		c1.setAge(20);
		c1.setBirth("2002-01-01");
		c1.setPhone("010-1111-1111");
		c1.setBranch("인천");
		
//		c1.studentPrint();
//		c1.academyPrint();
//		c1.subjectPrint();
//		c1.subjectAdd("java", "6");
//		c1.subjectAdd("html", "4");
//		c1.subjectAdd("DB", "1");
//		c1.subjectPrint();
		
		/*
		 * 배열로 5명의 학생을 등록 후
		 * - 학생 이름으로 검색
		 * - 지점명으로 검색
		 */
		
		EzenComputer[] std = new EzenComputer[6];
		std[0] = new EzenComputer("첫째", "010-1111-1111", "인천");
		std[1] = new EzenComputer("둘째", "010-2222-2222", "서울");
		std[2] = new EzenComputer("셋째", "010-3333-3333", "대전");
		std[3] = new EzenComputer("넷째", "010-4444-4444", "인천");
		std[4] = new EzenComputer("첫째", "010-5555-5555", "서울");
		std[5] = c1;
		
		String searchName = "첫째";
		String searchBranch = "인천";
		
		System.out.println("====이름 검색====");
		for (int i = 0; i < std.length; i++) {
			if (std[i].getName().equals(searchName)) {
				std[i].studentPrint();
				std[i].academyPrint();
			}
		}
		System.out.println();
		
		System.out.println("====지점 검색====");
//		for (int i = 0; i < std.length; i++) {
//			if (std[i].getBranch().equals(searchBranch)) {
//				std[i].studentPrint();
//				std[i].academyPrint();
//			}
//		}
		for(EzenComputer tmp : std) {
			if (tmp.getBranch().equals(searchBranch)) {
				tmp.studentPrint();
				tmp.academyPrint();				
			}
		}
	}
	
	/*
	 * 학생 기본 정보 : 이름, 생년월일, 나이, 전화번호
	 * 학원정보 : 학원이름 = "EZEN", 지점
	 * 수강정보 : 수강과목, 기간
	 * 자바(6개월), DB(1개월), html(2개월)
	 * 한명의 학생은 여러과목을 수강할 수 있음
	 * 과목, 기간 : 배열로 처리 (길이 = 5)
	 * 
	 * 메서드
	 * - 기본 정보 출력
	 * 		홍길동, 990101, 20, 010-1111-1111
	 * - 학원 정보 출력
	 * 		EZEN, 인천
	 * - 수강 정보 출력
	 * 		자바(6개월), DB(1개월), html(2개월)
	 * - 수강 정보 추가 기능
	 */
	Scanner sc = new Scanner(System.in);
	
	private String name;
	private String birth;
	private int age;
	private String phone;
	private final static String academyName = "EZEN";
	private String branch;
	private String[] subjectName = new String[5];
	private String[] subjectMonth = new String[5];
	private int cnt = 0; 

	public EzenComputer() {}
	
	public EzenComputer(String name, String birth, int age, String phone, String branch) {
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.phone = phone;
		this.branch = branch;
	}
	
	public EzenComputer(String name, String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
	}
	
	public void studentPrint() {
		System.out.printf("이름 : %s, 생년월일 : %s, 나이 : %d, 전화번호 : %s\n", name, birth, age, phone);
	}
	
	public void academyPrint() {
		System.out.printf("학원 : %s, 지점 : %s\n", academyName, branch);
	}
	
	public void subjectPrint() {
		for (int i = 0; i < subjectName.length; i++) {
			if (cnt == 0) {
				System.out.println("수강 과목이 없습니다.");
				return;
			} else if (subjectName[i] != null) {
				System.out.printf("과목 : %s(%s개월)\n", subjectName[i], subjectMonth[i]);
			}
		}
	}
	
	public void subjectAdd(String subjectName, String subjectMonth) {
		this.subjectName[cnt] = subjectName;
		this.subjectMonth[cnt] = subjectMonth;
		cnt++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String[] subjectName) {
		this.subjectName = subjectName;
	}

	public String[] getSubjectMonth() {
		return subjectMonth;
	}

	public void setSubjectMonth(String[] subjectMonth) {
		this.subjectMonth = subjectMonth;
	}

	public static String getAcademyname() {
		return academyName;
	}
}
