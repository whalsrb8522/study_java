package day015;

public class Subject {
	// class - subject (별도 생성)
	// 1. 과목 클래스: 한 과목의 정보를 나타내는 클래스
	// - 과목 코드, 과목 명, 학점, 시수, 교수명, 학기, 분류, 시간표

	// 멤버 변수: 일반적으로 private로 선언
	private String subCode;
	private String subName;
	private double subCredit;
	private int subTime;
	private String subProfessor;
	private String subSemester;
	private String subCategory;
	private String subScheduler;

	// 생성자: 객체를 생성할 때 기본으로 초기화 하고하 하는 값을 미리 입력받아 객체를 생성
	// 별도 생성자를 지정하지 않을경우, 클래스를 자동으로 기본적인 생성자를 가짐
	// 생성자를 직접 지정할 경우, 기본적인 생성자는 사라짐

	// 기본 생성자
	public Subject() {
	}

	// 과목명만 받는 생성자
	public Subject(String subName) {
		this.subName = subName;
	}

	// 과목코드, 과목명, 학점을 받는 생성자
	public Subject(String subCode, String subName, double subCredit) {
		this.subCode = subCode;
		this.subName = subName;
		this.subCredit = subCredit;
	}

	// 전체 데이터를 받는 생성자
	public Subject(String subCode, String subName, double subCredit, int subTime, String subProfessor,
			String subSemester, String subCategory, String subScheduler) {
		super();
		this.subCode = subCode;
		this.subName = subName;
		this.subCredit = subCredit;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subSemester = subSemester;
		this.subCategory = subCategory;
		this.subScheduler = subScheduler;
	}

	// getter, setter
	public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public double getSubCredit() {
		return subCredit;
	}

	public void setSubCredit(double subCredit) {
		this.subCredit = subCredit;
	}

	public int getSubTime() {
		return subTime;
	}

	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}

	public String getSubProfessor() {
		return subProfessor;
	}

	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}

	public String getSubSemester() {
		return subSemester;
	}

	public void setSubSemester(String subSemester) {
		this.subSemester = subSemester;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getSubScheduler() {
		return subScheduler;
	}

	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}

	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", subName=" + subName + ", subCredit=" + subCredit + ", subTime="
				+ subTime + ", subProfessor=" + subProfessor + ", subSemester=" + subSemester + ", subCategory="
				+ subCategory + ", subScheduler=" + subScheduler + "]";
	}
}
