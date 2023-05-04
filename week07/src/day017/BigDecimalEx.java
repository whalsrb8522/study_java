package day017;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalEx {
	public static void main(String[] args) {
		// BigDecimal: java에서 숫자를 정밀하게 저장/표현하기 위한 클래스
		// 돈, 소수점 등 정밀한 계산이 필요한 경우는 필수
		// 단점으로는 느린 속도가 있다

		// BigDecimal 객체 생성시, 매개 변수는 문자열로 입력해야한다.
		BigDecimal bd = new BigDecimal("1000.1234");
		BigDecimal bd1 = new BigDecimal("1000.1234");
		BigDecimal bd2 = new BigDecimal("100");

		System.out.println(bd);

		// 객체의 주소가 같은지 비교, 값이 같은지 비교하려면 equals, compareTo 사용
		// compareTo : 같으면 0, 작으면 -1, 크면 1
		System.out.println(bd == bd1);
		System.out.println(bd.equals(bd1));
		System.out.println(bd.compareTo(bd2));

		// +(add), -(substract), *(multiply), /(divide), %(remainder)
		System.out.println("+: " + bd.add(bd2));
		System.out.println("-: " + bd.subtract(bd2));
		System.out.println("*: " + bd.multiply(bd2));
		System.out.println("/: " + bd.divide(bd2));
		System.out.println("%: " + bd.remainder(bd2));

		// max, min
		System.out.println("max: " + bd.max(bd2));
		System.out.println("min: " + bd.min(bd2));

		// BigInteger
		BigInteger bi = BigInteger.valueOf(1000000); // 일반 int
		System.out.println(bi);
		
		// Integer 형변환
		int int_bi = bi.intValue();
		long long_bi = bi.longValue();
		String string_bi = bi.toString();
	}
}
