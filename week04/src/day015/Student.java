package day015;

public class Student {
	// class - student (별도 생성)
	// 1. 학생 클래스: 한 학생의 정보를 나타내는 클래스
	// - 학번, 이름, 주민번호, 학부, 학과, 수강과목(과목 클래스를 배열로 생성)
	// - 수강과목에 대한 번지를 대신할 count 변수 필요
	// - 생성자
	// - 메서드
	// ㄴ 수강과목 추가 (배열이 다 찼다면 늘려주기)
	// ㄴ 수강과목 삭제
	// ㄴ getter/setter, print

	// 멤버변수
	private String stdNum;
	private String stdName;
	private String stdRegNum;
	private String stdFaculty;
	private String stdMajor;
	private Subject[] subList = new Subject[5];
	private int subCount;

	// 생성자
	public Student() {
	}

	public Student(String stdNum, String stdName, String stdRegNum, String stdFaculty, String stdMajor) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdRegNum = stdRegNum;
		this.stdFaculty = stdFaculty;
		this.stdMajor = stdMajor;
	}

	// 메서드
	public void stdPrint() {
		System.out.printf("학생명(학번): %s(%s)\n", stdName, stdNum);
		System.out.printf("학부(학과): %s(%s)\n", stdFaculty, stdMajor);
	}

	public void subPrint() {
		if (subCount == 0) {
			System.out.printf("수강중인 과목이 없습니다.\n");
		}

		for (int i = 0; i < subCount; i++) {
			System.out.printf("%s\n", subList[i]); // toString을 이용한 출력
		}
	}

	public void insertSubject(Subject subject) {
		if (subCount == subList.length) {
			Subject[] tmp = new Subject[subList.length + 5];
			System.arraycopy(subList, 0, tmp, 0, subList.length);
			subList = tmp;
		}

		subList[subCount] = subject;
		subCount++;
	}

	public void deleteSubject(String subName) {
		for (int i = 0; i < subCount; i++) {
			if (subList[i].getSubName().equals(subName)) {
				for (int j = i; j < subCount - 1; j++) {
					subList[j] = subList[j + 1];
				}

				subList[subCount - 1] = null;
				subCount--;
				
				return;
			}
		}
		
		System.out.println("없는 강의입니다.");
	}

	// getter, setter
	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdRegNum() {
		return stdRegNum;
	}

	public void setStdRegNum(String stdRegNum) {
		this.stdRegNum = stdRegNum;
	}

	public String getStdFaculty() {
		return stdFaculty;
	}

	public void setStdFaculty(String stdFaculty) {
		this.stdFaculty = stdFaculty;
	}

	public String getStdMajor() {
		return stdMajor;
	}

	public void setStdMajor(String stdMajor) {
		this.stdMajor = stdMajor;
	}

	public Subject[] getSubList() {
		return subList;
	}

	public void setSubList(Subject[] subList) {
		this.subList = subList;
	}

	public int getSubCount() {
		return subCount;
	}
}
