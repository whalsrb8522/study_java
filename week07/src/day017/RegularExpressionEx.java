package day017;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEx {
	public static void main(String[] args) {
		// RegularExpression: 정규 표현식
		// 문자의 형식을 검증
		// 전화번호, 비밀번호
		// [a-zA-Z]: 대소문자 가능
		// \d: 숫자만 가능
		// \w(==[a-zA-Z0-9]): 모든 숫자,문자 가능
		// .: 모든 문자중 한개의 문자
		// ?: 없음 또는 1개
		// *: 없음 또는 1개 이상
		// {}: 개수의 제한
		// {3,}: 3자리 이상
		// |: 또는
		// 전화번호: (02|010)-\d{3,4}-\d{4}
		
		// 배열 중 b로 시작하는 단어만 찾기
		String[] strArr = {"bat", "baby", "cat", "cb", "date", "disk", "count", "apple", "banana"};
		
		Arrays.sort(strArr);
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.printf("%s ", strArr[i]);
		}
		
		System.out.printf("\n------------------------------\n");
		
		Pattern pattern = Pattern.compile("b[a-zA-Z]*");
//		Pattern pattern = Pattern.compile("(b|B)[a-zA-Z]*");
		
		for(String str: strArr) {
			Matcher matcher = pattern.matcher(str);	// 패턴이 일치가 되면 true를 반환
			if(matcher.matches()) {
				System.out.printf("%s ", str);
			}
		}
		
	}
}
