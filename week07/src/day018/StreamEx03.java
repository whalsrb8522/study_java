package day018;

import java.util.ArrayList;

public class StreamEx03 {
	// ArrayList로 Student 객체 선언
	// add() 메소드로 입력
	// 해당 list로 stream 생성 후 '이름:점수' 출력

	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<Student>();

		sList.add(new Student("A", 50));
		sList.add(new Student("B", 60));
		sList.add(new Student("C", 70));
		sList.add(new Student("D", 90));
		sList.add(new Student("E", 80));
		sList.add(new Student("F", 100));

		// 객체에 toString() 메소드가 있을경우
		// sList.stream().forEach(System.out::println);

		// {}: 데이터 처리 구문
		sList.stream().forEach(student -> {
			System.out.printf("%s: %3d\n", student.getName(), student.getScore());
		});

		System.out.printf("합계: %d, 총인원: %d\n",
				sList.stream().map(student -> student.getScore()).mapToInt(score -> score.intValue()).sum(),
				sList.stream().count());

		// 점수가 70점 이상인 학생의 합계
		System.out.printf("(70점 이상) 합계: %d, 총인원: %d\n",
				sList.stream().map(student -> student.getScore()).mapToInt(score -> score.intValue())
						.filter(score -> score >= 70).sum(),
				sList.stream().map(student -> student.getScore()).filter(score -> score >= 70).count());
	}
}
