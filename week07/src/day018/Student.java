package day018;

public class Student {
	// 멤버 변수: 이름, 점수

	private String name;
	private int score;

	public Student() {
		super();
	}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return name + ": " + score;
	}
}
