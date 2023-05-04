package day010;

public class 클래스06 {
	public static void main(String[] args) {
		/*
		 * final은 클래스, 변수, 메서드에 붙일 수 있음
		 * final : 수정할 수 없는 값
		 * final 멤버 변수 : 상수
		 * final 멤버 메서드 : 오버라이딩을 할 수 없다
		 * final 클래스 : 상속 할 수 없다. 부모 클래스가 될 수 없다.
		 */
		
		EzenStudent s1 = new EzenStudent();
		s1.print();
		
		System.out.println();
	
		EzenStudent s2 = new EzenStudent("인천", "조민규", "AWS java", "(010-8423-8522)");
		s2.print();
	}
}

class EzenStudent {
	// 멤버변수 : 지점, 이름 ,반, 전화번호
	// 메서드 : 출력(print 메서드 또는 toString)
	private String branch;
	private String name;
	private String classRoom;
	private String phoneNumber;		// int로 받게되면 0으로 시작하면 8진수로 받게됨, 연산할 필요가 없는 값인 경우, string으로 

	/*
	 * 초기화 방법 : 기본값, 명시적 초기값, 초기화 블럭,
	 * 우선순위 : 기본값 -> 명시적 -> 초기화 블럭 -> 생성자 
	 */
	
	{
		// 초기화 블럭 : 멤버변수들을 초기화;
	}
	
	public EzenStudent() {}
	
	public EzenStudent(String branch, String name, String classRoom, String phoneNumber) {
		this.branch = branch;
		this.name = name;
		this.classRoom = classRoom;
		this.phoneNumber = phoneNumber;
	}
	
	public void print() {
		System.out.println("brandch : " + branch);
		System.out.println("name : " + name);
		System.out.println("classRoom : " + classRoom);
		System.out.println("phoneNumber : " + phoneNumber);
	}

	public String toString() {
		return "EzenStudent [branch=" + branch + ", name=" + name + ", classRoom=" + classRoom + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
