package day005;

public class String02 {
	public static void main(String[] args) {
		/*
		 * 이것이자바다.txt 파일에서 파일명과 확장자를 분리하여 출력
		 */
		
		String str = "이것이자바다.txt";
		String fName, eName;
		
		fName = str.substring(0, str.indexOf("."));
		eName = str.substring(str.indexOf(".") + 1);
		
		System.out.printf("파일명 : %s\n확장자명 : %s\n",fName, eName);
		System.out.println(fName.contains("자바"));		// contains : 특정 문자열이 포함되어있느지 true/false
	}
}
