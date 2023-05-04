package reNew01;

public class New01 {
	public static void main(String[] args) {
		// 홍길동의 주민동륵번호 : 881002-1234567
		// 출력형태 : 생년월일 : 881002, 성별 : 남
		String pin = "881002-1234567";
		
		String birthday = pin.substring(0, pin.indexOf("-"));
		char gender = pin.charAt(pin.indexOf("-") + 1) == '1' ? '남' : '여';
		
		System.out.printf("생년월일 : %s, 성별 : %s", birthday, gender);
	}
}
