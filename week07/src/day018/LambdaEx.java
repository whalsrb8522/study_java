package day018;

import java.util.ArrayList;

public class LambdaEx {
	public static void main(String[] args) {
		// Lambda: 람다식
		// 함수형 프로그램(Functional Programming, FP) 
		// 		: 순수한 함수를 구현하고 호출함으로써 외부 자료에 부수적인 영향(Side effect)를 주지 않도록 구현하는 방식
		// 순수 함수(Pure Function): 매개변수만을 사용하여 만드는 함수
		// 		즉. 함수 내부에서 함수 외부에 있는 변수를 사용하지 않아 함수가 실행되더라도 외부에 영향을 주지 않는 형태
	
		int result = add(3, 5);
		System.out.println(result);
		ArrayList<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(20);
		number.add(5);
		number.add(30);
		number.add(15);
		
		for (Integer i :number) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		
		System.out.println("----- 람다식");
		number.forEach(n -> {
			System.out.printf("%d ", n);
		});
		System.out.println();
		
		number.forEach(System.out::println);
		System.out.println("----- number list 개수");
		System.out.println(number.stream().count());
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
}
